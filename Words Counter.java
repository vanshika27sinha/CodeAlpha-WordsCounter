package CWH09;
import java.awt.event.*;
import javax.swing.*;

public class CHARCOUNT extends JFrame implements ActionListener {
    JTextArea t;
    JButton button1,button2;
    CHARCOUNT(){
        super("Words Counter by Vanshika");
        t=new JTextArea();
        t.setBounds(60,60,350,250);
        button1=new JButton("word");
        button1.setBounds(100,350,140,40);
        button2=new JButton("character");
        button2.setBounds(230,350,140,40);
        button1.addActionListener(this);
        button2.addActionListener(this);
        add(button1);add(button2);add(t);
        setSize(350,350);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent a){
        String text=t.getText();
        if(a.getSource()==button1) {
            String words[] = text.split("\\s");
            JOptionPane.showMessageDialog(this, "total words" + words.length);
        }
        if(a.getSource()==button2){
            JOptionPane.showMessageDialog(this,"total number of characters including space"+text.length());

        }
    }
    public static void main(String[] args) {
        new CHARCOUNT();

    }
}
