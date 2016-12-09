//A Dice Game
import java .applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/*<applet code="vyon99" width=500 height=500>
 </applet>*/
public class vyon99 extends Applet implements MouseListener
{   int x,y,i=1,f=0,c=0,a,s,r=2;
    String msg;
    public void init()
    { addMouseListener(this);
      msg="Rolling";
    }
    public void mouseClicked(MouseEvent me)
    { x=me.getX();
      y=me.getY();
      repaint();
    }
    public void mousePressed(MouseEvent me)
    {}
    public void mouseReleased(MouseEvent me)
    {}
    public void mouseEntered(MouseEvent me)
    {}
    public void mouseExited(MouseEvent me)
    {}
    public void paint(Graphics g)
    {   try
        {
        setSize(500,500);
        Color c1=new Color(0,90,0);
        Font f1=new Font("Arial",Font.BOLD,16);
        g.setFont(f1);
        setBackground(c1);
        g.setColor(Color.GREEN);
        g.drawString("A DICE GAME",180,30);
        if(f==0)
        g.drawString("What are you waiting for? PLAY IT NOW!",100,170);
        if(f==1)
        { g.drawString(""+msg, 180, 80);
          g.setColor(Color.WHITE);
          g.fillRoundRect(170,100,150,150,10,10);
        }
        g.drawLine(260,330,260,480);
        g.setColor(Color.GREEN);
        g.drawString("Press Roll to Start",300,350);
        g.setColor(Color.WHITE);
        g.fillRoundRect(300,370,100,100,10,10);
        g.setColor(Color.GREEN);
        g.drawString("ROLL",330,420);
        g.drawString("Choose your guess",80,350);
        g.setColor(Color.WHITE);
        g.fillRoundRect(80,370,45,45,10,10);
        g.fillRoundRect(130,370,45,45,10,10);
        g.fillRoundRect(180,370,45,45,10,10);
        g.fillRoundRect(80,420,45,45,10,10);
        g.fillRoundRect(130,420,45,45,10,10);
        g.fillRoundRect(180,420,45,45,10,10);
        g.setColor(Color.GREEN);
        g.drawString("1",100,400);
        g.drawString("2",150,400);
        g.drawString("3",200,400);
        g.drawString("4",100,450);
        g.drawString("5",150,450);
        g.drawString("6",200,450);
        g.setColor(Color.BLACK);
        if(x>=300&&x<=400&&y>=370&&y<=470)
        { f=1;
          c=1;
          a=0;
          s=0;
          msg="Rolling";
        }
        if(c==1)
        { if (i==1)
          { g.fillOval(230,160,30,30);
          }
          else if(i==2)
          { g.fillOval(180,110,30,30);
            g.fillOval(280,210,30,30);
          }
          else if(i==3)
          { g.fillOval(180,110,30,30);
            g.fillOval(230,160,30,30);
            g.fillOval(280,210,30,30);
          }
          else if(i==4)
          { g.fillOval(180,110,30,30);
            g.fillOval(280,110,30,30);
            g.fillOval(180,210,30,30);
            g.fillOval(280,210,30,30);
          }
          else if(i==5)
          { g.fillOval(180,110,30,30);
            g.fillOval(280,110,30,30);
            g.fillOval(180,210,30,30);
            g.fillOval(280,210,30,30);
            g.fillOval(230,160,30,30);
          }
          else if(i==6)
          { g.fillOval(180,110,30,30);
            g.fillOval(180,160,30,30);
            g.fillOval(280,110,30,30);
            g.fillOval(180,210,30,30);
            g.fillOval(280,160,30,30);
            g.fillOval(280,210,30,30);
          }
          if(a==0)
          i++;
          Thread.sleep(700);
          if(i==7)
          i=1;
          if(s==0)
          repaint();
        }
        if(s==0)
        { if (x>=80&&x<=125&&y>=370&&y<=415)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=1;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          else if (x>=130&&x<=175&&y>=370&&y<=415)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=2;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          else if (x>=180&&x<=225&&y>=370&&y<=415)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=3;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          else if (x>=80&&x<=125&&y>=420&&y<=465)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=4;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          else if (x>=130&&x<=175&&y>=420&&y<=465)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=5;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          else if (x>=180&&x<=225&&y>=420&&y<=465)
          { Random r1=new Random();
            r=1+r1.nextInt(6);
            a=6;
            s=1;
            i=r;
            if(a==r)
            msg="YOU WIN ! You Guess Correct Number";
            else
            msg="YOU LOSE ! You have to guess "+r;
            repaint();
          }
          
        }
      }
      catch(Exception e)
      {}
    }

}

