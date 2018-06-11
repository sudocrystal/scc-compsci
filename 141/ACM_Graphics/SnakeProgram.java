import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import java.awt.event.*;
 
public class SnakeProgram extends GraphicsProgram {
 
   private Snake snake;
 
   public void init() {
      snake = new Snake(getWidth()/2, getHeight()/2, 20);
      add(snake);
      addKeyListeners();
   }

   public void run() {
      while(snake.isAlive()) {
         //snake.move();
         pause(500);
      }
   }
    
   public void keyPressed(KeyEvent e) {
      int key = e.getKeyCode();
      if(key == KeyEvent.VK_LEFT){
         snake.move('W');
      }
   }
   
   public void keyReleased(KeyEvent e) {}
   public void keyTyped(KeyEvent e) {}
   
   public static void main(String[] args) {
		new SnakeProgram().start(args);
	}
} 