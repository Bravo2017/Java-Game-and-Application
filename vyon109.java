//Tic Tac Toe
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code="vyon109" width=440 height=400>
</applet>*/
public class vyon109 extends Applet implements MouseListener
{        int x1,y1,i,j,r,c,v=-1,p,q,e,z,n,m,f,w,b,g1=0;
         char s[][]=new char[3][3];
         int x2=127,y2=132;
         public void init()
         { addMouseListener(this);
           for(i=0;i<3;i++)
           { for(j=0;j<3;j++)
             s[i][j]=' ';
           }
         }
         public void mouseClicked(MouseEvent me)
         { if(g1==0)
           { x1=me.getX();
             y1=me.getY();
             repaint();
           }
         }
         public void mouseEntered(MouseEvent me)
         {}
         public void mouseExited(MouseEvent me)
         {}
         public void mousePressed(MouseEvent me)
         {}
         public void mouseReleased(MouseEvent me)
         {}
         public void paint(Graphics g)
         { try
           { setSize(400,400);
             if(g1==1)
             { Color c1=new Color(135,200,240);
               Color c2=new Color(235,240,252);
               Color c3=new Color(170,153,172);
               Color c4=new Color(183,224,247);
               Font fobj=new Font("Arial",Font.BOLD,14);
               Font fobj1=new Font("Arial",Font.BOLD,18);
               g.setColor(Color.BLACK);
               g.fillRect(69,49,302,302);
               g.setColor(c1);
               g.fillRect(70,50,300,300);
               g.setColor(c2);
               g.drawRect(71,51,297,297);
               g.setColor(c3);
               g.drawLine(71,81,368,81);
               g.setColor(c2);
               g.fillRect(76,86,288,258);
               g.setColor(c3);
               g.fillRect(77,87,286,256);
               g.setColor(Color.BLACK);
               g.fillRect(79,89,282,252);
               g.setColor(c2);
               g.drawLine(71,82,368,82);
               g.setColor(c1);
               g.fillRect(81,91,278,248);
               g.setColor(c4);
               g.fillRect(173,91,92,82);
               g.fillRect(81,173,92,82);
               g.fillRect(265,173,92,82);
               g.fillRect(173,255,92,82);
               g.setFont(fobj);
               g.setColor(Color.WHITE);
               g.drawString("TIC-TAC-TOE",80,70);
               g.setColor(Color.BLACK);
               for(i=0;i<3;i++)
               { for(j=0;j<3;j++)
                 { g.setFont(fobj1);
                   g.drawString(""+s[i][j],x2,y2);
                   x2=x2+92;
                 }
                 x2=127;
                 y2=y2+82;
               }
               x2=127;
               y2=132;
               g.drawString("COMPUTER WINS",170,380);
             } 
             else
             { Color c1=new Color(135,200,240);
               Color c2=new Color(235,240,252);
               Color c3=new Color(170,153,172);
               Color c4=new Color(183,224,247);
               Font fobj=new Font("Arial",Font.BOLD,14);
               Font fobj1=new Font("Arial",Font.BOLD,18);
               g.setColor(Color.BLACK);
               g.fillRect(69,49,302,302);
               g.setColor(c1);
               g.fillRect(70,50,300,300);
               g.setColor(c2);
               g.drawRect(71,51,297,297);
               g.setColor(c3);
               g.drawLine(71,81,368,81);
               g.setColor(c2);
               g.fillRect(76,86,288,258);
               g.setColor(c3);
               g.fillRect(77,87,286,256);
               g.setColor(Color.BLACK);
               g.fillRect(79,89,282,252);
               g.setColor(c2);
               g.drawLine(71,82,368,82);
               g.setColor(c1);
               g.fillRect(81,91,278,248);
               g.setColor(c4);
               g.fillRect(173,91,92,82);
               g.fillRect(81,173,92,82);
               g.fillRect(265,173,92,82);
               g.fillRect(173,255,92,82);
               g.setFont(fobj);
               g.setColor(Color.WHITE);
               g.drawString("TIC-TAC-TOE",80,70);
               g.drawString("TURN: USER",230,70);
               g.setColor(Color.BLACK);
               z=0;
               w=0;
               for(i=0;i<3;i++)
               { for(j=0;j<3;j++)
                 { g.setFont(fobj1);
                   g.drawString(""+s[i][j],x2,y2);
                   x2=x2+92;
                   if(s[i][j]==' ')
                   w=1;
                 }
                 x2=127;
                 y2=y2+82;
               }
               x2=127;
               y2=132;
               if(w==0)
               g.drawString("Tie",200,380);
               if(x1>=81&&x1<173&&y1>=91&&y1<173)
               { r=1;
                 c=1;
                 v++;
               }
               else if(x1>=173&&x1<265&&y1>=91&&y1<173)
               { r=1;
                 c=2;
                 v++;
               }
               else if(x1>=265&&x1<357&&y1>=91&&y1<173)
               { r=1;
                 c=3;
                 v++;
               }
               else if(x1>=81&&x1<173&&y1>=173&&y1<255)
               { r=2;
                 c=1;
                 v++;
               }
               else if(x1>=173&&x1<265&&y1>=173&&y1<255)
               { r=2;
                 c=2;
                 v++;
               }
               else if(x1>=265&&x1<357&&y1>=173&&y1<255)
               { r=2;
                 c=3;
                 v++;
               }
               else if(x1>=81&&x1<173&&y1>=255&&y1<337)
               { r=3;
                 c=1;
                 v++;
               }
               else if(x1>=173&&x1<265&&y1>=255&&y1<337)
               { r=3;
                 c=2;
                 v++;
               }
               else if(x1>=265&&x1<357&&y1>=255&&y1<337)
               { r=3;
                 c=3;
                 v++;
               }
               if(s[r-1][c-1]==' ')
               { g.setColor(Color.BLACK);
                 g.fillRect(69,49,302,302);
                 g.setColor(c1);
                 g.fillRect(70,50,300,300);
                 g.setColor(c2);
                 g .drawRect(71,51,297,297);
                 g.setColor(c3);
                 g.drawLine(71,81,368,81);
                 g.setColor(c2);
                 g.fillRect(76,86,288,258);
                 g.setColor(c3);
                 g.fillRect(77,87,286,256);
                 g.setColor(Color.BLACK);
                 g.fillRect(79,89,282,252);
                 g.setColor(c2);
                 g.drawLine(71,82,368,82);
                 g.setColor(c1);
                 g.fillRect(81,91,278,248);
                 g.setColor(c4);
                 g.fillRect(173,91,92,82);
                 g.fillRect(81,173,92,82);
                 g.fillRect(265,173,92,82);
                 g.fillRect(173,255,92,82);
                 g.setFont(fobj);
                 g.setColor(Color.WHITE);
                 g.drawString("TIC-TAC-TOE",80,70);
                 s[r-1][c-1]='X';
                 for(i=0;i<3;i++)
                 { for(j=0;j<3;j++)
                   { g.setFont(fobj1);
                     g.setColor(Color.BLACK);
                     g.drawString(""+s[i][j],x2,y2);
                     x2=x2+92;
                   }
                   x2=127;
                   y2=y2+82;
                 }
                 g.setFont(fobj);
                 g.setColor(Color.WHITE);
                 g.drawString("TURN: COMPUTER",230,70);
                 x2=127;
                 y2=132;
                 Thread.sleep(2000);
                 if(v==0)
                 { if(r==2&&c==2)
                   { s[0][2]='O';
                   }
                   else
                   { s[1][1]='O';
                   }
                   repaint();
                 }
                 if(v>1&&g1==0)
                 { for(i=0;i<3;i++)
                   { for(j=0;j<3;j++)
                     { if(s[i][j]==' ')
                       { f=0;
                         s[i][j]='O';
                         for(p=0;p<3;p++)
                         { if(s[p][0]=='O'&&s[p][1]=='O'&&s[p][2]=='O'&&g1==0)
                           { s[i][j]='O';
                             f=1;
                             g1=1;
                             repaint();
                           }
                         }
                         for(q=0;q<3;q++)
                         { if(s[0][q]=='O'&&s[1][q]=='O'&&s[2][q]=='O'&&g1==0)
                           { s[i][j]='O';
                             f=1;
                             g1=1;
                             repaint();
                           }
                         }
                         if(s[0][0]=='O'&&s[1][1]=='O'&&s[2][2]=='O'&&g1==0)
                         { s[i][j]='O';
                           f=1;
                           g1=1;
                           repaint();
                         }
                         if(s[0][2]=='O'&&s[1][1]=='O'&&s[2][0]=='O'&&g1==0)
                         { s[i][j]='O';
                           f=1;
                           g1=1;
                           repaint();
                         }
                         if(f!=1)
                         s[i][j]=' ';
                       }
                     }
                   }
                 }
                 if(v>1&&f==0&&g1==0)
                 { for(i=0;i<3;i++)
                   { for(j=0;j<3;j++)
                     { if(s[i][j]==' ')
                       { e=0;
                         s[i][j]='X';
                         for(p=0;p<3;p++)
                         { if(s[p][0]=='X'&&s[p][1]=='X'&&s[p][2]=='X')
                           { s[i][j]='O';
                             e=1;
                             z=1;
                             repaint();
                           }
                         }
                         for(q=0;q<3;q++)
                         { if(s[0][q]=='X'&&s[1][q]=='X'&&s[2][q]=='X')
                           { s[i][j]='O';
                             z=1;
                             e=1;
                             repaint();
                           }
                         }
                         if(s[0][0]=='X'&&s[1][1]=='X'&&s[2][2]=='X')
                         { s[i][j]='O';
                           z=1;
                           e=1;
                           repaint();
                         }
                         if(s[0][2]=='X'&&s[1][1]=='X'&&s[2][0]=='X')
                         { s[i][j]='O';
                           e=1;
                           z=1;
                           repaint();
                         }
                         if(e!=1)
                         s[i][j]=' ';
                       }
                     }
                   }
                 }
                 if(z==0&&v>1&&f==0&&g1==0)
                 { for(n=0;n<3;n++)
                   { for(m=0;m<3;m++)
                     { if(s[n][m]==' ')
                       { if(s[1][1]=='O'&&s[1][2]=='X'&&s[2][0]=='X'&&s[0][0]==' '&&s[0][1]==' '&&s[0][2]==' ')
                         s[0][2]='O';
                         else if(s[1][1]=='O'&&s[1][2]=='X'&&s[2][1]=='X'&&s[0][0]==' '&&s[0][1]==' '&&s[0][2]==' ')
                         s[0][2]='O';
                         else if(s[1][1]=='O'&&s[0][2]=='X'&&s[2][0]=='X'&&s[0][0]==' '&&s[0][1]==' '&&s[1][0]==' ')
                         s[0][1]='O';
                         else if(s[1][1]=='O'&&s[0][2]=='X'&&s[2][1]=='X'&&s[0][0]==' '&&s[0][1]==' '&&s[1][0]==' ')
                         s[1][0]='O';
                         else if(s[1][1]=='O'&&s[0][0]=='X'&&s[2][1]=='X'&&s[0][1]==' '&&s[0][2]==' '&&s[1][2]==' ')
                         s[2][0]='O';
                         else if(s[1][1]=='O'&&s[0][0]=='X'&&s[1][2]=='X'&&s[0][1]==' '&&s[0][2]==' '&&s[1][0]==' ')
                         s[0][2]='O';
                         else
                         s[n][m]='O';
                         n=3;
                         m=3;
                       }
                     }
                   }
                   repaint();
                 }
               }
             }
           }
           catch(Exception e)
           {}
         }
}
