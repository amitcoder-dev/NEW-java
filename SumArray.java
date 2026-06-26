public class SumArray {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5};
        int sum =0;
        //System.out.println("Array elements:");
       for (int i=0; i< numbers.length;i++){
        sum += numbers[i];
       }
            System.out.println("Sum of array elements: " + sum);
        }
    }
