package com.bayviewglen.thinkingcap;
import java.util.ArrayList;
import java.util.Scanner;

public class BetterGame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many players: ");
		int numPlayers = Integer.parseInt(in.nextLine());

		ArrayList<Player> players = new ArrayList<Player>();
		for (int i=0; i<numPlayers; i++){
			System.out.print("What is your name:");
			players.add(new Player(in.nextLine()));
		}
		
		System.out.print("How many rounds: ");
		int numRounds = Integer.parseInt(in.nextLine());
		
		for (int i=0; i<numRounds; i++){
			for (int j=0; j<numPlayers; j++){
				System.out.println(players.get(j).getPlayerName());
				if (players.get(j).takeTurn())
					System.out.println("PAIR");
			}
		}
		
		in.close();
		
	}

}
