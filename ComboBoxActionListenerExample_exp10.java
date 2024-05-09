import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxActionListenerExample_exp10 extends JFrame {

    public ComboBoxActionListenerExample_exp10() {
        setTitle("ComboBox with ActionListener Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a combo box
        String[] options = {"Option 1", "Option 2", "Option 3", "Option 4", "Option 5"};
        JComboBox<String> comboBox = new JComboBox<>(options);

        // Create a label to display the selected option
        JLabel resultLabel = new JLabel("Selected option: None");

        // Create a panel and add components to it
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(comboBox);
        panel.add(resultLabel);

        // Add an action listener to the combo box
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // When a new item is selected in the combo box, update the label accordingly
                String selectedOption = (String) comboBox.getSelectedItem();
                resultLabel.setText("Selected option: " + selectedOption);
            }
        });

        // Add the panel to the frame
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ComboBoxActionListenerExample_exp10::new);
    }
}
