//Butterfly Curve
import java.awt.*;
import java.applet.*;
import java.awt.geom.Line2D;
public class Butterfly_Curve extends Applet
{ double x0[]=new double[1000];
  double y0[]=new double[1000];
  double x1[]=new double[1000];
  double y1[]=new double[1000];
  double theta = 0.0;
  int i;
  public void init()
  { i=0;
    x0[0]=0;
    y0[0]=0;
  }
  public void paint(Graphics g)
  { try
    { setSize(500,500);
      Graphics2D g2 = (Graphics2D) g;
      double r = Math.exp(Math.cos(theta)) - 2*Math.cos(4*theta) + Math.pow(Math.sin(theta/12), 5);
      x1[i] = r * Math.cos(theta);
      y1[i] = r * Math.sin(theta);
      x0[i] = x1[i]*100;
      y0[i] = y1[i]*100;
      theta += 0.05;
      i++;
      for(int j=0;j<1000;j++)
      g2.draw(new Line2D.Double(x0[j]+200,y0[j]+250,x1[j]+200,y1[j]+250));
      Thread.sleep(100);
      if(theta <8)
      repaint();
    }
    catch(Exception e)
    {}
  }
}

       
