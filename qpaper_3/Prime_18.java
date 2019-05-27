import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Prime_18 extends Applet implements ActionListener{
    TextField t, t1;
    Label l1;
    public Prime_18(){
        l1 = new Label("Enter number: ");
        t = new TextField("", 12);
        t1 = new TextField("", 12);
        add(l1);
        add(t);
        add(t1);
        t.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        String a = t.getText().trim();
        int n = Integer.parseInt(a), f=1;
        if(n < 2)
            t1.setText("Not Prime");
        else{
            for(int i=2;i<=n/2; i++){
                if(n%i==0){
                    t1.setText("Not Prime");
                    f=0;
                    break;
                }
            }
            if(f==1)
                t1.setText("Prime");
        }
    }
}