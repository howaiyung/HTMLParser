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
		
//		try
//		{
//			String part1 = "jobmap = {};";
//			String url = "http://ca.indeed.com/jobs?q=developer&l=Calgary%2C+AB&sort=date&start=10&pp=\\";
//			
//			
//			Document doc = Jsoup.connect(url).get();
//		
//			
//			Elements scriptTags = doc.getElementsByTag("script");
//			Elements spanTags = doc.getElementsByTag("span");
//			//while spanTags.contains.element with class"np".containsText("Next")
//				//parse page 1 for information
//				// put all jobs into object
//				//modify url
//				//goto next page
//			
//	
//		//take relevant info from relevant jobs
//			//check to see if last job on page is within acceptable date/time range
//				//modify the url to go to next page
//				
//			for(Element e : spanTags){
//				
//				//System.out.print(e.text() + "\n");
//				
//				if (e.hasClass("np")){
//					System.out.println(e.text());
//				}
//				
//				/*if (e.hasClass("np")&&(e.text().contains("Next"))){
//					System.out.println(e.text());
//					System.out.println("yes");
//				}*/
//			}
//			
//			//boolean test = spanTags.hasClass("np");
//			
//			
//			//Elements eTets = scriptTags.select(query)
//			
//			
//			for (Element tag : scriptTags){   
//				//if(tag.toString().contains(part1)){System.out.println(tag.toString());}
//				
//			/*	if(eArr.size()>=1){
//					System.out.println("yes");}*/
//			/*	for (DataNode node : tag.dataNodes()){
//						//String[] temp = node.toString().split(" ");
//						
//					tag.g
//						String[] temp = node.toString().split(" ");
//						String temp2 = String.join(" ", temp);
//						
//						
//						
//						vbv
//						
//						//temp2 = temp2.replaceAll("\\r|\\n", "");
//						
//						
//						System.out.println(temp2 + " ");
//						
//						//Look for Window and Jobmap
//						for(String part : temp)
//						{
//							if((part == "") || (part == null) || (part.isEmpty()))
//							{
//								
//							}
//							else
//							{
//								
//							}
//						}
//						//System.out.println(node.getWholeData());
//		           } */       
//			}
//
//		    /*for (Element tag : scriptTags){                
//		           for (DataNode node : tag.dataNodes()) {
//		               System.out.println(node.getWholeData());
//		           }        
//		     }*/
//
//		    
//			/*for (Element t : script){
//				System.out.println(t.data());
//			}*/
//			
//			//Elements e = doc.getAllElements();
//			//for (Element t : e){
//				//System.out.println(t.getElementById(""));
//				//System.out.println(t.data());
//			//}
//			
//			//System.out.println(doc.select("script"));
//		}
//		catch (IOException e) 
//		{
//		    e.printStackTrace();
//		}
		
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
