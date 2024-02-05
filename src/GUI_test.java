import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUI_test {

	static JFrame frame;
	static JPanel panel_01;
	static JPanel panel_02;
	static JCheckBox yesCheckBox;
	static JCheckBox noCheckBox;
	static JCheckBox maybeCheckBox;
	static JLabel label1;
	static JSeparator horizontal_line;
	
	public static void main(String[] args) {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		panel_01 = new JPanel();
		panel_01.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
		panel_01.setLayout(new GridLayout(0,1));
		frame.add(panel_01, BorderLayout.CENTER);
		
		label1 = new JLabel("Yes, no, or maybe?");
		panel_01.add(label1);
		
		yesCheckBox = new JCheckBox("yes");
		noCheckBox = new JCheckBox("no");
		maybeCheckBox = new JCheckBox("maybe");
		panel_01.add(yesCheckBox);
		panel_01.add(noCheckBox);
		panel_01.add(maybeCheckBox);
		
		horizontal_line = new JSeparator();
		panel_01.add(horizontal_line);
		
		JRadioButton yesButton = new JRadioButton("yes");
	    JRadioButton noButton = new JRadioButton("no");
	    JRadioButton maybeButton = new JRadioButton("maybe");

	    ButtonGroup group = new ButtonGroup();
	    group.add(yesButton);
	    group.add(noButton);
	    group.add(maybeButton);

	    panel_01.add(yesButton);
	    panel_01.add(noButton);
	    panel_01.add(maybeButton);

	    frame.pack();
	    frame.setVisible(true);
		//done

	}

}
