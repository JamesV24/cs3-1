import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import static java.lang.System.*;

class IteratorTest {
   ArrayList<String> sList;
   public static void populateListFromString(ArrayList<String> list, 
                                                        String strList){   
      String[] words = strList.split(" ");
      list = new ArrayList<String>(Arrays.asList(words));
      
   }

   public static void addToListFromString(ArrayList<String> list, 
                                                        String strList)   {   
      Iterator<String> iter = list.iterator();
   }
   
   /*** REMOVE ***/
   public static void remove(ArrayList<String> list, String toRemove) {
                               
   }

   /*** REPLACE ***/
   public static void replace(ArrayList<String> list, String toRemove, String replaceWith) {

   } 
}