import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class main{
    public static void main(String[] args) {
        //HashMap data structure is used by a key,value statement of the username and the User Object in order to store each user
        Map<String,User> list = new HashMap<>();

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

        //Characteristics/items for the main page
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

        //Characteristics/items for the login page
        JLabel ran = new JLabel("Log in to the Volunteering Hub");
        ran.setBounds(525,150,800,250);
        ran.setFont(new Font("Times New Roman",Font.PLAIN,60));
        loginPanel.add(ran);

        JTextField username_input = new JTextField("");
        username_input.setBounds(700,450,400,30);
        username_input.setFont(new Font("Times New Roman",Font.PLAIN,20));
        username_input.setBackground(Color.LIGHT_GRAY);
        username_input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginPanel.add(username_input);


        JLabel username = new JLabel("Username: ");
        username.setBounds(600,450,400,30);
        username.setFont(new Font("Times New Roman",Font.PLAIN,20));
        username.setBackground(Color.cyan);
        loginPanel.add(username);

        JPasswordField password_input = new JPasswordField("");
        password_input.setBounds(700,550,400,30);
        password_input.setFont(new Font("Times New Roman",Font.PLAIN,20));
        password_input.setBackground(Color.LIGHT_GRAY);
        password_input.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        loginPanel.add(password_input);

        JLabel password = new JLabel("Password: ");
        password.setBounds(600,550,400,30);
        password.setFont(new Font("Times New Roman",Font.PLAIN,20));
        password.setBackground(Color.cyan);
        loginPanel.add(password);

        JButton login = new JButton("Log In");
        login.setBounds(700,650,300,60);
        login.setFont(new Font("Times New Roman",Font.PLAIN,30));
        loginPanel.add(login);

        //When the login button is pressed, the data is collected and checks if this is in the database
        login.addActionListener(e -> {
            String username_text = username_input.getText();
            char[] password_list = password_input.getPassword();
            String password_text = new String(password_list); //Check if this works
            //Change the card layout to display a different panel
            if(list.containsKey(username_text) && list.get(username_text).getPassword().equals(password_text)){
                cardLayout.show(panel, "mainPanel");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }


        });
        //Signup Panel
        JPanel signUpPanel = new JPanel(null);
        signUpPanel.setPreferredSize(new Dimension(2000,2000));

        JLabel signUp = new JLabel("Sign up to the Volunteering Hub");
        signUp.setBounds(475,100,800,250);
        signUp.setFont(new Font("Times New Roman",Font.PLAIN,60));
        signUpPanel.add(signUp);

        JTextField username_input_signIn = new JTextField("");
        username_input_signIn.setBounds(500,353,200,30);
        username_input_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        username_input_signIn.setBackground(Color.LIGHT_GRAY);
        username_input_signIn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        signUpPanel.add(username_input_signIn);


        JLabel username_signIn = new JLabel("Username: ");
        username_signIn.setBounds(315,350,200,30);
        username_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        username_signIn.setBackground(Color.cyan);
        signUpPanel.add(username_signIn);

        JPasswordField password_input_signIn = new JPasswordField("");
        password_input_signIn.setBounds(500,478,200,30);
        password_input_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        password_input_signIn.setBackground(Color.LIGHT_GRAY);
        password_input_signIn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        signUpPanel.add(password_input_signIn);

        JLabel password_signIn = new JLabel("Password: ");
        password_signIn.setBounds(325,475,200,30);
        password_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        password_signIn.setBackground(Color.cyan);
        signUpPanel.add(password_signIn);

        JTextField email_Input_signIn = new JTextField("");
        email_Input_signIn.setBounds(1150,353,200,30);
        email_Input_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        email_Input_signIn.setBackground(Color.LIGHT_GRAY);
        email_Input_signIn.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        signUpPanel.add(email_Input_signIn);


        JLabel email_signIn = new JLabel("Email: ");
        email_signIn.setBounds(1030,350,200,30);
        email_signIn.setFont(new Font("Times New Roman",Font.PLAIN,40));
        email_signIn.setBackground(Color.cyan);
        signUpPanel.add(email_signIn);


        JButton signIn = new JButton("Log In");
        signIn.setBounds(700,650,300,60);
        signIn.setFont(new Font("Times New Roman",Font.PLAIN,30));
        signUpPanel.add(signIn);





        //Adds the different panels to the main panel and shows the main panel first
        panel.add(mainPanel, "mainPanel");
        panel.add(loginPanel, "loginPanel");
        panel.add(signUpPanel, "signUpPanel");
        cardLayout.show(panel, "mainPanel");

        //When pressed the login button, the page will change to the login page(the cardLayout changes the panel from mainPanel to loginPanel)
        button.addActionListener(e -> cardLayout.show(panel, "loginPanel"));
        button2.addActionListener(e -> cardLayout.show(panel, "signUpPanel"));

        frame.setVisible(true);

    }
}


