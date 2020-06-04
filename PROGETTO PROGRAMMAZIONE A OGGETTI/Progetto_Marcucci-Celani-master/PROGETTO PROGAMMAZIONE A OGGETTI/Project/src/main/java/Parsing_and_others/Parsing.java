package Parsing_and_others;

import java.awt.image.RescaleOp;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLConnection;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import javax.net.ssl.HttpsURLConnection;

import org.apache.tomcat.util.json.JSONParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.springframework.boot.jackson.JsonObjectDeserializer;

import com.fasterxml.jackson.core.JsonParser;

import Project.models.Tweet;

//import org.json.simple.parser.ParseException;
import java.io.*;

public class Parsing {
	
	public void Parsing_obj() {
		try {
			Download_File_JSON();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.apache.tomcat.util.json.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file_da_leggere=new File("C:\\Users\\STEPO\\Desktop\\PROGETTO PROGRAMMAZIONE A OGGETTI\\Progetto_Marcucci-Celani-master\\PROGETTO PROGAMMAZIONE A OGGETTI\\Project\\Dati_JSON2");
		
				  try {
					   BufferedReader br = new BufferedReader (new FileReader(file_da_leggere));
					
					   String lineaSingola = "";
					   
					   while ( (lineaSingola = br.readLine()) != null ) {
					    System.out.println(lineaSingola);
					   }
					  } catch (FileNotFoundException e) {
					   // TODO Auto-generated catch block
					   e.printStackTrace();
					  } catch (IOException e) {
					   // TODO Auto-generated catch block
					   e.printStackTrace();
					  }
	}
		
			/*	
		  	JSONObject obj = new JSONObject(json);
	        String pageName = obj.getJSONObject("pageInfo").getString("pageName");

	        System.out.println(pageName);

	        JSONArray arr = obj.getJSONArray("posts");
	        for (int i = 0; i < arr.length(); i++) {
	            String post_id = arr.getJSONObject(i).getString("post_id");
	            System.out.println(post_id);
	        }
		//	public static ArrayList<API_twitter> jsonParserColum(Object Filter)/* throws eccezioni */{
	//		
	//		ArrayList<API_twitter> previousArray = new ArrayList<API_twitter>();
	//	}
		// JSONParser parse=new JSONParser(inline);
		// JSONObject jobj=(JSONObject) parse.parse();
		// JSONArray obj =(JSONArray) jobj.get("results");
		
	}

public static void Download_File_JSON()throws ParseException, org.apache.tomcat.util.json.ParseException, IOException{
		//URL STAFFS
		URL url=new URL("https://wd4hfxnxxa.execute-api.us-east-2.amazonaws.com/dev/api/1.1/search/tweets.json?q=univpm&count=1");
		HttpURLConnection openConnection= (HttpURLConnection)url.openConnection();
		openConnection.setRequestMethod("GET");
		openConnection.connect();
		int responcecode =openConnection.getResponseCode();			
		//STRINGE E FILE SU CUI SALVIAMO I DATI
		try
			{
			//String inline ="";
			File f=new File("C:\\Users\\STEPO\\Desktop\\PROGETTO PROGRAMMAZIONE A OGGETTI\\Progetto_Marcucci-Celani-master\\PROGETTO PROGAMMAZIONE A OGGETTI\\Project\\Dati_JSON2");
			if ( f.exists() )
			{ 
			System.out.println("Il file esiste!!");
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
						//inline+=sc.nextLine();
					    //fw.write(sc.nextLine());
						}
					System.out.println("\nJSON data in string foramt \n");
					//System.out.println(inline);
					sc.close();
					
				// JSONParser parse=new JSONParser(inline);
				// JSONObject jobj=(JSONObject) parse.parse();
				// JSONArray obj =(JSONArray) jobj.get("results");
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
			e.printStackTrace();
			}
		
	}
	public static void main(String[] args)  {
		
	}
}

