import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.jar.Attributes.Name;

/**
 * The agenda for a festival.
 * This contains afestival date
 * an arrayList of performances, stages and artist
 * 
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Agenda implements Serializable
{
	
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
	
	/**
	 * 
	 * @param festivalDate 
	 */
	public Agenda(GregorianCalendar festivalDate)
	{
		performances = new ArrayList<Performance>();
		stages = new ArrayList<Stage>();
		artists = new ArrayList<Artist>();
		this.festivalDate = festivalDate;
	}
	
	/**
	 * 
	 * @param f festivalDate 
	 */
	public void setFestivalDate(GregorianCalendar f)
	{
		festivalDate = f;
	}
	
	/**
	 * 
	 * @param show show
	 */
	public void addShow(Performance show)
	{
		performances.add(show);
	}
	
	/**
	 * 
	 * @param stage stage
	 */
	public void addStage(Stage stage)
	{
		stages.add(stage);
	}
	
	/**
	 * 
	 * @param artist artist
	 */
	public void addArtist(Artist artist)
	{
		artists.add(artist);
	}
	
	/**
	 * 
	 * @return festivaldate in YYYY-MM-DD format as String
	 */
	public String  getFestivalDate()
	{
		return festivalDate.get(GregorianCalendar.YEAR)+ "-" +
			   (festivalDate.get(GregorianCalendar.MONTH)+1) + "-" +
			   festivalDate.get(GregorianCalendar.DAY_OF_MONTH);
	}
	
	public ArrayList<Performance> getPerformances()
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
	
	/**
	 * 
	 * @return an arraylist of all artist names
	 */
	public ArrayList<String> getNamesOfArtist()
	{
		ArrayList<String> names = new ArrayList<String>();
		for(Artist a :artists)
		{
			names.add(a.getName());
		}
		return names;
	}
	
	/**
	 * 
	 * @return an arraylist of all stage names
	 */
	public ArrayList<String> getNamesOfStages()
	{
		ArrayList<String> names = new ArrayList<String>();
		for(Stage s :stages)
		{
			names.add(s.getName());
		}
		return names;
	}
}
