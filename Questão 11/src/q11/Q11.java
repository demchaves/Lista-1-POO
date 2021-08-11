package q11;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args){
        System.out.println("Digite n1: ");
        Scanner s = new Scanner (System.in);
        int n1 = s.nextInt();
        System.out.println("Digite n2: ");
        int n2 = s.nextInt();
        System.out.println("Qual a operação a ser realizada?");
        Scanner ss = new Scanner (System.in);
        String op = ss.nextLine();
        if ("+".equals(op)){
            int soma = n1+n2;
            System.out.println("Soma: "+soma);
        }
        else if ("-".equals(op)){
            int sub = n1-n2;
            System.out.println("Subtração: "+sub);
        }            
        else if ("*".equals(op)){
            int mult = n1*n2;
            System.out.println("Multiplicação: "+mult);
        }
        else if ("/".equals(op)){
            if (n2 != 0){
                    float div = n1/n2;
                    System.out.println("Divisão:"+div);

                } else{
                    System.out.println("Erro: Divisão por zero!");
                }
        }
        else{
            System.out.println("Operação inválida!");
        }
    }
}