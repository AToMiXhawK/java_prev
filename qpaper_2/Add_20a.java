import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_20a extends Applet implements ActionListener{
    TextField t1, t2, t3;
    Button b;
    public Add_20a(){
        Label l1 = new Label("Enter number: ");
        Label l2 = new Label("Enter number: ");
        b = new Button("Add");
        t1 = new TextField("", 7);
        t2 = new TextField("", 7);
        t3 = new TextField("Answer", 7);
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        b.setBounds(135, 135, 30, 30);
        b.addActionListener(this);
        add(b);
        add(t3);
    }
    public void actionPerformed(ActionEvent e){
        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = a+b;
        t3.setText(Double.toString(c));
    }
}