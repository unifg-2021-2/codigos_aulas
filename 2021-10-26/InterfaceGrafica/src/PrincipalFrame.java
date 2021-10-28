import javax.swing.JFrame;
import javax.swing.JLabel;

public class PrincipalFrame extends JFrame{
    public PrincipalFrame(){
        super("Titulo da minha janela");
        JLabel rotulo = new JLabel();
        rotulo.setText("Ola Mundo");

        this.add(rotulo);

    }
}
