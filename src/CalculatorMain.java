import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorMain {

	public static void main(String[] args) {
		test();
	}
	
	public static void test() {
		JFrame frame = new JFrame("Try It");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,200);
		JButton testButton = new JButton("Try This");

		testButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame newFrame = new JFrame("Hello World");
				newFrame.setSize(300,200);
				JLabel theLabel = new JLabel("Hello World");
				newFrame.add(theLabel);
				newFrame.setVisible(true);
			}
		});

		frame.getContentPane().add(testButton);

		frame.setVisible(true);
	}
}
