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
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDonHeader hdh = new HoaDonHeader.Builder()
                .setMaHD("HD001")
                .setNgayBan("12-10-2019")
                .setTenKH("Might Guy").build();
        CTHD cthd1 = new CTHD.Builder()
                .setSanPham("Vip Predator")
                .setDonGia(49500000)
                .setSoLuong(1)
                .setChietKhau("4%").build();
        
        CTHD cthd2 = new CTHD.Builder()
                .setSanPham("Omega Pow")
                .setDonGia(50500000)
                .setSoLuong(2)
                .setChietKhau("10%").build();
        
        HoaDon hd = new HoaDon();
        hd.setHoaDonHeader(hdh);
        hd.addCTHD(cthd1);
        hd.addCTHD(cthd2);
        hd.inHoaDon();
    }
    
}
