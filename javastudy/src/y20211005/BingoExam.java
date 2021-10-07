package y20211005;

import java.util.*;

public class BingoExam {

	public static void main(String[] args) {
		Set set = new HashSet();
		int[][] board = new int[5][5];
		
		for (int i = 0; set.size() <25; i++) {
			set.add((int)(Math.random()*50)+1+"");
			//System.out.println(set);
		}
		
		Iterator it = set.iterator(); // iterator를 거치면서 object
		
		for(int i = 0 ; i < board.length ; i++) {
			for(int j = 0 ; j < board[i].length ; j++ ) {
				board[i][j] = Integer.parseInt((String)it.next());
				System.out.print((board[i][j] < 10 ? "  " : " ") + board[i][j]);
			}
			System.out.println();
		}
		
	}
}
