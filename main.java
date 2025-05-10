import javax.swing.*;
import java.awt.*;

public class main{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Volunteering Hub");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,2000);
        frame.setLayout(null);


        Label label = new Label("Volunteering Hub");
        label.setBounds(550,150,600,250);
        label.setFont(new Font("Times New Roman",Font.PLAIN,80));
        JButton button = new JButton("Log In");
        button.setBounds(700,500,300,60);
        button.setFont(new Font("Times New Roman",Font.PLAIN,15));
        JButton button2 = new JButton("Sign Up");
        button2.setBounds(700,600,300,60);
        button2.setFont(new Font("Times New Roman",Font.PLAIN,15));
        ImageIcon logo = new ImageIcon("tungtungsahur.png");
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(0,0,logo.getIconWidth(),logo.getIconHeight());
        frame.add(logoLabel);

        frame.add(label);
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.getContentPane().add(button2);
        button.addActionListener(e ->{
                frame.setVisible(false);
                new logInPage();
        });

        frame.setVisible(true);

    }
}


