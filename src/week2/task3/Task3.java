package week2.task3;

public class Task3 {
}

public class car {
    int banh;
    String ten;
    int id;

    public int getBanh() {
        return banh;
    }

    public void setBanh(int banh) {
        this.banh = banh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean checkId(int id) {
        return (this.id == id) ? true : false;
    }


    public boolean checkName(String name) {
        return (this.ten == name) ? true : false;
    }


    public boolean checkBanh(int banh) {
        return (this.banh == banh) ? true : false;
    }

}

public class hocSinh {
    int lop;   //khai báo biến
    String ten;
    int id;

    public int getLop() {
        return lop;
    }

    public void setLop(int lơp) {
        this.lop = lơp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean checkId(int id) {
        return (this.id == id) ? true : false;
    }


    public boolean checkName(String name) {
        return (this.ten == name) ? true : false;
    }

    public boolean checkLơp(int lop) {
        return (this.lop == lop) ? true : false;
    }

}


public class teacher {
    int quanLySoHocSinh;   //khai báo biến
    String ten;
    int id;

    public int getHS() {
        return quanLySoHocSinh;
    }

    public void setHS(int lơp) {
        this.quanLySoHocSinh = lơp;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Kiem tra id
    public boolean checkId(int id) {
        return (this.id == id) ? true : false;
    }

    //Kiem tra ten
    public boolean checkName(String name) {
        return (this.ten == name) ? true : false;
    }

    //Kiem tra quan ly so hs
    public boolean checkLơp(int HS) {
        return (this.quanLySoHocSinh == HS) ? true : false;
    }

}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
