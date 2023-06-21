import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static double price = 0;
    static ArrayList<String> pizzaList = new ArrayList<> ();

    public static void pizzaMenu() {
        JFrame jFrame = new JFrame ("Order your pizza");
        jFrame.setLayout (null);
        jFrame.setSize (500, 360);
        jFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        JTextArea orders = new JTextArea ("Your order: \n");
        Border ordersBorder = BorderFactory.createLineBorder (Color.RED);
        orders.setBorder (ordersBorder);
        orders.setPreferredSize (new Dimension (150, 500));
        orders.setBounds (320, 110, 150, 280);
        jFrame.add (orders);

        JLabel totalPrice = new JLabel ("Total price: " + price + "lv.");
        Border border = BorderFactory.createLineBorder (Color.BLACK);
        totalPrice.setBorder (border);
        totalPrice.setPreferredSize (new Dimension (150, 50));
        totalPrice.setBounds (320, 50, 150, 50);
        jFrame.add (totalPrice);

        JLabel margaritta = new JLabel ("Margaritta");
        margaritta.setPreferredSize (new Dimension (150, 100));
        margaritta.setHorizontalAlignment (JLabel.LEFT);
        margaritta.setText ("Margaritta");
        margaritta.setBounds (50, 30, 150, 100);
        margaritta.setVisible (true);
        jFrame.add (margaritta);

        JButton orderMargaritta = new JButton ("Add");
        orderMargaritta.setBounds (200, 50, 100, 50);
        orderMargaritta.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String text = orders.getText ();
                text += margaritta.getText () + "\n";
                orders.setText (text);
                price += 7.5;
                totalPrice.setText ("Total price: " + price + "lv.");
            }
        });
        jFrame.add (orderMargaritta);

        JLabel quattroformaggi = new JLabel ("Quattro Formaggi");
        quattroformaggi.setPreferredSize (new Dimension (150, 100));
        quattroformaggi.setHorizontalAlignment (JLabel.LEFT);
        quattroformaggi.setText ("Quattro Formaggi");
        quattroformaggi.setBounds (50, 100, 150, 100);
        quattroformaggi.setVisible (true);
        jFrame.add (quattroformaggi);

        JButton orderQuattroFormaggi = new JButton ("Add");

        orderQuattroFormaggi.setBounds (200, 120, 100, 50);
        orderQuattroFormaggi.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String text = orders.getText ();
                text += quattroformaggi.getText () + "\n";
                orders.setText (text);
                price += 10.5;
                totalPrice.setText ("Total price: " + price + "lv.");
            }
        });
        jFrame.add (orderQuattroFormaggi);

        JLabel chicken = new JLabel ("Chicken");
        chicken.setPreferredSize (new Dimension (150, 100));
        chicken.setHorizontalAlignment (JLabel.LEFT);
        chicken.setText ("Chicken");
        chicken.setBounds (50, 170, 150, 100);
        chicken.setVisible (true);
        jFrame.add (chicken);

        JButton orderChicken = new JButton ("Add");

        orderChicken.setBounds (200, 190, 100, 50);
        orderChicken.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String text = orders.getText ();
                text += chicken.getText () + "\n";
                orders.setText (text);
                price += 12.5;
                totalPrice.setText ("Total price: " + price + "lv.");
            }
        });
        jFrame.add (orderChicken);


        JLabel peperoni = new JLabel ("Peperoni");
        peperoni.setPreferredSize (new Dimension (150, 100));
        peperoni.setHorizontalAlignment (JLabel.LEFT);
        peperoni.setText ("Peperoni");
        peperoni.setBounds (50, 240, 150, 100);
        peperoni.setVisible (true);
        jFrame.add (peperoni);

        JButton orderPeperoni = new JButton ("Add");

        orderPeperoni.setBounds (200, 260, 100, 50);
        orderPeperoni.addActionListener (new ActionListener () {
            public void actionPerformed(ActionEvent e) {
                String text = orders.getText ();
                text += peperoni.getText () + "\n";
                orders.setText (text);
                price += 9.5;
                totalPrice.setText ("Total price: " + price + "lv.");
            }
        });
        jFrame.add (orderPeperoni);


        LocalDate dateNow = LocalDate.now ();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern ("E dd-MM-yyyy");
        String formattedDate = dateNow.format (formatter);
        JLabel date = new JLabel (formattedDate);
        date.setBorder (border);
        date.setPreferredSize (new Dimension (150, 50));
        date.setBounds (150, 370, 150, 50);
        jFrame.add (date);
        date.setVisible (false);

        JButton purchase = new JButton ("Purchase");
        purchase.setBounds (200, 340, 100, 50);
        purchase.addActionListener (new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                orders.setBounds (150, 20, 150, 280);
                totalPrice.setBounds (150, 310, 150, 50);
                date.setVisible (true);

                jFrame.getContentPane().removeAll();
                jFrame.getContentPane().repaint();
                jFrame.add(date);
                jFrame.add(orders);
                jFrame.add(totalPrice);

            }
        });

        jFrame.add (purchase);


        jFrame.setVisible (true);


    }

    public static void main(String[] args) {
        pizzaMenu ();
    }

}
