package cse360assign2;

/**
 * @version [05/23/16]
 * Class to execute 5 unique methods
 * Method 1: Mean as a Double
 * Method 2: Median as an Integer
 * Method 3: Highest Value of the List
 * Method 4: Lowest Value of the List
 * Method 5: Number of Integers in the List
 * For Methods 1-4, if the list is empty, it will return -1
 *
 * @author Timothy Kaing (PIN: tbd) for CSE360 Summer 2016
 *
 */

import java.util.stream.IntStream;

/**
 * Inherits - Class inherits from the OrderedIntList.java Class
 */

public class Analytics extends OrderedIntList
{
	/**
	 * method - return the mean of the integer list as a double
	 * @return mean value
	 */
	
	public double mean ()
	{

		if ((count == 0)) 
		{
			return -1;
		}

		else
		{
			double sumOfArray = IntStream.of(array).sum();

			double mean = ((sumOfArray) / (count));

			return mean; 
		}

	}
	
	/**
	 * method - return the median of the integer list as an integer
	 * @return median value
	 */
	
	public int median ()
	{

		if ((count == 0))
		{
			return -1;
		}

		else if((count % 2) == 0)
		{ 
			int median = (array[count / 2] + array[(count / 2) - 1]) / 2;
			
			return median;
		}

		else
		{
			int median = array[count / 2];
			
			return median;
		}

	}
	
	/**
	 * method - return the highest value of the list
	 * @return highest value
	 */

	public int high ()
	{

		if ((count == 0))
		{
			return -1;
		}

		else
		{
			int high = array[count - 1];
			
			return high;
		}
	}
	
	/**
	 * method - return the lowest value of the list
	 * @return lowest value
	 */
	
	public int low ()
	{
		if ((count == 0))
		{
			return -1;
		}

		else
		{
			int low = array[0];
			
			return low;
		}
	}
	
	/**
	 * method - return the number of integer
	 * @return number of integers
	 */

	public int numInts ()
	{
		return count;
	}
}
