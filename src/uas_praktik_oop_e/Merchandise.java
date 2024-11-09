package uas_praktik_oop_e;

public class Merchandise extends Item {
    private String namaMerk;
    private String kategori;

    public Merchandise(String nama, float harga, int stok, String namaMerk, String kategori) {
        super(nama, harga, stok);
        this.namaMerk = namaMerk;
        this.kategori = kategori;
    }

    public String getDataMerch() {
        return String.format("Nama: %s, Harga: %.2f, Stok: %d, Merek: %s, Kategori: %s",
                nama, harga, stok, namaMerk, kategori);
    }

    public String getItemType() {
        return "Merchandise";
    }
}