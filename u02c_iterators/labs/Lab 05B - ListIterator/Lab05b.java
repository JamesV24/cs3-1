//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;
import static java.lang.System.*;

public class Lab05b
{
	public static void main ( String[] args )
	{
		//add test cases		
		ListIteratorTest t = new ListIteratorTest("a b c a b c");
		t.replace("a","+");
		out.println(t + "\n");
		t.setTest("a b c d e f g h i j x x x x");
		t.replace("x","7");
		out.println(t + "\n");
		t.setTest("1 2 3 4 5 6 a b c a b c");
		t.replace.("b","#");
		out.println(t + "\n");
	}
}
