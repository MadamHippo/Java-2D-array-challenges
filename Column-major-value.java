/*
The researchers want to know which person spotted the most koalas over the five days. To find this information, we’ll have to iterate through a specific index of an array at each row. The steps for completing this task is:

1. Create a variable, largestColumn, that will store the index value of the column with the largest sum.
2. Create a variable, largestSum that will store the sum value of the column with the largest sum.
3. Create a for loop that iterates through the columns of the 2D array.
4. Create a variable, columnVal, that will store the sum of an individual column.
5. Create a nested for loop that iterates through the rows the 2D array.
6. Inside the nested loop, increase the value of the variable columnVal, by the current element value.
7. Outside the nested loop, but inside the outer loop, check if columnVal is larger than largestSum. If it is, set largestSum to columnVal and set largestColumn to the loop’s current iteration value.
8. Outside the loop, return largestColumn.

Complete the method largestColumn(). The function accepts a 2D array of ints as a parameter and returns an int representing which column had the highest sum value.
*/

class KoalaCounting {
  public static int largestColumn(int[][] arr2D) {
    // Add your code below
    int largestColumn = 0;
    int largestSum = 0;

    for (int col = 0; col < arr2D[0].length; col++) {
      int individual_col = 0;
      for (int row = 0; row < arr2D.length; row++) {
        individual_col += arr2D[row][col];
      }
      if (individual_col > largestSum) {
        largestSum = individual_col;
        largestColumn = col;
      }
    }
    return largestColumn;
  }

  public static void main(String[] args) {

    int[][] koalaSpottings = {{17, 13, 19, 22}, {12, 18, 25, 20}, {15, 18, 21, 24}, {19, 23, 23, 22}, {18, 20, 21, 26}};
    System.out.println(largestColumn(koalaSpottings));
  }
}

/*
We started by initializing two int variables with a value of 0: largestColumn and largestNumber. largestColumn will be used to represent which column has the largest sum value while largestNumber represents said sum. Next we create a for loop. Unlike the previous code challenges, our outer for loop will be used to iterate through the columns. Therefore, we continue iterating until the value is one less than the length of an array row. Inside this loop, we create an int variable, columnVal, and set it to 0. We’ll use this to temporarily store the sum of a column. After, we’ll create a nested loop that iterates through the rows of the 2D array. Inside the loop, we’ll add the current element value to columnVal with the line columnVal += arr2D[row][col];. Outside the nested loop but inside the outer loop, we use a conditional statement to check if columnVal is larger than largestNumber; if it is, we set largestNumber to equal columnVal and largestColumn to col.

If you’re still feeling confused, let’s look back at the chart. This time, we’ll add which index each researcher is represented by in the 2D array:

*	Noor - 0th	Edward - 1st	Camila - 2nd	Amir - 3rd
Day 1	17	13	19	22
Day 2	12	18	25	20
Day 3	15	18	21	24
Day 4	19	23	23	22
Day 5	18	20	21	26

In the first iteration of the outer loop, we iterate through each element at the 0th index and add that value to columnVal. Think of this as getting the sum for the first column of numbers under Noor. This value looks like 17 + 12 + 15 + 19 + 18, making columnVal equal 81. We then check if columnVal has a value that is greater than the value of largestNumber which is currently 0. Since the columnVal is larger, we set largestNumber to equal columnVal which is 87. We then declare largestColumn to 0 to represent that the sum of all the values at the 0th index has the largest sum. This concludes the first iteration of the outer loop. Our process repeats now for each value at the 1st index. The sum of the 1st index (each value under the name of Edward) is 92. When we compare columnVal (with a value of 92) to largestVal (with a value of 87), we see that the condition columnVal > largestVal is true; therefor, we change largestVal to represent the new largest value, 92, and set largestColumn to 1. This process repeats for index 2 and index 3. In the end, index 3 (under Amir) has the largest value; therefore, the method will return the value of 3.
*/
