package q15;

import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        System.out.println("Digite um número: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 0; i < 4; i++){
            System.out.print(" "+n+" ");

            n = n*10;     
        }
    }  
}
