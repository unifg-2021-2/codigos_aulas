import java.security.Principal;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalFrame extends JFrame {
    public PrincipalFrame() {
        super("Caixa Restaurante");
        JButton bt = new JButton("Clique aqui");
        bt.setSize(60,40);
        JLabel label1 = new JLabel("Olá Mundo");
        
       
        this.add(bt, BoxLayout.X_AXIS); 
        this.add(label1, BoxLayout.X_AXIS);
    }

}
