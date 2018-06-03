//Convert an array  to an arraylist
import java.util.ArrayList;
import java.util.Arrays;
public class ArraytoArrayList {
public static void  main(String[] args) 
{
	String[]  my_array = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
	ArrayList<String>  obj = new ArrayList<String>(Arrays.asList(my_array));
	System.out.println(obj);
}
}