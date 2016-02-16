import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Agenda {
	
	private ArrayList<Performance> performances;
	private ArrayList<Stage> stages;
	private ArrayList<Artist> artists;
	private GregorianCalendar festivalDate;
	
	
	public Agenda()
	{
		performances = new ArrayList<Performance>();
		stages = new ArrayList<Stage>();
		artists = new ArrayList<Artist>();
		festivalDate = new GregorianCalendar();
		
	}
	
	public Agenda(GregorianCalendar festivalDate)
	{
		performances = new ArrayList<Performance>();
		stages = new ArrayList<Stage>();
		artists = new ArrayList<Artist>();
		this.festivalDate = festivalDate;
	}
	
	
	public void setFestivalDate(GregorianCalendar f)
	{
		festivalDate = f;
	}
	
	public void addShow(Performance show)
	{
		performances.add(show);
	}
	
	public void addStage(Stage stage)
	{
		stages.add(stage);
	}
	
	public void addArtist(Artist artist)
	{
		artists.add(artist);
	}
	
	public String  getFestivalDate()
	{
		return festivalDate.get(GregorianCalendar.YEAR)+ "-" +
			   (festivalDate.get(GregorianCalendar.MONTH)+1) + "-" +
			   festivalDate.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public ArrayList<Performance> getShows()
	{
		return performances;
	}
	
	public ArrayList<Stage> getStages()
	{
		return stages;
	}
	
	public ArrayList<Artist> getArtists()
	{
		return artists;
	}
}
