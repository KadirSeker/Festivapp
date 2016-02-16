import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * 
 * @author Joshua
 * @version 1.0
 *
 */
public class Festival {
	
	private ArrayList<Show> shows;
	private ArrayList<Stage> stages;
	private ArrayList<Artist> artists;
	private GregorianCalendar festivalDate;
	
	
	public Festival()
	{
		shows = new ArrayList<Show>();
		stages = new ArrayList<Stage>();
		artists = new ArrayList<Artist>();
		
	}
	
	public Festival(GregorianCalendar festivalDate)
	{
		shows = new ArrayList<Show>();
		stages = new ArrayList<Stage>();
		artists = new ArrayList<Artist>();
		this.festivalDate = festivalDate;
	}
	
	
	
	
	public void addShow(Show show)
	{
		shows.add(show);
	}
	
	public void addStage(Stage stage)
	{
		stages.add(stage);
	}
	
	public void addArtist(Artist artist)
	{
		artists.add(artist);
	}
	
	public GregorianCalendar  getFestivalDate()
	{
		return festivalDate;
	}
	
	public ArrayList<Show> getShows()
	{
		return shows;
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
