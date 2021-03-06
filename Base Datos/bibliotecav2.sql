-- phpMyAdmin SQL Dump
-- version 4.8.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-06-2018 a las 04:07:54
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
  `precio` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

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
  ADD PRIMARY KEY (`username`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compra_venta`
--
ALTER TABLE `compra_venta`
  ADD CONSTRAINT `compra_venta_ibfk_1` FOREIGN KEY (`fk_libro`) REFERENCES `libros` (`id_libro`),
  ADD CONSTRAINT `compra_venta_ibfk_2` FOREIGN KEY (`fk_usuario_com`) REFERENCES `usuarios` (`username`),
  ADD CONSTRAINT `compra_venta_ibfk_3` FOREIGN KEY (`fk_usuario_ven`) REFERENCES `usuarios` (`username`);

--
-- Filtros para la tabla `pregunta`
--
ALTER TABLE `pregunta`
  ADD CONSTRAINT `pregunta_ibfk_1` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`username`);

--
-- Filtros para la tabla `respuesta`
--
ALTER TABLE `respuesta`
  ADD CONSTRAINT `respuesta_ibfk_1` FOREIGN KEY (`fk_pregunta`) REFERENCES `pregunta` (`id_pregunta`),
  ADD CONSTRAINT `respuesta_ibfk_2` FOREIGN KEY (`fk_usuario`) REFERENCES `usuarios` (`username`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
