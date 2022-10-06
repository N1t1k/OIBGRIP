import java.util.Scanner;
import java.util.ArrayList;
class Main
{
  public static void main (String[]args)
  {
    ArrayList < String > arr = new ArrayList < String > ();
    int balance = 0;
    int count = 0;
      System.out.
      println
      ("--------------------------------------------------------------------------------------------------------------");
      System.out.
      println
      ("****----****----****----****----****----***WELCOME TO A.T.M***----****----****----****----****----****----****");
      System.out.
      println
      ("--------------------------------------------------------------------------------------------------------------");
    Scanner sc = new Scanner (System.in);
      System.out.println ();
      System.out.println ();
      System.out.
      println
      ("**************************************************************************************************************");
      System.out.
      println
      ("***************************************************************************************************************");
      System.out.println ("USER ID :-");
    String Name = sc.nextLine ();
      System.out.println ();
      System.out.println ("USER PIN :-");
    int password = sc.nextInt ();
      System.out.
      println
      ("***************************************************************************************************************");
      System.out.
      println
      ("***************************************************************************************************************");

    if (Name.equals ("nitik sinha") && password == 1234)
      {


	while (true)
	  {
	    System.out.println ("SELECT WHAT YOU WANT TO DO :-");
	    System.out.println ();
	    System.out.print ("DEPOSIT <----- 1 PRESS");
	    System.out.println (" 2----->WITHDRAW");
	    System.out.print ("TRANSFER <----- 3 PRESS");
	    System.out.println (" 4----->HISTORY_TRANSACTION");
	    System.out.println ("PRESS 5---------->QUIT<------------5 PRESS");
	    System.out.println ();

	    int c = sc.nextInt ();
	    switch (c)
	      {
	      case 1:
		System.out.print ("Please enter your deposit amount:- ");
		int deposit = sc.nextInt ();
		  balance = balance + deposit;
		  System.out.
		  println ("Your Money has been successfully deposited");
		  System.out.println ();
		  System.out.println ();
		  arr.add ("deposit:" + deposit);
		  break;
		case 2:System.out.
		  print ("Please enter your withdraw amount:- ");
		int withdraw = sc.nextInt ();
		if (balance >= withdraw)
		  {
		    arr.add ("withdraw:" + withdraw);
		    balance = balance - withdraw;
		    count = count + 1;

		    System.out.println ("Please collect your money");

		    System.out.println ();
		    System.out.println ();
		  }
		else
		  {
		    System.out.println ("Insufficient Balance");
		    System.out.println ();
		    System.out.println ();
		  }
		System.out.println ("");
		break;
	      case 3:

		System.out.println ("Enter the Receiver's bank name: ");
		String name = sc.next ();
		System.out.println ();
		System.out.println ("Enter the beneficiary first name: ");
		String receiver_first = sc.next ();
		System.out.println ("Enter the beneficiary last name: ");
		String receiver_last = sc.next ();
		System.out.println ();
		System.out.println ("Enter the bank A/C no.: ");
		int account = sc.nextInt ();
		String s = Integer.toString (account);
		int l = s.length ();
		System.out.println ();
		System.out.println ("Enter the amount to transfer: ");
		int amount = sc.nextInt ();

		if (l == 10)
		  {

		    balance = balance - amount;
		    count = count + 1;
		    arr.add ("Transfer Rs " + amount + " To " +
			     receiver_first + " " + receiver_last + "(A/C :" +
			     account + ") " + name);
		    System.out.
		      println
		      ("                             Transaction successfully!!"
		       + receiver_first + " " + receiver_last);
		    System.out.println ();
		    System.out.println ();

		  }
		else
		  {
		    System.out.
		      println
		      ("oops!! User not found please check bank details");
		    System.out.println ();
		    System.out.println ();

		  }
		System.out.println ();
		break;
	      case 4:
		System.out.
		  println ("**********Transaction_history*************");
		System.out.println ();
		System.out.println ();
		for (int i = 0; i <= count; i++)
		  {
		    System.out.println ("Transaction " + i + " : " +
					arr.get (i));
		  }
		System.out.println ("current balance :" + balance);
		System.out.
		  println ("******************************************");
		System.out.println ();
		System.out.println ();
		break;
	      case 5:
		System.out.
		  println
		  ("                                    THANK YOU FOR VISITING");
		System.exit (0);



	      }



	  }

      }
    else
      {
	System.out.
	  println ("oops!! Please enter right username and password");
	System.out.print ("Thank you");
      }


  }
}
