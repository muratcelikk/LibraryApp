# İDE Bağımsız Kurulum:

- JDK 15 kurunuz. İndirme bağlantısı: http://jdk.java.net/java-se-ri/15 (OpenJDK) İşletim sisteminize uygun olanı seçiniz.

- Derleme için ise Maven kurulmalıdır. İndirme bağlantısı: https://maven.apache.org/download.cgi 

  https://maven.apache.org/install.html adresinden kurulum adımlarını inceleyebilirsiniz.

- Maven ortam değişkenlerinde (PATH) kayıtlı olmalıdır. (Başlat->Gelişmiş sistem ayarlarını görüntüle->Gelişmiş-Ortam Değişkenleri-->Kullanıcı ve Sistem Değişkeni eklenmeli)

- MYSQL veritabanı kurulmalı. Docker(compose.yml) veya XAMPP(mysql) programları ile süreci hızlandırabilirsiniz.

  Mysql DB içinde sql klasörü içerisindeki librarydbb.sql import edilmelidir.

  Mysql DB'yi ayağa kaldırmalıyız.(Yoksa program çalışmaz.)

## Kurulum sonrası;

Terminal üzerinde: 
```git
 git clone https://github.com/muratcelikk/LibraryApp.git 
 ```
(Bu komut için "git" kurulmuş olmalıdır.)

İlgili Klasöre ulaşınız.
```git
 cd LibraryApplication  
```
Maven İle derleme yapınız.
```git 
 ./mvnw clean package	 
```
Jar dosyasını çalıştırmak için aşağıdaki komutu giriniz. 
```cmd 
java -jar target/LibraryApplication.jar 
```
##
## Uygulama özellikleri:

- Yazar Tanımı yapılabilmeli (Yazar Adı)
- Yayın Evi Tanımı yapılabilmeli (Yayın Evi Adı)
- Kitap tanıtımı yapılabilmeli (kitap adı, yazar, yayın evi, isbn numarası,)
- Bir Yazar için n tane kitap tanımlanabilmeli
- Bir Yayın evi için n tane kitap tanımlanabilmeli
- Var olan bir kayıt üzerinde değişiklik yapılabilmeli
- Var olan kayıtlar incelebilmeli
- Var olan bir kayıt silinebilmeli

## Proje kod standartlarına uygun geliştirilmiştir:

OOP baz alınarak katmanlı mimari ile oluşturulmuştur.

- Data erişim katmanı 
- Servis Katmanı
- Sunum Katmanı

## Kullanılan Teknolojiler
Spring Boot, Spring Security, Spring Data-JPA/Hibernate, Maven, ThymeLeaf, Html, Css, jquery, bootstrap, Mysql)(Getter-setter yerine Lombok plugini de kullanılabilir).

## Eksiklikler
Search eksik. 
Join table eksik.
Security eksik. 

## Projenin Ekran görüntüleri
<p>
<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2083.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2083.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2084.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2084.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2085.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2085.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2090.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2090.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2086.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2086.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2087.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2087.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2088.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2088.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2089.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApplication/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%2089.jpg" width="200" style="max-width:100%;"></a>


