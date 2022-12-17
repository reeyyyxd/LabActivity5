package LeapYear;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeapYearGUI extends JFrame {
    private JPanel LeapPanel;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {


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