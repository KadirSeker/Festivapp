import java.io.Serializable;

/**
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Artist implements Serializable 
{

	private String name;
	private String genre;
	private double popularity;
	//TODO here comes an image of artist?
	
	public Artist()
	{
	
	}
	
	/**
	 * 
	 * @param n Name
	 * @param g Genre
	 * @param p Popularity
	 */
	public Artist(String n, String g, double p)
	{
		name = n;
		genre = g;
		popularity = p;
		
	}

	
	
	
	/**
	 * 
	 * @param n name
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * 
	 * @param g genre
	 */
	public void setGenre(String g)
	{
		genre = g;
	}
	
	/**
	 * 
	 * @param p popularity
	 */
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
