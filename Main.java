package P2;

/* This file includes:
 * 	1. Solution to P1
 *  2. Questions for P2. Comments starting with REQ represent the questions.
 *  
 * Features:
 * 	- We have exactly 3 players: player0, player1, and player2
 *  - We have exactly 3 questions, one question for each player
 *  - User can play many rounds of the game. 
 * 
 * Focus: 
 * 	- while loops
 * 
 * Aim:
 * 	- Allow user to play again after the end of the game (using while loop)
 *  - Validate user's input (using while loop)
 */

public class Main {
	static Game game;	
	public static void main(String[] args) {
		String again;
		do {
		//REQ1:	This is the beginning of the game loop (that will re-run all the game if the user wants to play again).
		game = new Game();		//This statement resets the game	
		
		//Create three questions and their answers
		String q0 = "question0";
		String a0 = "answer0";
		String q1 = "question1";
		String a1 = "answer1";
		String q2 = "question2";
		String a2 = "answer2";
		
		//Add 3 players to the game
		String name = game.askForText("What is player 0 name?");
		game.addPlayer(name);
		name = game.askForText("What is player 1 name?");
		game.addPlayer(name);
		name = game.askForText("What is player 2 name?");
		game.addPlayer(name);
		
		//Ask each player a question and change his/her score based on the given answer
		game.setCurrentPlayer(0);
		String answer = game.askForText(q0);
		if(a0.equals(answer))
			game.correct();		//display "Correct", increment score, change frame color to green
		else
			game.incorrect();	//display "incorrect", change frame color of player to red

		game.setCurrentPlayer(1);
		answer = game.askForText(q1);
		if(a1.equals(answer))
			game.correct();		
		else
			game.incorrect();	
		
		game.setCurrentPlayer(2);
		answer = game.askForText(q2);
		if(a2.equals(answer))
			game.correct();		
		else
			game.incorrect();	
		
		//REQ1 (cont.):	
		//		- Ask the user if they want to play again (use game.askForText() and store the input in a variable)
		//		- Make sure you get valid input (i.e., it is not null, and it is either "Y" (for yes) or "N" (for no). Your code should ignore the case of the input (small or capital).
		//		  Show an error message if the input is invalid and ask again for Y or N.
		//		- Repeat the game again if the user answered "Y" or "y", otherwise terminate the program.
			 again=game.askForText("Do you want to play again?(\"Y\" for yes and \"N\"for no)");
			while(!(again.equals("Y")|| again.equals("N")|| again.equals("y")||again.equals("n")))
			{
			again=game.askForText("invalid input .Do you want to play again?(Y/N)");
		
			}
		}while(again.equals("Y")|| again.equals("y"));
		
			System.exit(1); 	//This statement terminates the program
	}
}
