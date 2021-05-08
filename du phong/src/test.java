import java.util.ArrayList;
import java.util.Scanner;

public class test extends quanly{
    ArrayList<quanly> danhsachdonhang = new ArrayList<quanly>();
    Scanner nhap = new Scanner(System.in);

    void themdonhang(quanly kh) {
        System.out.println("nhap don hang ");
        kh.nhap();
        danhsachdonhang.add(kh);
    }

    public void xemdonhang() {
        if (danhsachdonhang.size() == 0) {
            System.out.println("khong co don hang de xem");
        } else {
            for (quanly kh : danhsachdonhang) {
                kh.xuat();
            }
        }
    }

    void suadonhang() {
        if (danhsachdonhang.size() == 0) {
            System.out.println("khong co don hang nao de xoa");
        } else {
            System.out.println("ban muon sua don hang so ");
            double so = nhap.nextDouble();
            nhap.nextLine();
            System.out.println("ten nguoi nhan don hang ban muon sua");
            String nhan = nhap.nextLine();

            System.out.println("nhap dia chi ma don hang ban muon sua");
            String address = nhap.nextLine();
            boolean timkiem = false;
            System.out.println("don hang ban muon sua la ");
            for (quanly kh : danhsachdonhang) {
                if (kh.nguoinhan.equals(nhan) && kh.diachi.equals(address) && kh.id == so) {
                    kh.xuat();
                    System.out.println("nhap lai ten nguoi nhan don hang ban muon sua lai");
                    String name = nhap.nextLine();
                    kh.setNguoinhan(name);
                    System.out.println("nhap lai dia chi ban cua don hang ban muon sua lai ");
                    String address1 = nhap.nextLine();
                    kh.setDiachi(address1);
                    System.out.println("don hang sau khi ban sua");
                    kh.xuat();
                    timkiem = true;
                    break;
                }

            }
            if (timkiem == false) {
                System.out.println("khong co don hang nhu tim kiem hoac ban nhap sai");
            }
        }
    }
    void xoadonhang() {
        if (danhsachdonhang.size() == 0) {
            System.out.println("khong co don hang nao de xoa");
        }
        else {
            System.out.println("nhap ten nguoi gui cua don hang muon xoa");
            String name = nhap.nextLine();
            System.out.println("nhap ten nguoi nhan ma don hang muon xoa");
            String nhan = nhap.nextLine();
            System.out.println("nhap ten dia chi don hang muon xoa");
            String address = nhap.nextLine();
            boolean timkiem = false;
            for (quanly kh : danhsachdonhang) {
                if (kh.nguoigui.equals(name) && kh.nguoinhan.equals(nhan) && kh.diachi.equals(address)) {
                    danhsachdonhang.remove(kh);
                    timkiem = true;
                    System.out.println("don hang da duoc xoa");
                    break;
                }
            }
            if (timkiem == false) {
                System.out.println("khong co don hang nhu tim kiem de xoa");
            }

        }
    }
    void timkiemdonhangtheotenvadiachi() {
        if (danhsachdonhang.size() == 0) {
            System.out.println("khong co don hang nao de tim kiem");
        }
        else {
            System.out.println("nhap ten khach hang ban muon tim");
            String name = nhap.nextLine();
            System.out.println("nhap ten dia chi khach hang ban muon tim");
            String address = nhap.nextLine();
            boolean timkiem = false;
            for (quanly kh : danhsachdonhang) {
                if (kh.nguoinhan.equals(name) && kh.diachi.equals(address)) {
                    System.out.println("don hang ban muon tim la  ");
                    kh.xuat();
                    timkiem = true;
                    break;
                }
            }
            if (timkiem == false) {
                System.out.println("khong co don hang theo tim kiem hoac ban nhap ten va dia chi sai");
            }
        }
    }
    void timkiemtheomotsolonhon(){
        if(danhsachdonhang.size()==0){
            System.out.println("khong co don hang nao trong he thong");
        }
        else{
            System.out.println("nhap so tien ban muon tim nhung don hang co tien lon hon");
            double a= nhap.nextDouble();
            System.out.println("nhung don hang lon hon so tien ban tim la");
            for (quanly kh: danhsachdonhang){
                if(kh.tienvanchuyen()>a){
                    kh.xuat();
                }
            }
        }
    }

    void tientheothang(){
        System.out.println("nhap thang ma ban muon tong hop tien ");
        int a= nhap.nextInt();
        double b=0;
        for(quanly kh: danhsachdonhang){
            if(kh.thang==a){
                b+=kh.tienvanchuyen();
            }
        }
        System.out.println("tien cua thang "+ a+" ma ban muon tong hop la "+ b);
        if(b==0){
            System.out.println("thang do khong co don hang nao");
        }
    }
}
