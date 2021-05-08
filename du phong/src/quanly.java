import java.util.Scanner;

public class quanly extends donhang{
    Scanner nhap = new Scanner(System.in);
    protected double tien;
    public double tienvanchuyen(){
        if(this.number==1){
            this.tien= this.khoangcach*20000+this.cannang*5000;

        }
        else if (this.number==2){
            this.tien= this.khoangcach*100000+this.cannang*100000+200000;
        }

        return tien;

    }
    public void xuat(){
        System.out.println("=========");
        System.out.println("don hang thu "+ this.id);
        System.out.println("ten nguoi gui "+ this.nguoigui);
        System.out.println("ten nguoi nhan "+ this.nguoinhan);
        System.out.println("dia chi nhan "+ this.diachi);
        System.out.println("khoang cach gui nhan "+this.khoangcach);
        System.out.println("can nang don hang "+ this.cannang);
        System.out.println("hinh thuc van chuyen "+ hinhthucvc(number));
        System.out.println("tien van chuyen "+ tienvanchuyen());
        System.out.println("don hang duoc xuat trong thang "+ this.thang);
    }
}
