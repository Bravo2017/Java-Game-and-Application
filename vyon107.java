//Arrange Game 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
/*<applet code="vyon107" width=200 height=200>
</applet>*/
public class vyon107 extends Applet implements KeyListener
{       int m[]=new int[16];
        int a[][]=new int[4][4];
        int x1,y1,x2,y2,i,j,p1=3,q1=3,e1,e2,t,c=1,o=0,h,k1;
        public void init()
        { int r1;
          addKeyListener(this);
          requestFocus();
          int k=0;
          while(k<15)
          { int e=0;
            Random r=new Random();
            r1=1+r.nextInt(15);
            for(int l=0;l<k;l++)
            { if(m[l]==r1)
	      { k--;
		e=1;
	      }
	    }
	    if(e==0)
            m[k]=r1;
	    k++;
	  }
          int p=0;
          for(i=0;i<4;i++)
          { for(j=0;j<4;j++)
            { if(p<15)
              { a[i][j]=m[p];
                p++;
              }
              else if(p==15)
              a[i][j]=0;
            }
          } 
        }
        public void keyPressed(KeyEvent ke)
        { int k=ke.getKeyCode();
          if(k==39)
          { if(q1==0)
            e1=0;
            else
            e1=1;
            t=a[p1][q1];
            a[p1][q1]=a[p1][q1-e1];
            a[p1][q1-e1]=t;
            q1=q1-e1;
          }
          else if(k==40)
          { if(p1==0)
            e2=0;
            else
            e2=1;
            t=a[p1][q1];
            a[p1][q1]=a[p1-e2][q1];
            a[p1-e2][q1]=t;
            p1=p1-e2;
          }
          else if(k==37)
          { if(q1==3)
            e1=0;
            else
            e1=-1;
            t=a[p1][q1];
            a[p1][q1]=a[p1][q1-e1];
            a[p1][q1-e1]=t;
            q1=q1-e1;
          }
          else if(k==38)
          { if(p1==3)
            e2=0;
            else
            e2=-1;
            t=a[p1][q1];
            a[p1][q1]=a[p1-e2][q1];
            a[p1-e2][q1]=t;
            p1=p1-e2;
          }
          repaint();
        }
        public void keyReleased(KeyEvent ke)
        {}
        public void keyTyped(KeyEvent ke)
        {}
        public void paint(Graphics g)
        { //showStatus("           c="+c+"  o= "+o);
          if(o==1)
          { setBackground(Color.WHITE);
            g.drawString("YOU WIN",50,50);
          }
          else
          { g.setColor(Color.YELLOW);
            y1=20;
            y2=y1;
            for(i=1;i<6; i++)
            { g.drawLine(20,y1,180,y2);
              y1=y1+40;
              y2=y1;
            }
            x1=20;
            x2=20;
            for(i=1;i<6;i++)
            { g.drawLine(x1,20,x2,180);
              x1=x1+40;
              x2=x1;
            }
            h=0;
            k1=0;
            g.setColor(Color.ORANGE);
            for(i=1;i<6;i++)
            { for(j=1;j<5;j++)
              { g.drawLine(22+h,19+k1,58+h,19+k1);
                h=h+40;
              }
              h=0;
              k1=k1+40;
            }
            x1=40;
            y1=40;
            for(i=0;i<4;i++)
            { for(j=0;j<4;j++)
              { g.setColor(Color.BLACK);
                if(a[i][j]==0)
                g.drawString("",x1,y1);
                else
                g.drawString(""+a[i][j],x1,y1);
                x1=x1+40;
              }
              y1=y1+40;
              x1=40;
            }
            for(i=0;i<4;i++)
            { for(j=0;j<4;j++)
              { if(a[i][j]==c)
                c++;
                else
                c=1;
                if(c==16)
                { o=1;
                  repaint();
                }
              }
            }
          }
          setSize(200,200);
        }
}
