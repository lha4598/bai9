public class Bill {
    private KhachHang KhachHang;
    private int socu,somoi;

    public Bill() {

    }

    public Bill(KhachHang khachHang, int socu, int somoi) {
        this.KhachHang = khachHang;
        this.socu = socu;
        this.somoi = somoi;
    }

    public KhachHang getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        KhachHang = khachHang;
    }

    public int getSocu() {
        return socu;
    }

    public void setSocu(int socu) {
        this.socu = socu;
    }

    public int getSomoi() {
        return somoi;
    }

    public void setSomoi(int somoi) {
        this.somoi = somoi;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "KhachHang=" + KhachHang +
                ", socu=" + socu +
                ", somoi=" + somoi + "Số tiền phải trả= " + (somoi - socu) * 5 +
                '}';
    }
}
