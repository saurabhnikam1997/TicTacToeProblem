package ticTacToeGame;

import java.util.Scanner;


public class Tictactoe {
	static char[] board = new char[10];
	private static char playchoice;
	private static char compChoice;
	private static Scanner userInput;
	//main method
	public static void main(String args[]) {
		System.out.println("---Welcome to Tictactoe Game---");
		new Tictactoe();
		Tictactoe.Board();
		Tictactoe.Inputchoice();
		Tictactoe.ShowBoard(board);
		Tictactoe.SelectLocation(board);	
}
//setting index for board
	private static char[] SelectLocation(char[] board) {
		System.out.println("Select the index to place: "+ playchoice); 
		int index = extracted().nextInt();
		board[index] = playchoice;
		System.out.println(board);
		ShowBoard(board);
		
		return board;	
	}

	private static Scanner extracted() {
		return new Scanner(System.in);
	}
//method to showing the board
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

	//take input from user
	private static void Inputchoice() {
		userInput = extracted();
		System.out.println("Choose 'X' OR 'O' as input: ");
		playchoice = userInput.next().toUpperCase().charAt(0);
	
		if(playchoice=='X') {
			setCompChoice('O');			
		}
		else if(playchoice=='O') {
			setCompChoice('X');
		}
		else {
			System.out.println("Wrong input");
			Inputchoice();
		}	
	}
	private static char[] Board() {
		for (int index=1; index<board.length; index++) {
			board[index]=' ';
		}
		return board;
	}

	public static char getCompChoice() {
		return compChoice;
	}

	public static void setCompChoice(char compChoice) {
		Tictactoe.compChoice = compChoice;
	}	
}