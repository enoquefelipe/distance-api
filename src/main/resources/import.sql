--insert into City (id, name, latitude, longitude) values (1, 'São Paulo', '-23.533773', '-46.625290');
--insert into City (id, name, latitude, longitude) values (2, 'Guarulhos', '-23.454163', '-46.534096');
--insert into City (id, name, latitude, longitude) values (3, 'Osasco', '-23.532881', '-46.792004');
--insert into City (id, name, latitude, longitude) values (4, 'Bauru', '-22.303074', '-49.065628');
--insert into City (id, name, latitude, longitude) values (5, 'Santos', '-23.944841', '-46.330376');

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

CREATE TABLE IF NOT EXISTS `city` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `latitude` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `longitude` varchar(255) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `city` (`id`, `name`, `latitude`, `longitude`) VALUES
(1, 'São Paulo', '-23.533773', '-46.625290'),
(2, 'Guarulhos', '-23.454163', '-46.534096'),
(3, 'Osasco', '-23.532881', '-46.792004'),
(4, 'Bauru', '-22.303074', '-49.065628'),
(5, 'Santos', '-23.944841', '-46.330376');

ALTER TABLE `city`
ADD PRIMARY KEY (`id`);
