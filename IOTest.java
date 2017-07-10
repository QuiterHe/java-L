import java.io.*;

public class IOTest {
    public static void main(String[] args) throws IOException
    {
 
    }

    public static void read() {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do{
            c = (char) br.read();
            System.out.println(c);
            
        }while(c != 'q');	
    }

    public static void print() {
    	
    }

}
