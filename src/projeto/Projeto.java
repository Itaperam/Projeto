
package projeto;

import javax.swing.JFrame;
import view.TelaDeCompra;

/**
 *
 * @author italo
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {         
       
        
       TelaDeCompra tela = new TelaDeCompra();
       
       JFrame frame = new JFrame("Tela de Compra");
       
       frame.setContentPane(tela);
       frame.setBounds(0, 0, 1024, 700); 
       frame.setResizable(false);
       frame.setVisible(true);     
       
       
    }
    
}
