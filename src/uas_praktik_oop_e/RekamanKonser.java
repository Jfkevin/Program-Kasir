package uas_praktik_oop_e;

import java.util.Date;
import java.text.SimpleDateFormat;

public class RekamanKonser extends Item {
    private String namaArtis;
    private Date tanggalKonser;
    private String venue;
    private String linkRekaman;

    public RekamanKonser(String nama, float harga, int stok, String namaArtis, Date tanggalKonser, String venue, String linkRekaman) {
        super(nama, harga, stok);
        this.namaArtis = namaArtis;
        this.tanggalKonser = tanggalKonser;
        this.venue = venue;
        this.linkRekaman = linkRekaman;
    }

    public String getDataRekaman() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Nama: %s, Harga: %.2f, Stok: %d, Artis: %s, Tanggal: %s, Venue: %s, Link: %s",
                nama, harga, stok, namaArtis, sdf.format(tanggalKonser), venue, linkRekaman);
    }

    public String getItemType() {
        return "Rekaman Konser";
    }
}