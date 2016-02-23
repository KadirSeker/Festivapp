import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * This class represents a performance.
 * a performance contains an x amount of artist
 * 1 stage and 1 start and endTime
 * 
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Performance implements Serializable {
	
	private ArrayList<Artist> artists;
	private Stage stage;
	private Time startTime,endTime;
	
	public Performance()
	{
		artists = new ArrayList<Artist>();
		
	}
	
	/**
	 * 
	 * @param s 	an stage object
	 * @param startTime 	an GregorianCalendar StartTime
	 * @param endTime		an GregorianCalendar EndTime
	 */
	public Performance(Stage s,Time startTime, Time endTime)
	{
		artists = new ArrayList<Artist>();
		stage = s;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	
	
	
	
	
	
	
	/**
	 * @param a artist an artist object
	 */
	public void addArtist(Artist a)
	{
		artists.add(a);
	}
	
	
	/**
	 * 
	 * @return arraylist of all artists from the performance
	 */
	public ArrayList<Artist> getArtists()
	{
		return artists;
	}
	
	/**
	 * 
	 * @return an stage object
	 */
	public Stage getStage()
	{
		return stage;
	}
	
	/**
	 * 
	 * @return startTime
	 */
	public Time getStartTime()
	{
		return startTime;
	}
	
	/**
	 * 
	 * @return endtime 
	 */
	public Time getEndTime()
	{
		return endTime;
	}
	
}
