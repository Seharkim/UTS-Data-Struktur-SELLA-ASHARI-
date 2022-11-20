/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner gg = new Scanner(System.in);
        System.out.print("Masukkan Bilangan: ");
        int bilangan = gg.nextInt();
        if (bilangan %2 == 1){
            System.out.println("GANJIL");
        }
        else
            System.out.println("GENAP");
    }
}
