package cse360assign2;

/**
 * @version [05/23/16]
 * Class to sort an array in ascending order.
 * Can insert in ascending order, descending order, and randomly.
 * Can insert more than 10 values, therefore the array can expand.
 *
 * @author Timothy Kaing (PIN: tbd) for CSE360 Summer 2016
 *
 */

public class OrderedIntList
{
	protected int[] array;
	protected int count; //the number of elements stored in the array
	private boolean debugger;	

	/**
	 * This constructor initializes our array to store 10 integers
	 */

	OrderedIntList ()
	{
		array = new int[10];
	}

	/**
	 * Insert - adds parameters into a list based on order
	 *
	 * @param value
	 */

	public void insert (int value)
	{
		if(count == array.length)
		{
			grow();
		}

		if(count == 0)
		{
			array[0] = value;
			count++;
		}

		else
		{
			int positionAdd = 0;
			boolean done = false;
			int index = 0;

			while(!done && index < count)
			{
				if(debugger)
				{
					System.out.println("Index: " + index);
					System.out.println("Value: " + array[index]);
				}
				
				if(value < array[index])
				{
					done = true;
				}

				else
				{
					index++;
					positionAdd++;
				}
			}

			for (index = count; index > positionAdd; index--)
			{
				array[index] = array[index-1];
			}

			array[positionAdd]= value;
			count++;
		}
	}

	/**
	 * Insert - adds more space into the array to support more values
	 *
	 */

	private void grow()
	{
		int[] temporary = new int[count * 2];
		for (int index = 0; index < count; index++)
		{
			temporary[index]= array[index];
			
			if(debugger)
			{
				System.out.println("Value copied: " + array[index]);
			}
		}

		array = temporary;
	}

	/**
	 * Print - Outputs the content of the array
	 *
	 */

	public void print ()
	{
		for (int index = 0; index < count; index++)
		{
			if (index % 5 == 0)
			{
				System.out.println();
			}

			System.out.print(array[index] + "\t");
		}

		System.out.println();
	}
}
