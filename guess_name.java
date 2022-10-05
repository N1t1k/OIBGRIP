import java.util.Random;
import java.util.Scanner;

class Guess
{
	public Guess(int N,int R,int i)
	{
		
		if(R==N)
			{System.out.println();
			System.out.println("Congratulations you won this game in"+" "+i+" "+"attempts");
				System.exit(i);
			}
		else if(R>N)
		{
			System.out.println("oops!! computer number is higher than generated number.");
			System.out.println("                ...Keep Trying...                    ");
		}
		else 
		{
			System.out.println("oops!! computer number is lower than generated number");
			System.out.println("                ...Keep Trying...                    ");
		}
	}
}

class guess_name{

	public static void main(String[] args) {
	    String more="Yes";
	    while(more.equals("Yes")){
		
		Random r=new Random();
		int ran=r.nextInt(100);
		
		
		Guess su[]=new Guess[6];
		
		Scanner sc=new Scanner(System.in);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("                                 |HEY_CHAMP! WELCOME_TO_GAME|                              ");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("(Note:- You have only five attempts....)");
		System.out.println("----------------------------------------------------------------------------------------------");
		System.out.println("So champ are u ready to play(Yes/No)?....");
		String play=sc.next();
		if(play.equals("Yes"))
		{
			for(int i=1;i<=5;i++)
		{	
				int a=5-i;
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Enter the number For "+i+ " "+"guess and your"+" "+a+" "+" guess remaining");
				int num=sc.nextInt();
				su[i]= new Guess(num,ran,i);
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println("O0ps!! you lose this game......Better luck next time :)");
		System.out.println("You have only five attempts");
		System.out.println("The Computer Number is:"+ran);
	    System.out.println();
		System.out.println();
		System.out.println("wanna play more(Yes/No)?");
		more=sc.next();
		
		
	
	
	  }
	else{
	    System.out.println();
		System.out.println();
	    System.out.println("              Okey_have_a_good_day_champ :)               ");
	    more="No";
	}
}
}
}