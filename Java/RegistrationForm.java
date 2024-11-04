import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationForm extends JFrame
{
    private JTextField nameField, mobileField;
    private JRadioButton maleRadio, femaleRadio;
    private JComboBox<String> dayCombo, monthCombo, yearCombo;
    private JTextArea addressArea, outputArea;
    private JCheckBox termsCheckBox;
    private JButton submitButton, resetButton;
    private JLabel statusLabel;
    public RegistrationForm()
    {
        setTitle("Sheldon.C(23MID0031)");
        setLayout(null);
        JLabel nameLabel = new JLabel("Name");
        nameLabel.setBounds(20, 20, 100, 30);
        add(nameLabel);
        nameField = new JTextField();
        nameField.setBounds(130, 20, 150, 30);
        add(nameField);
        JLabel mobileLabel = new JLabel("Mobile");
        mobileLabel.setBounds(20, 60, 100, 30);
        add(mobileLabel);
        mobileField = new JTextField();
        mobileField.setBounds(130, 60, 150, 30);
        add(mobileField);
        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setBounds(20, 100, 100, 30);
        add(genderLabel);
        maleRadio = new JRadioButton("Male");
        maleRadio.setBounds(130, 100, 70, 30);
        femaleRadio = new JRadioButton("Female");
        femaleRadio.setBounds(200, 100, 70, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        add(maleRadio);
        add(femaleRadio);
        JLabel dobLabel = new JLabel("DOB");
        dobLabel.setBounds(20, 140, 100, 30);
        add(dobLabel);
        String[] days = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
        dayCombo = new JComboBox<>(days);
        dayCombo.setBounds(130, 140, 50, 30);
        add(dayCombo);
        String[] months = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
        monthCombo = new JComboBox<>(months);
        monthCombo.setBounds(185, 140, 60, 30);
        add(monthCombo);
        String[] years = { "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005" };
        yearCombo = new JComboBox<>(years);
        yearCombo.setBounds(250, 140, 70, 30);
        add(yearCombo);
        JLabel addressLabel = new JLabel("Address");
        addressLabel.setBounds(20, 180, 100, 30);
        add(addressLabel);
        addressArea = new JTextArea();
        addressArea.setBounds(130, 180, 150, 60);
        add(addressArea);
        termsCheckBox = new JCheckBox("Accept Terms And Conditions.");
        termsCheckBox.setBounds(130, 250, 250, 30);
        add(termsCheckBox);
        submitButton = new JButton("Submit");
        submitButton.setBounds(80, 300, 100, 30);
        resetButton = new JButton("Reset");
        resetButton.setBounds(200, 300, 100, 30);
        add(submitButton);
        add(resetButton);
        outputArea = new JTextArea();
        outputArea.setBounds(320, 20, 250, 220);
        outputArea.setEditable(false);
        add(outputArea);
        statusLabel = new JLabel();
        statusLabel.setBounds(20, 340, 300, 30);
        add(statusLabel);
        submitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if (termsCheckBox.isSelected())
                {
                    String name = nameField.getText();
                    String mobile = mobileField.getText();
                    String gender = maleRadio.isSelected() ? "Male" : "Female";
                    String dob = dayCombo.getSelectedItem() + "/" + monthCombo.getSelectedItem() + "/" + yearCombo.getSelectedItem();
                    String address = addressArea.getText();
                    String output = "Name : " + name + "\nMobile : " + mobile + "\nGender : " + gender + "\nDOB : " + dob + "\nAddress : " + address;
                    outputArea.setText(output);
                    statusLabel.setText("Registration Successfully Completed..");
                } 
                else
                {
                    statusLabel.setText("Please accept the terms and conditions.");
                }
            }
        });
        resetButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                mobileField.setText("");
                genderGroup.clearSelection();
                dayCombo.setSelectedIndex(0);
                monthCombo.setSelectedIndex(0);
                yearCombo.setSelectedIndex(0);
                addressArea.setText("");
                termsCheckBox.setSelected(false);
                outputArea.setText("");
                statusLabel.setText("");
            }
        });
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new RegistrationForm();
    }
}
