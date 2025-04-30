import javax.swing.*;
import java.awt.*;

public class main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);

        Label label = new Label("Volunteering Hub");
        label.setBounds(250,100,250,250);
        JButton button = new JButton("Events");
        button.setBounds(150,400,100,100);
        JButton button2 = new JButton("User");
        button2.setBounds(350,400,100,100);

        frame.add(label);
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.getContentPane().add(button2);


        frame.setVisible(true);

    }
}
