
# İDE Bağımsız Kurulum:

- JDK 15 kurunuz. İndirme bağlantısı: http://jdk.java.net/java-se-ri/15 (OpenJDK) İşletim sisteminize uygun olanı seçiniz.

- Derleme için ise Maven kurulmalıdır. İndirme bağlantısı: https://maven.apache.org/download.cgi 

  https://maven.apache.org/install.html adresinden kurulum adımlarını inceleyebilirsiniz.

- Maven ortam değişkenlerinde (PATH) kayıtlı olmalıdır.

- MYSQL veritabanı kurulmalı. Docker(compose.yml) veya XAMPP(mysql) programları ile süreci hızlandırabilirsiniz.

  Mysql DB içinde sql klasörü içerisindeki libraryappdb.sql import edilmelidir.

  Mysql DB'yi ayağa kaldırmalıyız.(Yoksa program çalışmaz.)

## Kurulum sonrası;

Terminal üzerinde: 
```git
 git clone https://github.com/muratcelikk/LibraryApp.git 
 ```
(Bu komut için "git" kurulmuş olmalıdır.)

İlgili Klasöre ulaşınız.
```git
 cd LibraryApp  
```
Maven İle derleme yapınız.
```git 
 ./mvnw clean package	 
```
Jar dosyasını çalıştırmak için aşağıdaki komutu giriniz. 
```cmd 
java -jar target/LibraryApp.jar 
```
##
## Uygulama özellikleri:

- Yazar Tanımı yapılabilmeli (Yazar Adı, Açıklama)
- Yayın Evi Tanımı yapılabilmeli (Yayın Evi Adı, Açıklama)
- Kitap tanıtımı yapılabilmeli (kitap adı, yazar, yayın evi, isbn numarası vs.)
- Bir Yazar için n tane kitap tanımlanabilmeli
- Bir Yayın evi için n tane kitap tanımlanabilmeli
- Kitap adı, Seri adı, Yazar ya da ISBN ile arama yapılabilmeli
- Var olan bir kayıt üzerinde değişiklik yapılabilmeli
- Var olan kayıtlar incelebilmeli
- Var olan bir kayıt silinebilmeli

## Proje kod standartlarına uygun geliştirilmiştir:

OOP baz alınarak katmanlı mimari ile oluşturulmuştur.

- Data erişim katmanı 
- Servis Katmanı
- Sunum Katmanı

## Kullanılan Teknolojiler
Spring Boot, Spring Security, Spring Data-JPA, Maven, ThymeLeaf, Html, Css, jquery, bootstrap, Mysql, Lombok.

## Eksiklikler
Search (Kitap adı, Seri adı, Yazar vs. arama), 
Join table, 
Security.. 

## Projenin Ekran görüntüleri
<p>
<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20130.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20130.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20131.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20131.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20132.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20132.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20133.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20133.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20134.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20134.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20135.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20135.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20136.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20136.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20137.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20137.jpg" width="200" style="max-width:100%;"></a>

<a href="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20138.jpg" target="_blank">
<img src="https://github.com/muratcelikk/LibraryApp/blob/main/img/Ekran%20G%C3%B6r%C3%BCnt%C3%BCs%C3%BC%20138.jpg" width="200" style="max-width:100%;"></a>

</p>

