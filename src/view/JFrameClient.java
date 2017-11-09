
package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author italo
 */
public class JFrameClient implements ActionListener{
    
    public static JLabel JLabelBus;
    public static JButton Botao01;
    public static FramePrincipal telaClient = new FramePrincipal();
    
    public JFrameClient(){
        ImageIcon imagem = new ImageIcon(getClass().getResource("image/b11.png"));
        
        JLabelBus = new JLabel(imagem);       
        JLabelBus.setBounds(0, 0, 1024, 768);       
        
        telaClient.add(JLabelBus);
        
        telaClient.repaint();
        telaClient.revalidate();
        telaClient.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
