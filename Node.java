//Name:  
//Lab 9A
//Node class for Singly Liinked List
//DO NO MODIFY Class Code

public class Node
{
   private int val;
   private Node next;
   
   public Node(int v)
   {
      val = v;
      next = null;
   }
   
   public void setNext(Node n)
   {
      next = n;
   }
   
   public Node getNext()
   {
      return next;
   }
   
   public int getVal()
   {
      return val;
   }
   
   public String toString()
   {
      return "" + val;
   }   
}