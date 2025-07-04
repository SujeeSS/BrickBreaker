package BallGame;

import javax.swing.JFrame;
//import BallGame.GamePlay;

public class Main {
	public static void main(String[] args) {
JFrame obj =new JFrame();
GamePlay gamePlay=new GamePlay();
obj.setBounds(10,10,707,600);
obj.setTitle("Ball Game");
obj.setResizable(true);
obj.setVisible(true);
obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
obj.add(gamePlay);

	} 
}
