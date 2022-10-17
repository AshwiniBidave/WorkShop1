package com.model;

import java.util.Scanner;

public class TicTacToeGame {
	char computer, player;

	public void createTicTacGame() {
		char[] board = new char[10];
		int start = 1;
		// for(int start =1;start<=board.length;start++)
		while (start < board.length) {

			board[start] = ' ';
			start++;

		}

	}

	public void choosingXorO() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Input");
		char player = sc.next().charAt(0);
		sc.close();
		if (player == 'X') {
			computer = 'O';

		} else if (player == 'O') {
			computer = 'X';

		} else {
			System.out.println("input is invalid");
		}

	}

	public static void main(String[] args) {

		TicTacToeGame create = new TicTacToeGame();
		create.createTicTacGame();
		create.choosingXorO();

	}
}
