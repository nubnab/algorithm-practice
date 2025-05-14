package org.practice.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {

    public boolean solution(char[][] board) {
        HashMap<Integer, Set<Character>> rows = new HashMap<>();
        HashMap<Integer, Set<Character>> cols = new HashMap<>();
        HashMap<String, Set<Character>> squares = new HashMap<>();

        for(int r = 0; r < 9; r++) {
            for(int c = 0; c < 9; c++) {
                if(board[r][c] == '.') continue;

                String squareKey =  r / 3 + "," + c / 3;

                rows.computeIfAbsent(r, k -> new HashSet<>());
                cols.computeIfAbsent(c, k -> new HashSet<>());
                squares.computeIfAbsent(squareKey, k -> new HashSet<>());

                if(rows.get(r).contains(board[r][c]) ||
                        cols.get(c).contains(board[r][c]) ||
                        squares.get(squareKey).contains(board[r][c])) return false;

                rows.get(r).add(board[r][c]);
                cols.get(c).add(board[r][c]);
                squares.get(squareKey).add(board[r][c]);
            }
        }
        return true;
    }
}
