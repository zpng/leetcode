/**
 * @(#)IsValidSudoku.java, 四月 03, 2017.
 * <p>
 * Copyright 2017 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import com.sun.rowset.internal.Row;

import java.util.HashSet;

/**
 * @author ldap
 */
public class IsValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < 9; i++) {
            HashSet<Character> rows = new HashSet<Character>();
            HashSet<Character> cols = new HashSet<Character>();
            HashSet<Character> cub = new HashSet<Character>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !rows.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !cols.add(board[j][i])) {
                    return false;
                }
                int RowIndex = 3 * (i / 3);
                int ColIndex = 3 * (i % 3);
                if (board[RowIndex + j / 3][ColIndex + j % 3] != '.' &&
                        !cub.add(board[RowIndex + j / 3][ColIndex + j % 3])) {
                    return false;
                }
            }
        }
        return true;
    }
}
