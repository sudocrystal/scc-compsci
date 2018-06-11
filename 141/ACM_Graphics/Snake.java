import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.util.*;

public class Snake extends GObject {
   
   private ArrayList<Block> snake;
   private int blockSize;

   public Snake(int x, int y, int w) {
      blockSize = w;
      snake = new ArrayList<Block>();
      snake.add(new Block(x,y,blockSize));
      snake.add(new Block(x+blockSize,y,blockSize));
      snake.add(new Block(x+blockSize*2,y,blockSize));
   }
   
   public void move(char dir) {
      if(dir == 'W') { 
         //dx = 0;
         //dy = -1;
         for(Block b : snake) {
            b.setY(b.getY()-blockSize);
         }
      }
   }
   
   public boolean isAlive() {
      return snake.size() > 0;
   }

   public GRectangle getBounds() {
      return new GRectangle(getX(), getY(), this.blockSize, this.blockSize);
   }
   
   public void paint(Graphics g) {
      for(Block b : snake)
         g.fillRect((int)b.getX(), (int)b.getY(), (int)b.getWidth(), (int)b.getHeight());
   }

}