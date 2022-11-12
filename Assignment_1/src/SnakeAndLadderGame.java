import java.util.*;

// Name: Gulraiz Noor Bari
// Roll No: 231-525536

public class SnakeAndLadderGame {
	
	public static void main(String[] args) {
		int player1 = 0;
		int player2 = 0;
		int die = 0;

		Random roll = new Random();

		System.out.println("Player 1's Initial Position: " + player1);
		System.out.println("Player 2's Initial Position: " + player2);
		
		while (player1 < 100 && player2 < 100) {
			
			// Player #1 turn:
			die = roll.nextInt(6) + 1;
			System.out.println();
			System.out.println("***Player 1's TURN***");
			System.out.println("Die Value: " + die);
			player1 += die;
			if (player1 > 100) {
				player1 -= die;
			}
			System.out.println("Player 1's position: " + player1);
			player1 = ladders(player1, 1);
			player1 = snakes(player1, 1);
			
			// Player #2 turn:
			die = roll.nextInt(6) + 1;
			System.out.println();
			System.out.println("***Player 2's TURN***");
			System.out.println("Die Value: " + die);
			player2 += die;
			if (player2 > 100) {
				player2 -= die;
			}
			System.out.println("Player 2's position: " + player2);
			player2 = ladders(player2, 2);
			player2 = snakes(player2, 2);
		}
		
		if (player1 == 100) {
			for (int i = 0; i < 3; i++)
				System.out.println();
			System.out.print("PLAYER 1 HAS WON THE GAME!");
		}
		else if (player2 == 100) {
			for (int i = 0; i < 3; i++)
				System.out.println();
			System.out.print("PLAYER 2 HAS WON THE GAME!");
		}
	}
	
	public static int ladders(int playerScore, int playerNo) {
		switch (playerScore) {
			case 4:
				playerScore = 25;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			case 21:
				playerScore = 39;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			case 29:
				playerScore = 74;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			case 43:
				playerScore = 76;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			case 63:
				playerScore = 80;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			case 71:
				playerScore = 89;
				System.out.println("YAYYY! Player " + playerNo + " climbed to " + playerScore + " position.");
				break;
			default:
				playerScore = playerScore;
		}
		return playerScore;
	}
	
	public static int snakes(int playerScore, int playerNo) {
		switch (playerScore) {
			case 30:
				playerScore = 7;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 47:
				playerScore = 15;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 56:
				playerScore = 19;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 73:
				playerScore = 51;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 82:
				playerScore = 42;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 92:
				playerScore = 75;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			case 98:
				playerScore = 55;
				System.out.println("NAHHH! Player " + playerNo + " fell down to " + playerScore + " position.");
				break;
			default:
				playerScore = playerScore;
		}
		return playerScore;
	}
 }
