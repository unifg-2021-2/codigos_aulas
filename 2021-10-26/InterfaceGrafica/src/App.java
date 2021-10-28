import javax.swing.JButton;

public class App {
    public static void main(String[] args) throws Exception {
        PrincipalFrame tela = new PrincipalFrame();
        tela.setSize(640,480);
        tela.setVisible(true);
        JButton botao = new JButton();
        botao.setSize(50,50);
        botao.setText("Clique aqui");
        tela.add(botao);
        
    }
}
