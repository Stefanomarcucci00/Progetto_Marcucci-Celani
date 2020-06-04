package Parsing_and_others;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class DataStorage {
	public static void Download_File_JSON()throws  org.apache.tomcat.util.json.ParseException, IOException{
		//URL STAFFS
		URL url=new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=univpm&count=4");
		HttpURLConnection openConnection= (HttpURLConnection)url.openConnection();
		openConnection.setRequestMethod("GET");
		openConnection.connect();
		int responcecode =openConnection.getResponseCode();			
		//STRINGE E FILE SU CUI SALVIAMO I DATI
		try
			{
			File f=new File("C:\\Users\\STEPO\\Desktop\\PROGETTO PROGRAMMAZIONE A OGGETTI\\Progetto_Marcucci-Celani-master\\PROGETTO PROGAMMAZIONE A OGGETTI\\Project\\Dati_JSON2");
			if ( f.exists() /*&& /*f.length() != 0*/)
			{ 
			System.out.println("Il file è stato creato correttamente e non è nullo !!!");
			return; 
			}
			FileWriter fw = new FileWriter(f);
			//CONTROLLO HTTP PROTOCOL
			if(responcecode !=200) 
				throw new RuntimeException("HttpResponseCode:"+responcecode);
			else
				{
			try 
				{			
				Scanner sc=new Scanner(url.openStream());
					while(sc.hasNext())
						{
					    fw.write(sc.nextLine());
						}
					System.out.println("\nJSON data in string foramt \n");
					sc.close();
					}
				catch(IOException e) {
				System.out.println("Errore I/O");
				System.out.println(e);
				} 
			}
			//Disconnect the HttpURLConnection stream
			openConnection.disconnect();
			fw.close();
			}
			catch(Exception e)
			{
			System.out.println("");
			e.printStackTrace();
			}
		
	}
}
