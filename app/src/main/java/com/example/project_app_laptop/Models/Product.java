package com.example.project_app_laptop.Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Product implements Serializable {
    private int masp, mahang, soluong;
    private String tensp, mota, hinhanh, cpu, ram, ocung, manhinh, vga, hedieuhanh, trongluong, pin;
    private long giaban;

    public Product() {
    }

    public Product(int masp, int mahang, int soluong, String tensp, String mota, String hinhanh, String cpu, String ram, String ocung, String manhinh, String vga, String hedieuhanh, String trongluong, String pin, long giaban) {
        this.masp = masp;
        this.mahang = mahang;
        this.soluong = soluong;
        this.tensp = tensp;
        this.mota = mota;
        this.hinhanh = hinhanh;
        this.cpu = cpu;
        this.ram = ram;
        this.ocung = ocung;
        this.manhinh = manhinh;
        this.vga = vga;
        this.hedieuhanh = hedieuhanh;
        this.trongluong = trongluong;
        this.pin = pin;
        this.giaban = giaban;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getMasp() {
        return masp;
    }

    public void setMasp(int masp) {
        this.masp = masp;
    }

    public int getMahang() {
        return mahang;
    }

    public void setMahang(int mahang) {
        this.mahang = mahang;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(String hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getOcung() {
        return ocung;
    }

    public void setOcung(String ocung) {
        this.ocung = ocung;
    }

    public String getManhinh() {
        return manhinh;
    }

    public void setManhinh(String manhinh) {
        this.manhinh = manhinh;
    }

    public String getVga() {
        return vga;
    }

    public void setVga(String vga) {
        this.vga = vga;
    }

    public String getHedieuhanh() {
        return hedieuhanh;
    }

    public void setHedieuhanh(String hedieuhanh) {
        this.hedieuhanh = hedieuhanh;
    }

    public String getTrongluong() {
        return trongluong;
    }

    public void setTrongluong(String trongluong) {
        this.trongluong = trongluong;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public long getGiaban() {
        return giaban;
    }

    public void setGiaban(long giaban) {
        this.giaban = giaban;
    }
    public static ArrayList<Product> initProduct()
    {
        ArrayList<Product> lst = new ArrayList<>();
        lst.add(new Product(1, 4, 5, "Laptop gaming Dell G15 5530 i7H165W11GR4060", "Laptop gaming Dell G15 5530 i7H165W11GR4060 là sản phẩm nằm trong phân khúc trên laptop gaming cao cấp trên 30 triệu và là thế hệ chơi game tiếp theo của Dell. Vốn nổi tiếng với những chiếc laptop văn phòng thì nay Dell mang đến cho game thủ một lựa chọn mới đầy tính năng, cấu hình mạnh mẽ và đương đầu với vô số tựa game dễ dàng.", "pic1", "Intel Core i7-13650HX 24 MB cache, 14 core, up to 4.90 GHz", "16GB (2x8GB) DDR5 4800MHz (2x SO-DIMM socket, up to 32GB SDRAM)", "512GB SSD M.2 PCIe NVMe", "15.6 FHD (1920x1080) 165Hz, 3ms, sRGB-100%, ComfortViewPlus, NVIDIA G-SYNC+DDS Display", "NVIDIA® GeForce RTX™ 4060 8GB GDDR6", "Windows 11 Home + Office Home & Student", "2.81 kg", "6 Cell 86WHrs", 37790000));
        lst.add(new Product(2, 4, 3, "Laptop gaming Dell Alienware M15 R6 P109F001CBL", "Một trong những dòng laptop chơi game cao cấp được yêu thích nhất hiện nay với vẻ ngoài đặc biệt cùng cấu hình mạnh mẽ, đây cũng là đứa con của thương hiệu Dell nổi tiếng với dòng laptop văn phòng, đó chính là Alienware. Hôm nay GEARVN sẽ đem đến cho bạn chiếc laptop Dell Alienware M15 R6 P109F001CBL, hãy cùng xem “người ngoài hành tinh” sẽ được trang bị những gì cho game thủ chúng ta nhé!", "pic1", "Intel Core i7-11800H 2.3GHz up to 4.6GHz 24MB", "32GB (16x2) DDR4 3200MHz (2x SO-DIMM socket, up to 64GB SDRAM)", "1TB SSD M.2 PCIe", "15.6 inch QHD (2560 x 1440) 240Hz, 2ms, with ComfortView plus, NVIDIA G-SYNC and Advanced Optimus, WVA Display", "NVIDIA GeForce RTX 3060 6GB GDDR6", "Windows 11 Home + Office Home & Student", "2.69 kg", "6 Cell 86WHrs", 44990000));
        lst.add(new Product(3, 5, 20, "Laptop gaming HP VICTUS 16-s0078AX 8C5N7PA", "Ngon bổ rẻ.", "pic1", "AMD Ryzen™ 5 7640HS (up to 5.0 GHz max boost clock, 16 MB L3 cache, 6 cores, 12 threads)", "16GB (2x8GB) DDR5 4800MHz (2x SO-DIMM socket, up to 32GB SDRAM)", "512 GB PCIe® Gen4 NVMe™ TLC M.2 SSD (1 slot)", "16.1 FHD (1920 x 1080), 144 Hz, IPS, micro-edge, anti-glare, 250 nits, 45% NTSC", "NVIDIA® GeForce RTX™ 4060 8GB GDDR6", "Windows 11 Home", "2.31 kg", "4 Cell 70WHr", 23990000));
        lst.add(new Product(4, 2, 10, "Laptop gaming Lenovo Legion 7 16IRX9 83FD006JVN", "Ngon bổ rẻ.", "pic1", "Intel® Core™ i9-14900HX, 24C (8P + 16E) / 32T, P-core 2.2 / 5.8GHz, E-core 1.6 / 4.1GHz, 36MB", "32GB (2x16GB) SO-DIMM DDR5 5600MHz (2 slots, nâng cấp tối đa 32GB)", "1TB SSD M.2 2280 PCIe® 4.0x4 NVMe® (2 slots M.2 2280 PCIe® 4.0 x4)", "16 3.2K (3200x2000) IPS 430nits Anti-glare, 100% DCI-P3, 165Hz, Dolby® Vision®, G-SYNC®, Low Blue Light", "NVIDIA® GeForce RTX™ 4070 8GB GDDR6, Boost Clock 2175MHz, TGP 115W", "Windows® 11 Home Single Language, English", "2.62 kg", "Integrated 99.9Wh", 64990000));
        lst.add(new Product(5, 4, 30, "Laptop gaming Dell G15 5530 i7H165W11GR4050", "Laptop gaming Dell G15 5530 i7H165W11GR4050 là sản phẩm nằm trong phân khúc trên laptop gaming cao cấp 30 triệu và là thế hệ chơi game tiếp theo của Dell. Vốn nổi tiếng với những chiếc laptop văn phòng thì nay Dell mang đến cho game thủ một lựa chọn mới đầy tính năng, cấu hình mạnh mẽ và đương đầu với vô số tựa game dễ dàng.", "pic1", "Intel Core i7-13650HX 24 MB cache, 14 core, up to 4.90 GHz", "16GB (2x8GB) DDR5 4800MHz (2x SO-DIMM socket, up to 32GB SDRAM)", "512GB SSD M.2 PCIe PCIE G4X4", "15.6 FHD (1920x1080) 165Hz, 3ms, sRGB-100%, ComfortViewPlus, NVIDIA G-SYNC+DDS Display", "NVIDIA® GeForce RTX™ 4050 6GB GDDR6", "Windows 11 Home + Office Home & Student", "2.81 kg", "3 Cell 56WHrs", 37990000));

        return lst;
    }
}
