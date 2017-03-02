/**
 * InsertionSort.java
 *
 * @author Jean-Luc Marchand
 * @version 1.0
 *
 * A class which will read data from a txt file ("aRandomData.txt") and create an array out of it,
 * which will later be sorted by the first InsertionSort class
 */
 
import java.util.*;
import java.io.*;

public class InsertionSort
{
   public static int[] Sort(int[] Array)
   {
      for (int index = 1; index < Array.length; index++)
      {
         int key = Array[index];
         
         int position = index;
         
         while (position > 0 && Array[position-1] > key)
         {
            Array[position] = Array[position-1];
            position--;
         }
         
         Array[position] = key;
      }
      return Array;
   }
   
   
   
   

   public static void main(String[] args) throws IOException
   {
      Scanner fileScan;
      fileScan = new Scanner(new File("aRandomData.txt"));
      
      int[] Array = new int[fileScan.nextInt()];
      
      for (int i = 0; i < Array.length; i++)
      {
         Array[i] = fileScan.nextInt();
      }
      
      System.out.println("Reading DATA from aRandomData.txt file:");
      System.out.println("Array size = " + Array.length);
      for (int i = 0; i < Array.length; i++)
      {
         System.out.println(Array[i]);
      }
      System.out.println("End of Reading !" + "\n");
      
       /* now sorts the array from the text file using the 'Sort' class, and
          then prints it out in a new, sorted array. */
      int[] SortedArray = Sort(Array);
                      
      System.out.println("After Sorting: ");
      for (int i:SortedArray)
      {
         System.out.print(i + "\n");
      }
   }
}
                                                          
