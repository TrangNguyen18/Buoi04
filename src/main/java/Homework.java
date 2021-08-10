import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // Bai 1a
        System.out.println("-----Bai so 1 a: Kiem tra so doi xung");
        int i = nhapso();
        if (isDoiXung(i)) {
            System.out.println("So " + i + " la so doi xung");
        }
        else {
            System.out.println("So " + i + " khong phai la so doi xung");
        }
        // Bai 1b
        System.out.println("-----Bai so 1 b: Kiem tra so chinh phuong");
        int i1 = nhapso();
        if (isChinhPhuong(i1)) {
            System.out.println(" So " + i1 + " la so chinh phuong");
        }
        else {
            System.out.println("So " + i1 + " không phai la so chinh phuong");
        }
        // Bai 2d
        System.out.println("-----Bai so 2 d: Tinh giai thua");
        int i2 = nhapso();
        System.out.println("Gia thua la : " + giaiThua(i2));
        // Bai 2e
        System.out.println("-----Bai 2e: Tinh tong giai thua");
        int i3 = nhapso();
        System.out.println("Tong giai thua la: " + tongGiaiThua(i3));
        // Bai 4

        System.out.println("-----Bai 4: Tinh tong cac so nguyen to");
        int i4;
        do {
            i4 = nhapso();
        }
        while (i4 > 50);
        System.out.println("Tong cac so nguyen to la: " + sum1(i4));
        // Bai 5
        System.out.println("----- Bai 5: Tim so nghich dao");
        int i5 = nhapso();
        System.out.println("So nguoc lai cua so " + i5 + " la so " + nghichDao(i5));
    }
    // ham kiem tra so doi xung
    public static boolean isDoiXung(int a){
        int tmp = a;
        int a2 = 0;
        while ( a != 0){
            int n = a/10;
            int d = a%10;
            a2 = a2 * 10 + d;
            a = n;
        }
        if (tmp == a2) return true;
        else return false;
    }
    public  static boolean isChinhPhuong(int n) {
        boolean check = false;
        int i = 0;
        while (i * i <= n) {
            if (i * i == n) {
                check = true;
            }
                i++;
            }
        return check;
    }
        // ham nhap du lieu
        public static int nhapso () {
            Scanner scanner = new Scanner(System.in);
            int n;
            do {
                System.out.print("Nhap vao mot so nguyen duong: ");
                n = scanner.nextInt();
            } while (n <= 0);
            return n;
        }

        // ham tinh tong
    public static int giaiThua (int n){
        int s = 1;
        for (int i = 1; i <= n; i++) {
            s = s*i;
        }
        return s;
    }
    // ham tinh tong giai thua
    public static int tongGiaiThua(int n){
        int s2 = 0;
    for (int i = 1; i <= n; i++) {
        s2 = s2 + giaiThua(i);
    }
    return s2;
}
// ham tim so nguyen to
    public static boolean isNguyenTo(int n){
        boolean check = false;
        if(n<2){
            check = false;
        }
        else if (n == 2){
            check = true;
        }
        else {
            check = true;
            for (int i = 2; i<n ;i++){
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        return check;
    }
// ham tinh tong cac so nguyen to nho hon n
    public static int sum1(int n){
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (isNguyenTo(i)){
                s = s + i;
            }
        }
        return s;
    }
// ham lay so nguoc lai
public static int nghichDao(int a){
    int tmp = a;
    int a2 = 0;
    while ( a != 0){
        int n;
        int d;
        n = a/10;
        d = a%10;
        a2= a2 * 10 + d;
        a = n;
    }
    return a2;
}
}
