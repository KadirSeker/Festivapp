import java.util.GregorianCalendar;

public class Testing
{
	private Artist artist1,artist2,artist3,artist4,artist5,artist6;
	private Stage stage1,stage2,stage3;
	private Performance perf1,perf2,perf3;
	private Agenda agenda;
	
	public Testing()
	{
		
		GregorianCalendar begin = new GregorianCalendar();
		
		artist1 = new Artist("Joshua","Hardstyle",10);
		artist2 = new Artist("Artur","Irish punk",6);
		artist3 = new Artist("Timon","Electro Swing",7);
		artist4 = new Artist("Kadir","GameSound",4);
		artist5 = new Artist("Christiaan","Rubik-Silence",2);
		artist6 = new Artist("Paulti","Death-Metal",420);
		
		stage1 = new Stage("Main-Stage");
		stage2 = new Stage("Reverze-Stage");
		stage3 = new Stage("Boring-Stage");
		
		perf1 = new Performance(stage1,new Time("08:00"),new Time("12:00"));
		perf1.addArtist(artist1);
		perf2 = new Performance(stage2,new Time("12:14"),new Time("13:25"));
		perf2.addArtist(artist2);
		perf3 = new Performance(stage3,new Time("01:45"),new Time("18:12"));
		perf3.addArtist(artist3);
		
		
		
		agenda = new Agenda();
		agenda.addShow(perf1);
		agenda.addShow(perf2);
		agenda.addShow(perf3);
		agenda.addStage(stage1);
		agenda.addStage(stage2);
		agenda.addStage(stage3);
		agenda.addArtist(artist1);
		agenda.addArtist(artist2);
		agenda.addArtist(artist3);
		agenda.addArtist(artist4);
		agenda.addArtist(artist5);
		agenda.addArtist(artist6);
		
		
		
	}
	
	public Agenda getAgenda()
	{
		return agenda;
	}
}
