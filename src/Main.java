import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double max = 0;
        int x=0;
        int y=0;
        double[][] arr = cerateArr();

        // in ra ma trận
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "   ");
            }
            System.out.println();
        }

        // in ra giá trị lớn nhất
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    x=i;
                    y=j;
                }
            }
        }
        System.out.println("Gía trị lớn nhất: "+max+" to độ x: "+x+"tọa độ y:"+y);

    }

    static double[][] cerateArr() {
        System.out.println("nhập số hàng: ");
        int row = scanner.nextInt();

        System.out.println("nhập số cột: ");
        int column = scanner.nextInt();
        double[][] arr = new double[row][column];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("nhập phần tử thứ " + i + "." + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
}