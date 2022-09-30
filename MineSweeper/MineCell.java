import javax.swing.ImageIcon;

import java.awt.Image;
import java.awt.Graphics;

/**
 * 
 * @author Omaid shaidah
 * this class is for cells that have mines in it
 *
 */
public class MineCell {
	private String Status;
	private ImageIcon a;
	private  int column;
	private  int row;
	
	
	/**
	 * 
	 * @param row intansiates the variable
	 * @param column instantisate the variable
	 * 
	 */
	public MineCell(int row,int column)
	{
		this.row =row;
		this.column = column;
		Status=Configuration.STATUS_COVERED;
	}
	/**
	 * 
	 * @param g draws the mine cell
	 */
	public void draw(Graphics g)

	{
		
		g.drawImage(getImage(), getHorizontalPosition(),  getVerticalPosition(), null);
		
	}
	/**
	 * 
	 * @return an int of the horizontal position
	 */
	public  int getHorizontalPosition()
	{
		return (this.column) *Configuration.CELL_SIZE;
	}
	/**
	 * 
	 * @return an int of the vertical Position of the cell
	 */
	public  int getVerticalPosition()
	{
		return (this.row)*Configuration.CELL_SIZE;
	}
	/**
	 * 
	 * @return a string of the status
	 */
	public   String getStatus()
	{
		return this.Status;
	}
	/**
	 * 
	 * @param status sets the status 
	 */
	public  void setStatus(String status)
	{
		Status=status;
	}
	/**
	 * 
	 * @return an image if it is covered,marked, or a mine
	 */
	public  Image getImage()
	{
	
		if(Status.equals(Configuration.STATUS_COVERED))
		{
			a = new ImageIcon("img/covered_cell.png");
		}
			
		else if(Status.equals(Configuration.STATUS_OPENED))
		{
			a = new ImageIcon("img/mine_cell.png");
			
		}
		
		else if(Status.equals(Configuration.STATUS_MARKED))
		{
			a = new ImageIcon("img/marked_cell.png");
			
		}
		return a.getImage();
		
		
		
		
		
	}
}


