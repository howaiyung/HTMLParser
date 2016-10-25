import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class indeed extends Site {

	public indeed(String name, String URL, int increm)
	{
		this.setName(name);
		this.setURL(URL);
		this.setIncrement(increm);
		this.setNumPages(numPages());
		
		
	}
	
	public int numPages()
	{
		String originalURL = this.getURL();
		String url = originalURL;
		
		int increment = this.getIncrement();
		int currentNumResults = 0;
		
		int numPages = 1;
		Boolean stillMorePages = true;
		
		while(stillMorePages)
		{
			try
			{
				Document doc = Jsoup.connect(url).get();
				Elements spanTags = doc.getElementsByTag("span");
				
				if(verifyNext(spanTags))
				{
					numPages++;
				}
				else
				{
					stillMorePages = false;
				}
				
				currentNumResults+=increment;
				url = originalURL + currentNumResults;
				
			}
			catch (IOException e) 
			{
			    e.printStackTrace();
			}
			
			
			
			
		}
		
		return numPages;
		
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
