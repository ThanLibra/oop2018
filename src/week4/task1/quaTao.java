﻿/**
 * khởi tạo thông tin quả táo
 */
package week4.task1;

public class quaTao extends hoaQua {


    protected double giaBan;

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double s) {
        this.giaBan = s;
    }

    //in thông tin
    public void inThongTin() {
        System.out.println("\n");
        super.inThongTin();
        System.out.println("Giá bán : " + this.giaBan + " vnd");
    }

}
