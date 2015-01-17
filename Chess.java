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
					
					// Check for king
					if(vert - 1 >= 0 && hori - 1 >= 0 && board[vert - 1][hori - 1] == 'K')
					{
						return 'K';
					}
					else if(vert - 1 >= 0 && board[vert - 1][hori] == 'K')
					{
						return 'K';
					}
					else if(vert - 1 >= 0 && hori + 1 <= 7 && board[vert - 1][hori + 1] == 'K')
					{
						return 'K';
					}
					else if(hori - 1 >= 0 && board[vert][hori - 1] == 'K')
					{
						return 'K';
					}
					else if(hori + 1 <= 7 && board[vert][hori + 1] == 'K')
					{
						return 'K';
					}
					else if(vert + 1 <= 7 && hori - 1 >= 0 && board[vert + 1][hori - 1] == 'K')
					{
						return 'K';
					}
					else if(vert + 1 <= 7 && board[vert + 1][hori] == 'K')
					{
						return 'K';
					}
					else if(vert + 1 <= 7 && hori + 1 <= 7 && board[vert + 1][hori + 1] == 'K')
					{
						return 'K';
					}
					
					// Check for knights
					if(vert - 2 >= 0 && hori - 1 >= 0 && board[vert - 2][hori - 1] == 'N')
					{
						return 'N';
					}
					else if(vert - 2 >= 0 && hori + 1 <= 7 && board[vert - 2][hori + 1] == 'N')
					{
						return 'N';
					}
					else if(vert - 1 >= 0 && hori - 2 >= 0 && board[vert - 1][hori - 2] == 'N')
					{
						return 'N';
					}
					else if(vert - 1 >= 0 && hori + 2 <= 7 && board[vert - 1][hori + 2] == 'N')
					{
						return 'N';
					}
					else if(vert + 1 <= 7 && hori - 2 >= 0 && board[vert + 1][hori - 2] == 'N')
					{
						return 'N';
					}
					else if(vert + 1 <= 7 && hori + 2 <= 7 && board[vert + 1][hori + 2] == 'N')
					{
						return 'N';
					}
					else if(vert + 2 <= 7 && hori - 1 >= 0 && board[vert + 2][hori - 1] == 'N')
					{
						return 'N';
					}
					else if(vert + 2 <= 7 && hori + 1 <= 7 && board[vert + 2][hori + 1] == 'N')
					{
						return 'N';
					}
					
					// Check for rooks
					for(int i = 0; i < board.length; i++)
					{
						if(board[vert][i] == 'R' || board[i][hori] == 'R')
						{
							return 'R';
						}
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
					
					// Check for king
					if(vert - 1 >= 0 && hori - 1 >= 0 && board[vert - 1][hori - 1] == 'k')
					{
						return 'k';
					}
					else if(vert - 1 >= 0 && board[vert - 1][hori] == 'k')
					{
						return 'k';
					}
					else if(vert - 1 >= 0 && hori + 1 <= 7 && board[vert - 1][hori + 1] == 'k')
					{
						return 'k';
					}
					else if(hori - 1 >= 0 && board[vert][hori - 1] == 'k')
					{
						return 'k';
					}
					else if(hori + 1 <= 7 && board[vert][hori + 1] == 'k')
					{
						return 'k';
					}
					else if(vert + 1 <= 7 && hori - 1 >= 0 && board[vert + 1][hori - 1] == 'k')
					{
						return 'k';
					}
					else if(vert + 1 <= 7 && board[vert + 1][hori] == 'k')
					{
						return 'k';
					}
					else if(vert + 1 <= 7 && hori + 1 <= 7 && board[vert + 1][hori + 1] == 'k')
					{
						return 'k';
					}
					
					// Check for knights
					if(vert - 2 >= 0 && hori - 1 >= 0 && board[vert - 2][hori - 1] == 'n')
					{
						return 'n';
					}
					else if(vert - 2 >= 0 && hori + 1 <= 7 && board[vert - 2][hori + 1] == 'n')
					{
						return 'n';
					}
					else if(vert - 1 >= 0 && hori - 2 >= 0 && board[vert - 1][hori - 2] == 'n')
					{
						return 'n';
					}
					else if(vert - 1 >= 0 && hori + 2 <= 7 && board[vert - 1][hori + 2] == 'n')
					{
						return 'n';
					}
					else if(vert + 1 <= 7 && hori - 2 >= 0 && board[vert + 1][hori - 2] == 'n')
					{
						return 'n';
					}
					else if(vert + 1 <= 7 && hori + 2 <= 7 && board[vert + 1][hori + 2] == 'n')
					{
						return 'n';
					}
					else if(vert + 2 <= 7 && hori - 1 >= 0 && board[vert + 2][hori - 1] == 'n')
					{
						return 'n';
					}
					else if(vert + 2 <= 7 && hori + 1 <= 7 && board[vert + 2][hori + 1] == 'n')
					{
						return 'n';
					}
					
					// Check for rooks
					for(int i = 0; i < board.length; i++)
					{
						if(board[vert][i] == 'r' || board[i][hori] == 'r')
						{
							return 'r';
						}
					}
				}
			}
		}
		
		return '-';
	}
}
