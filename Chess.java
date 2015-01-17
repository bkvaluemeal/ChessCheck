/**
 * The Chess class is where all the action happens.
 * 
 * @author Justin Willis
 * @version 2015-01-17
 */
public class Chess
{
	/**
	 * Gets the piece in check the king
	 * 
	 * @param board the chess board
	 * @return the piece checking the king
	 */
	public static char getCheck(char[][] board)
	{
		for(int vert = 0; vert < board.length; vert++)
		{
			for(int hori = 0; hori < board[vert].length; hori++)
			{
				if(board[vert][hori] == 'k')
				{
					// Check for pawns
					if(vert + 1 <= 7 && hori - 1 >= 0 && board[vert + 1][hori - 1] == 'P')
					{
						return 'P';
					}
					else if (vert + 1 <= 7 && hori + 1 <= 7 && board[vert + 1][hori + 1] == 'P')
					{
						return 'P';
					}
				}
				else if(board[vert][hori] == 'K')
				{
					// Check for pawns
					if(vert + 1 >= 0 && hori - 1 >= 0 && board[vert - 1][hori - 1] == 'p')
					{
						return 'p';
					}
					else if (vert + 1 >= 0 && hori + 1 <= 7 && board[vert - 1][hori + 1] == 'p')
					{
						return 'p';
					}
				}
			}
		}
		
		return '-';
	}
}
