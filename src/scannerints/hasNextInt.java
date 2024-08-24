
package scannerints;

import java.util.Scanner;

public class hasNextInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input: ");
        boolean check = scanner.hasNextInt();
        System.out.println("Co phai la so nguyen khong? " + check);
    }
    
}
