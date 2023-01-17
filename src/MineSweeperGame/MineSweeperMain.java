package MineSweeperGame;

import java.util.Scanner;

public class MineSweeperMain {
    public static void main(String[] args) {

        Scanner snc = new Scanner(System.in);

        System.out.print("Mayın tarlası oyunun\nBoyutunu belirtiniz x : ");
        int rowSize = snc.nextInt();
        System.out.print("Boyutunu belirtiniz x : ");
        int colSize = snc.nextInt();

        MineSweeper Ms = new MineSweeper(rowSize, colSize);

        System.out.println("----------------");
        Ms.printBoard(Ms.getMineArray());
        Ms.run();


    }
}
