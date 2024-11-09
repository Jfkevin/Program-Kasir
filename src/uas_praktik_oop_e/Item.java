package uas_praktik_oop_e;

public abstract class Item {
    protected String itemId;
    protected String nama;
    protected float harga;
    protected int stok;

    public Item(String nama, float harga, int stok) {
        this.itemId = java.util.UUID.randomUUID().toString();
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public float getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void kurangiStok(int jumlah) {
        if (jumlah > stok) {
            throw new IllegalArgumentException("Stok tidak cukup");
        }
        this.stok -= jumlah;
    }

    public int hitungTotalDariJumlah(int jumlah) {
        return Math.round(this.harga * jumlah);
    }

    public abstract String getItemType();
}
