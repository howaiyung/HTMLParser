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
		String url = "http://ca.indeed.com/jobs?q=developer&l=Calgary%2C+AB&sort=date&start=10&pp=\\";
		String jobs;
		
		jobs = urlBuild(url, "This is a extension");
		

		
	}
	
	
	public static String urlBuild(String url, String add){
		
		try
		{
			Document doc = Jsoup.connect(url).get();
			Elements spanTags = doc.getElementsByTag("span");
			
			
			// verifyNext(spanTags)
			while(spanTags.hasClass("span")) 
			{
				for(Element e : spanTags){
					System.out.println(e.text() + "\n");
					
				}
			}
		}
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		
		return "empty string";
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
