package com.he.test;
import java.io.*;

public class FileStreamTest {
	public static void main(String[] args) {
		String fileName = "test_writer.txt";
//		fileOutputStream(fileName);
		outputStreamWriterTest(fileName);

	}
	
	// FileWriter 写入char[] 时无法正常读取 不确定是否正常写入
	public static void fileWriterTest(String fileName) throws UnsupportedEncodingException {
		byte[] str1 = {1, 2, 3};
		String str3 = new String(str1);
//		String str2 = "Hello";
		try {
			FileWriter writer = new FileWriter(fileName);
			writer.write(str3);   //TODO
//			writer.write(str2);
			writer.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// FileOutputStream
	public static void fileOutputStream(String fileName) {
	    try{
	        byte bWrite [] = {11,21,3,40,5};
	        OutputStream os = new FileOutputStream(fileName);
	        os.write(bWrite);
	        for(int x=0; x < bWrite.length ; x++){
	        	os.write( bWrite[x] ); // writes the bytes
	        }
	      os.close();
	   
	      InputStream is = new FileInputStream(fileName);
	      int size = is.available();
	   
	      for(int i=0; i< size; i++){
	        System.out.print((char)is.read() + "  ");
	      }
	        is.close();
	      }catch(IOException e){
	        System.out.print("Exception");
	      }
	}
	
	// OutputStreamWriter
	public static void outputStreamWriterTest(String fileName) {
		try {
			byte bWrite [] = {11,21,3,40,5};
			FileOutputStream fh = new FileOutputStream(fileName);
			OutputStreamWriter writer = new OutputStreamWriter(fh, "UTF-8");
			writer.append("中文输入");
			writer.append("\r\n");
			String str = new String(bWrite);
			System.out.println(str);
			writer.append(str);
			writer.close();
			fh.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

