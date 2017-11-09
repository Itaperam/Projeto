
package view;

import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author italo
 */
public class FramePrincipal extends JFrame{
    
  private static final long serialVersionUID = 1L;
  
  public FramePrincipal()
  {
    super("Bus Tour");
    
    Container containerPrincipal = getContentPane();
    containerPrincipal.setLayout(null);
    
    setDefaultCloseOperation(3);
    setSize(1024, 728);
    
    setUndecorated(false);
    setResizable(true);
    setVisible(true);
  }
    
}
