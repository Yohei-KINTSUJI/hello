import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = 73; // プログラマが設定する当てるべき数
        int maxGuesses = 5; // ユーザが数を予想できる回数の最大値
        int guessesTaken = 0; // ユーザが予想した回数

        System.out.println("数当てゲームを開始します！2桁の正の整数を予想してください。");

        Scanner scanner = new Scanner(System.in);

        while (guessesTaken < maxGuesses) {
            System.out.printf("残り回数：");
            System.out.printf("%d", maxGuesses - guessesTaken);
            System.out.println("回");
            System.out.print("予想した数を入力してください: ");
            int guess = scanner.nextInt();
            guessesTaken++;

            if (guess == targetNumber) {
                System.out.println("当たり！正解です！");
                break;
            } else if (guess > targetNumber) {
                System.out.println("残念！予想した数は正解より大きいです。");
            } else {
                System.out.println("残念！予想した数は正解より小さいです。");
            }

            int difference = Math.abs(targetNumber - guess);
            if (difference >= 20) {
                System.out.println("ヒント：20以上の差があります！");
            }
        }

        if (guessesTaken == maxGuesses) {
            System.out.println("ゲームオーバー！正解は " + targetNumber + " でした。");
        }

        scanner.close();
    }
}