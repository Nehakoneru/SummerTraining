import java.awt.*;
import java.awt.event.*;
Class ColorEx  implements ActionListener
{
   Frame f = new Frame();
   Button b1 = new Button("green");
   Button b2 = new Button("blue");
   ColourEx() 
   {
	f.add(b1);
      f.add(b2);
      f.setLayout(new FlowLayout());
	f.setVisible(true);
	f.setsize(400,300);
	b1.addActionListener(this);
	b2.addActionListener(this);
   }
	public static void actionPerformed(ActionEvent e)
{	
	if(e.getSource()==b1)
		f.setBackground(Color.green);
	else
		f.setBackground(Color.blue);
}
}

classTestColor
{
public static void main(Strimg args[])
{
	ColorEx c1=new ColorEx()
}
}
