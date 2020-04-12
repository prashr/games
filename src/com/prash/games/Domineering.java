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
		char dom[][] = new char[8][8];
		init(dom);
		String input = "";
		Map<Integer, String> player = new HashMap<>();
		player.put(0, "\"One\" - Horizantal move");
		player.put(1, "\"Two\" - Vertical move");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int counter = 0;
		boolean validMove = true;
		while (!input.equals("q")) {
			clear();
			print(dom);
			do {
				if (!validMove) {
					System.err.println("Wrong co-ordinate value, Try Again");
					validMove = true;
				}
				System.out.println("Player-" + player.get((counter) % 2) + " Please put your co-ordinate");
				input = reader.readLine();
				String[] strs = input.split(",");
				if (strs.length == 2) {
					try {
						validMove = isValid(strs, dom, counter % 2);
					} catch (NumberFormatException e) {
						validMove = false;
					}
				} else {
					validMove = false;
				}
				if (input.equals("q"))
					break;
			} while (!validMove);

			counter++;
		}

		System.out.println("Game Over ");

	}

	private boolean isValid(String[] strs, char[][] dom, int counter) throws NullPointerException {
		int first = Integer.parseInt(strs[0].trim());
		int second = Integer.parseInt(strs[1].trim());
		if (first < 1 || first > 8 || second < 1 || second > 8)
			return false;
		if (counter == 0) {
			// horizontal
			if (dom[first - 1][second - 1] != '-' || dom[first - 1][second] != '-' || second == 8) {
				return false;
			} else {
				dom[first - 1][second - 1] = 'H';
				dom[first - 1][second] = 'H';
			}

		} else {
			// Vertical
			if (dom[first - 1][second - 1] != '-' || dom[first][second - 1] != '-' || first == 8) {
				return false;
			} else {
				dom[first - 1][second - 1] = 'V';
				dom[first][second - 1] = 'V';

			}
		}

		return true;

	}

	private void clear() {
		try {
			final String os = System.getProperty("os.name");
			// System.out.println(os);
			if (os.contains("Windows")) {
				Runtime.getRuntime().exec("cls");
			} else {
				Runtime.getRuntime().exec("clear");
			}
		} catch (Exception e) {

		}
	}

	private void init(char[][] dom) {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				dom[i][j] = '-';
			}
		}

	}

	private void print(char[][] dom) {
		System.out.println("  1 2 3 4 5 6 7 8");
		for (int i = 0; i < 8; i++) {
			System.out.print(i + 1 + " ");
			for (int j = 0; j < 8; j++) {
				System.out.print(dom[i][j] + " ");
			}
			System.out.println();
		}
	}

}
