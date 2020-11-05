package ticTacToeGame;

import java.util.Scanner;

public class Tictactoe {
	
	static char[] board = new char[10];
	private static String compchoice;
	private static char playchoice;
	private static Scanner userInput;
	public static void main(String args[]) {
	System.out.println("Welcome to Tictactoe Game---");
	Tictactoe tictactoe = new Tictactoe();
	Tictactoe.Board();
	Tictactoe.Inputchoice();
	
}


private static void Inputchoice() {
	userInput = new Scanner(System.in);
	System.out.println("Choose 'X' OR 'O' as input: ");
	playchoice = userInput.next().toUpperCase().charAt(0);
	if(playchoice =='X') {
			compchoice = "O";
	}
	else if(playchoice=='O'){
			compchoice = "X";
	}
	else {
		System.out.println("Wrong input");
		Inputchoice();
	}	
}
	private static char[] Board() {
		for (int i=1; i<board.length; i++) {
		
			board[i]=' ';
		}
		return board;
	}	
}