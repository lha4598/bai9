public class KhachHang {
    private String ten;
    private int sonha,maso;

    public KhachHang() {
    }

    public KhachHang(String ten, int sonha, int maso) {
        this.ten = ten;
        this.sonha = sonha;
        this.maso = maso;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "Tên='" + ten + '\'' +
                ", Số nhà=" + sonha +
                ", Mã số CTĐ=" + maso +
                '}';
    }
}
