/**
 * ArrayCreator.java
 *
 * @author Jean-Luc Marchand
 * @version 1.0
 *
 * A class which will read data from a txt file ("aRandomData.txt") and create and array out of it,
 * which will later be sorted.
 */

import java.util.*;
import java.io.*;

public class ArrayCreator
{
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
      System.out.println("End of Reading !");
   }
}

