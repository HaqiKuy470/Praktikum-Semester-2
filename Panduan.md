# 🚀 Panduan Wajib Git untuk Kolaborasi Tim

> **⚠️ PERHATIAN PENTING SEBELUM MULAI NGODING:**
> Dilarang keras melakukan *coding* atau *commit* langsung di branch `main`! Panduan ini wajib diikuti langkah demi langkah agar file *project* tidak bentrok, saling tertimpa, atau *error*.

---

## 🛠️ TAHAP 1: Pengaturan Awal (Hanya Dilakukan 1x di Laptop)

Buka terminal atau Command Prompt, lalu jalankan perintah ini satu per satu. Pastikan mengganti teks di dalam tanda kutip dengan data akun GitHub **milikmu sendiri**.

```bash
# 1. Atur nama (Ganti dengan namamu)
git config --global user.name "Nama Kamu"

# 2. Atur email (HARUS SAMA dengan email akun GitHub-mu)
git config --global user.email "email.kamu@gmail.com"

# 3. Simpan kredensial agar tidak ditanya password terus-menerus
git config --global credential.helper store

```

---

## 📥 TAHAP 2: Mengambil Project Pertama Kali (Clone)

Lakukan ini jika kamu belum memiliki folder *project* di laptopmu.

1. Buka terminal dan arahkan ke folder tempat kamu ingin menyimpan *project* (misal: `cd Documents`).
2. Lakukan *clone* *repository* (minta *link* ke ketua tim):

```bash
git clone [https://github.com/ArshakaID/Echoes-of-the-Third-Night.git](https://github.com/ArshakaID/Echoes-of-the-Third-Night.git)

```

3. Masuk ke dalam folder *project* yang baru saja diunduh:

```bash
cd NamaProject

```

---

## 💻 TAHAP 3: Alur Kerja Harian (WAJIB DILAKUKAN SETIAP KALI NGODING)

Setiap kali kamu mendapat tugas baru (misal: membuat UI, mendesain level, membuat *script*), ikuti 5 langkah sakti ini secara berurutan:

### 1. Sinkronisasi Kode Terbaru

Pastikan kodemu tidak tertinggal dari teman-teman yang lain.

```bash
git checkout main
git pull origin main

```

### 2. Buat Branch Baru (Ruang Kerja Pribadi)

Gunakan nama *branch* yang mendeskripsikan tugasmu. Jangan gunakan spasi (gunakan tanda strip `-`).

```bash
git checkout nama-branch
git checkout -b nama-branch (buat baru)
list nama Branch
Prolog
Aris-Story 
Bima-Story
Citra-Story
Last-Scene
Asset
Credit
Sound-Effect

```

*(Contoh: `git checkout -b Prolog` atau `git checkout -b Aris-Story`)*

### 3. Ngoding & Save

Silakan buka *text editor* atau *game engine*, kerjakan tugasmu, dan jangan lupa di-*save*. Jika sudah, kembali ke terminal.

### 4. Simpan ke Git (Add & Commit)

```bash
# Tambahkan semua file yang baru diedit
git add .

# Buat pesan commit yang JELAS
git commit -m "feat: menyelesaikan desain halaman menu utama"

```

### 5. Kirim ke GitHub (Push)

Karena kamu berada di *branch* baru, gunakan perintah ini untuk mengirimnya ke server:

```bash
git push -u origin nama-branch

```

*(Catatan: Jika terminal meminta password, **PASTE TOKEN** GitHub milikmu, bukan password akun biasa).*

---

## 🤝 TAHAP 4: Meminta Persetujuan (Pull Request)

Tugasmu di terminal sudah selesai. Sekarang saatnya menggabungkan kodemu ke `main`.

1. Buka halaman *repository* *project* kita di GitHub melalui *browser*.
2. Kamu akan melihat tombol hijau bertuliskan **"Compare & pull request"**. Klik tombol tersebut.
3. Beri keterangan singkat tentang apa yang kamu buat, lalu buat *Pull Request*.
4. Kabari di grup tim: *"Guys, tugasku udah di-push, tolong di-review dan di-merge ya!"*
5. **DILARANG MERGE PULL REQUEST SENDIRI.** Biarkan ketua tim yang mengecek dan menekan tombol *merge*.

```


Catatan: 
Install git lfs
# 1. Inisialisasi Git (Hanya jika folder ini belum ada Git-nya)
git init

# 2. Sekarang jalankan LFS-nya
git lfs install

# 3. Masukkan file yang mau dilacak
git lfs track "*.mp3"
git lfs track "*.wav"
git lfs track "*.psd"
git lfs track "*.png"

# 4. Simpan pengaturannya (Penting!)
git add .gitattributes
git commit -m "chore: track heavy assets with Git LFS"