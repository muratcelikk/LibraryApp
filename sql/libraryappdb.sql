-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 21 Kas 2020, 22:16:14
-- Sunucu sürümü: 10.4.14-MariaDB
-- PHP Sürümü: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `libraryappdb`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author`
--

CREATE TABLE `author` (
  `id` bigint(20) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `surname` varchar(20) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `author`
--

INSERT INTO `author` (`id`, `explanation`, `name`, `surname`) VALUES
(1, 'm', 'm1', 'm'),
(2, 'm', 'Resat Nuri', 'guntekin'),
(3, 'sıkı yazar', 'Oğuz ', 'Atay');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `author_book`
--

CREATE TABLE `author_book` (
  `author_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book`
--

CREATE TABLE `book` (
  `id` bigint(20) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `isbn_no` varchar(13) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `serial_name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL,
  `sub_name` varchar(150) COLLATE utf8_turkish_ci DEFAULT NULL,
  `publisher_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `book`
--

INSERT INTO `book` (`id`, `explanation`, `isbn_no`, `name`, `serial_name`, `sub_name`, `publisher_id`) VALUES
(6, 'alegorik roman', '', '1984 ', '9789750718533', 'Bin Dokuz Yüz Seksen Dört', NULL),
(10, 'ee', '9789754700114', 'Tutunamayanlar', '', '', NULL);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `book_author`
--

CREATE TABLE `book_author` (
  `book_id` bigint(20) NOT NULL,
  `author_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(3),
(3);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `publisher`
--

CREATE TABLE `publisher` (
  `id` bigint(20) NOT NULL,
  `explanation` varchar(500) COLLATE utf8_turkish_ci DEFAULT NULL,
  `name` varchar(50) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `publisher`
--

INSERT INTO `publisher` (`id`, `explanation`, `name`) VALUES
(1, 'Güzel kitaplar var.', 'Can'),
(2, 'yeni kitaplar gelmis', 'Pandora'),
(3, 'ii', 'İletişim');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `publisher_book`
--

CREATE TABLE `publisher_book` (
  `publisher_id` bigint(20) NOT NULL,
  `book_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `role`
--

CREATE TABLE `role` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `role`
--

INSERT INTO `role` (`id`, `name`) VALUES
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `first_name` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `last_name` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `user`
--

INSERT INTO `user` (`id`, `email`, `first_name`, `last_name`, `password`) VALUES
(1, 'm', 'm', 'm', '$2a$10$VLZJWHUQsMovjbn/.2HAveakzB08HPb3FhtDEpYFnQwtvGfHCfsoi');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `users_roles`
--

CREATE TABLE `users_roles` (
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `users_roles`
--

INSERT INTO `users_roles` (`user_id`, `role_id`) VALUES
(1, 2);

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `author`
--
ALTER TABLE `author`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `author_book`
--
ALTER TABLE `author_book`
  ADD KEY `FKn8665s8lv781v4eojs8jo3jao` (`book_id`),
  ADD KEY `FKg7j6ud9d32ll232o9mgo90s57` (`author_id`);

--
-- Tablo için indeksler `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKgtvt7p649s4x80y6f4842pnfq` (`publisher_id`);

--
-- Tablo için indeksler `book_author`
--
ALTER TABLE `book_author`
  ADD KEY `FKbjqhp85wjv8vpr0beygh6jsgo` (`author_id`),
  ADD KEY `FKhwgu59n9o80xv75plf9ggj7xn` (`book_id`);

--
-- Tablo için indeksler `publisher`
--
ALTER TABLE `publisher`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD UNIQUE KEY `UK_9lulq18oro7sv3prju3tox5c3` (`book_id`),
  ADD KEY `FK6buft2dj1d6ig7hekbx7c0ysp` (`publisher_id`);

--
-- Tablo için indeksler `role`
--
ALTER TABLE `role`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `UKob8kqyqqgmefl0aco34akdtpe` (`email`);

--
-- Tablo için indeksler `users_roles`
--
ALTER TABLE `users_roles`
  ADD KEY `FKt4v0rrweyk393bdgt107vdx0x` (`role_id`),
  ADD KEY `FKgd3iendaoyh04b95ykqise6qh` (`user_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `author`
--
ALTER TABLE `author`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Tablo için AUTO_INCREMENT değeri `book`
--
ALTER TABLE `book`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- Tablo için AUTO_INCREMENT değeri `publisher`
--
ALTER TABLE `publisher`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Dökümü yapılmış tablolar için kısıtlamalar
--

--
-- Tablo kısıtlamaları `author_book`
--
ALTER TABLE `author_book`
  ADD CONSTRAINT `FKg7j6ud9d32ll232o9mgo90s57` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `FKn8665s8lv781v4eojs8jo3jao` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Tablo kısıtlamaları `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `FKgtvt7p649s4x80y6f4842pnfq` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`id`);

--
-- Tablo kısıtlamaları `book_author`
--
ALTER TABLE `book_author`
  ADD CONSTRAINT `FKbjqhp85wjv8vpr0beygh6jsgo` FOREIGN KEY (`author_id`) REFERENCES `author` (`id`),
  ADD CONSTRAINT `FKhwgu59n9o80xv75plf9ggj7xn` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Tablo kısıtlamaları `publisher_book`
--
ALTER TABLE `publisher_book`
  ADD CONSTRAINT `FK6buft2dj1d6ig7hekbx7c0ysp` FOREIGN KEY (`publisher_id`) REFERENCES `publisher` (`id`),
  ADD CONSTRAINT `FKnro4ab7u1j42osd4sehbkptrr` FOREIGN KEY (`book_id`) REFERENCES `book` (`id`);

--
-- Tablo kısıtlamaları `users_roles`
--
ALTER TABLE `users_roles`
  ADD CONSTRAINT `FKgd3iendaoyh04b95ykqise6qh` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `FKt4v0rrweyk393bdgt107vdx0x` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
