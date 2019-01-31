package com.ttdjava.ticTacToe;

public class TicTacToe {

    private Character [] [] board =  {{'\0', '\0', '\0'}, {'\0', '\0', '\0'}, {'\0', '\0', '\0'}};
    private String lastPlayer = null;

    public void play(int x, int y) {
        checkAxis(x);
        checkAxis(y);
        setBoard(x, y);
        lastPlayer = nextPlayer();
    }

    public void checkAxis (int axis) {
        if (axis < 1 || axis > 3) {
            throw new RuntimeException(axis + " is outside board");
        }
    }

    public void setBoard (int x, int y) {
        if (board[x - 1][y - 1] != '\0') {
            throw new RuntimeException("Box is occupied");
        } else {
            board[x - 1][y - 1] = 'X';
        }
    }

    public String nextPlayer() {
        if (lastPlayer == "X") {
            return "O";
        }
        return "X";
    }
}
