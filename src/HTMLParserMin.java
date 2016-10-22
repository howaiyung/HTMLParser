import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.parser.*;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;



//https://jsoup.org/cookbook/input/load-document-from-url


	
public class HTMLParserMin {
	
	public static void main(String[] args){
		// Hmmm, concatenation
		
//		//while spanTags.contains.element with class"np".containsText("Next")
//		//parse page 1 for information
//		// put all jobs into object
//		//modify url
//		//goto next page
		
		String url = "http://www.indeed.ca/jobs?q=developer&l=Calgary%2C+AB&sort=date&start=";
		
		
		String jobs;
		int incre = 10;
		
		jobs = urlBuild(url, incre);
		
		System.out.println(jobs);
		
	}
	
	
	public static String urlBuild(String url, int incre){
		
		String originalURL = url;
		
		while(true)
		{
			try
			{
				
				Document doc = Jsoup.connect(url).get();
				Elements spanTags = doc.getElementsByTag("span");
				
				
				if(verifyNext(spanTags))
				{
					for(Element e : spanTags)
					{
						System.out.println(e.text());
						
					}
					
				}
				else
				{
					break;
					
				}
				
				incre+=20;
				
				url = originalURL + incre; 
				
				
				
			}
			catch (IOException e) 
			{
			    e.printStackTrace();
			}
			
			
		}
		return originalURL;
		
		
	}
	
	public static boolean verifyNext(Elements spanTags)
	{
		Boolean temp = false;
		
		for(Element e : spanTags)
		{
			if (e.hasClass("np")&&(e.text().contains("Next"))){
				temp = true;
			}
		}
		
		
		
		return temp;
		
		
	}
	
	
	
}
