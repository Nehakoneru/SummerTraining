java login page
import java.awt.*;
import java.awt.event.*;
class LoginPage implements ActionListner
{
   String username="neha";
   String Password 
   Frame F = new Frame("Login Page");
   Button b =  new Label("Submit");
   Label l1 = new Label("user name");
   Label l2 = new Label("password");
   Label l3 = new Label("       ");
TextField t1 = new TextField(20);
textField t2 = new TextField(20);
LoginPage()
{
  f.setLayout(new FlowLayout());
  f.setVisible(true);
  f.setSize(100,200);
  f.add(l1);
  f.add(t1);
  f.add(l2);
  f.add(t2);
  f.add(b);
  b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
	String u = t1.getText();
	String p = t1.getText();
      if(u.equals(Username)&& p.equals(Password))
{
       ColorEx c = new ColorEx();
       
}
}
class Test
{
public static void main(String[]args) 
{
LoginPage p =new LoginPage();
}
}
