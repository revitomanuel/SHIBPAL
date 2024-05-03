# Tugas 1 PBO - Program Pemesanan Makanan Secara Online

Anggota:

Jeaconia Elfrida Tiono (2305551094)

Revito Manuel Hasudungan Manik (2305551130)

---

SHIBPAL merupakan program pemesanan secara online yang menggunakan konsep pemrograman berorientasi objek atau OOP (Object Oriented Programming).

Program ini dimulai dengan memilih tipe user, apakah sebagai admin atau customer. Admin pada program ini dapat melakukan beberapa hal, seperti melihat restaurant, menambah restaurant, dan menghapus restaurant. Sedangkan customer dapat membuat pesanan pada satu restaurant. 

Saat memilih masuk sebagai Admin, program akan diawali dengan memasukkan username dan password Admin yang telah diinisiasikan. Login dengan Admin dapat memasukkan username: "Seungcheol" dan dengan password: "password". Selanjutnya, sistem akan memeriksa apakah username dan password benar. Jika benar, maka akan diperlihatkan menu yang dapat dilakukan oleh Admin.

Saat memilih masuk sebagai Customer, program akan diawali dengan melakukan Sign Up terlebih dahulu dengan memasukkan username dan password. Dan setelah itu dapat melakukan Login. Ketika login berhasil, maka dapat membuat pesanan. Program akan menampilkan beberapa restaurant yang dapat dipilih oleh customer ketika ingin mengorder makanan. Setiap restaurant memiliki menu makanan dan minuman beserta harganya. Selanjutnya, customer akan memilih menu makanan atau minuman yang ingin dipesan dan menginputkan kuantitas setiap menunya. Setelah selesai membuat pesanan, customer dapat melihat detail order yang berisikan identitas restaurant berupa nama restaurant, identitas menu berupa nama menunya, kuantitas setiap menu yang dipesan, jarak lokasi antar, dan total harga.


==TAMPILAN PROGRAM==

