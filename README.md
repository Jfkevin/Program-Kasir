# 💻 Program Kasir Festival Musik (OOP - Java)

<img width="836" height="820" alt="image" src="https://github.com/user-attachments/assets/52b3037c-1f3b-46ea-b006-f1035309e99e" />

---

## 📘 Deskripsi Proyek

Program ini merupakan aplikasi **Kasir Festival Musik** yang dibangun menggunakan bahasa pemrograman **Java** dengan konsep **Object Oriented Programming (OOP)**.  
Aplikasi ini digunakan untuk mengelola penjualan barang-barang di festival musik, termasuk **tiket konser**, **merchandise**, dan **rekaman konser**.

Semua fitur dikembangkan dengan prinsip OOP seperti **class**, **inheritance**, **encapsulation**, **polymorphism**, dan **exception handling**.

---

## 🧠 Konsep OOP yang Digunakan

| Konsep OOP        | Implementasi                                                                 |
|-------------------|------------------------------------------------------------------------------|
| **Encapsulation** | Penggunaan atribut `private` dan getter/setter di class `Item`, `Customer`   |
| **Inheritance**   | Class `Ticket`, `Merchandise`, `Recording` mewarisi class `Item`             |
| **Polymorphism**  | Override method `displayInfo()` di subclass                                  |
| **Abstraction**   | Class `Item` bersifat abstract                                               |
| **Exception Handling** | Validasi email & nomor telepon menggunakan **Custom Exception**         |

---

## ⚙️ Fitur-Fitur Utama

### 🛒 1. Pendaftaran Barang yang Dijual  
- Mendaftarkan barang seperti:
  - **Tiket Konser**
  - **Merchandise**
  - **Rekaman Konser**
- Barang disimpan ke dalam satu `ArrayList<Item>`.

### 📋 2. Melihat Semua Barang yang Dijual  
- Menampilkan daftar semua barang:
  - Nama barang
  - Harga
  - Kuantitas
  - Kategori

### 👤 3. Pendaftaran Pelanggan  
- Mendaftarkan pelanggan dengan data:
  - Nama
  - Email
  - Nomor Telepon  
- Dilengkapi validasi:
  - Email harus mengandung karakter `@`
  - Nomor telepon harus **12 digit** dan **dimulai dengan “08”**  
- Jika invalid → muncul **Custom Exception**.

### 🧾 4. Pemesanan Barang  
- Pelanggan dapat memesan barang.  
- Syarat:
  - Pelanggan dan barang harus terdaftar.  
- Sistem mencatat:
  - Barang yang dipesan
  - Jumlah
  - Total harga

### 📦 5. Melihat Semua Pesanan  
- Menampilkan semua transaksi pemesanan yang telah dilakukan.

### ⚠️ 6. Exception Handling  
- Menangani kesalahan input data pelanggan (email & telepon).  
- Menggunakan **Custom Exception**:
  - `InvalidEmailException`
  - `InvalidPhoneNumberException`

---

## 🧰 Tools / Software yang Digunakan

| 🧩 Komponen | 🛠️ Keterangan |
|-------------|----------------|
| 💻 **Bahasa Pemrograman** | Java |
| ☕ **Java JDK** | Versi 17 atau lebih baru |
| 🧠 **Paradigma** | Object Oriented Programming (OOP) |
| 🧰 **IDE** | IntelliJ IDEA / VS Code / NetBeans |


---

## 🧑‍💻 Pembuat
**Farrelius Kevin**  

---

## 📚 Mata Kuliah

**Pemrograman Berorientasi Objek (OOP) – IF 433 - Semester 4**

**Program Studi Informatika**

**Fakultas Teknik dan Informatika**

**Universitas Multimedia Nusantara (UMN)**

---
