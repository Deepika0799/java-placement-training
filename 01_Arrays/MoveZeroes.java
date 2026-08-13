import java.util.*;

class MoveZeroes {
    public static void main(String[] args) {

        int arr[] = {0, 1, 0, 3, 12};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}