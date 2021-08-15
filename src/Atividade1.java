
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno
 */
public class Atividade1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = "";
        float salarioBruto = 0, INSS = 0, salarioLiquido = 0;
        
        try{
            System.out.print("Nome: ");
            nome = sc.nextLine();
            
            System.out.print("Salário bruto (R$): ");
            salarioBruto = sc.nextFloat();
            
            if(salarioBruto < 0){
                throw new Exception("\nO salário bruto não pode ser negativo");
            }
            
            if(salarioBruto >= 0 && salarioBruto <= 1100){
            INSS = (float) (salarioBruto * 0.075);
            salarioLiquido = salarioBruto - INSS;
            } else if(salarioBruto > 1100 && salarioBruto <= 2203.48){
                INSS = (float) (salarioBruto * 0.09);
                salarioLiquido = salarioBruto - INSS;
            } else if(salarioBruto > 2203.48 && salarioBruto <= 3305.22){
                INSS = (float) (salarioBruto * 0.12);
                salarioLiquido = salarioBruto - INSS;
            } else if(salarioBruto > 3305.22){
                INSS = (float) (salarioBruto * 0.14);
                salarioLiquido = salarioBruto - INSS;
            }
        
            System.out.println("\nNome: " + nome);
            System.out.println("Salário bruto: " + salarioBruto);
            System.out.println("INSS: " + INSS);
            System.out.println("Salário líquido: " + salarioLiquido);
        } catch(Exception e){
            System.out.println("\nOcorreu um erro... " + e.getMessage()
                                        + "\nClasse do erro: " + e.getClass());
        }  
    }  
}
