import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Program_8 extends JFrame implements ActionListener {
    JTextField principalField;
    JTextField rateField;
    JTextField timeField;

    JLabel resultLabel;
    JButton calculateButton;

    Program_8() {

        setTitle("Investment Calculator");

        setSize(300, 250);

        setLayout(null);

        JLabel l1 = new JLabel("Principal:");
        l1.setBounds(30, 30, 100, 25);
        add(l1);

        principalField = new JTextField();
        principalField.setBounds(130, 30, 100, 25);
        add(principalField);

        JLabel l2 = new JLabel("Rate:");
        l2.setBounds(30, 70, 100, 25);
        add(l2);

        rateField = new JTextField();
        rateField.setBounds(130, 70, 100, 25);
        add(rateField);

        JLabel l3 = new JLabel("Time:");
        l3.setBounds(30, 110, 100, 25);
        add(l3);

        timeField = new JTextField();
        timeField.setBounds(130, 110, 100, 25);
        add(timeField);

        calculateButton =
                new JButton("Calculate");

        calculateButton.setBounds(90, 150, 100, 30);

        add(calculateButton);

        resultLabel = new JLabel("Result:");

        resultLabel.setBounds(30, 190, 200, 25);

        add(resultLabel);

        calculateButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            double principal =
                    Double.parseDouble(
                            principalField.getText());

            double rate =
                    Double.parseDouble(
                            rateField.getText());

            double time =
                    Double.parseDouble(
                            timeField.getText());

            double amount =
                    principal + (principal * rate * time) / 100;

            resultLabel.setText("Amount = " + amount);

        } catch (Exception ex) {

            resultLabel.setText("Enter valid numbers");
        }
    }

    public static void main(String[] args) {

        new Program_8();
    }
}