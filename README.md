# Aplikasi Kalkulator: Automated White Box Testing with Maven
**Aplikasi kalkulator** sederhana yang digunakan untuk melakukan unit testing dengan pendekatan white box testing menggunakan build tools Maven.

**Fitur Kalkulator:**
* Operasi matematika dasar: tambah, kurang, kali, bagi.
* Validasi input:
    * Nilai harus angka (bukan karakter).
    * Angka harus dalam rentang -32.768 hingga 32.767.
    * Operator yang valid: +, -, *, /.
    * Pembagi tidak boleh nol pada operasi pembagian.
* Pesan error yang untuk input yang tidak valid.
  
**Langkah Kerja Kalkulator:**
1. User melakukan operasi kalkulator dengan input dua buah operand
2. User memilih operator yang ingin digunakan untuk proses penghitungan
3. Aplikasi melakukan perhitungan dengan memanggil method komputasi
4. Aplikasi menampilkan hasilnya ke layar

**Menjalankan Testing di Visual Studio Code:**
1. **Prasyarat**: Install Maven dan Visual Studio Code.
2. Clone repository `https://github.com/suciawalia/White-Box-Automation-Testing.git`
3. Buka project dengan Visual Studio Code.
4. Buka terminal dan navigasikan ke directory calculator.
5. Jalankan perintah `mvn test` untuk menjalankan tes.
6. Hasil tes akan ditampilkan pada console.
