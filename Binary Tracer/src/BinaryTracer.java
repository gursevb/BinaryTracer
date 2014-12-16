import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryTracer
	{
	static int num = 0;
    static ArrayList numbers = new ArrayList();
	public static void main(String[] args)
		{
		// binarySearch(null, 0);
		userInput();
		}

	public static void userInput()
		{

		
		System.out.println("Enter the numbers for your array. Please end the array with a -1.");
		Scanner input = new Scanner(System.in);
		num = input.nextInt();

		while(num >= 0)
			{
			firstStep();
			}
		

		//for (int i = 0; i < numbers.size(); i++) 
			//{ 
			//System.out.println(numbers.get(i));
			//}
		}
	
	public static void firstStep()
		{
		System.out.println("Enter the numbers for your array. Please end the array with a -1.");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		numbers.add(a);
System.out.println(numbers);
		numbers.remove(numbers.size()-1);

		}

	public static int binarySearch(int[] elements, int target)
		{
		int left = 0;
		int right = elements.length - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < elements[middle])
				{
				right = middle - 1;
				} else if (target > elements[middle])
				{
				left = middle + 1;
				} else
				{
				return middle;
				}
			}
		return -1;
		}

	}
