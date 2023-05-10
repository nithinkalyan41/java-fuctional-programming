package Lamda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame {
    JButton  mybutton = new JButton("MY BUTTON");
    MyFrame(){
        mybutton.setBounds(100,100,200,100);
        //imperative
        /* mybutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("You clicked a button!");
            }
        });*/
        mybutton.addActionListener(
                (e) -> System.out.println("you clicked!!!!!!!!")
        );

        this.add(mybutton);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,400);
        this.setLayout(null);
        this.setVisible(true);

    }
}
