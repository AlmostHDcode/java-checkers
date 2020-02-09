import java.util.Arrays;
public class Checkers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int Blank = 0;
		final int White = 1;
		final int Black = 2;
		int[] [] board = new int[8] [8];
		
		for (int i = 0; i < 8; i++) { 
			Arrays.fill(board[i], Blank);
		}
		board[0] [1] = board[0] [3] = board[0] [5] = board[0] [7] = White;
		board[1] [0] = board[1] [2] = board[1] [4] = board[1] [6] = White;
		board[2] [1] = board[2] [3] = board[2] [5] = board[2] [7] = White;
		board[5] [0] = board[5] [2] = board[5] [4] = board[5] [6] = Black;
		board[6] [1] = board[6] [3] = board[6] [5] = board[6] [7] = Black;
		board[7] [0] = board[7] [2] = board[7] [4] = board[7] [6] = Black;
		
		for (int i = 0; i < 8; i++) {
			System.out.println(Arrays.toString(board[i]));
		}
	}

}
