import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ScoreBoard implements ActionListener {
	
	//example  ...ScoreBoard extends JFrame implements ActionListener GOOD
	//example  ...ScoreBoard extends JFrame implements ActionListener, AnotherOne GOOD
	//example  ...ScoreBoard extends JFrame, JPanel implements ActionListener BAD
	
	//extends means inherit - use all vars and methods of the superclass
	//implements means you must use an "interface" 
	//Definition of global values and items that are part of the GUI.
	
	int homeScoreAmount = 0;
	int visitorScoreAmount = 0;
	
	JPanel titlePanel, scorePanel, buttonPanel;
	JLabel homeLabel, visitorLabel, homeScore, visitorScore;
	JButton resetButton;
	JButton addOneHome, addTwoHome, addThreeHome, addSixHome, subOneHome;
	JButton addOneVisitor, addTwoVisitor, addThreeVisitor, addSixVisitor, subOneVisitor;

	public Container createContentPane() {
		
		JPanel totalGUI = new JPanel();
		totalGUI.setSize(400,300);
		totalGUI.setBackground(Color.YELLOW);
		totalGUI.setLayout(null);
		
		
		JPanel titlePanel = new JPanel();
		titlePanel = new JPanel();
		titlePanel.setLayout(null);
		titlePanel.setLocation(10, 10);
		titlePanel.setSize(330, 30);
		totalGUI.add(titlePanel);
		
		homeLabel = new JLabel("Home Team");
		homeLabel.setLocation(0, 0);
		homeLabel.setSize(200, 30);
		homeLabel.setHorizontalAlignment(0);
		homeLabel.setForeground(Color.RED);
		titlePanel.add(homeLabel);
		
		visitorLabel = new JLabel("Vistor Team");
		visitorLabel.setLocation(140, 0);
		visitorLabel.setSize(200, 30);
		visitorLabel.setHorizontalAlignment(0);
		visitorLabel.setForeground(Color.BLUE);
		titlePanel.add(visitorLabel);
		
		scorePanel = new JPanel(); // JPanel ScorePanel = new JPanel();
		scorePanel.setLayout(null);
		scorePanel.setBackground(Color.PINK);
		scorePanel.setLocation(10, 50);
		scorePanel.setSize(330, 30);
		totalGUI.add(scorePanel);
		
		homeScore = new JLabel("" + homeScoreAmount);
		homeScore.setLocation(0, 0);
		homeScore.setSize(200, 30);
		homeScore.setHorizontalAlignment(0);
		scorePanel.add(homeScore);
		
		visitorScore = new JLabel("" + visitorScoreAmount);
		visitorScore.setLocation(140, 0);
		visitorScore.setSize(200, 30);
		visitorScore.setHorizontalAlignment(0);
		scorePanel.add(visitorScore);
		
		buttonPanel = new JPanel();
		buttonPanel.setLayout(null);
		buttonPanel.setBackground(Color.WHITE);
		buttonPanel.setLocation(10, 90);
		buttonPanel.setSize(330, 100);
		totalGUI.add(buttonPanel);
		
		addOneHome = new JButton("+ 1");
		addOneHome.setLocation(0, 0);
		addOneHome.setSize(160, 30);
		addOneHome.addActionListener(this);
		buttonPanel.add(addOneHome);
		
		addTwoHome = new JButton("+2");
		addTwoHome.setLocation(0, 35);
		addTwoHome.setSize(160, 30);
		addTwoHome.addActionListener(this);
		buttonPanel.add(addTwoHome);
		
		addOneVisitor = new JButton("+ 1");
		addOneVisitor.setLocation(170, 0);
		addOneVisitor.setSize(160, 30);
		addOneVisitor.addActionListener(this);
		buttonPanel.add(addOneVisitor);
		
		resetButton = new JButton("Start New Game!");
		resetButton.setLocation(0, 70);
		resetButton.setSize(330, 30);
		resetButton.addActionListener(this);
		buttonPanel.add(resetButton);
		
		
		return totalGUI;
	}

	//this method came to us from the interface ActionListener
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addOneHome) {
			homeScoreAmount = homeScoreAmount + 1;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addTwoHome) {
			homeScoreAmount = homeScoreAmount + 2;
			homeScore.setText("" + homeScoreAmount);
		} else if (e.getSource() == addOneVisitor) {
			visitorScoreAmount = visitorScoreAmount +1;
			visitorScore.setText("" + visitorScoreAmount);
		} else if (e.getSource() == resetButton) {
			homeScoreAmount = 0;
			visitorScoreAmount = 0;
			homeScore.setText("" + homeScoreAmount);
			visitorScore.setText("" + visitorScoreAmount);
		}
		
	}

}
