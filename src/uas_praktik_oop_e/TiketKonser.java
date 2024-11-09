package uas_praktik_oop_e;

import java.util.Date;
import java.text.SimpleDateFormat;

public class TiketKonser extends Item {
    private String namaArtis;
    private Date tanggalKonser;
    private String venue;

    public TiketKonser(String nama, float harga, int stok, String namaArtis, Date tanggalKonser, String venue) {
        super(nama, harga, stok);
        this.namaArtis = namaArtis;
        this.tanggalKonser = tanggalKonser;
        this.venue = venue;
    }

    public String getDataTiket() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("Nama: %s, Harga: %.2f, Stok: %d, Artis: %s, Tanggal: %s, Venue: %s",
                nama, harga, stok, namaArtis, sdf.format(tanggalKonser), venue);
    }

    public String getItemType() {
        return "Tiket Konser";
    }
}
