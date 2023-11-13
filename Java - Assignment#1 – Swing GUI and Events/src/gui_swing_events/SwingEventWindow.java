package gui_swing_events;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingEventWindow extends JFrame implements ActionListener {
    private int rdoChecked = 1; // Initial value for the first radio button
    private Excel excel; // Instance of the Excel class

    // Create JComponents Items based on the assignment requirements:
    private JLabel lblMain, lblRequest, lblResult;
    private JTextField txtNum, txtResult;
    private JRadioButton rdoTotal, rdoAverage, rdoMax, rdoMin;
    private ButtonGroup radioGroup;
    private JButton btnCalculate;

    // Class Constructor:
    public SwingEventWindow() {
        // Setting Windows Title by targeting the method from the super class:
        super("Excel Functions");

        // Setting Window (JFrame) Size:
        setSize(400, 300);

        // Set the Window (JFrame) visibility to true to make it visible
        setVisible(true);

        // Set the default operation for the close button to Exit the JFrame
        // (Stopping the application)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Initialize JComponents:
        lblMain = new JLabel("Excel Functions");
        lblRequest = new JLabel("Enter numbers:");
        lblResult = new JLabel("Result:");

        txtNum = new JTextField(15);
        txtResult = new JTextField(15);
        txtResult.setEditable(false);

        rdoTotal = new JRadioButton("Total");
        rdoAverage = new JRadioButton("Average");
        rdoMax = new JRadioButton("Maximum");
        rdoMin = new JRadioButton("Minimum");

        btnCalculate = new JButton("Calculate");

        // Create ButtonGroup and add radio buttons to it:
        radioGroup = new ButtonGroup();
        radioGroup.add(rdoTotal);
        radioGroup.add(rdoAverage);
        radioGroup.add(rdoMax);
        radioGroup.add(rdoMin);

        // Adding the components to their panels:
        JPanel panel1 = new JPanel(new FlowLayout());
        panel1.add(lblMain);

        JPanel panel2 = new JPanel(new FlowLayout());
        panel2.add(lblRequest);
        panel2.add(txtNum);

        JPanel panel3 = new JPanel(new GridLayout(4, 1));
        panel3.add(rdoTotal);
        panel3.add(rdoAverage);
        panel3.add(rdoMax);
        panel3.add(rdoMin);

        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(btnCalculate);

        JPanel panel5 = new JPanel(new FlowLayout());
        panel5.add(lblResult);
        panel5.add(txtResult);

        JPanel mainPanel = new JPanel(new GridLayout(6, 1));
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        mainPanel.add(panel3);
        mainPanel.add(panel4);
        mainPanel.add(panel5);

        // Adding the main panel to the JFrame:
        add(mainPanel);

        // Adding/attaching the required Events to some components:
        rdoTotal.addActionListener(this);
        rdoAverage.addActionListener(this);
        rdoMax.addActionListener(this);
        rdoMin.addActionListener(this);
        btnCalculate.addActionListener(this);
    }

    // Implementing the required ActionListener method:
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rdoTotal) {
            rdoChecked = 1;
        } else if (e.getSource() == rdoAverage) {
            rdoChecked = 2;
        } else if (e.getSource() == rdoMax) {
            rdoChecked = 3;
        } else if (e.getSource() == rdoMin) {
            rdoChecked = 4;
        } else if (e.getSource() == btnCalculate) {
            // Getting the user's input string from the first textfield:
            String userInput = txtNum.getText();

            // Initialize our "Excel" class object:
            excel = new Excel(userInput);

            // Run the if condition for checking the value of the flag variable "rdoChecked"
            if (rdoChecked == 1) {
                // call the findTotal() method
                // output/Print the result (value) in the result's textfield
                txtResult.setText(Double.toString(excel.findTotal()));
            } else if (rdoChecked == 2) {
                // call the findAvg() method
                // output/Print the result (value) in the result's textfield
                txtResult.setText(Double.toString(excel.findAvg()));
            } else if (rdoChecked == 3) {
                // call the findMax() method
                // output/Print the result (value) in the result's textfield
                txtResult.setText(Double.toString(excel.findMax()));
            } else if (rdoChecked == 4) {
                // call the findMin() method
                // output/Print the result (value) in the result's textfield
                txtResult.setText(Double.toString(excel.findMin()));
            }
        }
    }

}
