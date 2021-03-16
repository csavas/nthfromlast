//Name:
//Lab 9A Main
//DO NOT MODIFY Class code

public class LListRunnerB
{
   public static void main(String[] arg)
   {
      
      LList one = new LList();
      one.add(1);
      one.add(2);
      one.add(3);
      one.add(4);
      one.add(5);
	   one.add(6);
	   one.add(7);
      
      System.out.println("Find 4th from last:");
      System.out.println(one.NthFromEnd(4));
      System.out.println();
      
      System.out.println("Find 12th from last:");
      System.out.println(one.NthFromEnd(12));
      System.out.println();

      System.out.println("Find 1st from last:");
      System.out.println(one.NthFromEnd(1));
      System.out.println();

      System.out.println("Find 7th from last:");
      System.out.println(one.NthFromEnd(7));
      System.out.println();

   }
}