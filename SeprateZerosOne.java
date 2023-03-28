public class SeprateZerosOne {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,9,8,7,6,1,1,1,1,1};
        int[] sortedArr = separateZerosOnes(arr);
        for (int i : sortedArr) {
            System.out.print(i + " ");
        }
    }

    public static int[] separateZerosOnes(int[] arr) {
        int[] sortedArr = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sortedArr[count] = 0;
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                sortedArr[count] = 1;
                count++;
            }
        }
        return sortedArr;
    }
}
