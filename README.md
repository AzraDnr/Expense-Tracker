## 🛠️ Kurulum ve Çalıştırma

### 1. MySQL Bağlantı Ayarı (Zorunlu)
Projenin veritabanına bağlanabilmesi için her kullanıcının kendi yerel şifresini girmesi gerekir:

- `src/ExpenseTracker/SqlConnection.java` dosyasını açın.
- `private final String PASSWORD = "YOUR_PASSWORD";` satırındaki `YOUR_PASSWORD` kısmını kendi MySQL root şifrenizle değiştirin.
- Eğer şifreniz yoksa `""` (boş tırnak) bırakın.

### 2. "Access Denied" Hatası Çözümü
Eğer şifreniz doğru olduğu halde bağlantı hatası alıyorsanız, MySQL terminalinde (veya Workbench üzerinde) şu komutu çalıştırarak yetkilendirme yöntemini güncelleyin:

Not: YOUR_PASSWORD kısmına kendi şifrenizi yazınız.

```sql
ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'YOUR_PASSWORD';
FLUSH PRIVILEGES;
