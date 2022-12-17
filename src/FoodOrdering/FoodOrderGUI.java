package FoodOrdering;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FoodOrderGUI extends JFrame{
    private JPanel OrderPanel;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

public FoodOrderGUI(){
    btnOrder.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            try {
                ButtonGroup group = new ButtonGroup();
                group.add(rbNone);
                group.add(rb5);
                group.add(rb10);
                group.add(rb15);

                boolean selectbox = false;
                double price = 0;


                if (cPizza.isSelected()) {
                    selectbox= true;
                    price += 100;

                }
                if (cBurger.isSelected()) {
                    selectbox = true;
                    price += 80;

                }
                if (cFries.isSelected()) {
                    selectbox = true;
                    price += 65;
                }
                if (cSoftDrinks.isSelected()) {
                    selectbox= true;
                    price += 55;

                }
                if (cTea.isSelected()) {
                    selectbox = true;
                    price += 50;

                }
                if (cSundae.isSelected()) {
                    selectbox = true;
                    price += 40;

                }

                if (rbNone.isSelected()) {
                    selectbox = true;
                    price = price;

                }
                if (rb5.isSelected()) {
                    selectbox = true;
                    double disprice = price * 0.05;
                    price = price - disprice;

                }
                if (rb10.isSelected()) {
                    selectbox = true;
                    double disprice = price * 0.10;
                    price = price - disprice;

                }
                if (rb15.isSelected()) {
                    selectbox = true;
                    double  disprice = price * 0.15;
                    price = price - disprice;

                }

                if(selectbox == false) {
                    throw new Exception("Input Something");
                }
                JOptionPane.showMessageDialog(OrderPanel, "The total price is Php " + String.format("%.2f", price));
            }
            catch (Exception g) {
                JOptionPane.showMessageDialog(null,g.getMessage());
            }
        }
    });
}


    public static void main(String[] args) {
       FoodOrderGUI app = new FoodOrderGUI();
        app.setTitle("Food Ordering System");
        app.setContentPane(app.OrderPanel);
        app.setSize(1280, 720);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
