package Lib;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RollingBall extends JPanel implements ActionListener{

    int x = 100;
    int start_angle = 0;

    public RollingBall(){
        Timer t = new Timer(30, this);
        t.start();
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x,90,80,80);
        g.fillArc(x,90,80,80,start_angle,180);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       x-=2;
       start_angle += 2;
       if(x<-80) x=getWidth();
       if(start_angle>=360) start_angle=0;
       repaint();
    }
}

