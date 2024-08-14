import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy quanLy = new QuanLy();
        while (true) {
            System.out.println("------MENU----------");
            System.out.println("1. Thêm thông tin hóa đơn ");
            System.out.println("2. Hiển thị các hóa đơn: ");
            System.out.println("3. Xóa hóa đơn ");
            System.out.println("4. Sửa thông tin hóa đơn");
            System.out.println("5. Thoát ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Nhập tên: ");
                    String ten = sc.nextLine();
                    System.out.println("Nhập số nhà: ");
                    int sonha = sc.nextInt();
                    System.out.println("Nhập mã số công tơ điện: ");
                    int maso = sc.nextInt();
                    sc.nextLine();
                    KhachHang khachHang = new KhachHang(ten, sonha, maso);
                    System.out.println("Nhập số điện cũ: ");
                    int socu = sc.nextInt();
                    System.out.println("Nhập số điện mới: ");
                    int somoi = sc.nextInt();
                    sc.nextLine();
                    Bill bill = new Bill(khachHang, socu, somoi);
                    quanLy.addBill(bill);
                    break;
                }
                case 2: {
                    quanLy.showBill();
                    break;
                }
                case 3: {
                    System.out.println("Nhập mã công tơ điện cần xóa: ");
                    int maso = sc.nextInt();
                    sc.nextLine();
                    quanLy.removeBill(maso);
                    break;
                }
                case 4: {
                    System.out.println("Nhập mã công tơ điện cần sửa: ");
                    int maso = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Nhập tên mới: ");
                    String newTen = sc.nextLine();
                    quanLy.suaBill(maso).getKhachHang().setTen(newTen);
                    System.out.println("Nhập số nhà mới: ");
                    int newSonha = sc.nextInt();
                    sc.nextLine();
                    quanLy.suaBill(maso).getKhachHang().setSonha(newSonha);
                    break;
                }
                case 5: {
                    return;
                }
            }
        }
    }
}