package lv.diana.repeatarrays;

import java.util.Scanner;

public class ScannerAndArrays {
    public static void main (String[]args) {
        Scanner s = new Scanner(System.in);
        int[] arr = new int[3];
        System.out.println("Input first array value");
        arr[0] = s.nextInt();
        System.out.println("Input second array value");
        arr[1] = s.nextInt();

        System.out.println(arr[0]+arr[1]);

    }
}
