package SimpleCalc;
import javax.swing.*;

public class SimpleCalcGUI extends JFrame {
    private JPanel CalcuPanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){



    }
    public static void main(String[] args) {

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.CalcuPanel);
        app.setSize(1280, 720);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
