import java.awt.*;
import javax.swing.*;

public class Greetings extends JPanel {
	
   private int myWindowWidth = 300;
   private int myWindowHeight = 400;
	
   public Greetings() {
      JFrame easel = new JFrame();		
      easel.setSize (myWindowWidth, myWindowHeight);
      easel.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      easel.add (this);
      easel.setVisible (true);
   }
	
   public void paintComponent (Graphics g) {
      int w = this.getSize().width/2;
      int h = this.getSize().height/2;
      g.drawRect(10, 10, 90, 290);
      g.drawRect(100, 10, 100, 290);
   }

   //public void paintComponent (Graphics g) {
      //int w = this.getSize().width/2;
      //int h = this.getSize().height/2;
      //g.drawString ("Hi there!", w, h);	
      //g.drawRect(w-2, h-15, 59, 20);

}