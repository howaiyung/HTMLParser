import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.jsoup.Jsoup;
import org.jsoup.parser.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;





	
public class HTMLParserMin {
	
	public static void main(String[] args){
		try
		{
			Document doc = Jsoup.connect("http://ca.indeed.com/jobs?q=developer&l=Calgary%2C+AB&sort=date").get();
			
			
			
			
			//Elements e = doc.getAllElements();
			//for (Element t : e){
				//System.out.println(t.getElementById(""));
				//System.out.println(t.data());
			//}
			
			System.out.println(doc.select("script"));
		}
		catch (IOException e) 
		{
		    e.printStackTrace();
		}
		
	}
	
}
