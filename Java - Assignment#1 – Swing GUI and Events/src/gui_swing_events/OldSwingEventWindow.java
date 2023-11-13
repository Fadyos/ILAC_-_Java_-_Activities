
package gui_swing_events;

// import java.awt.*;
import javax.swing.*;

public class OldSwingEventWindow {
    OldSwingEventWindow() {

        // Create a frame
        JFrame frame = new JFrame("Panel Example");

        // Default action when frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Main panel creation
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // Vertical layout

        // First Panel: Title and Instruction
        JPanel panel1 = new JPanel();
        JLabel title = new JLabel("Excel Functions");
        JLabel instruction = new JLabel("Enter your numbers separated by spaces");
        panel1.add(title);
        panel1.add(instruction);
        mainPanel.add(panel1);

        // Second Panel: Input Field
        JPanel panel2 = new JPanel();
        JTextField inputField = new JTextField(20); // Create a text field
        panel2.add(inputField);
        mainPanel.add(panel2);

        // Third Panel: Radio Buttons
        JPanel panel3 = new JPanel();
        ButtonGroup radioGroup = new ButtonGroup();
        JRadioButton autoSum = new JRadioButton("AutoSum");
        JRadioButton average = new JRadioButton("Average");
        JRadioButton maximum = new JRadioButton("Maximum");
        JRadioButton minimum = new JRadioButton("Minimum");

        radioGroup.add(autoSum);
        radioGroup.add(average);
        radioGroup.add(maximum);
        radioGroup.add(minimum);

        panel3.add(autoSum);
        panel3.add(average);
        panel3.add(maximum);
        panel3.add(minimum);
        mainPanel.add(panel3);

        // Fourth Panel: Calculate Button
        JPanel panel4 = new JPanel();
        JButton calculateButton = new JButton("Calculate");
        panel4.add(calculateButton);
        mainPanel.add(panel4);

        // Fifth Panel: Result Display
        JPanel panel5 = new JPanel();
        JLabel resultLabel = new JLabel("Result: ");
        JTextField resultField = new JTextField(10); // Create a text field for result
        resultField.setEditable(false); // Make the result field read-only
        panel5.add(resultLabel);
        panel5.add(resultField);
        mainPanel.add(panel5);

        frame.add(mainPanel);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String args[]) {
        new OldSwingEventWindow();
    }
}
