-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-05-2017 a las 23:44:11
-- Versión del servidor: 10.1.21-MariaDB
-- Versión de PHP: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `almac`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `boleta`
--

CREATE TABLE `boleta` (
  `IdBoleta` int(20) NOT NULL,
  `Valor` int(20) NOT NULL,
  `Fecha` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE `cliente` (
  `Rut` varchar(20) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Descuento` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cliente`
--

INSERT INTO `cliente` (`Rut`, `Nombre`, `Descuento`) VALUES
('120119400', 'Guillermo Perez', 25),
('124837125', 'Pilar Briones', 10),
('153155123', 'Sergio Bahamondes', 5),
('179619049', 'Sebastian Gomez', 15),
('94028319', 'Carmen Saldaña', 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cupon`
--

CREATE TABLE `cupon` (
  `CodigoCupon` int(20) NOT NULL,
  `CodigoProducto` int(20) NOT NULL,
  `DescuentoCupon` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `cupon`
--

INSERT INTO `cupon` (`CodigoCupon`, `CodigoProducto`, `DescuentoCupon`) VALUES
(1111, 1, 15),
(2222, 6, 30);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `CodigoProducto` int(20) NOT NULL,
  `Descripcion` varchar(50) NOT NULL,
  `Valor` int(20) NOT NULL,
  `CntInventario` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`CodigoProducto`, `Descripcion`, `Valor`, `CntInventario`) VALUES
(1, 'Bebido Pepsi 3 Lt', 1650, 10),
(2, 'Bebida Pepsi 2 Lt', 1350, 10),
(3, 'Jugo Naranja 1 Lt', 950, 10),
(4, 'Jugo Manzana 1Lt', 950, 10),
(5, 'Bebida Coca Cola 3 Lt', 1700, 10),
(6, 'Azucar 1 kg', 550, 10),
(7, 'Sal 1 kg', 500, 10),
(8, 'Harina 1 kg', 900, 10),
(9, 'Harina 2 kg', 1750, 10),
(10, 'Mantequilla 250 gr', 1150, 10),
(11, 'Margarina 250 gr', 1050, 10),
(12, 'Porotos 1 kg', 2850, 10),
(13, 'Lentejas 1 kg', 2750, 10),
(14, 'Garbanzos 1 kg', 2500, 10),
(15, 'Aceite 1 Lt', 1750, 10),
(16, 'Vinagre de Manzana 500 cc', 1250, 10),
(17, 'Mostaza 1 kg', 2400, 10);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `boleta`
--
ALTER TABLE `boleta`
  ADD PRIMARY KEY (`IdBoleta`);

--
-- Indices de la tabla `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`Rut`);

--
-- Indices de la tabla `cupon`
--
ALTER TABLE `cupon`
  ADD PRIMARY KEY (`CodigoCupon`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`CodigoProducto`),
  ADD UNIQUE KEY `CodigoProducto` (`CodigoProducto`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `boleta`
--
ALTER TABLE `boleta`
  MODIFY `IdBoleta` int(20) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
