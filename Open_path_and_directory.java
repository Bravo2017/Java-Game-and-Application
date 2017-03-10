//Open path and directory
import java.awt.Desktop;
import java.io.*;
class abc
{ String s;
  public void A()
  { try
    { Desktop.getDesktop().open(new File("D:/"));
      System.out.println("open");
    }
    catch(Exception e)
    {}
  }
}
public class test
{ public static void main(String[] args)
  { abc obj=new abc();
    obj.A();
  }
}



