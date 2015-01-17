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
		// Check for pawns
		for(int i = 0; i < board.length; i++)
		{
			for(int j = 0; j < board[i].length; j++)
			{
				if(board[i][j] == 'k')
				{
					if(j - 1 >= 0 && i + 1 <= 7 && board[i + 1][j - 1] == 'P')
					{
						return 'P';
					}
					else if (j + 1 <= 7 && i + 1 <= 7 && board[i + 1][j + 1] == 'P')
					{
						return 'P';
					}
				}
				else if(board[i][j] == 'K')
				{
					if(j - 1 >= 0 && i + 1 >= 0 && board[i - 1][j - 1] == 'P')
					{
						return 'P';
					}
					else if (j + 1 <= 7 && i + 1 >= 0 && board[i - 1][j + 1] == 'P')
					{
						return 'P';
					}
				}
			}
		}
		
		return '-';
	}
}
