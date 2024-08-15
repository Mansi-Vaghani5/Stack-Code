import java.util.*;

public class stack {

    public static void main(String[]args){

        Stack<String> stack=new Stack<String>();
       stack.push("one");
    stack.push("two");
       stack.push("three");
       System.out.print(stack);
     stack.pop();
    System.out.println();
    System.out.println(stack.search("one"));
       System.out.println(stack.search("three"));
    System.out.println(stack.peek());
       System.out.print( stack.empty());
  }
}