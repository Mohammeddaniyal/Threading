import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class xyz extends JFrame
{
JTextArea ta;
xyz()
{
Container container;
ta=new JTextArea(10,100);
ta.setLineWrap(true);
ta.setWrapStyleWord(true);
JScrollPane jsp=new JScrollPane(ta);
JButton b=new JButton("Start");
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ev)
{
aaa a=new aaa(xyz.this);
 }
});
container=getContentPane();
container.setLayout(new FlowLayout());
container.add(jsp);
container.add(b);
setLocation(100,100);
setVisible(true);
setSize(900,900);

}
public void setNum(int num)
{
ta.append(String.valueOf(num));
ta.append(" ");
}
}
class aaa extends Thread
{
aaa(xyz i)
{
Runnable r=new Runnable(){
public void run()
{
System.out.println("About to set Number");
for(int x=101;x<150;x++)
{
i.setNum(x);
try
{
Thread.sleep(250);
}catch(InterruptedException ie)
{
System.out.println(ie.getMessage());
}
}
}
};
System.out.println("Before Invoking invokeLater");
SwingUtilities.invokeLater(r);
System.out.println("After Invoking invokeLater");
}
}
class psp
{
public static void main(String gg[])
{
xyz x=new xyz();
}
}