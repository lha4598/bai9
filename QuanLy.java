import java.util.ArrayList;
import java.util.List;

public class QuanLy {
    private List<Bill> bills;

    public QuanLy() {
        this.bills = new ArrayList<Bill>();
    }

    public void addBill(Bill bill) {
        this.bills.add(bill);
    }

    public void showBill() {
        this.bills.forEach(bill -> System.out.println(bill.toString()));
    }
    public void removeBill(int maso) {
        this.bills.removeIf(bill -> bill.getKhachHang().getMaso() == maso);
    }

    public Bill suaBill(int maso) {
        Bill bill1 = this.bills.stream().filter(bill -> bill.getKhachHang().getMaso() == maso).findFirst().orElse(null);
        if (bill1 == null) {
            return null;
        } else {
            return bill1;
        }
    }
}
