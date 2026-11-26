import java.util.Scanner;
import java.util.Arrays;

class sinsa{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        // N を読み込む
        int N = sc.nextInt();

        // 5N 個の評点を格納する配列を用意して読み込む
        int[] X = new int[5 * N];
        for (int i = 0; i < 5*N; i++) {
            X[i] = sc.nextInt();
        }

        // 評点を昇順（小さい順）に並び替える
        Arrays.sort(X);

        // 下位 N 人（インデックス 0 〜 N-1）と
        // 上位 N 人（インデックス 4N 〜 5N-1）を除いた、
        // 中央の 3N 人（インデックス N 〜 4N-1）の合計を求める
        double sum = 0;
        for (int i = N; i < 4 * N; i++) {
            sum += X[i];
        }

        // 平均を計算して出力（3N で割る）
        double average = sum / (3.0 * N);
        System.out.printf("%.15f\n", average);
    }
}