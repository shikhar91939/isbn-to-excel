import java.io.*;

class Main
{
	
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = new FileInputStream("outliers.xml");
		DataInputStream dis = new DataInputStream(fis);
		BufferedReader br = new BufferedReader(new InputStreamReader(dis));
		
		String line ;
		PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("book_details.csv", false)))
		printWriter.println("title,contentVersion,creator,date,description,format,identifier,language,publisher,subject");
		
		while((line=br.readLine()) != null){
			String title="";
			String contentVersion="";
			String creator="";
			String date="";
			String description="";
			String format="";
			String identifier="";
			String language="";
			String publisher="";
			String subject="";



		}
		
	}
}
