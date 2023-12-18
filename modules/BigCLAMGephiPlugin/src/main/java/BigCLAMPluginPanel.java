import javax.swing.*;
import java.awt.*;

public class BigCLAMPluginPanel extends JPanel {

    JTextField kvalue;

    @SuppressWarnings("unchecked")
    public BigCLAMPluginPanel() {
        //this.setLayout(null);
        JLabel jXHeader1 = new JLabel();

        jXHeader1.setText("Enter the value for k (clique size, ex: k = 3 will find triangualrs). Higher values of k may take more time for computation. This algorithm is NP-Hard, so use it carefully."); // NOI18N

        JLabel label = new JLabel("Enter value of k here:");
        label.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 13));
        this.add(label);
        kvalue = new JTextField();
        this.add(kvalue);
        Insets insets = this.getInsets();

        Dimension size = label.getPreferredSize();
        label.setBounds(20 + insets.left, 30 + insets.top, size.width, size.height);

        Dimension size1 = kvalue.getPreferredSize();
        kvalue.setBounds(20 + insets.left, 130 + insets.top, size1.width + 20, size1.height);

        javax.swing.GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);

        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jXHeader1, javax.swing.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label)
                                .addContainerGap(354, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(kvalue)
                                .addContainerGap(382, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jXHeader1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(kvalue)
                                .addContainerGap(187, Short.MAX_VALUE))
        );
    }

    public int getK() {
        int i = 0;
        try {
            i = Integer.valueOf(kvalue.getText());
        } catch (Exception ex) {
            return 0;
        }
        return i;
    }

    public void setK(int k) {
        this.kvalue.setText(String.valueOf(k));
    }
}