package com.neetcode.arrays.and.hashing;

import java.util.HashSet;

public class ValidSukodu {


    public boolean isValidSudoku(char[][] board) {
        int N=9;
        HashSet<Character>[] rows = new HashSet[N];
        HashSet<Character>[] cols = new HashSet[N];
        HashSet<Character>[] boxes = new HashSet[N];

        for(int i=0;i<N;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }


        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                char value= board[r][c];


                //check if the value is filled with number
                if(value=='.'){
                    continue;
                }

                //check the row
                if(rows[r].contains(value)){
                    return false;
                }
                rows[r].add(value);

                // check the column
                if(cols[c].contains(value)){
                    return false;
                }
                cols[c].add(value);

                //check the box

                int idx=(r)/3*3+(c)/3;
                if(boxes[idx].contains(value)){
                    return false;
                }
                boxes[idx].add(value);
            }
        }
            return  true;
    }
    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };


        ValidSukodu validSukodu = new ValidSukodu();
        System.out.println(validSukodu.isValidSudoku(board));

    }
}
