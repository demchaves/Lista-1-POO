package q13;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        int n1 = 0;
        int n2 = 1;
        System.out.print("Digite um número: ");        
        Scanner s = new Scanner (System.in);
        int n = s.nextInt();
        for(int i = 0; i < n; i++){
            n1 = n1 + n2;
            n2 = n1 - n2;
            System.out.println(n1);
        }             
    }
    
}