1. User Type
   
   ![Screenshot 2024-05-03 151031](https://github.com/revitomanuel/SHIBPAL/assets/146865963/be79acb9-d266-45a0-a448-1c64d4ddb731)

Gambar di atas merupakan tampilan awal saat Program SHIBPAL dijalankan. Terdapat dua pilihan sebagai untuk memilih tipe user, yakni sebagai admin atau customer.

2. Masuk sebagai Admin

   ![Screenshot 2024-05-03 151441](https://github.com/revitomanuel/SHIBPAL/assets/146865963/b99cb89e-6428-475e-99a8-be3c39f9c484)

Gambar di atas merupakan tampilan saat masuk sebagai Admin. Selanjutnya user akan diminta untuk memasukkan username dan password yang telah diinialisasikan pada kode program. Selanjutnya, program akan memeriksan kesesuaian username dan password yang baru saja diinputkan dengan yang ada di dalam kode program. Gambar di atas juga merupakan tampilan saat login admin berhasil.

   ![Screenshot 2024-05-03 152831](https://github.com/revitomanuel/SHIBPAL/assets/146865963/918318e9-81a6-4655-a29b-c851c2899c1e)

Gambar di atas merupakan tampilan saat gagal melakukan login sebagai admin. Selama belum berhasil, program akan melakukan perulangan dengan meminta user untuk menginputkan username dan password sampai keduanya benar. 

3. Menu Admin

   ![Screenshot 2024-05-03 154150](https://github.com/revitomanuel/SHIBPAL/assets/146865963/9f117ae0-891f-437b-ad1f-c71c31eb5386)

Gambar di atas merupakan tampilan menu admin, di mana terdapat beberapa pilihan yang dapat dilakukan oleh seorang admin.

   ![Screenshot 2024-05-03 154338](https://github.com/revitomanuel/SHIBPAL/assets/146865963/66a5c005-5ea8-47a6-bc39-a3718d715d39)

Gambar di atas merupakan tampilan saat admin memilih opsi 1, yakni melihat daftar restaurant.

   ![Screenshot 2024-05-03 155433](https://github.com/revitomanuel/SHIBPAL/assets/146865963/daab2bb3-b285-4f39-bda3-5b3ec51cb3d7)

Gambar di atas merupakan tampilan saat admin memilih opsi 2, yakni menambah restaurant. Selanjutnya, admin akan diminta untuk mengisikan informasi terkait restaurant seperti nama restaurant, alamat restaurant, dan menu yang ada beserta harganya.

   ![Screenshot 2024-05-03 155816](https://github.com/revitomanuel/SHIBPAL/assets/146865963/770c8fc6-81fd-4fe2-9b85-6f3285b45378)

Gambar di atas merupakan tampilan saat admin memilih opsi 3, yakni menghapus restaurant dengan menginputkan nama restaurant tersebut.

4. Masuk sebgai Customer

   ![Screenshot 2024-05-03 160347](https://github.com/revitomanuel/SHIBPAL/assets/146865963/5d11f381-8b26-4d7a-95e4-e8f4017ca2fc)

Gambar di atas merupakan tampilan saat masuk sebagai Customer. Pada proses ini, user dapat login sebagai customer jika sudah melakukan sign up terlebih dahulu. 

   ![Screenshot 2024-05-03 161208](https://github.com/revitomanuel/SHIBPAL/assets/146865963/bac94642-38d3-4741-b5f7-c81c18e8625b)

Gambar di atas merupakan tampilan saat user memilih opsi 2, yakni sign up. Pada saat sign up, user diminta untuk menginputkan username dan password. Ketika sign up berhasil dilakukan, user akan diminta untuk melakukan login dengan username dan password yang telah didaftarkan. Gambar di atas juga merupakan tampilan saat sign up customer berhasil.

   ![Screenshot 2024-05-03 195644](https://github.com/revitomanuel/SHIBPAL/assets/146865963/c07c471d-8af1-4ff7-a2a1-9d0a9c4875b4)

Gambar di atas merupakan tampilan saat user diminta untuk melakukan login setelah melakukan sign up. Sistem akan memeriksan kesesuaian username dan password yang baru saja diinputkan dengan yang telah didaftarkan. Ketika login gagal dilakukan, maka sistem akan terus meminta username dan password sampai user menginputnya dengan benar. 

5. Menu Customer
   
   ![Screenshot 2024-05-03 200359](https://github.com/revitomanuel/SHIBPAL/assets/146865963/7da82ec2-32ec-44f6-a630-cad0586537a9)

Gambar di atas merupakan tampilan menu customer, di mana terdapat beberapa pilihan yang dapat dilakukan oleh customer pada program ini.

   ![Screenshot 2024-05-03 200755](https://github.com/revitomanuel/SHIBPAL/assets/146865963/fec7a4bf-2d8e-491f-8c15-f1e87316970f)

Gambar di atas merupakan tampilan saat customer memilih opsi 1, yakni membuat pesanan. Sistem akan menampilkan data restaurant terlebih dahulu dan customer dapat memilihnya dengan cara menginputkan nama restaurant. 

   ![Screenshot 2024-05-03 201141](https://github.com/revitomanuel/SHIBPAL/assets/146865963/2f25f1c9-7b09-4599-ba6a-e95721ed54cd)

Gambar di atas merupakan tampilan saat customer telah memilih restaurant. Sistem akan menampilkan daftar menu yang tersedia pada restaurant tersebut beserta harga per menunya. 

   ![Screenshot 2024-05-03 201643](https://github.com/revitomanuel/SHIBPAL/assets/146865963/b90f2c65-3f0a-4be1-b279-7c9a52931c9c)
   ![Screenshot 2024-05-03 201657](https://github.com/revitomanuel/SHIBPAL/assets/146865963/e16db048-a22a-4002-b0b0-e4409a0937bf)

Kedua gambar di atas merupakan tampilan saat customer diminta untuk menginputkan menu yang ingin dipesan beserta kuantitas setiap menunya. Setiap selesai memesan satu menu, program akan menanyakan customer apakah ingin ada pesanan tambahana atau tidak. Jika ada, maka program akan kembali menampilkan menu makanan beserta harganya, namun jika tidak, program akan meminta customer untuk menginputkan jarak (dalam km).

   ![image](https://github.com/revitomanuel/SHIBPAL/assets/146865963/1ccfe2dc-6083-4dd1-9b04-6b4011082dfc)

Gambar di atas merupakan tampilan saat customer telah selesai melakukan pesanan. Sistem akan menampilkan kembali menu customer, di mana customer dapat melihat detail pesanan yang baru saja dilakukan dengan mimilih opsi 2. Setelah itu, detail pesanan akan ditampilkan. Sistem akan menanyakan apakah customer ingin melakukan pesanan lagi atau tidak. Jika ya, maka menu customer akan ditampilkan lagi.

   ![image](https://github.com/revitomanuel/SHIBPAL/assets/146865963/7b0b00eb-0e65-4818-8407-bfe8a2c57530)

Gambar di atas merupakan tampilan ketika customer sudah tidak ingin melakukan pesanan lagi. 










