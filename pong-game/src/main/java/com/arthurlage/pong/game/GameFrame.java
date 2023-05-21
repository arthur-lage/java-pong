package com.arthurlage.pong.game;

import java.awt.Color;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
  GamePanel gamePanel;

  public GameFrame() {
    gamePanel = new GamePanel();
    this.add(gamePanel);
    this.setTitle("Pong");
    this.setResizable(false);
    this.setBackground(Color.BLACK);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }
}
