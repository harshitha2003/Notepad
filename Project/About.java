package Project;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class About extends JFrame {
    About(){
        setBounds(100,100,500,400);
        setTitle("About ThinkPad Application");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(null);
        
       // ImageIcon icon = new ImageIcon(getClass().getResource("my_logo.png"));
       // setIconImage(icon.getImage());

       // JLabel iconLabel = new JLabel(new ImageIcon(getClass().getResource("my_logo.png")));
      //  iconLabel.setBounds(50,30,293,255);;
       // add(iconLabel);

        JLabel textLabel = new JLabel("<html>Welcome to ThinkPad<br>ThinkPad is a simple text editor created by Me Where you can change Font<br>All Rights Reserved@2023</html>");
        textLabel.setBounds(100,170,400,300);
        add(textLabel);
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }
}