-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2018 a las 06:08:23
-- Versión del servidor: 10.1.31-MariaDB
-- Versión de PHP: 7.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `biblioteca`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compra_venta`
--

CREATE TABLE `compra_venta` (
  `id` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `fk_usuario_com` varchar(40) NOT NULL,
  `fk_libro` int(11) NOT NULL,
  `fk_usuario_ven` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `compra_venta`
--

INSERT INTO `compra_venta` (`id`, `fecha`, `fk_usuario_com`, `fk_libro`, `fk_usuario_ven`) VALUES
(1, '2018-06-13', 'Ema', 1, 'Carlos'),
(2, '2018-06-05', 'Ema', 2, 'Carlos');

--
-- Disparadores `compra_venta`
--
DELIMITER $$
CREATE TRIGGER `ins_compra` AFTER INSERT ON `compra_venta` FOR EACH ROW BEGIN
	
    UPDATE libros SET libros.estado = 1 WHERE id_libro = NEW.fk_libro;
    
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `recuperarLibro` AFTER DELETE ON `compra_venta` FOR EACH ROW UPDATE libros set estado = 0 WHERE id_libro = OLD.fk_libro
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `id_libro` int(11) NOT NULL,
  `titulo_libro` varchar(60) NOT NULL,
  `autor` varchar(40) NOT NULL,
  `descripcion` text NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `precio` double NOT NULL,
  `fk_usuario` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`id_libro`, `titulo_libro`, `autor`, `descripcion`, `estado`, `precio`, `fk_usuario`) VALUES
(1, 'harry popotes', 'Coco', 'Esta bien chido', 1, 100, 'Carlos'),
(2, 'La soledad', 'El solo', 'Ella no', 1, 12, 'Carlos'),
(10, 'Los juegos del hambre', 'Emma', 'Libro muy interesante', 0, 130, 'Ema');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pregunta`
--

CREATE TABLE `pregunta` (
  `id_pregunta` int(11) NOT NULL,
  `titulo_pregunta` varchar(40) NOT NULL,
  `texto` text NOT NULL,
  `fk_usuario` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `pregunta`
--

INSERT INTO `pregunta` (`id_pregunta`, `titulo_pregunta`, `texto`, `fk_usuario`) VALUES
(1, 'Duda sobre encontrar tal libro', 'Estoy buscando este libro y por ningun lado lo encuentro, alguien sabe donde puedo encontrarlo?', 'Ema'),
(2, 'Hola amigos!!!', 'Soy nuevo en el foro :D', 'Carlos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuesta`
--

CREATE TABLE `respuesta` (
  `id_respuesta` int(11) NOT NULL,
  `titulo_respuesta` varchar(40) NOT NULL,
  `texto` text NOT NULL,
  `fk_usuario` varchar(40) NOT NULL,
  `fk_pregunta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `respuesta`
--

INSERT INTO `respuesta` (`id_respuesta`, `titulo_respuesta`, `texto`, `fk_usuario`, `fk_pregunta`) VALUES
(1, 'Libreria', 'Yo creo que si lo encontraras en tal libreria', 'Chris', 1),
(2, 'Buscar libro', 'Animo amigo, ve a las librerias del centro', 'Chris', 1),
(3, 'NO', 'La verdad no se como ayudarte :/', 'Chris', 1),
(4, 'Holiwis', 'Como estas?', 'Ema', 2),
(5, 'Responder', 'Todo bien, gracias', 'Ema', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `usuario` varchar(40) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `saldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`usuario`, `correo`, `password`, `saldo`) VALUES
('Carlos', '123', '123', 1000),
('Chris', 'Christopher9@gmail.com', '123', 100),
('Ema', '1', '12345', 100);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_usuario_ven` (`fk_usuario_ven`),
  ADD KEY `fk_libro` (`fk_libro`),
  ADD KEY `fk_usuario_com` (`fk_usuario_com`);

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`id_libro`);

--
-- Indices de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD PRIMARY KEY (`id_pregunta`),
  ADD KEY `fk_usuario` (`fk_usuario`);

--
-- Indices de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `fk_pregunta` (`fk_pregunta`),
  ADD KEY `fk_usuario` (`fk_usuario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  ADD CONSTRAINT `compra_venta_ibfk_2` FOREIGN KEY (`fk_usuario_com`) REFERENCES `usuarios` (`usuario`),
  ADD CONSTRAINT `compra_venta_ibfk_3` FOREIGN KEY (`fk_usuario_ven`) REFERENCES `usuarios` (`usuario`),
  ADD CONSTRAINT `compra_venta_ibfk_4` FOREIGN KEY (`fk_libro`) REFERENCES `libros` (`id_libro`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`usuario`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_2` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`usuario`),
  ADD CONSTRAINT `respuesta_ibfk_3` FOREIGN KEY (`fk_pregunta`) REFERENCES `pregunta` (`id_pregunta`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
