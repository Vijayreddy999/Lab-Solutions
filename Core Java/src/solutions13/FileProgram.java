package solutions13;

import java.io.FileReader;
import java.io.FileWriter;

public class FileProgram extends Thread 
{
	public static void main(String[] args)throws Exception 
	{
		FileReader fi = new FileReader("D:\\Vijay\\Core Java\\source.txt");
		FileWriter fw = new FileWriter("D:\\Vijay\\Core Java\\target.txt");
		CopyDataThread c = new CopyDataThread(fi,fw);
	}
}
