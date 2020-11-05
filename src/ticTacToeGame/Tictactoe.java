package ticTacToeGame;

import java.util.Scanner;

public class Tictactoe {
	static char[] board = new char[10];
	private static char playchoice;
	private static Scanner userInput;
	public static void main(String args[]) {
		System.out.println("---Welcome to Tictactoe Game---");
		new Tictactoe();
		Tictactoe.Board();
		Tictactoe.Inputchoice();
		Tictactoe.ShowBoard(board);
		Tictactoe.SelectLocation(board);
	
}

private static char[] SelectLocation(char[] board2) {
	System.out.println("Select the index to place: "+ playchoice); 
	int index = extracted().nextInt();
		board2[index] = playchoice;
		System.out.println(board2);
		ShowBoard(board2);
		
	return board2;
	
}

private static Scanner extracted() {
	return new Scanner(System.in);
}

private static void ShowBoard(char[] board) {
	System.out.println("TicTacToe Board:");
	System.out.println("_____________");
	System.out.println("|  "+board[1]+"|  "+board[2]+"|  "+board[3]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board[4]+"|  "+board[5]+"|  "+board[6]+"|");
	System.out.println("─────────────");
	System.out.println("|  "+board[7]+"|  "+board[8]+"|  "+board[9]+"|");
	System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾");
	
}


private static void Inputchoice() {
	userInput = extracted();
	System.out.println("Choose 'X' OR 'O' as input: ");
	
	playchoice = userInput.next().toUpperCase().charAt(0);
	
	if(playchoice=='X') {
	}
	else if(playchoice=='O') {
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