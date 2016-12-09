//Digital Clock
import java.applet.*;
import java.awt.*;
import java.util.*;
/*<applet code="vyon86" width=200 height=200>
</applet>*/
public class vyon86 extends Applet
{   
    public void paint(Graphics g)
    { try
      { setSize(250,180);
        Calendar cal = new GregorianCalendar();
        GregorianCalendar date = new GregorianCalendar();
        String hour = String.valueOf(cal.get(Calendar.HOUR));
        String minute = String.valueOf(cal.get(Calendar.MINUTE));
        String second = String.valueOf(cal.get(Calendar.SECOND));
        String msg=""+hour + ":" + minute + ":" + second;
        Font f=new Font("Arial",Font.BOLD,54);
        g.setFont(f);
        g.setColor(Color.BLUE);
        g.drawString(""+msg,30,50);
        repaint();
      }
      catch(Exception e)
      {}
  }
}
