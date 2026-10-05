public class InvoiceItem {
    // Private Attributes
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Returns unitPrice * qty
    public double getTotal() {
        return unitPrice * qty;
    }

    // Returns formatted string: "InvoiceItem[id=?,desc=?,qty=?,unitPrice=?]"
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}
class InvoiceItemTest {
    public static void main(String[] args) {

        InvoiceItem item = new InvoiceItem(
                "I001",
                "Laptop",
                2,
                500.00
        );

        System.out.println("ID: " + item.getId());
        System.out.println("Description: " + item.getDesc());
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Unit Price: $" + item.getUnitPrice());
        System.out.println("Total: $" + item.getTotal());

        item.setQty(3);
        item.setUnitPrice(450.00);

        System.out.println("\nAfter updating quantity and price:");
        System.out.println("Quantity: " + item.getQty());
        System.out.println("Unit Price: $" + item.getUnitPrice());
        System.out.println("Total: $" + item.getTotal());

        System.out.println("\nInvoice Item Information:");
        System.out.println(item);
    }
}