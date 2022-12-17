package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel LeapPanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        btnCheckYear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String inputyear = tfYear.getText();
                    int year = Integer.parseInt(inputyear);
                    if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                        JOptionPane.showMessageDialog(LeapPanel, "Leap Year");
                    }
                    if (year < 0) {
                        throw new IllegalArgumentException("Years not be negative");
                    }
                    else {
                        JOptionPane.showMessageDialog(LeapPanel, "Not a Leap Year");
                    }
                } catch (NullPointerException | NumberFormatException error) {
                    JOptionPane.showMessageDialog(null, "Please enter a correct year");
                } catch(IllegalArgumentException error2){
                    JOptionPane.showMessageDialog(null, error2.getMessage());
                }

            }
        });
    }




        public static void main(String[] args) {
        LeapYearGUI app = new LeapYearGUI();
        app.setTitle("Leap Year Checker");
        app.setContentPane(app.LeapPanel);
        app.setSize(1280, 720);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}