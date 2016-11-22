package pacman;

import java.awt.EventQueue;
import javax.swing.JFrame;

public class Pacman extends JFrame {

    public Pacman() {
        
        initUI();
    }
    
    private void initUI() {
        
        add(new tablero());
        setTitle("muñecos");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);        
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                Pacman ex = new Pacman();
                ex.setVisible(true);
            }
        });
    }
}