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
	
	private Artist artist;
	private Stage stage;
	private GregorianCalendar startTime,endTime;
	
	public Performance()
	{
	
	}
	
	/**
	 * 
	 * @param s 	an stage object
	 * @param startTime 	an GregorianCalendar StartTime
	 * @param endTime		an GregorianCalendar EndTime
	 */
	public Performance(Artist a, Stage s,GregorianCalendar startTime, GregorianCalendar endTime)
	{
		artist = a;
		stage = s;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	/**
	 * 
	 * @return arraylist of all artists from the performance
	 */
	public Artist getArtists()
	{
		return artist;
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
	public GregorianCalendar getStartTime()
	{
		return startTime;
	}
	
	/**
	 * 
	 * @return endtime 
	 */
	public GregorianCalendar getEndTime()
	{
		return endTime;
	}
	
}
