
import javax.swing.JOptionPane;


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
        String nome, strSalarioBruto;
        float fSalarioBruto, INSS = 0, salarioLiquido = 0;
        
        try{
            nome = JOptionPane.showInputDialog("Nome: ");

            strSalarioBruto = JOptionPane.showInputDialog("Salário bruto: ");
            fSalarioBruto = Float.parseFloat(strSalarioBruto);
            
            if(fSalarioBruto < 0){
                throw new Exception("\nO salário bruto não pode ser negativo");
            }
            
            if(fSalarioBruto >= 0 && fSalarioBruto <= 1100){
            INSS = (float) (fSalarioBruto * 0.075);
            salarioLiquido = fSalarioBruto - INSS;
            } else if(fSalarioBruto > 1100 && fSalarioBruto <= 2203.48){
                INSS = (float) (fSalarioBruto * 0.09);
                salarioLiquido = fSalarioBruto - INSS;
            } else if(fSalarioBruto > 2203.48 && fSalarioBruto <= 3305.22){
                INSS = (float) (fSalarioBruto * 0.12);
                salarioLiquido = fSalarioBruto - INSS;
            } else if(fSalarioBruto > 3305.22){
                INSS = (float) (fSalarioBruto * 0.14);
                salarioLiquido = fSalarioBruto - INSS;
            }
        
            JOptionPane.showMessageDialog(null, "Nome: " + nome + "\n" 
                                              + "Salário bruto: " + fSalarioBruto + "\n"
                                              + "INSS: " + INSS + "\n"
                                              + "Salário líquido: " + salarioLiquido);
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "\nOcorreu um erro: " + e.getMessage()
                                                + "\nClasse do Erro: " + e.getClass());
        }  
    }  
}
