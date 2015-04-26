import java.io.*;

class Main
{
	
	public static void main(String args[]) throws IOException
	{
//		System.out.println("Welcome Back :)");
		FileInputStream fis = new FileInputStream("outliers.xml");
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		
		String line ;
		
		while((line=br.readLine()) != null){
			System.out.println(line);
		}
		
	}
}
