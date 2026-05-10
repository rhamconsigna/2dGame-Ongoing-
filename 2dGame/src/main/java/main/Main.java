package main;

import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        JFrame windows = new JFrame();
        windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        windows.setResizable(false);
        windows.setTitle("2d Game Project");
        
        GamePanel gamePanel = new GamePanel();
        windows.add(gamePanel);
        
        windows.pack();
        
        windows.setLocationRelativeTo(null);
        windows.setVisible(true);
        
        gamePanel.startGameThread();
    }
}
