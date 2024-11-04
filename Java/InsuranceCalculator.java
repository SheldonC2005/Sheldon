import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class InsuranceCalculator extends JFrame
{
    private JTextField principalField;
    private JTextField rateField;
    private JTextField yearsField;
    private JTextField maturityField;
    private JButton calculateButton;
    public InsuranceCalculator()
    {
        setTitle("Sheldon.C(23MID0031)");
        setLayout(new GridLayout(5, 2, 10, 10));
        add(new JLabel("Deposited Money (Principal):"));
        principalField = new JTextField(10);
        add(principalField);
        add(new JLabel("Rate of Interest (%):"));
        rateField = new JTextField(10);
        add(rateField);
        add(new JLabel("Number of Years:"));
        yearsField = new JTextField(10);
        add(yearsField);
        add(new JLabel("Maturity Amount:"));
        maturityField = new JTextField(10);
        maturityField.setEditable(false);
        add(maturityField);
        calculateButton = new JButton("Calculate Maturity");
        add(calculateButton);
        calculateButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                calculateMaturity();
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setVisible(true);
    }
    private void calculateMaturity()
    {
        try
        {
            double principal = Double.parseDouble(principalField.getText());
            double rate = Double.parseDouble(rateField.getText());
            int years = Integer.parseInt(yearsField.getText());
            double maturity = principal * (1 + (rate / 100) * years);
            maturityField.setText(String.format("%.2f", maturity));
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers.", "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(() -> new InsuranceCalculator());
    }
}
