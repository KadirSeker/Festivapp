import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
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
		
		Testing test = new Testing();
		agenda = test.getAgenda();
		//@delete after done
		
		frame = new JFrame("FestiFapp");
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
				JOptionPane.showMessageDialog(frame, "This FestiFapp was developed by Project group A3.");
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
		JFrame addStageFrame = new JFrame("Add stage");
		
		
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
		
		JTextField inputField = new JTextField();
		inputField.setBounds(118, 16, 116, 22);
		addStageFrame.getContentPane().add(inputField);
		inputField.setColumns(10);
		
		JLabel addStageLabel = new JLabel("Add Stage");
		addStageLabel.setBounds(12, 19, 116, 16);
		addStageFrame.getContentPane().add(addStageLabel);
		
		JButton addButton = new JButton("Add");
		addButton.setBounds(269, 15, 74, 25);
		addButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent event) 
			{
				String stageName = inputField.getText();
				if(stageName.length() > 0)
				{
					agenda.addStage(new Stage(stageName));
					addStageFrame.dispose();
					JOptionPane.showMessageDialog(addStageFrame, "Stage is saved");
					
					
				}
				else
				{
					JOptionPane.showMessageDialog(addStageFrame, "One of the Fields is not filled in correctly Stage is not saved!");
				}
			}
				}
				);
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
		JLabel pop = new JLabel();
		name.setText("Please enter the Artist name");
		genre.setText("Please Enter the music Genre");
		pop.setText("Please Enter the Artist Popularity");
		name.setBounds(12, 66, 200, 16);
		genre.setBounds(12, 101, 200, 16);
		pop.setBounds(12, 135, 200, 16);
		
		// TODO SET BOUNDS FOR ALL THE FIELDS SO ITS NICE

		JTextField nameField = new JTextField();
		nameField.setBounds(249, 63, 116, 22);
		JTextField genreField = new JTextField();
		genreField.setBounds(249, 98, 116, 22);
		JTextField popField = new JTextField();
		popField.setBounds(249, 132, 116, 22);

		JButton button = new JButton();
		button.setBounds(125, 192, 158, 48);
		button.setText("Add Artist");
		button.addActionListener(new ActionListener() {
        
        public void actionPerformed(ActionEvent event) {
            String nameInput = nameField.getText();
            String genreInput = genreField.getText();
            String popInput = popField.getText();
            
         
            
            if(nameInput.length() > 0 && genreInput.length() > 0 && popInput.length() > 0)
            { //TODO fix the input can be 10 
            double popularity = Double.parseDouble(popInput);
            Artist artist = new Artist(nameInput,genreInput,popularity);
            agenda.addArtist(artist);
            JOptionPane.showMessageDialog(addArtistFrame, "Artist is saved");
            //System.out.println(artist.getName()+ artist.getGenre() + artist.getPopularity());
            addArtistFrame.dispose();
            }
            else
            {
            	JOptionPane.showMessageDialog(addArtistFrame, "One of the Fields is not filled in correctly Artist is not saved!");
            }
            
        }
    });
		
		
		

		JPanel content = new JPanel(null);
		content.add(name);
		content.add(nameField);
		content.add(genre);
		content.add(genreField);
		content.add(pop);
		content.add(popField);
		content.add(button);
		addArtistFrame.setContentPane(content);

	}

	private void addPerformance()
	{
		
		Performance performance = new Performance();
		
		
		JFrame addPerformanceFrame = new JFrame("Add Performance");
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
		
		JLabel lblAddArtistTo = new JLabel("Add artist to performance");
		lblAddArtistTo.setBounds(12, 41, 203, 16);
		addPerformanceFrame.getContentPane().add(lblAddArtistTo);
		
		/**
		JLabel lblUnaddArtistTo = new JLabel("Delete artist to performance");
		lblUnaddArtistTo.setBounds(12, 73, 203, 16);
		addPerformanceFrame.getContentPane().add(lblUnaddArtistTo);
		**/
		
		JLabel lblStage = new JLabel("stage");
		lblStage.setBounds(12, 124, 56, 16);
		addPerformanceFrame.getContentPane().add(lblStage);
		
		JLabel lblStartTime = new JLabel("Start Time");
		lblStartTime.setBounds(12, 182, 85, 16);
		addPerformanceFrame.getContentPane().add(lblStartTime);
		
		JLabel lblEndtime = new JLabel("End Time");
		lblEndtime.setBounds(247, 182, 56, 16);
		addPerformanceFrame.getContentPane().add(lblEndtime);
		
		
		
		
		
		JComboBox addArtistBox = new JComboBox();
		addArtistBox.setBounds(227, 41, 95, 22);
		addArtistBox.setModel(new DefaultComboBoxModel(agenda.getNamesOfArtist().toArray()));
		addPerformanceFrame.getContentPane().add(addArtistBox);
		
		/**
		JComboBox deleteArtistBox = new JComboBox();
		deleteArtistBox.setBounds(227, 73, 95, 22);
		deleteArtistBox.setModel(new DefaultComboBoxModel(performance.getNamesOfArtist().toArray()));
		addPerformanceFrame.getContentPane().add(deleteArtistBox);
		**/
		
		JComboBox stageBox = new JComboBox();
		stageBox.setBounds(109, 121, 95, 22);
		stageBox.setModel(new DefaultComboBoxModel(agenda.getNamesOfStages().toArray()));
		addPerformanceFrame.getContentPane().add(stageBox);

		
		JTextField startTimeField = new JTextField();
		startTimeField.setBounds(109, 179, 116, 22);
		addPerformanceFrame.getContentPane().add(startTimeField);
		startTimeField.setColumns(5);
		
		JTextField endTimeField = new JTextField();
		endTimeField.setBounds(336, 179, 116, 22);
		addPerformanceFrame.getContentPane().add(endTimeField);
		endTimeField.setColumns(5);
		
		/**
		
		JButton btnAdd = new JButton("S");
		btnAdd.setBounds(334, 41, 88, 25);
		btnAdd.addActionListener(new ActionListener()
		{
			//TODO fix IOOB error here
			public void actionPerformed(ActionEvent e)
			{
				if(deleteArtistBox.getItemCount() < 1)
				{
				performance.addArtist(agenda.getArtists().get(addArtistBox.getSelectedIndex()));
				deleteArtistBox.addItem(performance.getArtists().get(addArtistBox.getSelectedIndex()).getName());
				//System.out.println(performance.getArtists().size());
				}
			}
		});
		addPerformanceFrame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(334, 73, 88, 25);
		btnRemove.addActionListener(new ActionListener() 
		{

			public void actionPerformed(ActionEvent e) 
			{
				if(deleteArtistBox.getItemCount() > 0)
				{
				performance.removeArtist(deleteArtistBox.getSelectedIndex());
				deleteArtistBox.removeItemAt(deleteArtistBox.getSelectedIndex());
				System.out.println("Deleted artist");
				}
				
			}
		});
		addPerformanceFrame.getContentPane().add(btnRemove);
		
		
		
		**/
		
		
		
		
		JButton btnDone = new JButton("Done");
		btnDone.setBounds(489, 215, 97, 25);
		btnDone.addActionListener(new ActionListener()
		{
			
			public void actionPerformed(ActionEvent e)
			{
				boolean isCorrectlyFilled = true;
				//performance.getArtists().isEmpty()|| 
				if(startTimeField.getText().isEmpty() || endTimeField.getText().isEmpty())
						{
							isCorrectlyFilled = false;
						}
				
				//System.out.println(isCorrectlyFilled);
				
				
				if(isCorrectlyFilled)
				{
					Time startTime = new Time(startTimeField.getText());
					Time endTime = new Time(endTimeField.getText());
					performance.setStage(agenda.getStages().get(stageBox.getSelectedIndex()));
					performance.addArtist(agenda.getArtists().get(addArtistBox.getSelectedIndex()));
					performance.setStartTime(startTime);
					performance.setEndTime(endTime);
					agenda.addShow(performance);
					JOptionPane.showMessageDialog(addPerformanceFrame, "Performance is saved");
					
					//System.out.println("Stage:  " + performance.getStage().getName() + "/n Times:  " + performance.getStartTime().getTime() + "  "+ performance.getEndTime().getTime()
							//+ "Artist  " + performance.getArtists().get(0).getName());
					addPerformanceFrame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(addPerformanceFrame, "One of the fields is not filled corectly, stage has not been saved!");
				}
				
			}
		});
		addPerformanceFrame.getContentPane().add(btnDone);
		
		
		
		
		
		
		
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
		//TODO make new JTable if rows or such change

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