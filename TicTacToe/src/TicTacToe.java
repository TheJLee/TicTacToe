import java.util.Scanner;

public class TicTacToe{
// assigns 'X' to player
public static char player = 'X';
// Assigns ' ' to board arrays
public static char[][] board = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
// first function asks the player to input a X or O on the board
public static boolean play() {
	System.out.println("Player " + player + " , please input the row letter followed by the "
			+ "column number with no spaces inbetween.");
	Scanner in = new Scanner(System.in); 
	String s = in.nextLine(); 
	// switch statement to grab both the letter and number for row and column
	switch (s)
	{ 
	case "A1" : board[0][0] = player; 
		break;
	case "a1" : board[0][0] = player; 
		break; 
	case "A2" : board[0][1] = player; 
		break;
	case "a2" : board[0][1] = player; 
		break; 
	case "A3" : board[0][2] = player; 
		break; 
	case "a3" : board[0][2] = player; 
		break; 
	case "B1" : board[1][0] = player; 
		break; 
	case "b1" : board[1][0] = player; 
		break; 
	case "B2" : board[1][1] = player; 
		break;
	case "b2" : board[1][1] = player; 
		break;
	case "B3" : board[1][2] = player; 
		break; 
	case "b3" : board[1][2] = player; 
		break; 
	case "C1" : board[2][0] = player; 
		break; 
	case "c1" : board[2][0] = player; 
		break; 
	case "C2" : board[2][1] = player; 
		break;
	case "c2" : board[2][1] = player; 
		break;
	case "C3" : board[2][2] = player; 
		break;
	case "c3" : board[2][2] = player; 
		break;
	// default statement is used to tell the user about an invalid move
	default: System.out.println("an Invalid move made was made, please try again"); 
		break; 
	}

return false;
}
// this function is used to switch the player from 'X' to  'O'
public static void switchTurn() 
{
	if(player == 'X')
	{
		player = 'O';
	}
	else
	{
		player = 'X';
	}
}

//Conditions for winning the game
public static boolean won() {
	// winner by columns
	if (board[0][0] != ' ' && board[0][0] == board[0][1] && board[0][1] == board[0][2]) 
		return true; 
	if (board[1][0] != ' ' && board[1][0] == board[1][1] && board[1][1] == board[1][2]) 
		return true; 
	if (board[2][0] != ' ' && board[2][0] == board[2][1] && board[2][1] == board[2][2]) 
		return true; 
	if (board[0][0] != ' ' && board[0][0] == board[1][0] && board[1][0] == board[2][0]) 
		return true; 
	if (board[0][1] != ' ' && board[0][1] == board[1][1] && board[1][1] == board[2][1]) 
		return true; 
	if (board[0][2] != ' ' && board[0][2] == board[1][2] && board[1][2] == board[2][2]) 
		return true; 
	//checks winner by diagonals 
	if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) 
		return true; 
	if (board[0][2] != ' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0]) 
		return true;
return false;
}
// conditions for stalemate
public static boolean stalemate() {

	for(int i=0; i<board.length; i++)
    {
        for(int j=0; j<board.length; j++)
        {
            if(board[i][j] ==' ')
            {
            	return false;
            }
        }
    }				
return true; 
}
// returns player symbol
public static char getPlayer() {

return player;
}
// displays the board
public static void print() {

System.out.println();
System.out.println("\t 1 2 3");
System.out.println();
System.out.println("\tA "+board[0][0]+"|"+board[0][1]+"|"+board[0][2]);
System.out.println("\t -----");
System.out.println("\tB "+board[1][0]+"|"+board[1][1]+"|"+board[1][2]);
System.out.println("\t "+"-----");
System.out.println("\tC "+board[2][0]+"|"+board[2][1]+"|"+board[2][2]);
System.out.println();
}


public static void main(String[] args) {
TicTacToe game = new TicTacToe();
System.out.println("Welcome to tic-tac-toe");
System.out.println("Enter coordinates for your move following the X and O prompts");
while(!stalemate()) {
	print();
	play();
	// if player wins then the loop is broken
	if (won())
	{
		break;
	}
	// if there are no more moves the loop is broken as well
	if (stalemate())
	{
		break;
	}
	// if the game is not won or tied, the next turn is to follow
	switchTurn();
}
print();
// if the win display statement for winning
if(won())
	{
	System.out.println("Player "+getPlayer()+" Wins!!!!");
	} 
// if it is a tie display statement for the tie
else 
	{
	System.out.println("Stalemate");
	}
}
}
