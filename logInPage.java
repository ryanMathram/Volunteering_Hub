import javax.swing.*;
import java.awt.*;
//Do not need class anymore but kept just for documentation for the journey
public class logInPage extends JFrame {
    public logInPage() {
        JFrame login = new JFrame("Log In");
        login.setSize(2000, 2000);
        login.setLayout(null);

        Label ran = new Label("Log In");
        ran.setBounds(550,150,600,250);
        ran.setFont(new Font("Times New Roman",Font.PLAIN,80));

        login.add(ran);

        login.setVisible(true);
    }
}

