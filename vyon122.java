//Two key press simultanously
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*<applet code="vyon122" width=500 height=500>
</applet>*/
public class vyon122 extends JApplet implements KeyListener
{       int x,y,k;
        boolean k1,k2,k3,k4;
        private JPanel panel;
        public void init()
        { addKeyListener(this);
          requestFocus();
          x=200;
          y=200;
          panel = new JPanel()
          { protected void paintComponent(Graphics g)
            { super.paintComponent(g);
              try
              { g.fillOval(x,y,15,15);
              }
              catch(Exception e)
              {}
            }
          };
          add(panel);
        }
        public void keyPressed(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          k1=true;
          if(k==39)
          k3=true;
          if(k==38)
          k2=true;
          if(k==40)
          k4=true;
          if(k1==true)
          x=x-5;
          if(k3==true)
          x=x+5;
          if(k2==true)
          y=y-5;
          if(k4==true)
          y=y+5;
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        { k=ke.getKeyCode();
          if(k==37)
          k1=false;
          if(k==39)
          k3=false;    
          if(k==38)
          k2=false;    
          if(k==40)
          k4=false;    
          repaint();
        }
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { super.paint(g);
          setSize(400,400);
        }
}
