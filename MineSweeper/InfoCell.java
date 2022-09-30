
import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.Graphics;
/**
 * 
 * @author Omaid shaidah
 * gives info on the cell
 *
 */
public class InfoCell {
	private ImageIcon a;
	private String status;
	private int numOfAdjacentMines;
	private int row;
	private int column;
	
	public InfoCell(int row, int column, int numOfAdjacentMines)
	{
		this.numOfAdjacentMines=numOfAdjacentMines;
		this.row=row;
		this.column=column;
		this.status= Configuration.STATUS_COVERED;
		 
	}
	/**
	 * 
	 * @param g draws the cell
	 */
	public  void draw(Graphics g)
	{
		 g.draw(getImage(), getHorizontalPosition(),getVerticalPosition() , null);
	}
	/**
	 * 
	 * @return an image from the img file
	 * 
	 */
	public  Image getImage()
	{
		//choose from 12 pics
		
		
		if(this.status.equals(Configuration.STATUS_COVERED))
		{
			a = new ImageIcon("covered_cell.png");
			return a.getImage();
		}
		else if(status.equals(Configuration.STATUS_OPENED))
		{
			if (numOfAdjacentMines==1)
			{
				
				a=new ImageIcon("info_1.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==2)
			{
				a = new ImageIcon("info_2.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==3)
			{
				a= new ImageIcon("info_3.png");
				return a.getImage();
			}
			else if(numOfAdjacentMines==4)
			{
				a = new ImageIcon("info_4.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==5)
			{
				a= new ImageIcon("info_5.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==6)
			{
				a = new ImageIcon ("info_6.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==7)
			{
				a = new ImageIcon ("info_7.png");
				return a.getImage();
			}
			else if (numOfAdjacentMines==8)
			{
				a = new ImageIcon ("info_8.png");
				return a.getImage();
			}
			else {
				a = new ImageIcon("mine_cell.png");
				return a.getImage();
			}
			
			
				
		}
		
		else if(status.equals(Configuration.STATUS_MARKED))
		{
			a = new ImageIcon("marked_cell.png");
			return a.getImage();
		}
		else
		{
			return null;
		}
		
		
		
		
	}
	/**
	 * 
	 * @return an integer of the horizontal postion of the info cell
	 */
	public  int getHorizontalPosition()
	{
		int r = this.column*Configuration.CELL_SIZE;
				
		return r;
	}
	/**
	 * 
	 * @return a integer of the vertical cell position
	 */
	public int getVerticalPosition()
	{
		int v = this.row*Configuration.CELL_SIZE;
		return v;
	}
	/**
	 * 
	 * @return a string of the status of the cell
	 * is a getter method
	 */
	public  String getStatus()
	{
		return this.status;
	}
	/**
	 * 
	 * @param status sets the status of the cell
	 */
	public void setStatus(String status)
	{
		this.status=status;
	}
	/**
	 * 
	 * @return a integer of adjacent mines
	 */
	public int getNumOfAdjacentMines()
	{
		return this.numOfAdjacentMines;
	}

}
