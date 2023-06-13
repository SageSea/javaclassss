package array;

import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        int i,j;
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[3][];
        a[0] = new int[4];
        a[1] = new int[3];
        a[2] = new int[6];
        for( i =0; i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.println("Enter the marks of "+ i + " class of " + j + " student");
                a[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Marks are: ");

        for( i =0; i<a.length;i++){
            for(j=0;j<a[i].length;j++){
                System.out.println("Marks of "+ i + " class of " + j + " student");
                System.out.println(a[i][j]);
            }
        }
    }
}
