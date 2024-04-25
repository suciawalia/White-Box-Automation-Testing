
# Aplikasi Kalkulator: Automated White Box Testing with Maven

**Aplikasi Kalkulator** ini merupakan sebuah program sederhana yang memungkinkan pengguna untuk melakukan operasi matematika dasar, seperti penjumlahan, pengurangan, perkalian, dan pembagian. Aplikasi ini dikembangkan dengan menggunakan Java dan telah dipecah menjadi beberapa modul yang terisolasi untuk memudahkan pengembangan dan pemeliharaan.
## Tentang Aplikasi Kalkulator

### Fitur
- **Operasi Kalkulator**: Pengguna dapat melakukan operasi kalkulator dengan memasukkan dua operand dan memilih operator yang diinginkan.
- **Validasi**: Sebelum melakukan perhitungan, aplikasi akan melakukan validasi terhadap input pengguna untuk memastikan bahwa operand dan operator yang dimasukkan sesuai dengan aturan yang ditentukan.
- **Penghitungan**: Setelah validasi berhasil, aplikasi akan melakukan perhitungan sesuai dengan operator yang dipilih.
- **Tampilan Hasil**: Hasil perhitungan akan ditampilkan ke layar untuk dilihat oleh pengguna.


### Class
- **MainApp**: Class ini bertanggung jawab untuk menangani interaksi dengan pengguna dan menjalankan proses kalkulator. Pengguna akan memasukkan input operand dan operator melalui modul MainApp, dan hasil perhitungan akan ditampilkan kembali kepada pengguna.
- **Calculator**: Class ini berisi logika perhitungan matematika untuk operasi penjumlahan, pengurangan, perkalian, dan pembagian yang terdapat pada modul compute. Setiap operasi memiliki method tersendiri untuk melakukan perhitungan.
- **Validation**: Class ini bertanggung jawab untuk melakukan validasi terhadap input pengguna sebelum proses perhitungan dilakukan. Validasi dilakukan secara berurutan sesuai dengan aturan yang telah ditetapkan, dan jika ada kesalahan, pesan error akan ditampilkan kepada pengguna. Terdapat dua modul yaitu integerValidation untuk melakukan validasi jika nilai yang diinputkan bukan integer. Selain itu terdapat modul validate untuk melakukan validasi jika operator yang diinputkan tidak sesuai dengan ketentuan, nilai operand 1 dan operand 2 berada di luar rentang yang telah ditentukan, dan validasi penyebut tidak boleh 0 untuk operasi pembagian.
- **MainAppTest**: Class ini meripakan class pengujian (unit test) untuk menguji fungsi-fungsi yang ada di dalam class MainApp
- **CalculatorTest**: Class ini merupakan class pengujian (unit test) untuk menguji operasi matematika yang ada pada class Calculator.
- **ValidationTest**: Class ini merupakan class pengujian (unit test) untuk menguji validasi input yang ada pada class Validation.

## Test Case
Pengujian-pengujian yang dilakukan pada modul-modul dibawah sesuai dengan Test Case yang telah dibuat. Di antaranya yaitu:
1. **MainApp**
   - Input dua buah operand, memilih operator, dan menampilkan hasilnya ke layar
   - Input operand pertama bukan bilangan bulat (data float)
   - Input operand pertama bukan bilangan bulat (karakter)
   - Input operand kedua bukan bilangan bulat (data float)
   - Input operand kedua bukan bilangan bulat (karakter)
   - Input operator tidak valid
   - Input operand tidak valid (diluar range -32,768 hingga 32,767)
   - Input operand tidak valid (hasil operasi tidak terdefinisi)
2. **Compute**
   - Operasi penjumlahan dua bilangan
   - Operasi pengurangan dua bilangan
   - Operasi perkalian dua bilangan
   - Operasi pembagian dua bilangan
   - Operasi dua bilangan dimana operator yang dimasukkan invalid (bukan berupa +, -, *, atau /)
3. **integerValidation**
   - Validasi angka yang diinputkan berupa float yaitu 4,5
   - Validasi nilai yang diinputkan berupa char yaitu "s"
4. **validate**
   - Validasi angka positif yang diinputkan berada diluar rentang -32768 hingga 32767
   - Validasi angka negatif yang diinputkan berada diluar rentang -32768 hingga 32767
   - Validasi operator yang diinputkan selain "+", "-", "*", "/" yaitu "x"
   - Validasi operand2 yang diinputkan adalah 0 ketika input operator pembagi(/)
   
