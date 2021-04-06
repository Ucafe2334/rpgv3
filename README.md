Nama : Umar Abdul Muntaqin
Nim : 1805300
===============================================================
Perubahan :

- penambahan Class baru bernama Game yang menjadi Superclass dari GameEngine dan Game Info; dimana Game menurunkan 2 atribute yaitu objPlayer dan objRuangan
- penambahan Class Baru bernama GameOBj yang menjadi Superclass dari Item, NPC, Pintu, Player dan Ruangan; dimana GameObj menurunkan nama, deskripsi, Scanner, gameInfo, arrItem dan arrAksi
- penambahan Polimorph pada Gameobject yang anntinya bisa digunakan oleh subclassnya

Class GameEngine
- perubahan pada metode aksi, jadi menggunakan switch case