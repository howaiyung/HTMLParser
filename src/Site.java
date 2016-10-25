import org.jsoup.nodes.Document;

public abstract class Site {
	
	private String name;
	private String baseURL;
	private int numPages;
	private String lastModified;
	private int increment;
	
	public String getName(){
		return name;
	}
	
	public void setName(String nameCompany){
		this.name = nameCompany ;
	}
	
	
	public String getURL(){
		return baseURL;
	}
	
	public void setURL(String URL){
		this.baseURL = URL;
	}
	
	public int getNumPages(){
		return numPages;
	}
	
	public void setNumPages(int numpages){
		this.numPages = numpages;
	}
	
	public String getLastModified(){
		return lastModified;
	}
	
	public void setLastModified(String lastmodified){
		this.lastModified = lastmodified;
	}
	
	public int getIncrement(){
		return increment;
	}
	
	public void setIncrement(int incre){
		this.increment = incre;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
