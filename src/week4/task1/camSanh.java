/**
 * khởi tạo thông tin cam sành
 */
package week4.task1;

public class camSanh extends quaCam {
    private String mauSac;

    //set/getter
    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    //hàm khởi tạo
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loại : Cam sành");
        System.out.println("Màu sắc : " + this.mauSac);
    }
}
