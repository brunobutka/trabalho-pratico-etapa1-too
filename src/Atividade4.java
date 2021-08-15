
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
public class Atividade4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String strValorCompra, strTotalParcelas, exibicao;
        float fValorCompra;
        int iTotalParcelas;
        LocalDate dataAtual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try{
            strValorCompra = JOptionPane.showInputDialog("Valor da compra: ");
            fValorCompra = Float.parseFloat(strValorCompra);
            if(fValorCompra < 0){
                throw new Exception("\nValor da compra não pode ser menor que 0");
            }
            exibicao = ("Valor da compra: " + fValorCompra + "\n");
            
            strTotalParcelas = JOptionPane.showInputDialog("Total de parcelas: ");
            iTotalParcelas = Integer.parseInt(strTotalParcelas);
            if(iTotalParcelas < 0){
                throw new Exception("\nTotal de parcelas não pode ser menor que 0");
            }
            exibicao += ("Total de parcelas: " + iTotalParcelas + "\n");

            float valorParcela[] = new float[iTotalParcelas];
            LocalDate datasVencimento[] = new LocalDate[iTotalParcelas];
            
            for(int i = 0; i < valorParcela.length; i++) {
                valorParcela[i] = (fValorCompra / iTotalParcelas);
                
                dataAtual = dataAtual.plusDays(30);
                exibicao += ("Valor da parcela: " + valorParcela[i] 
                             + " Data do " + (i + 1) + "º vencimento: " + formato.format(dataAtual)) + "\n";
            }
            
            JOptionPane.showMessageDialog(null, exibicao);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "\nOcorreu um erro: " + e.getMessage()
                                                + "\nClasse do Erro: " + e.getClass());
        }
        
    }
    
}
