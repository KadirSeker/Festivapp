import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MainFrame_Gui {

	private JFrame frame;
	private JMenu[] menuItems;
	private JMenuBar menuBar;
	private Agenda agenda = new Agenda();

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
		frame.setBounds(100, 100, 800, 600);
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
		JPanel agendaPanel = new JPanel();
		JPanel datePanel = new JPanel();
		content.setLayout(new BorderLayout());
		content.add(agendaPanel, BorderLayout.NORTH);
		content.add(datePanel, BorderLayout.SOUTH);
		
		JLabel festivalDate = new JLabel("Festival Date: " + agenda.getFestivalDate() , JLabel.CENTER);
		datePanel.add(festivalDate);
		
		//TODO add the agenda somewhere here
		
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
                System.exit(0);
              //TODO make this a usefullthing
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
}