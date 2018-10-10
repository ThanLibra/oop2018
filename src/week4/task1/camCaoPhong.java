/**
 * khởi tạo thông tin cam cao phong
 */
package week4.task1;

public class camCaoPhong extends quaCam {
    private String muiVi;

    //set/getter
    public String getMuiVi() {
        return muiVi;
    }

    public void setMoTa(String muiVi) {
        this.muiVi = muiVi;
    }

    //hàm khởi tạo
    public void inThongTin() {
        super.inThongTin();
        System.out.println("Loại : Cam cao phong");
        System.out.println("Mùi vị của quả cam : " + this.muiVi);
    }
}
