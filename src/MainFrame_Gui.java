import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class MainFrame_Gui
{

	private JFrame frame;
	private JMenu[] menuItems;
	private JMenuBar menuBar;

	private JTable agendaTable;

	private Agenda agenda = new Agenda();

	private Dimension textFieldSize = new Dimension(120, 25);
	private Dimension screenSize = new Dimension((int) (Toolkit.getDefaultToolkit().getScreenSize().width / 1.5),
			(int) (Toolkit.getDefaultToolkit().getScreenSize().height / 1.5));

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
		frame = new JFrame("Festivapp");
		frame.setSize(screenSize);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		JPanel agendaPanel = new JPanel(); // left pannel for agenda
		JPanel datePanel = new JPanel(); // bottom panel for the date of
											// festival
		JPanel infoPanel = new JPanel(); // right panel for extra information
		JScrollPane scrollPane = new JScrollPane(); // TODO fix relativity of
													// scrollpane to screen

		JLabel festivalDate = new JLabel("Festival Date: " + agenda.getFestivalDate(), JLabel.CENTER);

		content.setLayout(new BorderLayout());
		content.add(agendaPanel, BorderLayout.CENTER);
		content.add(datePanel, BorderLayout.SOUTH);
		content.add(infoPanel, BorderLayout.EAST);

		datePanel.add(festivalDate); // TODO need to fix the date of festival.

		generateAgenda();
		scrollPane.getViewport().add(agendaTable);
		// scrollPane.setPreferredSize(preferredSize);
		agendaPanel.add(scrollPane);

		frame.setContentPane(content);
		frame.revalidate();
	}

	private void fillFile()
	{
		JMenuItem[] subMenuItems = new JMenuItem[4];
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("New Festival");
		subMenuItems[0].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this the last item in the list
			}
		});

		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Save Festival");
		subMenuItems[1].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this the last item in the list
			}
		});

		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Load Festival");
		subMenuItems[2].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this the last item in the list
			}
		});

		subMenuItems[3] = new JMenuItem();
		subMenuItems[3].setText("Exit App");
		subMenuItems[3].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
			}
		});

		for (int i = 0; i < 4; i++)
			menuItems[0].add(subMenuItems[i]);
	}

	private void fillHelp()
	{
		JMenuItem[] subMenuItems = new JMenuItem[2];
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Open Help Menu");
		subMenuItems[0].addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent event)
			{
				JOptionPane.showMessageDialog(frame, "This Festivapp was developed by Project group A3.");
			}
		});

		for (int i = 0; i < 1; i++)
			menuItems[1].add(subMenuItems[i]);
	}

	private void fillAdd()
	{
		JMenuItem[] subMenuItems = new JMenuItem[3];

		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Add Performance");
		subMenuItems[0].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				addPerformance();
			}
		});

		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Add Artist");
		subMenuItems[1].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{

				addArtist();
			}
		});

		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Add Stage");
		subMenuItems[2].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				addStage();
			}
		});

		for (int i = 0; i < 3; i++)
			menuItems[2].add(subMenuItems[i]);
	}

	private void fillEdit()
	{
		JMenuItem[] subMenuItems = new JMenuItem[3];
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Edit Performance");
		subMenuItems[0].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this a usefullthing
			}
		});

		subMenuItems[1] = new JMenuItem();
		subMenuItems[1].setText("Edit Artist");
		subMenuItems[1].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this a usefullthing
			}
		});

		subMenuItems[2] = new JMenuItem();
		subMenuItems[2].setText("Edit Stage");
		subMenuItems[2].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				System.exit(0);
				// TODO make this a usefullthing
			}
		});

		for (int i = 0; i < 3; i++)
			menuItems[3].add(subMenuItems[i]);
	}

	private void fillDelete()

	{
		JMenuItem[] subMenuItems = new JMenuItem[1];
		subMenuItems[0] = new JMenuItem();
		subMenuItems[0].setText("Delete Data");
		subMenuItems[0].addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				deleteData();
			}
		});
		
		menuItems[4].add(subMenuItems[0]);

		
	}

	private void createNewFestival()
	{
		// TODO write it
	}

	private void addStage()
	{
		JFrame addStageFrame = new JFrame();
		
		
		addStageFrame.addWindowListener(new java.awt.event.WindowAdapter()
		{
public void windowClosing(java.awt.event.WindowEvent windowEvent)
{
	closeFrame(addStageFrame);
}
		});
				
		addStageFrame.setBounds(100, 100, 371, 103);
		addStageFrame.setResizable(false);
		addStageFrame.setVisible(true);
		addStageFrame.getContentPane().setLayout(null);
		
		JTextField textField_5 = new JTextField();
		textField_5.setBounds(118, 16, 116, 22);
		addStageFrame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel addStageLabel = new JLabel("Add Stage");
		addStageLabel.setBounds(12, 19, 116, 16);
		addStageFrame.getContentPane().add(addStageLabel);
		
		JButton addButton = new JButton("Add");
		addButton.setBounds(269, 15, 74, 25);
		addStageFrame.getContentPane().add(addButton);
	}

	private void addArtist()
	{
		JFrame addArtistFrame = new JFrame("Add Artist");
		
		addArtistFrame.addWindowListener(new java.awt.event.WindowAdapter()
		{
public void windowClosing(java.awt.event.WindowEvent windowEvent)
{
	closeFrame(addArtistFrame);
}
		});
		
		
		
		addArtistFrame.setVisible(true);
		addArtistFrame.setSize(400, 300);
		addArtistFrame.setResizable(false);

		JLabel name = new JLabel();
		JLabel genre = new JLabel();
		JLabel popularity = new JLabel();
		name.setText("Artist name: ");
		genre.setText("Music genre: ");
		popularity.setText("Artist popularity: ");
		name.setBounds(12, 66, 200, 16);
		genre.setBounds(12, 101, 200, 16);
		popularity.setBounds(12, 135, 200, 16);
		
		// TODO SET BOUNDS FOR ALL THE FIELDS SO ITS NICE

		JTextField nameField = new JTextField();
		nameField.setBounds(249, 63, 116, 22);
		JTextField genreField = new JTextField();
		genreField.setBounds(249, 98, 116, 22);
		JTextField popularityField = new JTextField();
		popularityField.setBounds(249, 132, 116, 22);

		JButton button = new JButton();
		button.setBounds(125, 192, 158, 48);
		button.setText("Add Artist");
		button.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent event) {
            String nameInput = nameField.getText();
            String genreInput = genreField.getText();
            String popInput = popularityField.getText();
            
         
            try
            {
            	int popularity = Integer.parseInt(popInput);
            	if(nameInput.length() > 0 && genreInput.length() > 0 && popInput.length() > 0)
                { 
                
                	Artist artist = new Artist(nameInput,genreInput,popularity);
                	agenda.addArtist(artist);
                
                }
                else
                {
                	JOptionPane.showMessageDialog(addArtistFrame, "One of the fields is not filled in correctly. Artist is not saved!");
                }
            }
            catch(NumberFormatException nf)
            {
            	JOptionPane.showMessageDialog(addArtistFrame, "Please enter a whole number for popularity.");
            }
            
        }
    });
		
		
		

		JPanel content = new JPanel(null);
		content.add(name);
		content.add(nameField);
		content.add(genre);
		content.add(genreField);
		content.add(popularity);
		content.add(popularityField);
		content.add(button);
		addArtistFrame.setContentPane(content);

	}

	private void addPerformance()
	{
		
		
		
		JFrame addPerformanceFrame = new JFrame();
		addPerformanceFrame.addWindowListener(new java.awt.event.WindowAdapter()
				{
		public void windowClosing(java.awt.event.WindowEvent windowEvent)
		{
			closeFrame(addPerformanceFrame);
		}
				});
				
				
				
		addPerformanceFrame.setResizable(false);
		addPerformanceFrame.setVisible(true);
		addPerformanceFrame.setBounds(100, 100, 616, 300);
		
		addPerformanceFrame.getContentPane().setLayout(null);
		
		JLabel addArtistToLabel = new JLabel("Add artist to performance");
		addArtistToLabel.setBounds(12, 41, 203, 16);
		addPerformanceFrame.getContentPane().add(addArtistToLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(227, 41, 95, 22);
		addPerformanceFrame.getContentPane().add(comboBox);
		
		JLabel removeArtistFromLabel = new JLabel("Remove artist from performance");
		removeArtistFromLabel.setBounds(12, 73, 203, 16);
		addPerformanceFrame.getContentPane().add(removeArtistFromLabel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(227, 73, 95, 22);
		addPerformanceFrame.getContentPane().add(comboBox_1);
		
		JButton addButton = new JButton("Add");
		addButton.setBounds(334, 41, 88, 25);
		addPerformanceFrame.getContentPane().add(addButton);
		
		JButton removeButton = new JButton("Remove");
		removeButton.setBounds(334, 73, 88, 25);
		addPerformanceFrame.getContentPane().add(removeButton);
		
		JLabel performingArtistsLabel = new JLabel("Performing artists");
		performingArtistsLabel.setBounds(444, 13, 95, 16);
		addPerformanceFrame.getContentPane().add(performingArtistsLabel);
		
		JLabel artistLabel = new JLabel("artist+ 20");
		artistLabel.setBounds(444, 41, 56, 16);
		addPerformanceFrame.getContentPane().add(artistLabel);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(109, 121, 95, 22);
		addPerformanceFrame.getContentPane().add(comboBox_2);
		
		JLabel stageLabel = new JLabel("Stage");
		stageLabel.setBounds(12, 124, 56, 16);
		addPerformanceFrame.getContentPane().add(stageLabel);
		
		JTextField textField_3 = new JTextField();
		textField_3.setBounds(109, 179, 116, 22);
		addPerformanceFrame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JTextField textField_4 = new JTextField();
		textField_4.setBounds(336, 179, 116, 22);
		addPerformanceFrame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel startTimeLabel = new JLabel("Start Time");
		startTimeLabel.setBounds(12, 182, 85, 16);
		addPerformanceFrame.getContentPane().add(startTimeLabel);
		
		JLabel endTimeLabel = new JLabel("End Time");
		endTimeLabel.setBounds(247, 182, 56, 16);
		addPerformanceFrame.getContentPane().add(endTimeLabel);
		
		JButton doneButton = new JButton("Done");
		doneButton.setBounds(489, 215, 97, 25);
		addPerformanceFrame.getContentPane().add(doneButton);
		
	}

	private void deleteData()
	{
		JFrame deleteFrame = new JFrame();
		deleteFrame.setBounds(100, 100, 557, 262);
		deleteFrame.setVisible(true);
		deleteFrame.addWindowListener(new java.awt.event.WindowAdapter()
		{
			public void windowClosing(java.awt.event.WindowEvent windowEvent)
			{
	closeFrame(deleteFrame);
			}
		});
		
		deleteFrame.getContentPane().setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(52, 36, 161, 22);
		deleteFrame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(52, 84, 161, 22);
		deleteFrame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(52, 139, 161, 22);
		deleteFrame.getContentPane().add(comboBox_2);
		
		JButton btnNewButton = new JButton("Delete Artist");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(312, 35, 167, 25);
		deleteFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Delete Stage");
		btnNewButton_1.setBounds(312, 83, 167, 25);
		deleteFrame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete Performance");
		btnNewButton_2.setBounds(312, 138, 167, 25);
		deleteFrame.getContentPane().add(btnNewButton_2);
		
	}
	
	
	
	private void generateAgenda()
	{
		agendaTable = new JTable(getRows(), getCollums());

	}


	
	
	
	
	// TODO switch return values of rows and collums depending on where we want
	// the time!!!

	
	
	
	
	/*
	 * returns the amount of rows that the agenda needs 1 row for the times and
	 * the rest is the amounth of stages
	 */
	private int getCollums()
	{
		return 1 + agenda.getStages().size();

	}

	/*
	 * return the ammount of collums that the agenda needs 49 stands for 1
	 * collum of stages and 48 parts of half hours
	 */
	private int getRows()
	{
		return 49;
	}

	/**
	 * 
	 * @param f frame you want to close
	 */
	private void closeFrame(Frame f)
	{
		f.dispose();
		
	}
	
	
}