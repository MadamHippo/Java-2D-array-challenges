/*
Test your knowledge of 2D array traversal with these code challenges!

2D arrays allow us to create and store data within rows and columns. Using iteration, we can traverse through these values to gather information about the data. In this activity, we’ll focus on traversing 2D arrays to gather information about a set of data.

Four wildlife researchers in Victoria, Australia spent five days counting the number of koalas they came across in different areas. Their numbers were as follows:

*	Noor	Edward	Camila	Amir
Day 1	17	13	19	22
Day 2	12	18	25	20
Day 3	15	18	21	24
Day 4	19	23	23	22
Day 5	18	20	21	26
The researchers want to use this chart to gather some information regarding their trip using Java. This type of data would be very fitting for a 2D array.

Traversing a 1D Array
A lot of the standard algorithms used for 1D arrays can be carried over when traversing a 2D array. Let’s pretend we only got the data from the first day of observation. We can place this data in a 1D array that looks like this:

int[] dayOne = {17, 13, 19, 22};
With this, let’s try to find the total number of koalas spotted on the first day. To do this, we’ll do the following:

Create an int variable and set it to 0. This will be used to store the cumulative sum of each element value.
Use a for loop to iterate through the array.
Inside the loop, increase the variable created in step 1 by the current element value.
Return the variable storing the sum.

Complete the function getTotal() which takes in an array of ints as a parameter and returns the sum of each element value of the array.
*/

class KoalaCounting {
  public static int getTotal(int[] arr) {
    // Add your code below
    int sum = 0;
    for (int num : arr){
      sum+=num;
    }
    return sum;


  }

/* For loop version
  public static int getTotal(int[] arr) {
      int total = 0;
      for (int i= 0; i < arr.length; i++) {
          total += arr[i];
      }
      return total;
  }
*/

  public static void main(String[] args) {
    int[] dayOne = {17, 13, 19, 22};
    System.out.println(getTotal(dayOne));
  }
}

/*
First, we created a variable called total and set its value to 0. This variable will store the cumulative sum of our array’s values. Next, we created a for loop that iterates from 0 to one value less than the length of our array. Inside the array, we only have one instruction: total += arr[i]. This line increases the current value of total by the value of the element at index i. Outside our loop, we return the value of total.
*/

// Fill in the blanks so that the program returns the average number of koalas spotted by the researchers on the first day.

class Koala {
  public static int getAvg(int[] arr) {
    int total = 0;
    for (int i= 0; i < arr.length; i++) {
      total += arr[i];
    }
    return total/arr.length;
  }
 
 
 
 
// Now for the 2D array example with the same example of researchers and koala sightings above...

/* 
Now, let’s go ahead and iterate through the 2D array to find out the total amount of koalas spotted over the five days. The code will look similar to the last example with some slight adjustments.

1. Create an int variable and set it to 0. This will be used to store the cumulative sum of each element value.
2. Use a for loop to iterate through the rows of the 2D array.
3. Create a nested loop to iterate through the columns of the 2D array.
4. Inside the loop, increase the variable created in step 1 by the current element value.
5. Return the variable storing the sum.

Complete the function, getTotal(), which takes in a 2D array and returns the overall sum value of every single element.
*/

class KoalaCounting {
  public static int getTotal(int[][] arr2D) {
    // Add your code below
    int total = 0;
    for (int row=0; row < arr2D.length; row++){
      for (int col=0; col < arr2D[0].length; col++){
        total += arr2D[row][col];

      }
    }
    return total;
  }

  public static void main(String[] args) {

    int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
    System.out.println(getTotal(koalaSpottings));
  }
}

/*
A lot of this code is similar to what we’ve seen previously. We start by creating a counter variable, total. In order to search for a value in a 2D array, we must access each individual row of the 2D array. We start with creating a nested for loop; the outer loop iterates over each row while the inner loop iterates over each individual value of the arrays. Inside our nested loop, we use an if statement to check for the condition arr2D[row][col] > num. This condition is true when the current element value is larger than the value of the parameter num. If the condition is true, we increase total by 1. Outside the loops, we return total.
*/
