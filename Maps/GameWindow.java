import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    String title = "Maps";
    JPanel gamePanel = new JPanel();
    final JPanel[] panels = new JPanel[4];
    public GameWindow(){
        this.setTitle(title);
        this.setLayout(new BorderLayout());
        this.setSize(900, 800);
        this.getContentPane().setBackground(ColorVar.orange);
        this.setResizable(true);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        callouts();
    }
    public void callouts(){
        GamePanel();
        setFiller();
    }
    public void GamePanel(){
        gamePanel.setBackground(ColorVar.Navy_Blue);
        gamePanel.setSize(new Dimension(300,400));//todo need to fix this issue
        this.add(gamePanel);
    }
    public void setFiller(){
        for (int i = 0; i < panels.length; i++) {
            panels[i] = new JPanel();
            panels[i].setBackground(ColorVar.orange);
            panels[i].setPreferredSize(new Dimension(160,160));

        }
        this.add(panels[0],BorderLayout.NORTH);
        this.add(panels[1], BorderLayout.WEST);
        this.add(panels[2], BorderLayout.EAST);
        this.add(panels[3], BorderLayout.SOUTH);
    }


    public static void main(String[] args) {
        new GameWindow();
    }

}
