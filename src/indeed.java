import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class indeed extends Site {

	public indeed(String name, String baseURL, String searchURL, int increm)
	{
		this.setName(name);
		this.setBaseURL(baseURL);
		this.setSearchURL(searchURL);
		this.setIncrement(increm);
		this.setNumPages(numPages());
		//Document doc = null;
		
		displayjobs();
		
	}
	
//	public indeed(url){
//		this.doc = Jsoup.connect(url).get();
//	}
	
	public int numPages()
	{
		String originalURL = this.getBaseURL().concat(this.getSearchURL());
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
	
	
	/*Truly needs a synchronize approach, like one big function that handles it in real time.
	 * 
	 * a) Store all the info into array of docs for processing
	 * b) put it as one big function that handles counting and displaying
	 * 
	 * For now they are separate
	 */
	public void displayjobs()
	{
		
		String originalURL = this.getBaseURL().concat(this.getSearchURL());
		String url = originalURL;
		
		//Study and find html codes
		while(true)
		{
			try
			{
				Document doc = Jsoup.connect(url).get();
				Elements spanTags = doc.getElementsByTag("span");
				//Elements test = doc.getElementsContainingText("jobTitle");
				//Elements test2 = doc.getElementsByAttributeValue("data-tn-element", "jobTitle");
				Elements test4 = doc.getElementsByAttributeValue("data-tn-component","organicJob");
				
			
				
				
//				if(verifyNext(spanTags))
//				{
				
				
					
				for(Element e : test4)
				{
					String company = e.getElementsByClass("company").get(0).text();
					String jobtitle = e.getElementsByClass("jobtitle").get(0).text();
					String date = e.getElementsByClass("date").get(0).text();
					String link = this.getBaseURL().concat(e.getElementsByAttribute("href").get(0).attributes().get("href").toString());
					
					//System.out.println(href3);
					
					System.out.println(company + " " + jobtitle + " " + date + " " + link);
					
					
					
					//Elements hrefs = e.getElementsByAttributeValue("rel","nofollow");
					
				
					
					//Elements hrefs = e.getElementsByAttributeValue("target", "_blank");
					//Elements hrefs2 = e.getElementsByAttributeValueMatching("onclick","setRefineByCookie");
					
					
					/*for(Element r : hrefs2)
					{
						System.out.println(r);
						
					}*/
					//System.out.println(e.getElementsByClass("date").toString());
					
					
					
				
					
					
					
					
					/*Elements temp = e.getElementsByClass("date");
					String date = temp.get(0).text();
					System.out.println(date);*/
					
					
//					boolean foo = e.hasAttr("data-tn-element");
//					boolean bar = e.hasAttr("jobTitle");
					//System.out.println(e.text());
					
					//jobtitle
					
					//company name
					
					//dateposted
					
/*					System.out.println("***********************************");
					System.out.println(e.toString());
					System.out.println("***********************************");
					System.out.println();*/
				}
				
//				}
//				else
				break;
					
				
			}
			catch (IOException e) 
			{
			    e.printStackTrace();
			}
			
			break;
			
			
		}
		
		
		
	}
	
	
	public boolean verifyNext(Elements tags)
	{
		Boolean temp = false;
		
		for(Element e : tags)
		{
			if (e.hasClass("np")&&(e.text().contains("Next"))){
				temp = true;
			}
		}
		return temp;
		
		
	}
	
	
	
}
