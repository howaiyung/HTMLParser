import java.awt.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.parser.*;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;



//https://jsoup.org/cookbook/input/load-document-from-url


	
public class HTMLParserMin {
	
	public static void main(String[] args){
		try
		{
			Document doc = Jsoup.connect("http://ca.indeed.com/jobs?q=developer&l=Calgary%2C+AB&sort=date").get();
			
			Elements scriptTags = doc.getElementsByTag("script");
			
			for (Element tag : scriptTags){   
				for (DataNode node : tag.dataNodes()){
						//String[] temp = node.toString().split(" ");
						String[] temp = node.toString().split(" ");
						String temp2 = String.join(" ", temp);
						temp2 = temp2.replaceAll("\\r", "");
						
						//Look for Window and Jobmap
						System.out.println(temp2 + "\n");
						
						/*for(String part : temp)
						{
							if((part == "") || (part == null) || (part.isEmpty()))
							{
								
							}
							else
							{
								
							}
						}*/
						//System.out.println(node.getWholeData());
		           }        
			}

		    /*for (Element tag : scriptTags){                
		           for (DataNode node : tag.dataNodes()) {
		               System.out.println(node.getWholeData());
		           }        
		     }*/

		    
			/*for (Element t : script){
				System.out.println(t.data());
			}*/
			
			//Elements e = doc.getAllElements();
			//for (Element t : e){
				//System.out.println(t.getElementById(""));
				//System.out.println(t.data());
			//}
			
			//System.out.println(doc.select("script"));
		}
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		
	}
	
}
