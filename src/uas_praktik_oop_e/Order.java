package uas_praktik_oop_e;

public class Order {
    private int orderId;
    private Pelanggan customer;
    private Item itemTerpilih;
    private int qtyItem;
    private double totalHarga;

    public Order(int id, Pelanggan customer, Item itemTerpilih, int qtyItem, double totalHarga) {
        this.orderId = id;
        this.customer = customer;
        this.itemTerpilih = itemTerpilih;
        this.qtyItem = qtyItem;
        this.totalHarga = totalHarga;
    }

    public String printDetailOrder() {
        return String.format("Order ID: %d, Pelanggan: %s, Barang: %s, Jumlah: %d, Total Harga: %.2f",
                orderId, customer.getDetailPelanggan(), itemTerpilih.getNama(), qtyItem, totalHarga);
    }
}