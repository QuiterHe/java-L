import java.io.*;

public class fileStreamTest2 {
	public static void main(String[] args) throws IOException {
		File f = new File("a.txt");

		FileOutputStream fop = new FileOutputStream(f);
	}
}