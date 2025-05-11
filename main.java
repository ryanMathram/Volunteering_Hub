import javax.swing.*;
import java.awt.*;

public class main{
    public static void main(String[] args) {
        //Creates the frame of the entire canvas, setting the bounds and to leave on the screen
        JFrame frame = new JFrame("Volunteering Hub");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,2000);
        frame.setLayout(null);

        //Creets the card layout and the panel
        CardLayout cardLayout = new CardLayout();
        JPanel panel = new JPanel(cardLayout);
        panel.setBounds(0,0,2000,2000);
        frame.add(panel);

        //Main Page Panel
        JPanel mainPanel = new JPanel(null);
        mainPanel.setPreferredSize(new Dimension(2000,2000));

        //Characterictics/items for the main page
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

        //Adds the items to the main panel
        mainPanel.add(logoLabel);
        mainPanel.add(label);
        mainPanel.add(button); // Adds Button to content pane of frame
        mainPanel.add(button2);

        //Login Panel
        JPanel loginPanel = new JPanel(null);
        loginPanel.setPreferredSize(new Dimension(2000,2000));

        //Characterictics/items for the login page
        JLabel ran = new JLabel("Log In");
        ran.setBounds(550,150,600,250);
        ran.setFont(new Font("Times New Roman",Font.PLAIN,80));
        loginPanel.add(ran);

        //Adds the different panels to the main panel and shows the main panel first
        panel.add(mainPanel, "mainPanel");
        panel.add(loginPanel, "loginPanel");
        cardLayout.show(panel, "mainPanel");

        //When pressed the login button, the page will change to the login page(the cardLayout changes the panel from mainPanel to loginPanel)
        button.addActionListener(e -> cardLayout.show(panel, "loginPanel"));

        frame.setVisible(true);

    }
}


