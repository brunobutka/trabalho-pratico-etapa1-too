
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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
public class Atividade2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float d = 0, valorTotal = 0, p = 0;
        String diaria = null, dataLocacao = null, dataDevolucao = null;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataL = null, dataD = null;
        
        try{
            diaria = JOptionPane.showInputDialog("Informe o valor da diária: ");
            d = Float.parseFloat(diaria);
            
            if(d < 0){
                throw new Exception("\nA diária não pode ser um valor negativo.");
            }
            
            dataLocacao = JOptionPane.showInputDialog("Informe a data de locação no formato dd/mm/aaaa: ");
            dataL = LocalDate.parse(dataLocacao, formato);
            
            dataDevolucao = JOptionPane.showInputDialog("Informe a data de devolução no formato dd/mm/aaaa: ");
            dataD = LocalDate.parse(dataDevolucao, formato);
            
            //Period periodo = Period.between(dataL, dataD);
            long p2 = ChronoUnit.DAYS.between(dataL, dataD);
            
            valorTotal = (float) (d * p2);
            
            JOptionPane.showMessageDialog(null, "Valor da diária: " + d + "\n" + "Data de locação: " + formato.format(dataL)
                                                    + "\n" + "Data de devolução: " + formato.format(dataD) + "\n"
                                                    + "Dias de locação: " + p2 + "\n"
                                                    + "Valor total da locação: " + valorTotal);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro: " + e.getMessage()
                                                + "\nClasse do Erro: " + e.getClass());
        }
    }
    
}
