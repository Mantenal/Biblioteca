-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-06-2018 a las 23:44:52
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Disparadores `compra_venta`
--
DELIMITER $$
CREATE TRIGGER `ins_compra` AFTER INSERT ON `compra_venta` FOR EACH ROW BEGIN
	
    UPDATE libros SET libros.estado = 1 WHERE id_libro = NEW.fk_libro;
    
END
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
(1, 'Saga Harry potter', 'JK Rowling', 'Saga completa de los libros de harry poter ', 0, 1000, 'Carlos');

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
(1, 'Que hago aqui', 'y si nos morimos ?', 'Astrid ');

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
(1, 'vas ', 'todos a morirnos', 'Christopher', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `username` varchar(40) NOT NULL,
  `correo` varchar(40) NOT NULL,
  `password` varchar(40) NOT NULL,
  `saldo` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`username`, `correo`, `password`, `saldo`) VALUES
('Astrid ', 'astrid@gmail.com', '14300021', 100),
('Carlos', 'carlos@gmail.com', '14300392', 100),
('Christopher', 'christopher@gmail.com', '14300241', 100),
('Emma', 'emma@gmail.com', '14300815', 100);

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
  ADD PRIMARY KEY (`id_libro`),
  ADD KEY `fk_usuario` (`fk_usuario`);

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
  ADD PRIMARY KEY (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `id_libro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `pregunta`
--
ALTER TABLE `pregunta`
  MODIFY `id_pregunta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT de la tabla `respuesta`
--
ALTER TABLE `respuesta`
  MODIFY `id_respuesta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  ADD CONSTRAINT `compra_venta_ibfk_2` FOREIGN KEY (`fk_usuario_com`) REFERENCES `usuarios` (`username`),
  ADD CONSTRAINT `compra_venta_ibfk_3` FOREIGN KEY (`fk_usuario_ven`) REFERENCES `usuarios` (`username`),
  ADD CONSTRAINT `compra_venta_ibfk_4` FOREIGN KEY (`fk_libro`) REFERENCES `libros` (`id_libro`);

--
-- Filtros para la tabla `libros`
--
ALTER TABLE `libros`
  ADD CONSTRAINT `libros_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`username`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`username`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_2` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`username`),
  ADD CONSTRAINT `respuesta_ibfk_3` FOREIGN KEY (`fk_pregunta`) REFERENCES `pregunta` (`id_pregunta`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
