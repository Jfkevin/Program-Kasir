package uas_praktik_oop_e;

import java.util.*;
import java.text.*;

public class Main {
    private static ArrayList<Item> daftarItem = new ArrayList<>();
    private static ArrayList<Pelanggan> daftarPelanggan = new ArrayList<>();
    private static ArrayList<Order> daftarOrder = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Menu Kasir Festival Musik =====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Lihat Semua Barang");
            System.out.println("3. Daftar Pelanggan Baru");
            System.out.println("4. Buat Pesanan");
            System.out.println("5. Lihat Semua Pesanan");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahBarang(scanner);
                    break;
                case 2:
                    lihatSemuaBarang();
                    break;
                case 3:
                    daftarPelangganBaru(scanner);
                    break;
                case 4:
                    buatPesanan(scanner);
                    break;
                case 5:
                    lihatSemuaPesanan();
                    break;
                case 6:
                    System.out.println("Terima kasih telah menggunakan program kasir.");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
            }
        }
    }

    private static void tambahBarang(Scanner scanner) {
        System.out.println("Menu Tambah Barang:");
        System.out.println("1. Tiket Konser");
        System.out.println("2. Merchandise");
        System.out.println("3. Rekaman Konser");
        System.out.println("4. Kembali ke Menu Utama");
        System.out.print("Pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        switch (pilihan) {
            case 1:
                System.out.print("Nama Tiket: ");
                String namaTiket = scanner.nextLine();
                System.out.print("Harga Tiket: ");
                float hargaTiket = scanner.nextFloat();
                System.out.print("Stok Tiket: ");
                int stokTiket = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nama Artis: ");
                String namaArtis = scanner.nextLine();
                System.out.print("Tanggal Konser (dd/MM/yyyy): ");
                String tanggalKonserStr = scanner.nextLine();
                System.out.print("Venue: ");
                String venue = scanner.nextLine();
                try {
                    Date tanggalKonser = new SimpleDateFormat("dd/MM/yyyy").parse(tanggalKonserStr);
                    daftarItem.add(new TiketKonser(namaTiket, hargaTiket, stokTiket, namaArtis, tanggalKonser, venue));
                    System.out.println("Tiket konser berhasil ditambahkan.");
                } catch (ParseException e) {
                    System.out.println("Format tanggal tidak valid.");
                }
                break;
            case 2:
                System.out.print("Nama Barang: ");
                String namaMerch = scanner.nextLine();
                System.out.print("Harga Barang: ");
                float hargaMerch = scanner.nextFloat();
                System.out.print("Stok Barang: ");
                int stokMerch = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nama Merek: ");
                String namaMerk = scanner.nextLine();
                System.out.print("Kategori Barang: ");
                String kategori = scanner.nextLine();
                daftarItem.add(new Merchandise(namaMerch, hargaMerch, stokMerch, namaMerk, kategori));
                System.out.println("Merchandise berhasil ditambahkan.");
                break;
            case 3:
                System.out.print("Nama Rekaman: ");
                String namaRekaman = scanner.nextLine();
                System.out.print("Harga Rekaman: ");
                float hargaRekaman = scanner.nextFloat();
                System.out.print("Stok Rekaman: ");
                int stokRekaman = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Nama Artis: ");
                String namaArtisRek = scanner.nextLine();
                System.out.print("Tanggal Konser (dd/MM/yyyy): ");
                String tanggalKonserRekStr = scanner.nextLine();
                System.out.print("Venue: ");
                String venueRek = scanner.nextLine();
                System.out.print("Link Rekaman: ");
                String linkRekaman = scanner.nextLine();
                try {
                    Date tanggalKonserRek = new SimpleDateFormat("dd/MM/yyyy").parse(tanggalKonserRekStr);
                    daftarItem.add(new RekamanKonser(namaRekaman, hargaRekaman, stokRekaman, namaArtisRek, tanggalKonserRek, venueRek, linkRekaman));
                    System.out.println("Rekaman konser berhasil ditambahkan.");
                } catch (ParseException e) {
                    System.out.println("Format tanggal tidak valid.");
                }
                break;
            case 4:
                return;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih opsi yang sesuai.");
        }
    }

    private static void lihatSemuaBarang() {
        System.out.println("Menu Lihat Semua Barang:");
        for (Item item : daftarItem) {
            if (item instanceof TiketKonser) {
                System.out.println("Tiket Konser: " + ((TiketKonser) item).getDataTiket());
            } else if (item instanceof Merchandise) {
                System.out.println("Merchandise: " + ((Merchandise) item).getDataMerch());
            } else if (item instanceof RekamanKonser) {
                System.out.println("Rekaman Konser: " + ((RekamanKonser) item).getDataRekaman());
            }
        }
        System.out.println("Press any key to continue ...");
        new Scanner(System.in).nextLine();
    }

    private static void daftarPelangganBaru(Scanner scanner) {
        System.out.print("Nama Pelanggan: ");
        String nama = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Nomor Telepon: ");
        String noHp = scanner.nextLine();
        try {
            Pelanggan pelanggan = new Pelanggan(daftarPelanggan.size() + 1, nama, email, noHp);
            daftarPelanggan.add(pelanggan);
            System.out.println("Pelanggan berhasil didaftarkan.");
        } catch (IllegalArgumentException e) {
            if (e instanceof EmailFormatException) {
                System.out.println("Error: Format email tidak valid. Silakan masukkan email dengan format yang benar (contoh: nama@example.com).");
            } else if (e instanceof PhoneNumberFormatException) {
                System.out.println("Error: Format nomor telepon tidak valid. Nomor telepon harus dimulai dengan \"08\" dan memiliki total 12 digit.");
            } else {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void buatPesanan(Scanner scanner) {
        System.out.print("ID Pelanggan: ");
        int customerId = scanner.nextInt();
        Pelanggan pelanggan = null;
        for (Pelanggan p : daftarPelanggan) {
            if (p.getDetailPelanggan().contains("ID: " + customerId + ",")) {
                pelanggan = p;
                break;
            }
        }
        if (pelanggan == null) {
            System.out.println("Error: Pelanggan dengan ID " + customerId + " tidak ditemukan dalam database. Silakan daftarkan pelanggan terlebih dahulu.");
            return;
        }

        System.out.print("ID Barang: ");
        int itemId = scanner.nextInt();
        Item item = null;
        for (Item i : daftarItem) {
            if (i.itemId.equals(Integer.toString(itemId))) {
                item = i;
                break;
            }
        }
        if (item == null) {
            System.out.println("Error: Barang dengan ID " + itemId + " tidak ditemukan.");
            return;
        }

        System.out.print("Jumlah Barang: ");
        int qty = scanner.nextInt();
        scanner.nextLine();

        if (item.getStok() < qty) {
            System.out.println("Error: Maaf, stok " + item.getNama() + " habis. Silakan pesan barang lain atau coba lagi nanti.");
            return;
        }

        double totalHarga = item.hitungTotalDariJumlah(qty);
        Order order = new Order(daftarOrder.size() + 1, pelanggan, item, qty, totalHarga);
        item.kurangiStok(qty);
        daftarOrder.add(order);
        System.out.println("Pesanan berhasil dibuat.");
    }

    private static void lihatSemuaPesanan() {
        System.out.println("Daftar Semua Pesanan:");
        for (Order order : daftarOrder) {
            System.out.println(order.printDetailOrder());
        }
        System.out.println("Press any key to continue ...");
        new Scanner(System.in).nextLine();
    }
}


//Selamat siang ka, saya atas nama Farrelius Kevin dengan NIM 00000081783, semoga kaka membaca komen ini.
//Saya mohon maaf atas keterbatasan dan kelalaian saya pada ujian UAS OOP lab ini karena
//Saya lupa kalau nama class harus berawalan dengan nama seperti Kevin_Main
//Saya baru menyadarinya saat waktu tersisa 20 menit, dan tidak keburu jika mengubah semuanya.
//Saya sempat mencoba untuk mengubah semuanya namun alhasil malah menjadi error dan program tidak bisa dijalankan
//Sehingga saya membuat keputusan untuk melakukan undo dan tidak mengubah penamaan classnya
//Semoga kaka bisa membantu saya, atas kelalaian saya dalam penamaan class
//Namun saya bisa memastikan bahwa ini saya benar-benar mengerjakannya sendiri
//Terikasih atas perhatiannya kaka, sekali lagi mohon maaf.