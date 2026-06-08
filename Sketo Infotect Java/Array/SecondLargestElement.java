package Array;

public class SecondLargestElement{

    public static int findSecondLargest(int[] arr) {
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            
            if (num > largest) {       // finding largest number
                secondLargest = largest;
                largest = num;
            } 
            else if(num > secondLargest && num != largest) {  // finding secondlargest number
                                            // first condition for num is greater than secondLargest and second to handle duplicate largest numbers)
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 4, 45, 99, 99, 6};
        System.out.println("Second largest element: " + findSecondLargest(arr));
    }
}