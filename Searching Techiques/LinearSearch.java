import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int target;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 5 elements in the array: ");
        
        for(int i=0; i<=arr.length-1; i++){
            arr[i] = in.nextInt();
        }

        System.out.println("Enter the target value you want to search: ");
        target = in.nextInt();


        for(int j=0; j<arr.length-1; j++){
            if(j==target){
                System.out.print("Value Found at index: "+j);
            }
        }
        

    }
}
