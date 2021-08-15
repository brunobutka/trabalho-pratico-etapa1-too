
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
public class Atividade3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String dataInserida, exibicaoDatas;
        LocalDate dataI;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try{
            dataInserida = JOptionPane.showInputDialog("Informe uma data (dd/MM/yyyy): ");
            dataI = LocalDate.parse(dataInserida, formato);
            
            exibicaoDatas = ("Data informada: " + formato.format(dataI) + "\n");
            
            for(int i = 0; i < 5; i++){
                dataI = dataI.plusDays(7);
                exibicaoDatas += ("Data de pagamento: " + formato.format(dataI) + "\n");
            }
            
            JOptionPane.showMessageDialog(null, exibicaoDatas);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "\nOcorreu um erro: " + e.getMessage()
                                                + "\nClasse do Erro: " + e.getClass());
        }
    }
    
}
