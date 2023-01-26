

public class ArrayExamples {

  // Changes the input array to be in reversed order
  static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length/2; i += 1) {

      int holder = arr[i];
      arr[i] = arr[arr.length - i - 1];
      arr[arr.length - i - 1] = holder;

    }
    /** The elements are not getting reversed properly, 
     * After the elements in the first half are reversed, the elements in the 
     * latter half will remain the same. 
     */ 
  }

  // Returns a *new* array with all the elements of the input array in reversed
  // order
  static int[] reversed(int[] arr) {
    int[] newArray = new int[arr.length];
    for(int i = 0; i < arr.length; i += 1) {
      newArray[i] = arr[arr.length - i - 1];
    }
    return newArray;
  }
  /**
   * the newArray initally had no data in its elements. Data from the old
   * array should have been copied to the new array instead of the other way
   * around
   */

  // Averages the numbers in the array (takes the mean), but leaves out the
  // lowest number when calculating. Returns 0 if there are no elements or just
  // 1 element in the array
  static double averageWithoutLowest(double[] arr) {
    if(arr.length < 2) { return 0.0; }
    double lowest = arr[0];

    for(double num: arr) {
      if(num < lowest) { lowest = num; }
    }

    double sum = 0;
    int num_Lowest = 0;
    for(double num: arr) {
      if(num != lowest) { 
        sum += num; 
      }
      else
        num_Lowest++;
    }
    if (num_Lowest == arr.length) {
      return 0;
    }

    return sum / (arr.length - num_Lowest);
  }
  /**
   * Method did not account for the fact that there could be multiple lowest 
   * numbers. E.g. {1,1,1,2,,3,4}, all of these ones should be removed
   */


}

