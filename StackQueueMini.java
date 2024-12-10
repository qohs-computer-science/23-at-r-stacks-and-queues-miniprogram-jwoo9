//Justin Wu, 12/9/24, PD 3
//Description: Program using temporary Stacks and Queues to rearrange and alter values in existing Stacks and Queues
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

class StackQueueMini {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Part 1");
    System.out.println();
    //creating myStack
    Stack <Integer> myStack = new Stack<Integer>();
    for (int i = 0; i<5; i++){
      System.out.println("Enter a whole number:");
      myStack.push(input.nextInt());
      input.nextLine();
    }//end for
    System.out.println("Current Stack:");
    System.out.println(myStack);

    //adding values into tempS
    Stack <Integer> temp = new Stack <Integer>();
    while (!myStack.isEmpty())
      temp.push(myStack.pop());
    System.out.println("Temp Stack:");
    System.out.println(temp);

    //add values back into myStack
    while (!temp.isEmpty()){
      myStack.push(temp.peek());
      myStack.push(temp.pop());
    }//end while
    System.out.println("New Stack:");
    System.out.println("Top of Stack");
    while (!myStack.isEmpty())
      System.out.println(myStack.pop());
    System.out.println("Bottom of Stack");

    System.out.println("\n");

    System.out.println("Part 2");
    System.out.println();

    //creating myQ
    Queue <Integer> myQ = new LinkedList <Integer>();
    for (int i = 0; i<10; i++){
      System.out.println("Enter a whole number");
      myQ.add(input.nextInt());
      input.nextLine();
    }//end for
    System.out.println("My Queue");
    System.out.println(myQ);

    //create two storage queues
    Queue <Integer> oddQ = new LinkedList <Integer>();
    Queue <Integer> evenQ = new LinkedList <Integer>();
    while (!myQ.isEmpty()){
      if (myQ.peek()%2==0)
        evenQ.add(myQ.remove());
      else 
        oddQ.add(myQ.remove());
    }//end while
    System.out.println("Even Queue:");
    System.out.println(evenQ);
    System.out.println("Odd Queue:");
    System.out.println(oddQ);
    while (!evenQ.isEmpty())
      myQ.add(evenQ.remove());
    while (!oddQ.isEmpty())
      myQ.add(oddQ.remove());
    System.out.println("New Queue");
    System.out.println("Front of Queue");
    while (!myQ.isEmpty())
      System.out.println(myQ.remove());
    System.out.println("Back of Queue");

  } // end main
} // end class
