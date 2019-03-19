import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
public class Series
{
	public static void main(String args[])
	{
		// This class will help us in reading the input from the user.
		BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.print("Please enter the term (Number only) : ");
			int term=Integer.parseInt(BR.readLine());                     // Read the user input and convert it in an Integer.
			int counter=1;                                                // This variable will increment itself in the loop below.
			int sequence=0;                                               // This will have the resultant value.
			
			System.out.println("The Sequence are as follows:");
			for(counter=1 ; counter<=term ; counter++)                    // Loop the entire calculation till the number user has entered.
			{
				sequence = (counter * counter * counter) - 1;             // The calculation will be (1*1*1)-1 , (2*2*2)-1 , (3*3*3)-1 and so on...
				System.out.println(sequence);                             // Print each calculated result on the screen.
			}
		}
		catch(Exception ex)
		{
			System.out.println("Please input a valid number. Execute the program again.");   // Notify user that the number entered is invalid.
		}
	}
}