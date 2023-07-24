package Project;
import javax.swing.*;
//import java.awt.*;
import java.awt.event.*;
//import java.awt.event.AWTEventListener;
class LoginForm extends JFrame implements ActionListener{
    int id;
    int password;
    JButton b1;
    JPanel newPanel;
    JLabel userLabel,passLabel;
    JTextField textField1,textField2;

    LoginForm(){
        setBounds(100,100,800,600);
        userLabel = new JLabel("Id");
        textField1 = new JTextField(15);

        passLabel = new JLabel("Password");
        textField2 = new JTextField(15);

        b1 = new JButton("SUBMIT");   
          
        
        newPanel = new JPanel();  
        newPanel.add(userLabel);      
        newPanel.add(textField1);     
        newPanel.add(passLabel);      
        newPanel.add(textField2);  
        newPanel.add(b1);           
            
        add(newPanel);  
        b1.addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            id = Integer.parseInt(textField1.getText());
            password = Integer.parseInt(textField2.getText());
            if(id == 1 && password == 123456){
                Notepad n = new Notepad();
                n.setVisible(true);
                this.setVisible(false);
            }
            else{
                textField1.setText("");
                textField2.setText("");
             
            }
        }
    }
      public static void main(String[] args) {
            new LoginForm().setVisible(true);
        }

}
