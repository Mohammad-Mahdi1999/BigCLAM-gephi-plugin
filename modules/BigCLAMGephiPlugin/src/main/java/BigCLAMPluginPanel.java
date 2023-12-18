import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BigCLAMPluginPanel extends JPanel {

    private JTextField textField1;
    private JTextField textField2;

    public BigCLAMPluginPanel() {
        initializeUI();
    }

    private void initializeUI() {
        setLayout(new GridLayout(3, 2));

        JLabel label1 = new JLabel("number of Nodes:");
        textField1 = new JTextField();
        JLabel label2 = new JLabel("number of Communities:");
        textField2 = new JTextField();

        add(label1);
        add(textField1);
        add(label2);
        add(textField2);

        JButton okButton = new JButton("OK");
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
        add(okButton);
    }

    private void onOK() {
        String numNodes = textField1.getText();
        String numCommunities = textField2.getText();

        // Use the values as needed (e.g., print or process them)
        System.out.println("number of Nodes: " + numNodes);
        System.out.println("number of Communities: " + numCommunities);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("BigCLAMPluginPanel Test");
                BigCLAMPluginPanel panel = new BigCLAMPluginPanel();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.getContentPane().add(panel);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
}