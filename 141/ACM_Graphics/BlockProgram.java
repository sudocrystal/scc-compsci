import acm.program.*;
import acm.graphics.*;
import java.awt.*;
 
public class BlockProgram extends GraphicsProgram {
 
   private Block b;
 
   public void init() {
      b = new Block(100,100,20);
      add(b);
   }

   public void run() {
      while(true) {
         b.move(2,2);
         pause(500);
      }
   }
   
   public static void main(String[] args) {
		new BlockProgram().start(args);
	}
} 