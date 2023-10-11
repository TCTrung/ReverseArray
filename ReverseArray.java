import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;
        int size;
        do {
            System.out.print("Nhap kich thuoc:");
            size = scanner.nextInt();
            if (size > 10)
                System.out.println("Kich thuoc khong vuot qua 10");
        } while (size > 10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhap phan tu tai vi tri " + i + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.println("---Phan tu trong mang: ---");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println("\n" + "---Dao nguoc mang: ---");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
