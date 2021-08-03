package scr;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    String title = "Maps";
    JPanel gamePanel = new JPanel();
    final JPanel[] fillerPanels = new JPanel[4];
    final JButton[] groupButtons = new JButton[4];

    public GameWindow(){
        this.setTitle(title);
        this.setLayout(new BorderLayout());
        this.setSize(900, 800);
        this.getContentPane().setBackground(ColorVar.orange);
        this.setResizable(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);

        callouts();
    }
    public void callouts(){
        setFiller();
        GamePanel();
        setGroupButtons();
        ApplicationDisplay();
    }
    public void GamePanel(){
        gamePanel.setBackground(ColorVar.Navy_Blue);//setup as orange after finish the window
        gamePanel.setPreferredSize(new Dimension(300,400));
        gamePanel.setLayout(new FlowLayout(FlowLayout.CENTER,10,155));
        this.add(gamePanel);
    }
    public void setFiller(){
        for (int i = 0; i < fillerPanels.length; i++) {
            fillerPanels[i] = new JPanel();
            fillerPanels[i].setBackground(ColorVar.orange);
            fillerPanels[i].setPreferredSize(new Dimension(160,160));
        }
        this.add(fillerPanels[0],BorderLayout.NORTH);
        this.add(fillerPanels[1], BorderLayout.WEST);
        this.add(fillerPanels[2], BorderLayout.EAST);
        this.add(fillerPanels[3], BorderLayout.SOUTH);
    }
    public void setGroupButtons(){
      for(int i = 0; i < groupButtons.length; i++){
          groupButtons[i] = new JButton();
          groupButtons[i].setPreferredSize(new Dimension(250,250));
          groupButtons[i].setBackground(ColorVar.chartreuse);
          gamePanel.add(groupButtons[i]);
      }
    }
    private void ApplicationDisplay(){
        this.setVisible(true);
    }

    public static void main(String[] args) {
        GameWindow gameWin = new GameWindow();
    }




}
