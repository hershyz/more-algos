public class Main {

    public static void main(String[] args) {

    }

    //Solution:
    public static int[] greatestProductSubarray(int[] arr) {

        /*
        * Uses a sliding window solution to find every subarray within 'arr':
        * 'i' represents the left index of the array that is being tested
        * 'j' represents the right index of the array that is being tested
        * */

        int maxProduct = Integer.MIN_VALUE; //Sets base case for max as lowest possible int value
        int maxBoundLeft = 0;
        int maxBoundRight = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {

                int[] test = arrayBuilder(arr, i, j); //Finds subarray from current bounds
                int currentProduct = getProduct(test); //Finds the product of the current subarray

                //Sets the maxProduct and bounds to the current product if the current product is greater than the max product:
                if (currentProduct > maxProduct) {
                    maxProduct = currentProduct;
                    maxBoundLeft = i;
                    maxBoundRight = j;
                }
            }
        }

        return arrayBuilder(arr, maxBoundLeft, maxBoundRight);
    }

    //Helper method:
    public static int[] arrayBuilder(int[] arr, int left, int right) {

        int[] result = new int[(right - left) + 1];
        int index = 0;
        for (int i = left; i <= right; i++) {
            result[index] = arr[i];
            index++;
        }

        return result;
    }

    //Helper method (for readability):
    public static int getProduct(int[] arr) {

        int product = 1;
        for (int num : arr) {
            product *= num;
        }

        return product;
    }
}
