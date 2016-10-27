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

// Note, possible document conversion system

	
public class HTMLParserMin {
	
	public static void main(String[] args){
		
		String baseURL = "http://www.indeed.ca";
		
		String developerURL = "/jobs?q=developer&l=Calgary,+AB&sort=date&start=";
		String dName = "developer";
		
		String systemAnalystURL = "/jobs?q=system+analyst&l=Calgary%2C+AB&sort=date&start=";
		String saName = "System Analyst";
		
		String businessAnalystURL = "/jobs?q=business+analyst&l=Calgary%2C+AB&fromage=last&sort=date&start=";
		String baName = "Business Analyst";
		
		String programmerAnalystURL = "/jobs?q=programmer+analyst&l=Calgary%2C+AB&sort=date";
		String paName = "Programmer Analyst";
		
		
		indeed developerSearch = new indeed(dName, baseURL, developerURL, 20);
		indeed systemAnalystSearch = new indeed(saName, baseURL, systemAnalystURL, 20);
		
		
		/*System.out.println(newSearch.getBaseURL().concat(newSearch.getSearchURL()));
		System.out.println(newSearch.getName());
		System.out.println(newSearch.getIncrement());
		System.out.println(newSearch.getNumPages());*/
		
		
		
		
		
		
	}
		
		

	
}
