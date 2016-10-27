import org.jsoup.nodes.Document;

public abstract class Site {
	
	private String name;
	private String baseURL;
	private String searchURL;
	private int numPages;
	private String lastModified;
	private int increment;
	
	public String getName(){
		return name;
	}
	
	public void setName(String nameCompany){
		this.name = nameCompany ;
	}
	
	
	public String getBaseURL(){
		return baseURL;
	}
	
	public void setBaseURL(String baseURL){
		this.baseURL = baseURL;
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

	public String getSearchURL() {
		return searchURL;
	}

	public void setSearchURL(String searchURL) {
		this.searchURL = searchURL;
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
