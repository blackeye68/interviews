package unitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WordSearchTest {
	WordSearch ws =  new WordSearch();
	@Test
	void testWordSearch() {
		char[][] board = {
							{'H', 'H', 'A', 'Y'},
							{'E', 'O', 'R', 'O'},
							{'L', 'W', 'E', 'U'},
							{'L', 'L', 'L', 'L'},
							{'O', 'O', 'O', 'O'}
						};
		
		String word = "howlo";
		assertTrue(ws.exist(board, word));
	}

}
