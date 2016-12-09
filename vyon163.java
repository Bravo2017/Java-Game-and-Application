//The Memory Game 
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon163" width=370 height=370>
</applet>*/
public class vyon163 extends Applet implements MouseListener
{       int x,y,i,j,x1,y1,c=0,i1,j1,i2,j2,a1,b1,e=0;
        int a[][]=new int[6][6];
        int xp1[]={50,45,45,50};
        int yp1[]={50,55,95,90};
        int xp2[]={50,45,85,90};
        int yp2[]={90,95,95,90};
        public void init()
        { addMouseListener(this);
          x1=50;
          y1=50;
          for(i=0;i<6;i++)
          { for(j=0;j<6;j++)
            a[i][j]=0;
          }
        }
        public void mouseClicked(MouseEvent me)
        {}
        public void mouseEntered(MouseEvent me)
        {}
        public void mouseExited(MouseEvent me)
        {}
        public void mousePressed(MouseEvent me)
        { if(e!=36)
          { x=me.getX();
            y=me.getY();
            repaint();
          }
        }
        public void mouseReleased(MouseEvent me)
        {}
        public void paint(Graphics g)
        { Color cobj1=new Color(137,113,255);
          Color cobj2=new Color(37,0,213);
          Color cobj3=new Color(174,157,255);
          Font fobj=new Font("Arial",Font.BOLD,16);
          Font fobj1=new Font("Arial",Font.BOLD,26);
          if(x>=50&&x<91&&y>=50&&y<91&&a[0][0]!=37)
          { a[0][0]=1;
            if(c==0)
            { a1=1;
              i1=0;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=1;
              i2=0;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=50&&y<91&&a[0][1]!=37)
          { a[0][1]=2;
            if(c==0)
            { a1=2;
              i1=0;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=2;
              i2=0;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=50&&y<91&&a[0][2]!=37)
          { a[0][2]=3;
            if(c==0)
            { a1=3;
              i1=0;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=3;
              i2=0;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=50&&y<91&&a[0][3]!=37)
          { a[0][3]=4;
            if(c==0)
            { a1=4;
              i1=0;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=4;
              i2=0;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=50&&y<91&&a[0][4]!=37)
          { a[0][4]=5;
            if(c==0)
            { a1=5;
              i1=0;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=5;
              i2=0;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=50&&y<91&&a[0][5]!=37)
          { a[0][5]=6;
            if(c==0)
            { a1=6;
              i1=0;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=6;
              i2=0;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=50&&x<91&&y>=100&&y<141&&a[1][0]!=37)
          { a[1][0]=7;
            if(c==0)
            { a1=7;
              i1=1;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=7;
              i2=1;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=100&&y<141&&a[1][1]!=37)
          { a[1][1]=8;
            if(c==0)
            { a1=8;
              i1=1;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=8;
              i2=1;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=100&&y<141&&a[1][2]!=37)
          { a[1][2]=9;
            if(c==0)
            { a1=9;
              i1=1;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=9;
              i2=1;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=100&&y<141&&a[1][3]!=37)
          { a[1][3]=10;
            if(c==0)
            { a1=10;
              i1=1;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=10;
              i2=1;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=100&&y<141&&a[1][4]!=37)
          { a[1][4]=11;
            if(c==0)
            { a1=11;
              i1=1;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=11;
              i2=1;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=100&&y<141&&a[1][5]!=37)
          { a[1][5]=12;
            if(c==0)
            { a1=12;
              i1=1;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=12;
              i2=1;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=50&&x<91&&y>=150&&y<191&&a[2][0]!=37)
          { a[2][0]=3;
            if(c==0)
            { a1=3;
              i1=2;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=3;
              i2=2;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=150&&y<191&&a[2][1]!=37)
          { a[2][1]=13;
            if(c==0)
            { a1=13;
              i1=2;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=13;
              i2=2;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=150&&y<191&&a[2][2]!=37)
          { a[2][2]=1;
            if(c==0)
            { a1=1;
              i1=2;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=1;
              i2=2;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=150&&y<191&&a[2][3]!=37)
          { a[2][3]=14;
            if(c==0)
            { a1=14;
              i1=2;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=14;
              i2=2;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=150&&y<191&&a[2][4]!=37)
          { a[2][4]=15;
            if(c==0)
            { a1=15;
              i1=2;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=15;
              i2=2;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=150&&y<191&&a[2][5]!=37)
          { a[2][5]=16;
            if(c==0)
            { a1=16;
              i1=2;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=16;
              i2=2;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=50&&x<91&&y>=200&&y<241&&a[3][0]!=37)
          { a[3][0]=10;
            if(c==0)
            { a1=10;
              i1=3;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=10;
              i2=3;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=200&&y<241&&a[3][1]!=37)
          { a[3][1]=2;
            if(c==0)
            { a1=2;
              i1=3;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=2;
              i2=3;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=200&&y<241&&a[3][2]!=37)
          { a[3][2]=12;
            if(c==0)
            { a1=12;
              i1=3;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=12;
              i2=3;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=200&&y<241&&a[3][3]!=37)
          { a[3][3]=7;
            if(c==0)
            { a1=7;
              i1=3;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=7;
              i2=3;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=200&&y<241&&a[3][4]!=37)
          { a[3][4]=16;
            if(c==0)
            { a1=16;
              i1=3;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=16;
              i2=3;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=200&&y<241&&a[3][5]!=37)
          { a[3][5]=17;
            if(c==0)
            { a1=17;
              i1=3;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=17;
              i2=3;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=50&&x<91&&y>=250&&y<291&&a[4][0]!=37)
          { a[4][0]=15;
            if(c==0)
            { a1=15;
              i1=4;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=15;
              i2=4;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=250&&y<291&&a[4][1]!=37)
          { a[4][1]=18;
            if(c==0)
            { a1=18;
              i1=4;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=18;
              i2=4;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=250&&y<291&&a[4][2]!=37)
          { a[4][2]=14;
            if(c==0)
            { a1=14;
              i1=4;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=14;
              i2=4;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=250&&y<291&&a[4][3]!=37)
          { a[4][3]=17;
            if(c==0)
            { a1=17;
              i1=4;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=17;
              i2=4;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=250&&y<291&&a[4][4]!=37)
          { a[4][4]=4;
            if(c==0)
            { a1=4;
              i1=4;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=4;
              i2=4;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=250&&y<291&&a[4][5]!=37)
          { a[4][5]=18;
            if(c==0)
            { a1=18;
              i1=4;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=18;
              i2=4;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=50&&x<91&&y>=300&&y<341&&a[5][0]!=37)
          { a[5][0]=6;
            if(c==0)
            { a1=6;
              i1=5;
              j1=0;
              c++;
            }
            else if(c==1)
            { b1=6;
              i2=5;
              j2=0;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=100&&x<141&&y>=300&&y<341&&a[5][1]!=37)
          { a[5][1]=9;
            if(c==0)
            { a1=9;
              i1=5;
              j1=1;
              c++;
            }
            else if(c==1)
            { b1=9;
              i2=5;
              j2=1;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=150&&x<191&&y>=300&&y<341&&a[5][2]!=37)
          { a[5][2]=5;
            if(c==0)
            { a1=5;
              i1=5;
              j1=2;
              c++;
            }
            else if(c==1)
            { b1=5;
              i2=5;
              j2=2;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=200&&x<241&&y>=300&&y<341&&a[5][3]!=37)
          { a[5][3]=11;
            if(c==0)
            { a1=11;
              i1=5;
              j1=3;
              c++;
            }
            else if(c==1)
            { b1=11;
              i2=5;
              j2=3;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=250&&x<291&&y>=300&&y<341&&a[5][4]!=37)
          { a[5][4]=13;
            if(c==0)
            { a1=13;
              i1=5;
              j1=4;
              c++;
            }
            else if(c==1)
            { b1=13;
              i2=5;
              j2=4;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          else if(x>=300&&x<341&&y>=300&&y<341&&a[5][5]!=37)
          { a[5][5]=8;
            if(c==0)
            { a1=8;
              i1=5;
              j1=5;
              c++;
            }
            else if(c==1)
            { b1=8;
              i2=5;
              j2=5;
              c=0;
            }
            if(c==1&&a1!=0&&b1!=0&&a1!=b1)
            c=0;
          }
          if(a1==b1&&a1!=0&&b1!=0)
          { a[i1][j1]=37;
            a[i2][j2]=37;
            if(i1==i2&&j1==j2)
            a[i1][j1]=a1;
            else
            { a1=0;
              b1=0;
              c=0;
            }
          }
          g.setFont(fobj1);
          g.setColor(Color.ORANGE);
          g.drawString("MEMORY GAME",100,25);
          for(i=0;i<6;i++)
          { for(j=0;j<6;j++)
            { if(a[i][j]>=0&&a[i][j]<37)
              { g.setColor(cobj1);
                g.fillRect(x1,y1,40,40);
                g.fillPolygon(xp1,yp1,4);
                g.fillPolygon(xp2,yp2,4);
                g.setColor(Color.BLACK);
                g.drawRect(x1,y1,40,40);
                g.drawPolygon(xp1,yp1,4);
                g.drawPolygon(xp2,yp2,4);
              }
              else if(a[i][j]==37)
              { g.setColor(cobj3);
                g.fillRect(x1,y1,40,40);
              }
              x1=x1+50;
              xp1[0]=xp1[0]+50;
              xp1[1]=xp1[1]+50;
              xp1[2]=xp1[2]+50;
              xp1[3]=xp1[3]+50;
              xp2[0]=xp2[0]+50;
              xp2[1]=xp2[1]+50;
              xp2[2]=xp2[2]+50;
              xp2[3]=xp2[3]+50;
            }
            x1=50;
            xp1[0]=50;
            xp1[1]=45;
            xp1[2]=45;
            xp1[3]=50;
            xp2[0]=50;
            xp2[1]=45;
            xp2[2]=85;
            xp2[3]=90;
            y1=y1+50;
            yp1[0]=yp1[0]+50;
            yp1[1]=yp1[1]+50;
            yp1[2]=yp1[2]+50;
            yp1[3]=yp1[3]+50;
            yp2[0]=yp2[0]+50;
            yp2[1]=yp2[1]+50;
            yp2[2]=yp2[2]+50;
            yp2[3]=yp2[3]+50;
          }
          x1=50;
          y1=50;
          xp1[0]=50;
          xp1[1]=45;
          xp1[2]=45;
          xp1[3]=50;
          xp2[0]=50;
          xp2[1]=45;
          xp2[2]=85;
          xp2[3]=90;
          yp1[0]=50;
          yp1[1]=55;
          yp1[2]=95;
          yp1[3]=90;
          yp2[0]=90;
          yp2[1]=95;
          yp2[2]=95;
          yp2[3]=90;
          for(i=0;i<6;i++)
          { for(j=0;j<6;j++)
            { g.setColor(cobj2);
              g.setFont(fobj);
              if(a[i][j]!=0)
              { if(a[i][j]!=37)
                g.drawString(""+a[i][j],x1+15,y1+20);
                else
                g.drawString(" ",x1+15,y1+20);
              }
              else
              g.drawString(" ",x1+15,y1+20);
              x1=x1+50;
            }
            x1=50;
            y1=y1+50;
          }
          x1=50;
          y1=50;
          if(a1!=b1&&c==0)
          { a[i1][j1]=0;
            a[i2][j2]=0;
            a1=0;
            b1=0;
          }
          for(i=0;i<6;i++)
          { for(j=0;j<6;j++)
            { if(a[i][j]==37)
              e++;
              else
              { i=6;
                j=6;
                e=0;
              }
            }
          }
          if(e==36)
          { g.setColor(Color.ORANGE);
            g.setFont(fobj1);
            g.drawString("YOU WON", 100, 200);
          }
         setSize(370,370);
        }       

}
