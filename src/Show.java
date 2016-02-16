import java.util.ArrayList;
import java.util.GregorianCalendar;


/**
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Show {
	private ArrayList<Artist> artists;
	private Stage stage;
	private GregorianCalendar startTime,endTime;
	
	public Show()
	{
		artists = new ArrayList<Artist>();
		
	}
	
	public Show(Stage s,GregorianCalendar startTime, GregorianCalendar endTime)
	{
		artists = new ArrayList<Artist>();
		stage = s;
		this.startTime = startTime;
		this.endTime = endTime;
	}
	
	
	
	public void addArtist(Artist a)
	{
		artists.add(a);
	}
	
	
	public ArrayList<Artist> getArtists()
	{
		return artists;
	}
	
	public Stage getStage()
	{
		return stage;
	}
	
	public GregorianCalendar getStartTime()
	{
		return startTime;
	}
	
	public GregorianCalendar getEndTime()
	{
		return endTime;
	}
	
}
