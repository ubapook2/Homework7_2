/**
 * BubbleSort.java
 *
 * @author Jean-Luc Marchand
 * @version 1.0
 *
 * A class which will read data from a txt file ("aRandomData.txt") and create an array out of it,
 * which will later be sorted by the first BubbleSort class
 */
 
import java.util.*;
import java.io.*;

public class BubbleSort
{
   public static int[] Sort(int[] Array)
   {
      int position, scan;
      int temp;
      
      for (position = Array.length - 1; position >= 0; position--)
      {
         for (scan = 0; scan <= position - 1; scan++)
         {
            if (Array[scan] > Array[scan+1])
               swap(Array, scan, scan + 1);
         }
      }
      return Array;
   }
   
   private static void swap(int[] Array, int index1, int index2)
   {
      int temp = Array[index1];
      Array[index1] = Array[index2];
      Array[index2] = temp;
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
                                                          
