import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class Block extends GObject {
   
   private int width;

   public Block() {
      this(250,250, 20);
   }
   
   public Block(int x, int y, int w) {
      setLocation(x,y);
      setColor(Color.BLACK);
      this.width = w;
   }

   public GRectangle getBounds() {
      return new GRectangle(getX(), getY(), this.width, this.width);
   }
   
   public void paint(Graphics g) {
      g.fillRect((int)getX(), (int)getY(), (int)getWidth(), (int)getHeight());
   }

}