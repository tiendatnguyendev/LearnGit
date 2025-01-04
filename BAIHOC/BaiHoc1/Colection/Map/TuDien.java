package BAIHOC.BaiHoc1.Colection.Map;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    private Map <String, String> DuLieu;

    public TuDien () {
        DuLieu = new TreeMap<>();
    }

    public void themTu(String key, String value) {
        DuLieu.put(key, value);
    }

    public void xoaTu(String key) {
        DuLieu.remove(key);
    }

    public String traTu(String key) {
       return DuLieu.get(key);
    }

    public void inDanhSachTu() {
        Set <String> TapHopTu = DuLieu.keySet();
        System.out.println(Arrays.toString(TapHopTu.toArray()));
    }

    public int soLuongTu() {
        return DuLieu.size();
    }

    public void xoaTatCaTu() {
        DuLieu.clear();
    }
    public static void main(String[] args) {
        TuDien DanhSachTu = new TuDien();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-------------MeNu-----------");
            System.out.println("1.Them Tu Dien.\n"+
            "2.Xoa Tu.\n"+
            "3.Xoa tat ca Tu.\n"+
            "4.In ra cac tu.\n"+
            "5.Tra tu.\n"+
            "6.In ra so luong tu.\n"+
            "7.Thoat.");
            System.out.print("choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Nhap Tu: ");
                    String key = sc.nextLine();
                    System.out.print("Nhap Y Nghia Tu: ");
                    String value = sc.nextLine();
                    DanhSachTu.themTu(key, value);
                    System.out.println("Da them thanh cong!");
                break;
                case 2:
                System.out.print("Nhap Tu: ");
                key = sc.nextLine();
                DanhSachTu.xoaTu(key);
                System.out.println("Da xoa thanh cong!");
                break;
                case 3:
                DanhSachTu.xoaTatCaTu();
                System.out.println("Da xoa thanh cong!");
                break;
                case 4:
                System.out.println("Danh sach cac tu: ");
                DanhSachTu.inDanhSachTu();
                break;
                case 5:
                System.out.print("Nhap Tu: ");
                key = sc.nextLine();
                DanhSachTu.traTu(key);
                System.out.println( DanhSachTu.traTu(key));
                break;
                case 6:
                System.out.println("So luong tu: "+DanhSachTu.soLuongTu());
                break;
                case 7:
                return;
                default:
                break;
            }
        } while (true);
    }
}
