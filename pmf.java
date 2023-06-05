import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pmf 
{
    private JFrame frame;
    private JPanel panel;
    private JLabel lblTitle;
    private JLabel lblIncome;
    private JLabel lblExpense;
    private JTextField txtIncome;
    private JTextField txtExpense;
    private JButton btnCalculate;
    private JLabel lblResult;

    public pmf() 
	{
        frame = new JFrame("Personal Finance Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        lblTitle = new JLabel("Personal Finance Manager");
        lblIncome = new JLabel("Monthly Income:");
        lblExpense = new JLabel("Monthly Expense:");
        txtIncome = new JTextField();
        txtExpense = new JTextField();
        btnCalculate = new JButton("Calculate");
        lblResult = new JLabel("");

        btnCalculate.addActionListener(new ActionListener()
	 {
            @Override
            public void actionPerformed(ActionEvent e) 
		{
                double income = Double.parseDouble(txtIncome.getText());
                double expense = Double.parseDouble(txtExpense.getText());
                double savings = income - expense;
                lblResult.setText("Monthly Savings: $" + String.format("%.2f", savings));
            }
        });

        panel.add(lblTitle);
        panel.add(new JLabel());
        panel.add(lblIncome);
        panel.add(txtIncome);
        panel.add(lblExpense);
        panel.add(txtExpense);
        panel.add(btnCalculate);
        panel.add(lblResult);

        frame.add(panel);
        frame.setVisible(true);
    }

    public static void main(String[] args) 
	{
        SwingUtilities.invokeLater(new Runnable() 
		{
            @Override
            public void run() 
		{
                new pmf();
            }
        });
    }
}

