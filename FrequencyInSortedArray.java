public class FrequencyInSortedArray {
    
    public static void frequencyInSortedArray(int arr[]) {
        if (arr.length == 0) {
            return; // Handle empty array case
        }

        int freq = 1, i = 1;

        while (i < arr.length) {
            while (i < arr.length && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }

            System.out.println(arr[i - 1] + " " + freq);
            freq = 1;
            i++;
        }

        if (arr.length == 1 || arr[arr.length - 1] == arr[arr.length - 2]) {
            System.out.println(arr[arr.length - 1] + " " + 1);
        }
    }
    public static void main(String[] args) {
        
        int[] sortedArray = {1, 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5};
        System.out.println("Original Array");
        for(int num:sortedArray)
        System.out.print(num+" ");
        System.out.println();
        System.out.println("Output");
        frequencyInSortedArray(sortedArray);
    }
}
