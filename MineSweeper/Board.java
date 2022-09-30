

import javax.swing.JPanel;

import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Dimension;
/**
 * this class displays the board for minesweeper
 * 
 * @author Omaid Shaidah
 * 
 *
 */
public class Board extends JPanel
{
	private int mines;
	private int height;
	private int width;
	private JLabel statusbar;
	/**
	 * 
	 * @param height of the board
	 * @param width of the board
	 * @param mines number of mines on the board
	 * @param statusbar the status o the board
	 */
	public Board(int height, int width, int mines, JLabel statusbar)
	{
		this.height=height;
		this.width=width;
		this.mines=mines;
		this.statusbar=statusbar;
		//Minefield Mine=new Minefield();
		
		
		setPreferredSize(new Dimension(Configuration.BOARD_WIDTH, Configuration.BOARD_HEIGHT));
		addMouseListener(new MouseReader(this));
	}

	@Override
	/**
	 * @param inputs the graphics g
	 * paints the board
	 */
	public void paintComponent(Graphics g)
	{
		// Here, you must invoke method draw(g) of the Minefield object
		
		
		getMinefield().draw(g);
		
	}
	/**
	 * 
	 * @param x location on the board
	 * @param y location on the board
	 * @param button the button on the mouse you click 
	 */
	public void mouseClickOnLocation(int x, int y, String button)
	{
		
		
		
		
		
		/*
			Your code goes here.

			Do not remove the invocation of repaint() below
		*/
		repaint();
	}
	/**
	 * 
	 * @return a Minefield object
	 */
	public  Minefield getMinefield()
	{
		Minefield MI= new Minefield();
		
		return MI;
	}
	/**
	 * 
	 * @return true when the game is over
	 */
	public  boolean isGameOver()
	{
		//game over when no mines left or when clicked on a mine
		if (getStatusbar().equals("Game over"))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	/**
	 * 
	 * @param text sets the statusbar text
	 */
	public  void setStatusbar(String text)
	{
		JLabel J= new JLabel();
		J.setText(text);
	}
	/**
	 * 
	 * @return  a getter method for statusbar
	 */
	public  String getStatusbar()
	{
		JLabel J= new JLabel();
		
		return J.getText();
	}
	public  boolean removeMine()
	{
		// minus MINe by 1 and if neg return false
		if(mines<0)
		{
			
			setStatusbar("Invalid action");
			return false;
			
		}
		else
		{
			setStatusbar(Integer.toString(mines)+" mines remaining");
			return true;
		}
		
		
		
	}
	public  boolean addMine()
	{
		
		if(mines<0)
		{
			
			setStatusbar("Invalid action");
			return false;
			
		}
		else
		{
			setStatusbar(Integer.toString(mines)+" mines remaining");
			return true;
		}
		
	
		
	}
	
	
	
	
	
	
}
