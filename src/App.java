import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        
        JFrame janela = new JFrame("Gerador de Formas");
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        g.drawOval(2, 2, 3, 3);


    }
}
