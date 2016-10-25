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
		
		String url = "http://www.indeed.ca/jobs?q=developer&l=Calgary,+AB&sort=date&start=";
		String name = "developer";

		indeed newSearch = new indeed(name, url, 20);
		
		System.out.println(newSearch.getURL());
		System.out.println(newSearch.getName());
		System.out.println(newSearch.getIncrement());
		System.out.println(newSearch.getNumPages());
		
		
		
	}
		
		

	
}
