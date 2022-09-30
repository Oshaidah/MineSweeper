
import java.awt.Graphics;
import java.util.Random;
/**
 * 
 * @author Omaid shaidah
 * this class is the brains of the appliaction
 *
 */
public class Minefield {

	private  Object[][] field;
	private int row;
	private int col;
	private static MineCell cell;
	private static InfoCell Ic;
	
 
 /**
  * creates a 2D array 
  */
	public Minefield()
	{
		field = new Object [10][10];
	}
	/**
	 * 
	 * @param numRows 
	 * @param numColumns
	 * @param numMines
	 */
	public Minefield(int numRows, int numColumns, int numMines)
	{
		field=new Object[numRows][numColumns];
		mineLaying(numMines);
  
	}
	public  void mineLaying(int numOfMines)
	{
		Random r = new Random();
		
		r.nextInt(numOfMines);
	}
	public  void addInfoCells()
	{
		
		for (int i=0;i<field.length;i++)
		{
			for(int z=0;z<field.length;z++)
			{
				if(field[i][z]!=Minefield.cell)
				{
					field[i][z]=Minefield.Ic;
				}
			}
			
		}
	}
	public void draw(Graphics g)
	{
		
	}
	public  Object getCellByScreenCoordinates(int x, int y)
	{
		int rowC = x/Configuration.CELL_SIZE;
		int colC = y/Configuration.CELL_SIZE;
		return this.field[rowC][colC];
	}
	public Object getCellByRowCol(int row, int col)
	{
		this.row=row;
		this.col=col;
		return field[row][col];
	}
	public void setMineCell(int row, int col, MineCell cell)
	{
		this.row = row;
		this.col= col;
		Minefield.cell=cell;
	}
	public void setInfoCell(int row, int col, InfoCell cell)
	{
		this.row=row;
		this.col=col;
		Minefield.Ic=cell;
	}
	public int countCellsWithStatus(String status)
	{
		
		int count=0;

		for (int i=0;i<field.length;i++)
		{
			for(int z=0;z<field.length;z++)
			{
				if(field[i][z].equals(status))
				{
					count++;
				}
			}
			
		}
		return count;
		
	}
	public void openCells(Object cell)
	{
  
	}
	public void revealIncorrectMarkedCells()
	{
  
	}
}
