import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class converter extends Applet implements ActionListener{
    TextField kph, mps;
    public converter(){
        setLayout(new FlowLayout());
        Label l1 = new Label("Enter speed in kph");
        Label l2 = new Label("Speed in mps");
        kph = new TextField("", 12);
        mps = new TextField("", 12);
        add(l1);
        add(kph);
        add(l2);
        add(mps);
        kph.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        double k = Double.parseDouble(kph.getText());
        double m = k/3.6;
        mps.setText(Double.toString(m));
    }
}