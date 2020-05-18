/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

/**
 *
 * @author HP
 */
public class CTHD{
    String sanPham;
    int soLuong;
    float donGia;
    String chietKhau;

    public CTHD(Builder builder){
        this.sanPham = builder.sanPham;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
        this.chietKhau = builder.chietKhau;
    }

    @Override
    public String toString() {
        return "SanPham: "+sanPham+" SoLuong: "+soLuong+" DonGia: "+donGia
                +" ChietKhau: "+chietKhau+"\n";
    }



    public static class Builder{
        String sanPham;
        int soLuong;
        float donGia;
        String chietKhau;

        public Builder setSanPham(String sanPham) {
            this.sanPham = sanPham;
            return this;
        }

        public Builder setSoLuong(int soLuong) {
            this.soLuong = soLuong;
            return this;
        }

        public Builder setDonGia(float donGia) {
            this.donGia = donGia;
            return this;
        }

        public Builder setChietKhau(String chietKhau) {
            this.chietKhau = chietKhau;
            return this;
        }

        public CTHD build(){
            return new CTHD(this);
        }

    }
}
