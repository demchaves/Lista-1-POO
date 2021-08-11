package q12;

public class Q12 {

    public static void main(String[] args){
        int x = 0;
        int y = 100;
        
        System.out.println("Valores de X e Y para soma = 100");
        System.out.println("X = "+x+" Y ="+y);
        do {
            x++;
            y--;
            System.out.println("X = "+x+" Y ="+y);
        } while (x <100);
    }    
}
