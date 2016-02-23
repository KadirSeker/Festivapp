import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainFrame_Gui extends JFrame {

	private JFrame frame;
	private JMenu[] menuItems;
	private JMenuBar menuBar;
	
	private JTable agendaTable;
	
	private Agenda agenda = new Agenda();
	
	private Dimension textFieldSize = new Dimension(120,25);
	private Dimension screenSize = new Dimension((int)(Toolkit.getDefaultToolkit().getScreenSize().width/1.5),(int)(Toolkit.getDefaultToolkit().getScreenSize().height/1.5));

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{

		@SuppressWarnings("unused")
		MainFrame_Gui window = new MainFrame_Gui();
	}

	/**
	 * Create the application.
	 */
	public MainFrame_Gui() 
	{
		menuItems = new JMenu[5]; 
		initialize();
		
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		frame = new JFrame("FestiFapp");
		frame.setSize(screenSize);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		menuItems[0] = new JMenu("File");
		fillFile();		
		menuItems[1] = new JMenu("Help");
		fillHelp();
		menuItems[2] = new JMenu("Add");
		fillAdd();
		menuItems[3] = new JMenu("Edit");
		fillEdit();
		menuItems[4] = new JMenu("Delete");
		fillDelete();
		
		for (int i = 0; i < 5; i++)
			menuBar.add(menuItems[i]);
		
		JPanel content = new JPanel();
		JPanel agendaPanel = new JPanel(); 			// left pannel for agenda
		JPanel datePanel = new JPanel();			// bottom panel for the date of festival
		JPanel infoPanel = new JPanel();			// right panel for  extra information
		JScrollPane scrollPane = new JScrollPane();	// TODO fix relativity of scrollpane to screen
		
		JLabel festivalDate = new JLabel("Festival Date: " + agenda.getFestivalDate() , JLabel.CENTER);
		
		content.setLayout(new BorderLayout());
		content.add(agendaPanel, BorderLayout.CENTER);
		content.add(datePanel, BorderLayout.SOUTH);
		content.add(infoPanel, BorderLayout.EAST);
		
		datePanel.add(festivalDate); //TODO need to fix the date of festival.
		
		generateAgenda();
		scrollPane.getViewport().add(agendaTable);
		//scrollPane.setPreferredSize(preferredSize);
		agendaPanel.add(scrollPane);
		
		
		frame.setContentPane(content);
		frame.revalidate();
	}
	
	private void fillFile()
	{
		JMenuItem[]	subMenuItems = new JMenuItem[4]; 
		subMenuItems[0] = new JMenuItem();
    	subMenuItems[0].setText("New Festival");
		subMenuItems[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
                //TODO make this the last item in the list
            }
        });
		
		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Save Festival");
		subMenuItems[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
                //TODO make this the last item in the list
            }
        });
		
		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Load Festival"); 
		subMenuItems[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
                //TODO make this the last item in the list
            }
        }); 
				
		subMenuItems[3] = new JMenuItem();
		subMenuItems[3].setText("Exit App");
		subMenuItems[3].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        }); 
		
		
				
				
				
		for (int i = 0; i < 4; i++)
			menuItems[0].add(subMenuItems[i]);
	}

	private void fillHelp()
	{
		JMenuItem[]	subMenuItems = new JMenuItem[2]; 
		subMenuItems[0] = new JMenuItem();
    	subMenuItems[0].setText("Open Help Menu");
		subMenuItems[0].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                JOptionPane.showMessageDialog(frame, "This FestiFapp was developed by Project group A3.");
            }
        });
		
		for (int i = 0; i < 1; i++)
			menuItems[1].add(subMenuItems[i]);
	}
	
	private void fillAdd()
	{
		JMenuItem[]	subMenuItems = new JMenuItem[3]; 
		
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Add Performance");
		subMenuItems[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Add Artist");
		subMenuItems[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
            
                addArtist();
            }
        });
		
		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Add Stage");
		subMenuItems[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		
		for (int i = 0; i < 3; i++)
			menuItems[2].add(subMenuItems[i]);
	}
	
	private void fillEdit()
	{
		JMenuItem[]	subMenuItems = new JMenuItem[3]; 
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Edit Performance");
		subMenuItems[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Edit Artist");
		subMenuItems[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Edit Stage");
		subMenuItems[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		for (int i = 0; i < 3; i++)
			menuItems[3].add(subMenuItems[i]);
	}
	
	private void fillDelete()

	{
		JMenuItem[]	subMenuItems = new JMenuItem[3]; 
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Delete Performance");
		subMenuItems[0].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Delete Artist");
		subMenuItems[1].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Delete Stage");
		subMenuItems[2].addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
              //TODO make this a usefullthing
            }
        });
		
		for (int i = 0; i < 3; i++)
			menuItems[4].add(subMenuItems[i]);
	}
	
	private void createNewFestival()
	{
		//TODO write it
	}
	
	private void addPerformance()
	{
		//TODO write it
	}
	
	private void addArtist()
	{
		JFrame addFrame = new JFrame("Add Artist");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addFrame.setVisible(true);
		addFrame.setSize(400, 200);
		addFrame.setResizable(false);
		
		
		JTextArea name = new JTextArea();
		JTextArea genre = new JTextArea();
		JTextArea pop = new JTextArea();
		name.setEditable(false);
		genre.setEditable(false);
		pop.setEditable(false);
		name.setText("Please enter the Artist name");
		genre.setText("Please Enter the music Genre");
		pop.setText("Please Enter the Artist Popularity");
		
		//TODO SET BOUNDS FOR ALL THE FIELDS SO ITS NICE
		
		JTextField nameField = new JTextField(); 
		nameField.setPreferredSize(textFieldSize);
		JTextField genreField = new JTextField();
		genreField.setPreferredSize(textFieldSize);
		JTextField popField = new JTextField();
		popField.setPreferredSize(textFieldSize);
		
		JButton button = new JButton();
		button.setPreferredSize(textFieldSize);
		button.setText("Add Artist");
		button.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent event) {
            String nameInput = nameField.getText();
            String genreInput = genreField.getText();
            String popInput = popField.getText();
            
         
            
            if(nameInput.length() > 0 && genreInput.length() > 0 && popInput.length() > 0 && popInput.matches("[0-9]"))
            { //TODO fix the input can be 10 
            double popularity = Double.parseDouble(popInput);
            Artist artist = new Artist(nameInput,genreInput,popularity);
            agenda.addArtist(artist);
            //System.out.println(artist.getName()+ artist.getGenre() + artist.getPopularity());
            }
            else
            {
            	JOptionPane.showMessageDialog(addFrame, "One of the Fields is not filled in correctly Artist is not saved!");
            }
            
        }
    });
		
		
		JPanel content = new JPanel(new FlowLayout());
		content.add(name);
		content.add(nameField);
		content.add(genre);
		content.add(genreField);
		content.add(pop);	
		content.add(popField);
		content.add(button);
		addFrame.setContentPane(content);
		
		
		
	}
	
	private void addStage()
	{}

	private void generateAgenda()
	{
	  agendaTable = new JTable(getRows(),getCollums());	
	  
	  
	}
	
	
	//TODO switch return values of rows and collums depending on where we want the time!!!
	
	/*
	 * returns the amount of rows that the agenda needs 
	 * 1 row for the times and the rest is the amounth of stages
	 */
	private int getCollums()
	{
		return 1 + agenda.getStages().size();
		
	}
	
	/*
	 * return the ammount of collums that the agenda needs
	 * 49 stands for 1 collum of stages and 48 parts of half hours
	 */
	private int getRows()
	{
		return 49;
	}
	
	
	
	
	
	
}