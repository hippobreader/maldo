import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleForm extends JFrame {

   
    private JTextField nameField, ageField, birthdayField;   
    private JRadioButton maleRadio, femaleRadio;
    private ButtonGroup genderGroup;
    private JButton submitButton;

    public SimpleForm() {
        
        setTitle("Fill Up Form");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); 

       
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2, 10, 10)); 

       
        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Age:"));
        ageField = new JTextField();
        panel.add(ageField);

        panel.add(new JLabel("Birthday [MM/DD/YYYY]:"));
        birthdayField = new JTextField();
        panel.add(birthdayField);

       
        panel.add(new JLabel("Gender:"));

        
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");

       
        genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        panel.add(genderPanel);

        
        submitButton = new JButton("Submit");
        panel.add(submitButton);

        
        panel.add(new JLabel(""));

        
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String age = ageField.getText();
                String birthday = birthdayField.getText();
                String gender = "";

                
                if (maleRadio.isSelected()) {
                    gender = "Male";
                } else if (femaleRadio.isSelected()) {
                    gender = "Female";
                } else {
                    JOptionPane.showMessageDialog(null, "Please select Male or Female for Gender.");
                    return;
                }

           
                JOptionPane.showMessageDialog(null, "Form Details:\n"
                        + "Name: " + name + "\n"
                        + "Age: " + age + "\n"
                        + "Birthday: " + birthday + "\n"
                        + "Gender: " + gender);
            }
        });

        
        add(panel);         

        setVisible(true);
    }

    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(() -> new SimpleForm());
    }
}
