import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryTracer
	{

	public static void main(String[] args)
		{
		int numbersAdded = 0;
		int middle = 0;
		
		ArrayList listArray = new ArrayList();
		System.out.println("Please enter your numbers 1-20, and when your done end the Array with a -1.");
		
			do			
			{
			System.out.println("Enter # from 1-20, or -1 to end the Array.");
			Scanner userInput2 = new Scanner(System.in);
			numbersAdded = userInput2.nextInt();
			if(numbersAdded >= 1 && numbersAdded <= 20 )
				{
				listArray.add(numbersAdded);
				}
			else if(numbersAdded <= 0 && numbersAdded != -1 || numbersAdded >= 21)
				{
				System.out.println("Please only imput numbers in the range of 1 - 20 inclusive.");
				}
			}	
		while(numbersAdded != -1);
		Collections.sort(listArray);
		
		
		int indexOfTarget = (int)(Math.random() * listArray.size());	
		int target = (int)(listArray.get(indexOfTarget - 1));
		System.out.println("The target number is " + target + ".");
		int counter = 0;
		
		binarySearch( listArray, target, counter);
		}

	public static int binarySearch(ArrayList listArray, int target, int counter)
		{

		int left = 0;
		int right = listArray.size() - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			for(int i = 0; i < listArray.size(); i++)
					{
					System.out.print(listArray.get(i));
					System.out.print(" ");
					}
			
			Scanner userInput6 = new Scanner(System.in);
			System.out.println("What is the right index?");
			int userRight = userInput6.nextInt();
			
			for(int i = 0; i < listArray.size() - 1; i++)
				{
				System.out.print(listArray.get(i));
				System.out.print(" ");
				}
			
			Scanner userInput5 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the left index?");
			int userLeft = userInput5.nextInt();
			
			for(int i = 0; i < listArray.size() - 1; i++)
				{
				System.out.print(listArray.get(i));
				System.out.print(" ");
				}			
			
			Scanner userInput4 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the middle index?");
			int userMiddle = userInput4.nextInt();
				
			for(int i = 0; i < listArray.size() - 1; i++)
				{
				System.out.print(listArray.get(i));
				System.out.print(" ");
				}
			
			Scanner userInput7 = new Scanner(System.in);
			System.out.println();
			System.out.println("What is the value of the middle?");
			int ofMiddleIndex = userInput7.nextInt();
			//determining the answer and the amount of tries
			if(userLeft == left && userRight == right)
				{
				
				if(userMiddle == middle)
					{
					if (target < ((int)listArray.get(middle)) && ((int)listArray.get(middle)) == ofMiddleIndex)
						{
						right = middle - 1;
						counter++;
						}
					else if(target < ((int)listArray.get(middle)) && ((int)listArray.get(middle)) != ofMiddleIndex)
						{
					System.out.println("That is incorrect, please try again.");
					counter++;
						}
					else if (target > ((int)listArray.get(middle)) && ((int)listArray.get(middle)) == ofMiddleIndex)
						{
					left = middle + 1;
					counter++;
						}
					else if(target > ((int)listArray.get(middle)) && ((int)listArray.get(middle)) != ofMiddleIndex )
						{
					System.out.println("That is incorrect, please try again.");
					counter++;
						}
					else
						{
						System.out.println("Good Job! It took you " + counter + " tries to complete the quiz!");
						return middle;
						}
					}
				}
			//if else to determine if the answer is correct 

			else if(userLeft != left)
				{
				System.out.println("That is incorrect, please try again.");
				counter++;
				}
			else if(userRight != right)
				{
				System.out.println("That is incorrect, please try again.");
				counter++;
				}
			
			else if(userMiddle != middle)
				{
				System.out.println("That is incorrect, please try again.");
				counter++;
				}			
			}
		//return the -1
			return -1;
		}
}