package com.prash.games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Domineering {

	public static void main(String[] args) throws IOException {
		Domineering d = new Domineering();
		d.play();
	}

	private void play() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(" Please enter the board size :");
		int n = Integer.parseInt(reader.readLine());
		char dom[][] = new char[n][n];
		init(dom, n);
		String input = "";
		Map<Integer, String> player = new HashMap<>();
		player.put(0, "\"One\" - Horizantal move");
		player.put(1, "\"Two\" - Vertical move");

		int counter = 0;
		boolean validMove = true;
		int first =0;
		int second = 0;
		while (!input.equals("q")) {
			clear();
			print(dom, n);
			String[] strs;
			validMove = validate(dom,counter % 2,n);
			if(!validMove) 
				break;
			do {
				if (!validMove) {
					System.err.println("Wrong co-ordinate value, Try Again");
					validMove = true;
				}
				System.out.println("Player-" + player.get((counter) % 2) + " Please put your co-ordinate");
				input = reader.readLine();
				strs = input.split(",");
				if (strs.length == 2) {
					try {
						first = Integer.parseInt(strs[0].trim());
						second = Integer.parseInt(strs[1].trim());
						validMove = isValid(first,second, dom, counter % 2, n);
					} catch (NumberFormatException e) {
						validMove = false;
					}
				} else {
					validMove = false;
				}
				if (input.equals("q"))
					break;
			} while (!validMove);
			
			move(first,second, dom, counter % 2);
			
			counter++;
		}
		System.out.println("Game Over ");
	}

	private boolean isValid(int first,int second, char[][] dom, int counter, int n) {
		if (first < 1 || first > n || second < 1 || second > n)
			return false;
		if (counter == 0) {
			// horizontal
			if (second == n || dom[first - 1][second - 1] != '-' || dom[first - 1][second] != '-') {
				return false;
			}
		} else {
			// Vertical
			if (first == n || dom[first - 1][second - 1] != '-' || dom[first][second - 1] != '-') {
				return false;
			}
		}
		return true;
	}
	
	private void move(int first,int second, char[][] dom, int counter) {
		if (counter == 0) {
			// horizontal
			dom[first - 1][second - 1] = 'H';
			dom[first - 1][second] = 'H';
		} else {
			// Vertical
			dom[first - 1][second - 1] = 'V';
			dom[first][second - 1] = 'V';
		}
	}
	private boolean validate(char[][] dom, int player, int n) {
		int count=0;
		if (player == 0) {
			// horizontal
			for(int i = 0; i < n ; i++) {
				for(int j = 0; j < n-1 ; j++) {
					if(dom[i][j+1] == '-' && dom[i][j] == '-' ) {
						count++;
					}
				}
			}
			if(count == 0) {
				System.out.println("Player TWO won the match");
				return false;
			}
		} else {
			// Vertical
			for(int i = 0; i < n-1 ; i++) {
				for(int j = 0; j < n ; j++) {
					if(dom[i][j] == '-' && dom[i+1][j] == '-' ) {
						count++;
					}
				}
			}
			if(count == 0) {
				System.out.println("Player ONE won the match");
				return false;
			}
		}
		return true;
	}

	private void clear() {
		try {
			final String os = System.getProperty("os.name");
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (Exception e) {

		}
	}

	private void init(char[][] dom,int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				dom[i][j] = '-';
			}
		}
	}

	private void print(char[][] dom, int n) {
		System.out.print(" ");
		for (int i = 1; i <= n; i++) {
			System.out.print(" " + i);
		}
		System.out.println("");
		for (int i = 0; i < n; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < n; j++) {
				System.out.print(dom[i][j] + " ");
			}
			System.out.println();
		}
	}

}
