/**
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Artist {

	private String name;
	private String genre;
	private double popularity;
	//TODO here comes an image of artist?
	
	public Artist()
	{
	
	}
	
	public Artist(String n, String g, double p)
	{
		name = n;
		genre = g;
		popularity = p;
		
	}

	
	
	
	
	public void setName(String n)
	{
		name = n;
	}
	
	public void setGenre(String g)
	{
		genre = g;
	}
	
	public void setPopularity(double p)
	{
		popularity = p;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public double getPopularity()
	{
		return popularity;
	}
	
}
