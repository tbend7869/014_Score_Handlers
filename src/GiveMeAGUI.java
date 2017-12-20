import javax.swing.JFrame;

public class GiveMeAGUI {

	public void createAndShowGUI() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("Score Board");
		
		ScoreBoard demo = new ScoreBoard();
		frame.setContentPane(demo.createContentPane());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(360, 250);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}

}
