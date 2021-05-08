import java.util.Scanner;

public class quanlydonhang {
    static void menu(){
        System.out.println("=============");
        System.out.println("1.them don hang");
        System.out.println("2.sua mot don hang");
        System.out.println("3.xoa mot don hang");
        System.out.println("4.tim kiem don hang theo ten va dia chi ");
        System.out.println("5.tim kiem don hang mot so nhap vao");
        System.out.println("6.thong ke cac don hang ");
        System.out.println("7.tong hop tien theo thang");
        System.out.println("8. thoat");
    }
    public static void main(String[] args) {
        int luachon;
        test dh= new test ();
        Scanner nhap = new Scanner(System.in);
        menu();
        while(true){
            System.out.println("moi ban nhap lua chon ");
            luachon= nhap.nextInt();
            switch(luachon){
                case 1:
                    dh.themdonhang(new quanly());
                    break;
                case 2:
                    dh.suadonhang();
                    break;
                case 3:
                    dh.xoadonhang();
                    break;
                case 4:
                    dh.timkiemdonhangtheotenvadiachi();
                    break;
                case 5:
                    dh.timkiemtheomotsolonhon();
                    break;
                case 6:
                    dh.xemdonhang();
                    break;
                case 7:
                    dh.tientheothang();
                    break;
                case 8:
                    return ;
            }
        }
    }
}
