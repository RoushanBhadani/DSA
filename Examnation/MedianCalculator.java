package in.Examnation;

public class MedianCalculator {

    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int totalLength = arr1.length + arr2.length;
        int[] mergedArray = new int[totalLength];
        
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k++] = arr1[i++];
            } else {
                mergedArray[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            mergedArray[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            mergedArray[k++] = arr2[j++];
        }
        
        if (totalLength % 2 == 0) {
            int mid = totalLength / 2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            int mid = totalLength / 2;
            return mergedArray[mid];
        }
    }

    public static void main(String[] args) {
        MedianCalculator calculator = new MedianCalculator();
        int[] arr1 = {1};
        int[] arr2 = {2};
        double median = calculator.findMedianSortedArrays(arr1, arr2);
        System.out.print(median);
    }
}
