package uas_praktik_oop_e;

public class Pelanggan {
    private int customerId;
    private String nama;
    private String email;
    private String noHp;

    public Pelanggan(int id, String nama, String email, String noHp) {
        this.customerId = id;
        this.nama = nama;
        if (!email.contains("@")) {
            throw new IllegalArgumentException(": Format email tidak valid. Silakan masukkan email dengan format yang benar (contoh: nama@example.com).");
        }
        if (!noHp.startsWith("08") || noHp.length() != 12) {
            throw new IllegalArgumentException("Format nomor telepon tidak valid. Nomor telepon harus dimulai dengan '08' dan memiliki total 12 digit");
        }
        this.email = email;
        this.noHp = noHp;
    }

    public String getDetailPelanggan() {
        return String.format("ID: %d, Nama: %s, Email: %s, No HP: %s", customerId, nama, email, noHp);
    }
}