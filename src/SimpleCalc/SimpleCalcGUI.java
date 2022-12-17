package SimpleCalc;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleCalcGUI extends JFrame {
    private JPanel CalcuPanel;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI(){

        btnCompute.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String input1 = tfNumber1.getText();
                    int inputNum1 = Integer.parseInt(input1);

                    String input2 = tfNumber2.getText();
                    int inputNum2 = Integer.parseInt(input2);
                    int equation = 0;
                    String operator = (String) cbOperations.getSelectedItem();


                    switch (operator) {
                        case "+":
                            equation = inputNum1 + inputNum2;
                            break;
                        case "-":
                            equation = inputNum1 - inputNum2;
                            break;
                        case "*":
                            equation = inputNum1 * inputNum2;
                            break;
                        case "/":
                            equation = inputNum1 / inputNum2;
                            break;
                    }
                    lblResult.setText(Integer.toString(equation));

            }
        });
    }

    public static void main(String[] args) {

        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.CalcuPanel);
        app.setSize(1280, 720);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
        app.lblResult.setEditable(false);

    }
}
