package org;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Library!");
        pizzaMenu();
    }

    public static double price = 0;
    private List<String> pizzaList = new ArrayList<String>();

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


        JLabel margaritta = addJLabel(jFrame, "Margaritta", 50);
        addButton(jFrame, orders, totalPrice, margaritta, 50, 7.5);

        JLabel quattroformaggi = addJLabel(jFrame, "Quattro Formaggi", 100);
        addButton(jFrame, orders, totalPrice, quattroformaggi, 120, 10.5);

        JLabel chicken = addJLabel(jFrame, "Chicken", 170);
        addButton(jFrame, orders, totalPrice, chicken, 190, 12.5);

        JLabel peperoni = addJLabel(jFrame, "Peperoni", 240);
        addButton(jFrame, orders, totalPrice, peperoni, 260, 9.50);


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

    private static void addButton(JFrame jFrame, JTextArea orders, JLabel totalPrice, JLabel pizza, int y, double pizzaPrice) {
        JButton orderMargaritta = new JButton ("Add");
        orderMargaritta.setBounds (200, y, 100, 50);
        orderMargaritta.addActionListener (new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = orders.getText ();
                text += pizza.getText () + "\n";
                orders.setText (text);
                price += pizzaPrice;
                totalPrice.setText ("Total price: " + price + "lv.");
            }
        });
        jFrame.add (orderMargaritta);
    }

    private static JLabel addJLabel(JFrame jFrame, String pizzaType, int y) {
        JLabel pizza = new JLabel (pizzaType);
        pizza.setPreferredSize (new Dimension (150, 100));
        pizza.setHorizontalAlignment (JLabel.LEFT);
        pizza.setText (pizzaType);
        pizza.setBounds (50, y, 150, 100);
        pizza.setVisible (true);
        jFrame.add (pizza);
        return pizza;
    }
}
