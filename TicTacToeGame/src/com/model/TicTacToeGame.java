package com.model;

public class TicTacToeGame {

	public void createTicTacGame() {
		char[] board= new char[10];
		int start=1;
		//for(int start =1;start<=board.length;start++)
		while(start<board.length)
		{
		
	     board[start]=' ';
		start++;
			
		}
	
	}
			
		


		public static void main(String[] args) 
		{

		TicTacToeGame create=new TicTacToeGame();
	   create.createTicTacGame();
		
		

	    }
}
