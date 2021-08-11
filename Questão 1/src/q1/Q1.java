package q1;

import Pacote.Empregados;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        Empregados func = new Empregados();
        
        System.out.print("Nome do funcionário: ");
        String nome = s.nextLine();
        func.setNome(nome);
        
        System.out.print("Departamento: ");
        String dep = s.nextLine();
        func.setDep(dep);
        
        System.out.print("Horas trabalhadas no mês: ");
        int horasMes = s.nextInt();
        func.setHorasMes(horasMes);
        
        System.out.print("Salário por hora: ");
        double salarioHora = s.nextDouble();
        func.setSalarioHora(salarioHora);
        
        System.out.print("Nome: "+func.getNome());
        System.out.println("");
        System.out.print("Departamento: "+func.getDep());
        System.out.println("");
        System.out.print("Horas trabalhadas no mês: "+func.getHorasMes()+" horas");
        System.out.println("");
        System.out.print("Salário no mês: "+func.getSalarioHora()*func.getHorasMes()+" R$");
    }    
}
