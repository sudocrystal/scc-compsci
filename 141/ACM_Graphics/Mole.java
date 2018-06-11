import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.io.*;

public class Mole extends Block {

   public static final int MOLE_WIDTH = 50;
   private static final Image MOLE_IMG = Toolkit.getDefaultToolkit().getImage("mole.png");
   
   public Mole(int x, int y) {
      super(x,y,MOLE_WIDTH);
   }

   public void paint(Graphics g) {
      g.drawImage(MOLE_IMG, (int)getX(), (int)getY(), getComponent());
   }

}