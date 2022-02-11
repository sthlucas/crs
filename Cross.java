// Question 2-13-a
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/*
 * Revised by Samuel Lucas
 * 10/27/2018
 * 
 * Fixed Bug:
 *  Before: Drew an "L" and kept it centered
 *  After: Draws a "+" which remains centered
 * 
 * Added Variables:
 *  Variables for upper right coordinates of both rectangles
 *  Calculations for values of upper right coordinates
 *  
 */
/**
 *  This program displays a red cross on a white
 *  background.
 */
public class Cross extends JPanel implements ActionListener
{

	int xPos = 400;
	public Cross()
	{
	    super();
		Timer t = new Timer(30, this);
	    t.start();
	}
	
  public void paintComponent(Graphics g)
  {
		super.paintComponent(g);  // Call JPanel's paintComponent method
		                          //   to paint the background
		int xCenter = getWidth() / 2; // Width
		int yCenter = getHeight() / 2; //Height
		
		
		int xHoriz = (xCenter-25); //x coordinate of horizontal rectangle
		int yHoriz = (yCenter-5); //y coordinate of horizontal rectangle
		
		int xVert = (xCenter-5); //x coordinate of vertical rectangle
		int yVert = (yCenter-25); //y coordinate of vertical rectangle
      	g.setColor(Color.RED);
		g.fillRect(xVert, yVert, 10, 50); // fills in vertical rectangle
		g.fillRect(xHoriz, yHoriz, 50, 10); // fills in horizontal rectangle
	    g.setColor(Color.BLACK);
	    g.fillRect(xPos-10, yHoriz-10, 150, 50);
		g.setColor(Color.GREEN);
		g.drawString("abc", xPos, yHoriz);
    
    }
  
//Adding a comment for Git commit practice
	public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(300, 300, 200, 200);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Cross panel = new Cross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
  
  public void actionPerformed(ActionEvent e)
  {
        xPos = (xPos+3) % 1000;
        System.out.println(xPos);  	
	    repaint();
  }
}

