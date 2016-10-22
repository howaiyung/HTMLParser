
public abstract class Site {
	
	private String name;
	private String baseURL;
	private int numPages;
	private String lastModified;
	private int increment;
	
	String getName(){
		return name;
	}
	
	void setName(String nameCompany){
		name = nameCompany ;
	}
	
	
	String getURL(){
		return baseURL;
	}
	
	void setURL(String URL){
		baseURL = URL;
	}
	
	int getNumPages(){
		return numPages;
	}
	
	void setNumPages(int numpages){
		numPages = numpages;
	}
	
	String getLastModified(){
		return lastModified;
	}
	
	void setLastModified(String lastmodified){
		lastModified = lastmodified;
	}
	
	int getIncrement(){
		return increment;
	}
	
	void setIncrement(int incre){
		increment = incre;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
