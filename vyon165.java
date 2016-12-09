//Tower of Hanoi(3-discs) 
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="vyon165" width=600 height=500>
</applet>*/
public class vyon165 extends Applet implements MouseListener
{       int x,y,i,j,x1,y1,w1,x2,w2,e=0,a1=0,b1=0,c1=0,f=0,m=0;
        int a[]=new int[3];
        int b[]=new int[3];
        int c[]=new int[3];
        public void init()
        { addMouseListener(this);
          a[0]=1;
          a[1]=2;
          a[2]=3;
          b[0]=0;
          b[1]=0;
          b[2]=0;
          c[0]=0;
          c[1]=0;
          c[2]=0;
          x1=60;
          y1=345;
          w1=140;
        }
        public void mouseClicked(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void mousePressed(MouseEvent me)
        { x=me.getX();
          y=me.getY();
          repaint();
        }
        public void mouseReleased(MouseEvent me)
        {}
        public void paint(Graphics g)
        { setSize(600,500);
          Font fobj = new Font("Arial", Font.BOLD, 40);
          setBackground(Color.CYAN);
          if(f==3)
          { g.setFont(fobj);
            g.setColor(Color.RED);
            g.drawString("YOU WIN",200,450);
            g.setFont(fobj);
            g.setColor(Color.RED);
            g.drawString("Tower Of Hanoi",150,70);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(118,170,20,220,5,5);
            g.fillRoundRect(280,170,20,220,5,5);
            g.fillRoundRect(440,170,20,220,5,5);
            g.setColor(Color.BLACK);
            g.drawRoundRect(118,170,20,220,5,5);
            g.drawRoundRect(280,170,20,220,5,5);
            g.drawRoundRect(440,170,20,220,5,5);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(40,370,505,25,5,5);
            g.setColor(Color.BLACK);
            g.drawRoundRect(40,370,505,25,5,5);
            x1=380;
            y1=345;
            w1=140;
            for(i=2;i>=0;i--)
            { g.setColor(Color.BLUE);
              if(c[i]==1)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(c[i]==2)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(c[i]==3)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              x1=x1+10;
              w1=w1-20;
            }
          }
          else
          { g.setFont(fobj);
            g.setColor(Color.RED);
            g.drawString("Tower Of Hanoi",150,70);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(118,170,20,220,5,5);
            g.fillRoundRect(280,170,20,220,5,5);
            g.fillRoundRect(440,170,20,220,5,5);
            g.setColor(Color.BLACK);
            g.drawRoundRect(118,170,20,220,5,5);
            g.drawRoundRect(280,170,20,220,5,5);
            g.drawRoundRect(440,170,20,220,5,5);
            g.setColor(Color.YELLOW);
            g.fillRoundRect(40,370,505,25,5,5);
            g.setColor(Color.BLACK);
            g.drawRoundRect(40,370,505,25,5,5);
            if(a1==1)
            { if(x>=40&&x<=210&&y>=170&&y<=370&&e==1)
              { x=0;
                y=0;
                e=0;
                m++;
              }
              else if(x>210&&x<=370&&y>=170&&y<=370&&e==1)
              { if(b[0]==0&&b[1]==0&&b[2]==0)
                { b[j]=a[j];
                  a[j]=0;
                  m++;
                }
                else if(b[0]==0||b[1]==0||b[2]==0)
                { for(i=0;i<3;i++)
                  { if(a[j]<=b[i])
                    { b[j]=a[j];
                      a[j]=0;
                      i=3;
                      m++;
                    }
                    else if(b[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else if(x>370&&x<=530&&y>=170&&y<=370&&e==1)
              { if(c[0]==0&&c[1]==0&&c[2]==0)
                { c[j]=a[j];
                  a[j]=0;
                  m++;
                }
                else if(c[0]==0||c[1]==0||c[2]==0)
                { for(i=0;i<3;i++)
                  { if(a[j]<=c[i])
                    { c[j]=a[j];
                      a[j]=0;
                      i=3;
                      m++;
                    }
                    else if(c[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else
              e=0;
            }
            else if(b1==1)
            { if(x>210&&x<=370&&y>=170&&y<=370&&e==1)
              { x=0;
                y=0;
                e=0;
                m++;
              }
              else if(x>=40&&x<=210&&y>=170&&y<=370&&e==1)
              { if(a[0]==0&&a[1]==0&&a[2]==0)
                { a[j]=b[j];
                  b[j]=0;
                  m++;
                }
                else if(a[0]==0||a[1]==0||a[2]==0)
                { for(i=0;i<3;i++)
                  { if(b[j]<=a[i])
                    { a[j]=b[j];
                      b[j]=0;
                      i=3;
                      m++;
                    }
                    else if(a[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else if(x>370&&x<=530&&y>=170&&y<=370&&e==1)
              { if(c[0]==0&&c[1]==0&&c[2]==0)
                { c[j]=b[j];
                  b[j]=0;
                  m++;
                }
                else if(c[0]==0||c[1]==0||c[2]==0)
                { for(i=0;i<3;i++)
                  { if(b[j]<=c[i])
                    { c[j]=b[j];
                      b[j]=0;
                      i=3;
                      m++;
                    }
                    else if(c[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else
              e=0;
            }
            else if(c1==1)
            { if(x>370&&x<=530&&y>=170&&y<=370&&e==1)
              { x=0;
                y=0;
                e=0;
                m++;
              }
              else if(x>=40&&x<=210&&y>=170&&y<=370&&e==1)
              { if(a[0]==0&&a[1]==0&&a[2]==0)
                { a[j]=c[j];
                  c[j]=0;
                  m++;
                }
                else if(a[0]==0||a[1]==0||a[2]==0)
                { for(i=0;i<3;i++)
                  { if(c[j]<=a[i])
                    { a[j]=c[j];
                      c[j]=0;
                      i=3;
                      m++;
                    }
                    else if(a[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else if(x>210&&x<=370&&y>=170&&y<=370&&e==1)
              { if(b[0]==0&&b[1]==0&&b[2]==0)
                { b[j]=c[j];
                   c[j]=0;
                   m++;
                }
                else if(b[0]==0||b[1]==0||b[2]==0)
                { for(i=0;i<3;i++)
                  { if(c[j]<=b[i])
                    { b[j]=c[j];
                      c[j]=0;
                      i=3;
                      m++;
                    }
                    else if(b[i]!=0)
                    i=3;
                  }
                }
                x=0;
                y=0;
                e=0;
              }
              else
              e=0;
            }
            x1=60;
            y1=345;
            w1=140;
            for(i=2;i>=0;i--)
            { g.setColor(Color.BLUE);
              if(a[i]==1)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(a[i]==2)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(a[i]==3)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              x1=x1+10;
              w1=w1-20;
            }
            x1=60;
            y1=370;
            w1=140;
            x2=60;
            w2=140;
            if(x>=50&&x<=210&&y>=170&&y<=370&&e==0)
            { if(a[0]==0&&a[1]==0&&a[2]==0)
              { x2=-50;
                y1=-50;
                w2=0;
                e=-1;
              }
              g.setColor(Color.pink);
              for(i=2;i>=0;i--)
              { if(a[i]==1)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(a[i]==2)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(a[i]==3)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                x1=x1+10;
                w1=w1-20;
                a1=1;
                b1=0;
                c1=0;
              }
              g.fillRoundRect(x2,y1,w2,25,25,25);
              e++;
            }
            x1=220;
            y1=345;
            w1=140;
            for(i=2;i>=0;i--)
            { g.setColor(Color.BLUE);
              if(b[i]==1)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(b[i]==2)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(b[i]==3)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              x1=x1+10;
              w1=w1-20;
            }
            x1=220;
            y1=370;
            w1=140;
            x2=220;
            w2=140;
            if(x>210&&x<=370&&y>=170&&y<=370&&e==0)
            { if(b[0]==0&&b[1]==0&&b[2]==0)
              { x2=-50;
                y1=-50;
                w2=0;
                e=-1;
              }
              g.setColor(Color.pink);
              for(i=2;i>=0;i--)
              { if(b[i]==1)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(b[i]==2)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(b[i]==3)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                x1=x1+10;
                w1=w1-20;
                a1=0;
                b1=1;
                c1=0;
              }
              g.fillRoundRect(x2,y1,w2,25,25,25);
              e++;
            }
            x1=380;
            y1=345;
            w1=140;
            for(i=2;i>=0;i--)
            { g.setColor(Color.BLUE);
              if(c[i]==1)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(c[i]==2)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              else if(c[i]==3)
              { g.fillRoundRect(x1,y1,w1,25,25,25);
                g.setColor(Color.BLACK);
                g.drawRoundRect(x1,y1,w1,25,25,25);
                y1=y1-25;
              }
              x1=x1+10;
              w1=w1-20;
            }
            x1=380;
            y1=370;
            w1=140;
            x2=380;
            w2=140;
            if(x>370&&x<=530&&y>=170&&y<=370&&e==0)
            { if(c[0]==0&&c[1]==0&&c[2]==0)
              { x2=-50;
                y1=-50;
                w2=0;
                e=-1;
              }
              g.setColor(Color.pink);
              for(i=2;i>=0;i--)
              { if(c[i]==1)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(c[i]==2)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                else if(c[i]==3)
                { j=i;
                  x2=x1;
                  w2=w1;
                  y1=y1-25;
                }
                x1=x1+10;
                w1=w1-20;
                a1=0;
                b1=0;
                c1=1;
              }
              g.fillRoundRect(x2,y1,w2,25,25,25);
              e++;
            }
            f=0;
            for(i=0;i<3;i++)
            { if(c[i]==0)
              f=0;
              else
              f++;
            }
            if(f==3)
            repaint();
          }
          showStatus("       MOVES= "+m);
        }
}
