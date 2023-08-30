package in.Array;

import java.util.Scanner;

public class InputOutput {
	
    public static void input(int arr[],int size) {
        Scanner sc = new Scanner(System.in);
       
    	for(int j = 0; j < size; ++j) {
            arr[j] = sc.nextInt();
        }
    }
    public static void output(int arr[],int size) {
    	for(int j = 0; j < size; ++j) {
            System.out.print(arr[j]+" ");
        }
    
    }

    public static void main(String[] args) {
    	int[] arr = new int[100];
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        input(arr,size);
        output(arr,size);
        

        

    }
}