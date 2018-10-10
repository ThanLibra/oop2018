
/**
 * khởi tạo thông tin qua cam
 */
package week4.task1;

import java.util.Scanner;

public class quaCam extends hoaQua {

    protected String vungSanXuat;

    //set/getter
    public void setVungSanXuat(String vungSanXuat) {
        this.vungSanXuat = vungSanXuat;
    }

    public String getVungSanXuat() {
        return vungSanXuat;
    }

    //hàm khơi tạo quaCam
    public quaCam() {
        super.setTen("Quả cam");
        this.setVungSanXuat(this.vungSanXuat);
    }

    //hàm in tên Vùng sản xuất cam
    public void inThongTin() {
        System.out.println("\n");
        super.inThongTin();
        System.out.println("Vùng sản xuát : " + this.vungSanXuat);
    }
}