## Directory Tree Project
```
.
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── calculator
│   │               ├── Calculator.java
│   │               ├── MainApp.java
│   │               └── Validation.java
│   └── test
│       └── java
│           └── com
│               ├── calculator
│               ├── CalculatorTest.java
│               ├── MainAppTest.java
│               └── ValidationTest.java
├── target
│   ├── classes/com/calculator
│   │   └── ....
│   ├── generated-sources
│   ├── generated-test-sources
│   ├── maven-status/maven-compiler-plugin
│   │   ├── compile/default-compile
│   │   │   └── ...
│   │   └── testCompile/default-testCompile
│   │       └── ...
│   ├── site
│   │   ├── css
│   │   │   └── ...
│   │   ├── images
│   │   │   └── ...
│   │   ├── surefire-report.html
│   │   └── ...
│   ├── surefire-reports
│   └── test-classes/com/calculator
│       └── ...
└── pom.xml
```
## Prerequisites

- Install java
- Install maven
- Install Visual Studio Code
- Install Extension Pack for java

## Menjalankan Aplikasi

Clone the project

```bash
  git clone https://github.com/suciawalia/White-Box-Automation-Testing.git
```

Compile and run app
```bash
  mvn spring-boot:run
```

## 
## Menjalankan Tests

To run tests, run the following command

```bash
   mvn test
```

## Generate Report by tools

Here is the command to generate a report using maven

```bash
  mvn site
```


## Hasil Tests
### Root file test report
```
..\target\site\surefire-report.html
```
### Contoh hasil test report dan cara membacanya
**1. Summary**

[![Screenshot-2024-04-20-211127.png](https://i.postimg.cc/rwqWR2jM/Screenshot-2024-04-20-211127.png)](https://postimg.cc/4mFnjMjS)

- Jumlah test case yang dieksekusi (Tests) adalah 9
- Jumlah error pada test case (Errors) adalah 0
- Jumlah test case yang fail (Failures) adalah 1
- Jumlah test case yang dilewati (Skipped) adalah 0
- Success Rate nya adalah 88.9%
- Waktu eksekusi test nya (Time) nya adalah 0.466s

**2. Package List**

[![Screenshot-2024-04-20-211837.png](https://i.postimg.cc/DwbZzjkn/Screenshot-2024-04-20-211837.png)](https://postimg.cc/w1gHfkjG)

- Package yang di test adalah package "com.calculator"
- Berdasarkan gambar diatas, test report menampilkan tiga class test yang dijalankan pada proses ini, yaitu AppTest, CalculatorTest, dan ValidationTest.
- Summary dari masing-masing class test akan ditampilkan. Summary ini mencakup jumlah test case yang dieksekusi, jumlah error, failure, skipped, dan juga success rate serta time.

**3. Test Result CalculatorTest**

[![Screenshot-2024-04-20-212505.png](https://i.postimg.cc/ZRynWwyr/Screenshot-2024-04-20-212505.png)](https://postimg.cc/phRR7YCT)

- Test report menunjukkan bahwa terdapat dua test case yang dieksekusi pada Class CalculatorTest, yaitu 'testAddition' dan 'testSubstraction'.
- Test report menunjukkan bahwa tidak ada failures dari test class ini.

**4. Test Result ValidationTest**

[![Screenshot-2024-04-20-212858.png](https://i.postimg.cc/8Pf41G55/Screenshot-2024-04-20-212858.png)](https://postimg.cc/TpGg9ZnM)

- Test report menunjukkan bahwa ada 6 test case yang dieksekusi pada Class ValidationTest.
- Terdapat 1 test case yang fail, yaitu 'testFloatInputValidation', ditandai dengan adanya keterangan ' - [Detail] ' di sebelah test case name, dan akan menampilkan detail failure dari test case tersebut.

**5. Failure Details**

[![Screenshot-2024-04-20-213529.png](https://i.postimg.cc/xdm2nFZH/Screenshot-2024-04-20-213529.png)](https://postimg.cc/nsn51Tpc)

- Failure details menunjukkan test case yang fail beserta keterangan penyebab fail-nya.
## Authors

- 211524001 | Adinda Faayza Malika [@adindafaayza](https://github.com/adindafaayza)
- 211524003 | Annisa Dinda Gantini [@annisaadg](https://github.com/annisaadg)
- 211524027 | Suci Awalia Gardara [@suciawalia](https://github.com/suciawalia)
