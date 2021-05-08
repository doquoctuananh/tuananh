import java.util.Scanner;

public class donhang {
    protected String nguoinhan;
    protected String nguoigui;
    protected String diachi;
    protected double khoangcach;
    protected double id;
    public int number;
    protected double cannang;
    protected String hinhthucvanchuyen;
    protected int thang;
    Scanner nhap = new Scanner(System.in);

    public donhang() {
    }

    public donhang(String nguoinhan, String nguoigui, String diachi, double khoangcach,double id,double cannang) {
        this.nguoinhan = nguoinhan;
        this.nguoigui = nguoigui;
        this.diachi = diachi;
        this.khoangcach = khoangcach;
        this.id= id;
        this.cannang=cannang;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getNguoinhan() {
        return nguoinhan;
    }

    public void setNguoinhan(String nguoinhan) {
        this.nguoinhan = nguoinhan;
    }

    public String getNguoigui() {
        return nguoigui;
    }

    public void setNguoigui(String nguoigui) {
        this.nguoigui = nguoigui;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getKhoangcach() {
        return khoangcach;
    }

    public void setKhoangcach(double khoangcach) {
        this.khoangcach = khoangcach;
    }

    public double getCannang() {
        return cannang;
    }

    public void setCannang(double cannang) {
        this.cannang = cannang;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String hinhthucvc(int x) {
        switch(this.number) {
            case 1:
                this.hinhthucvanchuyen = " duong bo ";
                break;
            case 2:
                this.hinhthucvanchuyen=" duong hang khong";
            default:
                break;
        }
        return this.hinhthucvanchuyen;
    }

    public void nhap(){
        System.out.println("day la don hang thu ");
        this.id=nhap.nextDouble();
        nhap.nextLine();
        System.out.println("nhap ten nguoi gui");
        this.nguoigui=nhap.nextLine();
        System.out.println("nhap ten nguoi nhan");
        this.nguoinhan=nhap.nextLine();
        System.out.println("nhap dia chi nguoi nhan");
        this.diachi=nhap.nextLine();
        System.out.println("nhap khoang cach");
        this.khoangcach=nhap.nextDouble();
        System.out.println("nhap hinh thuc van chuyen(1-duong bo/ 2- duong hang khong )");
        this.number=nhap.nextInt();
        System.out.println("nhap can nang");
        this.cannang=nhap.nextDouble();
        System.out.println("don hang nay duoc xuat trong thang ");
        this.thang=nhap.nextInt();
    }
}
