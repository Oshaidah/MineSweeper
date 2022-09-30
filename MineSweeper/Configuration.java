import java.io.File;
import java.util.Scanner;
/**
 * 
 * @author Omaid shaidah
 * this class configues the application of the code for our game
 *
 */
public class Configuration {
 public static int ROWS;
 public static int COLS;
 public static int CELL_SIZE;
 public static int MINES;
 public static int BOARD_WIDTH;
 public static int BOARD_HEIGHT;
 public static String STATUS_COVERED;
 public static String STATUS_OPENED;
 public static String STATUS_MARKED;
 public static String STATUS_WRONGLY_MARKED;
 /**
  * 
  * @param filename takes an input of a file and reads and assigns the values of the file to an array and assigns them to the 
  * respective variable
  */
 public static void loadParameters(String filename)  {
 try {
   
   File f =new File(filename);
   Scanner scn= new Scanner(f);
   // in the config1 there are 16 words
   String [] arr= new String[16];
   int q =0;
  while(scn.hasNext())
  {
   
    arr[q]=scn.next();
    
    q++;
   
  }
  
  for(int x=0; x<arr.length;x++) 
  {
  
   if(arr[x].equals("COLS"))
   {
     Configuration.COLS=Integer.parseInt(arr[x+1]);
     Configuration.BOARD_WIDTH = (COLS*CELL_SIZE)+1;
   }
   else if (arr[x].equals("ROWS"))
   {
     Configuration.ROWS = Integer.parseInt(arr[x+1]);
     Configuration.BOARD_HEIGHT= (Configuration.ROWS*Configuration.CELL_SIZE)+1;
   }
   if (arr[x].equals("CELL_SIZE"))
   {
     Configuration.CELL_SIZE=Integer.parseInt(arr[x+1]);
   }
   else if(arr[x].equals("MINES"))
   {
     Configuration.MINES= Integer.parseInt(arr[x+1]);
   }
   else if(arr[x].equals("STATUS_COVERED"))
   {
     Configuration.STATUS_COVERED= arr[x+1];
   }
   else if(arr[x].equals("STATUS_OPENED"))
   {
     Configuration.STATUS_OPENED= arr[x+1];
   }
   else if(arr[x].equals("STATUS_MARKED"))
   {
     Configuration.STATUS_MARKED= arr[x+1];
   }
   else if(arr[x].equals("STATUS_WRONGLY_MARKED"))
   {
     Configuration.STATUS_WRONGLY_MARKED=arr[x+1];
   }
  
  
 }
  
  
 
  }
  catch(Exception e) {}
  
 }
 
 
 

}
