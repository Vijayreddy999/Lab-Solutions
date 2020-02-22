package solutions8;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class ReadWriteExample 
{

	public static void main(String[] args)throws Exception 
	{
		FileReader fr = new FileReader("D:\\Vijay\\Core Java\\test.txt");
		FileWriter fw = new FileWriter("D:\\Vijay\\Core Java\\testop.txt");
		File f = new File("D:\\Vijay\\Core Java\\testop.txt");
		String path = f.getAbsolutePath();
		BufferedReader br = new BufferedReader(fr);
		String data = null;
		ArrayList a = new ArrayList();
		while((data=br.readLine())!=null)
		{
			StringBuilder b = new StringBuilder(data);
			b.reverse();
			a.add(b.toString());
		}
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter p = new PrintWriter(bw);
		Iterator i = a.iterator();
		while(i.hasNext())
		{
			p.println((String)i.next());
		}
		System.out.println("Your output is generated in:"+path);
		br.close();
		bw.close();
		fr.close();
		fw.close();
		p.close();
	}

}
