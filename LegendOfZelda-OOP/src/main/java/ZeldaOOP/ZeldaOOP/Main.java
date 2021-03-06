package ZeldaOOP;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Main {

    public static void main(String... args) {
        
        
        Runnable r = () -> {
            JFrame gameView = new JFrame("2D Zelda Top-Down Game");
            gameView.setSize(486, 474);
            gameView.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            gameView.setResizable(false);
            ControlPad a = new ControlPad();
            gameView.getContentPane().add(new Game(a));
            gameView.setIconImage(ImageUtil.get("winIcon.png"));
            gameView.setVisible(true);
            gameView.setFocusable(true);
            gameView.requestFocus();
            gameView.addKeyListener(a);
            gameView.setLocationRelativeTo(null);
            gameView.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    gameView.dispose();
                    System.exit(0);
                }
            });
        };
        EventQueue.invokeLater(r);
    }
}
