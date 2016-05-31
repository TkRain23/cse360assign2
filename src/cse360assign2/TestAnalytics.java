package cse360assign2;

public class TestAnalytics 
{
	public static void main (String[] args)
	{
		
		OrderedIntList list = new Analytics(); //List inputs the integers in increasing order
		list.insert(0);
		list.insert(1);
		list.insert(2);
		list.insert(3);
		list.insert(4);
		list.insert(5);
		list.insert(6);
		list.insert(7);
		list.insert(8);
		list.insert(9);
		list.insert(10);
		list.print();
		
		OrderedIntList list2 = new Analytics(); //List2 inputs the integers in decreasing order
		list2.insert(10);
		list2.insert(9);
		list2.insert(8);
		list2.insert(7);
		list2.insert(6);
		list2.insert(5);
		list2.insert(4);
		list2.insert(3);
		list2.insert(2);
		list2.insert(1);
		list2.insert(0);
		list2.print();
		
		OrderedIntList list3 = new Analytics(); //List3 inputs the integers in assorted order
		list3.insert(69);
		list3.insert(23);
		list3.insert(13);
		list3.insert(24);
		list3.insert(32);
		list3.insert(36);
		list3.insert(11);
		list3.insert(6);
		list3.insert(19);
		list3.insert(49);
		list3.insert(61);
		list3.insert(99);
		list3.print();
		
		OrderedIntList list4 = new Analytics(); //List4 inputs two integers 
		list4.insert(6);
		list4.insert(1);
		list4.print();
		
		OrderedIntList list5 = new Analytics(); //List5 inputs zero integers
		list5.print();
		
		Analytics meanOdd = new Analytics();
		meanOdd.insert(13);
		meanOdd.insert(24);
		meanOdd.insert(32);
		System.out.println("Mean of an Odd Array {13, 24, 32}: " + meanOdd.mean());
		
		
		Analytics meanEven = new Analytics();
		meanEven.insert(13);
		meanEven.insert(24);
		meanEven.insert(32);
		meanEven.insert(50);
		System.out.println("Mean of an Even Array {13, 24, 32, 50}: " + meanEven.mean());
		
		Analytics meanEmpty = new Analytics();
		System.out.println("Mean of an Empty Array: " + meanEmpty.mean() + " [error]");
		
		Analytics medianOdd = new Analytics();
		medianOdd.insert(1);
		medianOdd.insert(2);
		medianOdd.insert(3);
		System.out.println("Median of an Odd Array {1, 2, 3}: " + medianOdd.median());
		
		Analytics medianEven = new Analytics();
		medianEven.insert(3);
		medianEven.insert(4);
		medianEven.insert(5);
		medianEven.insert(6);
		System.out.println("Median of an Even Array {3, 4, 5, 6}: " + medianEven.median());
		
		Analytics medianEmpty = new Analytics();
		System.out.println("Median of an Empty Array: " + medianEmpty.median() + " [error]");
		
		Analytics high = new Analytics();
		high.insert(1);
		high.insert(2);
		high.insert(3);
		System.out.println("Highest Value of an Array {1, 2, 3}: " + high.high());
		
		Analytics emptyHigh = new Analytics();
		System.out.println("Highest Value of an Empty Array: " + emptyHigh.high() + " [error]");
		
		Analytics low = new Analytics();
		low.insert(1);
		low.insert(2);
		low.insert(3);
		System.out.println("Lowest Value of an Array {1, 2, 3}: " + low.low());
		
		Analytics emptyLow = new Analytics();
		System.out.println("Lowest Value of an Empty Array: " + emptyLow.low() + " [error]");
		
		Analytics numberOfIntegers = new Analytics();
		numberOfIntegers.insert(1);
		System.out.println("Number of Integers in an Array with one Element: " + numberOfIntegers.numInts());
		
		Analytics noIntegers = new Analytics();
		System.out.println("Number of Integers in an Array when Empty: " + noIntegers.numInts());
		
	}
}
