DROP DATABASE IF EXISTS cursojava;

CREATE DATABASE IF NOT EXISTS `cursojava` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci;

USE `cursojava`;

DROP TABLE IF EXISTS `user`;

CREATE TABLE IF NOT EXISTS `user` (
  `id` bigint UNSIGNED NOT NULL AUTO_INCREMENT,
  `nombre` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci NOT NULL,
  `apellido` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci NOT NULL,
  `email` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci NOT NULL,
  `telefono` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci NOT NULL,
  `password` varchar(40) CHARACTER SET utf8mb4 COLLATE utf8mb4_es_0900_ai_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE = InnoDB AUTO_INCREMENT = 7 DEFAULT CHARSET = utf8mb4 COLLATE = utf8mb4_es_0900_ai_ci;

INSERT INTO
  `user` (
    `id`,
    `nombre`,
    `apellido`,
    `email`,
    `telefono`,
    `password`
  )
VALUES
  (
    1,
    'Aaaa',
    'Zzzz',
    'a@coldmail.com',
    '111111111',
    'poipoi'
  ),
  (
    2,
    'Bbbb',
    'Yyyy',
    'b@coldmail.com',
    '222222222',
    'qweqwe'
  ),
  (
    3,
    'Cccc',
    'Xxxx',
    'c@coldmail.com',
    '333333333',
    'asdasd'
  ),
  (
    4,
    'Dddd',
    'Wwww',
    'd@coldmail.com',
    '444444444',
    'dfgdgd'
  ),
  (
    5,
    'Eeee',
    'Vvvv',
    'e@coldmail.com',
    '555555555',
    'hjkhjk'
  ),
  (
    6,
    'Ffff',
    'Uuuu',
    'f@coldmail.com',
    '666666666',
    'vbnvbn'
  );