import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main
{
	public static void main(String args[])
    {
      List<Integer> a = scanLine();
      System.out.println(a.toString());
    }
  
  	public static List<Integer> scanLine()
    {
    	Scanner sc = new Scanner(System.in);
      List<Integer> list = new ArrayList<Integer>();
      	while(sc.hasNextInt())
        {
          list.add(sc.nextInt());
        }

        return list;
    }

}