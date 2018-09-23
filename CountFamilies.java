//Developed by Aemun Ahmar
//CSCI 185-M03: Spring 2017
//Professor Hakkan Peckan
//Classwork 6: Count Families 
//April 7, 2017

import java.util.ArrayList;
import java.util.Scanner;

public class CountFamilies 
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		
		ArrayList<Integer> familyIncome = new ArrayList<Integer>();
		
		System.out.print("Enter the income of the family: ");
		familyIncome.add(userInput.nextInt());
		System.out.print("Do you want to enter another family's income? Type yes or no: ");
		
		int max = familyIncome.get(0);
		
		while(!userInput.nextLine().equalsIgnoreCase("no"))
		{
			if(userInput.nextLine().equalsIgnoreCase("yes"))	
			{
				System.out.print("\nEnter the income of the family: ");
				familyIncome.add(userInput.nextInt());
				System.out.print("Do you want to enter another family's income? Type yes to continue: ");
			} else
			{
				for(int i = 1; i < familyIncome.size(); i++)
				{
					if(max < familyIncome.get(i))
					{
						max = familyIncome.get(i);
					}
				}
				
				System.out.print("\nThe maximum income is: $" + max);
			}	
		}
		
		userInput.close();
	}
}
