//Shoot the Box
import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.Random;
public class Shoot_the_Box extends Applet implements MouseListener,MouseMotionListener
{ int x,y,w,z,a,b,c,c1,x1,y1,e,f,s;
  double m,m1,i,j,i1,j1,a1,e1;
  public void init()
  { addMouseListener(this);
    addMouseMotionListener(this);
    a=90;
    b=290;
    x=100;
    y=300;
    e=300;
    f=100;
  }
  public void mouseClicked(MouseEvent me)
  {}
  public void mouseEntered(MouseEvent me)
  {}
  public void mouseExited(MouseEvent me)
  {}
  public void mousePressed(MouseEvent me)
  { w=100;
    z=300;
  }
  public void mouseReleased(MouseEvent me)
  { x=me.getX();
    y=me.getY();
    c=1;
    repaint();
  }
  public void mouseMoved(MouseEvent me)
  {}
  public void mouseDragged(MouseEvent me)
  { x=me.getX();
    y=me.getY();
    repaint();
  }
  public void paint(Graphics g)
  { try
    { setSize(500,400);
      g.drawLine(100,0,100,400);
      g.drawLine(0,300,500,300);
      g.fillOval(a,b,20,20);
      g.drawRect(e,f,40,40);
      if(a>=e&&a<=e+40&&b>=f&&b<=f+40)
      { Font fo=new Font("Arial",Font.BOLD,24);
        g.setFont(fo);
        g.drawString("GOAL",150,50);
        s=1;
      }
      if(s==0)
      { if(w>=95&&w<=105&&z>=295&&z<=305&&c1==0)
        { g.drawLine(w,z,x,y);
          g.drawOval(x-7,y-5,12,12);
          i=y-290;
          j=x-90;
          m=i/j;
          Random r=new Random();
          y1=50+r.nextInt(100);
          x1=250+r.nextInt(100);
          i1=y1-100;
          j1=x1-300;
          m1=i1/j1;
        }
        if(c==1&&c1==0)
        { c=0;
          c1=1;
        }
        if(c1==1)
        { if(x<=100)
          a=a+5;
          else if(x>100)
          a=a-5;
          a1=a;
          b=(int)(m*(a1-90))+290;
          if(x1<=300)
          e=e+1;
          else if(x1>300)
          e=e-1;
          e1=e;
          f=(int)(m1*(e1-300))+100;
        }
        /*Color c1=new Color(153,217,234);
        Color c2=new Color(0,162,232);
        Graphics2D g2 = (Graphics2D) g;
        g2.setPaint(new GradientPaint(0,0,c1,200,200,c2,true));
        Rectangle r = new Rectangle(0,0,500,400);
        g2.fill(r);*/
        Thread.sleep(60);
        repaint();
      }
    }
    catch(Exception e)
    {}
  }
}

       
