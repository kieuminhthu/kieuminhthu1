
package scannerints;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input: ");
        boolean check = keyboard.hasNext();
        System.out.println("Co phai la chuoi khong? " + check);
    }
    
}
