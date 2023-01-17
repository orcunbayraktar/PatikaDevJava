package MineSweeperGame;

import java.util.Scanner;

public class MineSweeper {
    static int counter = 0;

    private int rowSize;
    private int colSize;
    private String[][] gameBoard;
    private String[][] mineArray;

    public MineSweeper(int rowSize, int colSize) {
        this.rowSize = rowSize;//row index degeri
        this.colSize = colSize;

        gameBoard = new String[this.rowSize][this.colSize];

        mineArray = new String[this.rowSize][this.colSize];

        fillAll(gameBoard, "-");

        createMineBoard(mineArray);
    }

    void run() {
        boolean isGameOver = true;
        boolean isGameWin = true;

        Scanner scn = new Scanner(System.in);

        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");

        while (isGameOver && isGameWin) {
            printBoard(this.gameBoard);
            int row, col;

            do {
                System.out.print("Satır Giriniz :");
                row = scn.nextInt();
                System.out.print("Sütun Giriniz :");
                col = scn.nextInt();
            } while (row < 0 || col < 0 || row >= gameBoard.length || col >= gameBoard[0].length);


            if (isGameOver(this.gameBoard, this.mineArray, row, col)) {
                isGameOver = false;
                System.out.println("Game Over!!");
            }


            gameRound(this.mineArray, row, col);

            if (isGameWin(this.gameBoard)) {
                System.out.println("Oyunu kazandınız");
                printBoard(gameBoard);
                isGameWin = false;
            }

            System.out.println("===========================");

        }



    }

    boolean isGameWin(String[][] gameBoard) {
        int tireNumber = 0;
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                if (gameBoard[i][j] == "-") {
                    tireNumber++;
                }
            }
        }
        if (tireNumber == (this.rowSize * this.colSize) / 4) {
            return true;
        }

        return false;
    }

    boolean isGameOver(String[][] gameBoard, String[][] mineArray, int row, int col) {

        if (gameBoard[row][col].equals(mineArray[row][col])) {
            return false;
        } else {
            return true;
        }
    }

    void gameRound(String[][] mineArray, int row, int col) {

        counter = 0;
        scanMatrix(mineArray, row, col);
        printBoard2DCor(gameBoard, Integer.toString(counter), row, col);
    }

    void scanMatrix(String[][] mineArray, int row, int col) {

        for (int i = row - 1; i < row + 2; i++) {
            if (i >= 0 && i < mineArray.length) {
                for (int j = col - 1; j < col + 2; j++) {
                    if (j >= 0 && j < mineArray[0].length) {
                        if (mineArray[i][j].equals("*")) {
                            counter++;
                        }
                    }

                }
            }

        }
    }


    void printBoard(String[][] gameBoard) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }

    }

    void fillAll(String[][] gameBoard, String str) {
        for (int i = 0; i < gameBoard.length; i++) {
            for (int j = 0; j < gameBoard[i].length; j++) {
                gameBoard[i][j] = str;
            }
        }
    }

    void printBoard2DCor(String[][] gameBoard, String str, int row, int col) {
        gameBoard[row][col] = str;
    }


    void createMineBoard(String[][] mineArray) {

        int mineNumber = (mineArray.length) * (mineArray[0].length) / 4;
        fillAll(mineArray, "-");

        while (mineNumber > 0) {

            int mineRow = (int) (Math.random() * (mineArray.length));
            int mineCol = (int) (Math.random() * (mineArray[0].length));


            printBoard2DCor(mineArray, "*", mineRow, mineCol);

            mineNumber--;
        }

    }


    public String[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(String[][] gameBoard) {
        this.gameBoard = gameBoard;
    }

    public String[][] getMineArray() {
        return mineArray;
    }

    public void setMineArray(String[][] mineArray) {
        this.mineArray = mineArray;
    }

    public int getRowSize() {
        return rowSize;
    }

    public void setRowSize(int rowSize) {
        this.rowSize = rowSize;
    }

    public int getColSize() {
        return colSize;
    }

    public void setColSize(int colSize) {
        this.colSize = colSize;
    }
}
