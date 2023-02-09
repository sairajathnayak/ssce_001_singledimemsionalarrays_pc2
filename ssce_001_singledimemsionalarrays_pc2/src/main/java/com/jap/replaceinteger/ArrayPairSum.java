package com.jap.replaceinteger;

public class ArrayPairSum {

    public static void main(String[] aa)
    {

        //Declare and initialize integer array in the variable numberArray
        int[] numberArray = null;
        ArrayPairSum arrayPairSum = new ArrayPairSum();
        int sumArray[] = arrayPairSum.sumOfArrayPair(numberArray);
        for(int data:sumArray)
        	System.out.println(data);
        //write forEach loop to iterate through the 'sumArray' to print the output
        
    }

    
    public int[] sumOfArrayPair(int numberArray[])
    {
    	int [] arr;
    	int size = (numberArray.length/2) + (numberArray.length%2);
    	arr = new int[size];
    	if(numberArray.length%2==0)
		{
    		for(int i=0,j=0;i<arr.length;i++,j+=2)
    		{
    			arr[i]=numberArray[j]+numberArray[j+1];
    		}
		}
    	
    	else
    	{
    		for(int i=0,j=0;i<arr.length;i++,j+=2)
    		{
    			if(i!=arr.length-1) 
    			{
    			arr[i]=numberArray[j]+numberArray[j+1];
    			}
    		}
    		arr[arr.length-1]=numberArray[numberArray.length-1];
    	}
    	
    	return arr;
    
    }

}
