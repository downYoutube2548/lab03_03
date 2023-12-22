import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class SimpleBankApp {
    public static void main(String[] args) {
        JFrame app = new JFrame();

        app.add(new JLabel("Simple Bank App", SwingConstants.CENTER), BorderLayout.PAGE_START);

        JPanel dataEntryPanel = new JPanel();
        dataEntryPanel.setLayout(new GridLayout(5, 2));
        dataEntryPanel.add(new JLabel("Account Number"));
        dataEntryPanel.add(new JLabel("1234-0001"));
        dataEntryPanel.add(new JLabel("Status"));
        dataEntryPanel.add(new JLabel("Active"));
        dataEntryPanel.add(new JLabel("Balance"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Amount"));
        dataEntryPanel.add(new JTextField());
        dataEntryPanel.add(new JLabel("Operation"));

        JPanel operationPanel = new JPanel();
        operationPanel.add(new JButton("Deposit"));
        operationPanel.add(new JButton("Withdraw"));

        dataEntryPanel.add(operationPanel);

        app.add(dataEntryPanel, BorderLayout.CENTER);

        // Default is HIDE_ON_CLOSE which will not exit the program when
        // clicking the X button
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.setSize(400, 240);
        app.setLocationRelativeTo(null);
        app.setVisible(true);
    }
}
