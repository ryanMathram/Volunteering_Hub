import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashMap;
import java.util.Map;

public class main{
    public static void main(String[] args) {
        //HashMap data structure is used by a key,value statement of the username and the User Object in order to store each user
        Map<String,User> users = new HashMap<>();
        Map<String, Event> events = new HashMap<>();

        User user1 = new User("gluski", "gluski", "gluski@gmail.com", true);
        users.put("gluski", user1);

        User user2 = new User("RedFlame", "RedFlame", "redFlame@icloud.com", false);
        users.put("RedFlame", user2);

        User user3 = new User("Kentrell", "NBAYoungboy", "nbayb@gmail.com", false);
        users.put("Kentrell", user3);


        Event event1 = new Event("San Antonio Food Bank", 50, 40,"5200 Historic, Old Hwy 90 W, San Antonio, TX 78227", "At the San Antonio Food Bank, volunteers will help sort, package, and distribute food to individuals and families in need. The work supports " +
                "the organization’s mission to fight hunger and provide essential nutrition across the community.","05/25/2025", "10:00 AM", "davidcastro@gmail.com", "David Castro");
        events.put("San Antonio Food Bank", event1);

        Event event2 = new Event("Haven for Hope", 70, 50, "1 Haven for Hope Way, San Antonio, TX 78207", "At Haven for Hope, volunteers will assist with meal service, facility upkeep, and engaging with individuals experiencing" +
                " homelessness to provide support and dignity. This event fosters compassion and community by contributing to efforts that help individuals transition from crisis to stability.", "05/29/2025", "2:00 PM", "javiersalad@icloud.com", "Javier Saldana");
        events.put("Haven for Hope", event2);

        Event event3 = new Event("Lockhill Elementary Education Night", 10,15, "5050 De Zavala Rd, San Antonio, TX 78249", "At this volunteering opportunity, you will help " +
                "adults/teachers in whichever station needs help such as the IT section, Food section, etc.", "06/01/2025", "11:00 AM", "daniellemills@android.com", "Danielle Mills");
        events.put("Lockhill Elementary Education Night", event3);

        //Creates the frame of the entire canvas, setting the bounds and to leave on the screen
        JFrame frame = new JFrame("Volunteering Hub");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(2000,2000);
        frame.setLayout(null);

        //Creates the card layout and the panel
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
        button.setBorder(new LineBorder(Color.BLACK, 2,true));

        JButton button2 = new JButton("Sign Up");
        button2.setBounds(700,600,300,60);
        button2.setFont(new Font("Times New Roman",Font.PLAIN,15));
        button2.setBorder(new LineBorder(Color.BLACK, 2,true));


        ImageIcon logo = new ImageIcon("logo.png");
        JLabel logoLabel = new JLabel(logo);
        logoLabel.setBounds(0,0,logo.getIconWidth(),logo.getIconHeight());

        //Fix this hover function
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent evt) {
                button.setBackground(new Color(80,180,255));
            }

            @Override
            public void mouseExited(MouseEvent evt) {
                button.setBackground(new Color(100,200,255));
            }
        });

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

        JButton back_login = new JButton("Back");
        back_login.setBounds(100,935,150,35);
        back_login.setFont(new Font("Times New Roman",Font.PLAIN,15));
        loginPanel.add(back_login);
        back_login.addActionListener(e -> cardLayout.show(panel, "mainPanel"));
        //When the login button is pressed, the data is collected and checks if this is in the database
        login.addActionListener(e -> {
            String username_text = username_input.getText();
            char[] password_list = password_input.getPassword();
            String password_text = new String(password_list); //Check if this works
            //Change the card layout to display a different panel
            if(users.containsKey(username_text) && users.get(username_text).getPassword().equals(password_text)){
                cardLayout.show(panel, "events");
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

        JCheckBox organizer_checkBox = new JCheckBox("Organizer");
        organizer_checkBox.setBounds(1020,490,400,50);
        organizer_checkBox.setFont(new Font("Times New Roman",Font.PLAIN,35));
        signUpPanel.add(organizer_checkBox);


        JButton signIn = new JButton("Create Account");
        signIn.setBounds(700,650,300,60);
        signIn.setFont(new Font("Times New Roman",Font.PLAIN,30));
        signUpPanel.add(signIn);

        JButton back_signin = new JButton("Back");
        back_signin.setBounds(100,935,150,35);
        back_signin.setFont(new Font("Times New Roman",Font.PLAIN,15));
        loginPanel.add(back_signin);

        back_signin.addActionListener(e -> cardLayout.show(panel, "mainPanel"));

        //When the sign-up button is pressed, the data is collected and checks if this is in the database
        signIn.addActionListener(e -> {
            String username_text_signIn = username_input_signIn.getText();
            char[] password_list_signIn = password_input_signIn.getPassword();
            String password_text_signIn = new String(password_list_signIn);
            String email_text_signIn = email_Input_signIn.getText();
            boolean isOrganizer = organizer_checkBox.isSelected();
            User user = new User(username_text_signIn, password_text_signIn, email_text_signIn, isOrganizer);
            users.put(username_text_signIn, user);
            cardLayout.show(panel, "mainPanel");
            JOptionPane.showMessageDialog(null, "Account Created Successfully");

        });

        JPanel eventab = new JPanel(null);
        eventab.setPreferredSize(new Dimension(2000,2000));
        eventab.setLayout(new BoxLayout(eventab,BoxLayout.Y_AXIS));

        //Fix Event Scroller
        for(Event e: events.values()){
            JPanel eventPanel = new JPanel();
            eventPanel.setPreferredSize(new Dimension(100,100));
            eventPanel.setLayout(new BorderLayout());
            eventPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

            JLabel event_info = new JLabel("<html><b>" + e.getName() + "</b><br>" + e.getDate() +  " at " + e.getTime()+ "<br>" + e.getLocation()+ "</html>");
            event_info.setFont(new Font("Times New Roman",Font.PLAIN,30));
            event_info.setBounds(100,350,200,30);

            JButton event_button = new JButton("Register");
            event_button.setBounds(700,650,300,60);
            event_button.setFont(new Font("Times New Roman",Font.PLAIN,30));


            eventPanel.add(event_info);
            eventPanel.add(event_button);

            event_button.addActionListener(ae ->{
                JOptionPane.showMessageDialog(null, "Registered Successfully");
            });

            eventab.add(eventPanel);
        }
        JScrollPane eventscroll = new JScrollPane(eventab);
        eventscroll.getVerticalScrollBar().setUnitIncrement(20);
        panel.add(eventscroll, "events");



        //JLabel eventsLabel = new JLabel("Events");
        //eventsLabel.setBounds(800,50,800,250);
        //eventsLabel.setFont(new Font("Times New Roman",Font.PLAIN,60));
        //eventab.add(eventsLabel);










        //Adds the different panels to the main panel and shows the main panel first
        panel.add(mainPanel, "mainPanel");
        panel.add(loginPanel, "loginPanel");
        panel.add(signUpPanel, "signUpPanel");
        panel.add(eventab, "events");
        cardLayout.show(panel, "mainPanel");

        //When pressed the login button, the page will change to the login page(the cardLayout changes the panel from mainPanel to loginPanel)
        button.addActionListener(e -> cardLayout.show(panel, "loginPanel"));
        button2.addActionListener(e -> cardLayout.show(panel, "signUpPanel"));


        frame.setVisible(true);

    }

}


