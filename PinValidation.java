import java.util.Scanner;
import static java.lang.System.out;
class PinValidation
{
	public static void main(String [] args) throws InterruptedException
	{
		int storePin = 1234;
		int duration = 5000;
		
		outerLoop :
		for(; ;)
		{
			int attempt = 3;
			
			do{
				out.println();
				out.print("Enter your pin : ");
				int userPin = new java.util.Scanner(System.in).nextInt();
				
				if(storePin == userPin)
				{
					out.println("PHONE UNLOCKED");
					break outerLoop;
				}
				else
				{
					out.println("Wrong Pin");
					out.println("Attempt left "+ (attempt-1));
				}
				attempt --;
			}while (attempt != 0);
			
			System.out.println();
			System.out.println("Phone is Disabled for "+(duration/1000)+" seconds");
			Thread.sleep(duration);
			duration*=2;
		}
	}
}