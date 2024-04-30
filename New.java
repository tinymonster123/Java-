//import java.util.Scanner;
//
//public class New {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int n = input.nextInt();
//        int m = input.nextInt();
//        if (n > 2e5 || n < 1 || m < 1) {
//            System.out.println("You enter error number");
//            return;
//        }
//
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        int t = input.nextInt();
//        int counter = 0;
//        while (counter < 1) {
//            if (t == 1) {
//                int i = input.nextInt();
//                int j = input.nextInt();
//                if (i < 1 || i > j || i > n || j < 1 || j > n) {
//                    System.out.println("You enter error number");
//                    return;
//                }
//                int k = input.nextInt();
//                double absK = Math.abs(k);
//                if (absK> 1e6) {b
//                    System.out.println("You enter error number");
//                    return;
//                }
//                for (int z = i - 1; z < j; z++) {
//                    arr[z] += k;
//                }
//            } else if (t == 2) {
//                counter++;
//                int i = input.nextInt();
//                int j = input.nextInt();
//                if (i < 1 || i > j || i > n || j < 1 || j > n) {
//                    System.out.println("You enter error number");
//                    return;
//                }
//                int sum = 0;
//                for (int z = i - 1; z < j; z++) {
//                    sum += arr[z];
//                }
//                System.out.println(sum);
//                System.out.print("Would you like to continue?(Y/N)");
//                char ch = input.next().charAt(0);
//                switch (ch) {
//                    case 'Y':
//                        counter = 0;
//                        break;
//                    case 'N':
//                        ;
//                    default:
//                        break;
//                }
//            }
//        }
//
//
//    }
//}

import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        //对输入的值进行潘多错误处理
        if (n > 2e5 || n < 1 || m < 1) {
            System.out.println("You enter error number");
            return;
        }

        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
//用来至少运行一次 2 操作
        int counter = 1;
        while (counter > 0) {
            int t = input.nextInt();
            //为 1 时所进行的操作
            if (t == 1) {
                int i = input.nextInt();
                int j = input.nextInt();
                if (i < 1 || i > j || i > n || j < 1 || j > n) {
                    System.out.println("You enter error number");
                    return;
                }
                int k = input.nextInt();
                double absK = Math.abs(k);
                if (absK > 1e6) {
                    System.out.println("You enter error number");
                    return;
                }
                for (int z = i - 1; z < j; z++) {
                    arr[z] += k;
                }
                //为 2 时所进行的操作
            } else if (t == 2) {
                int i = input.nextInt();
                int j = input.nextInt();
                if (i < 1 || i > j || i > n || j < 1 || j > n) {
                    System.out.println("You enter error number");
                    return;
                }
                int sum = 0;
                for (int z = i - 1; z < j; z++) {
                    sum += arr[z];
                }
                System.out.println(sum);
                //让 client 自行判断是否继续
                System.out.print("Would you like to continue? (Y/N): ");
                char ch = input.next().charAt(0);
                switch (ch) {
                    case 'Y':
                        counter = 1;
                        break;
                    case 'N':
                        return;
                    default:
                        return;
                }
            }
        }
    }
}