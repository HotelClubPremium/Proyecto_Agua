-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 26-11-2013 a las 15:05:54
-- Versión del servidor: 5.5.24-log
-- Versión de PHP: 5.4.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `proyectoagua`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE IF NOT EXISTS `clientes` (
  `cedula` int(11) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  PRIMARY KEY (`cedula`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`cedula`, `nombre`, `apellido`, `direccion`, `telefono`, `email`) VALUES
(111, 'jeiner e.', 'mellado valencia', 'calle 7# 29-90', '3135028786', 'je_in_er.com'),
(222, 'carlos', 'pitre', 'calle 5', '313502', 'pitre.com'),
(333, 'miguel', 'palomino', 'calle 6', '3146556', 'migue.com'),
(5656, 'leo', 'mellado valencia', 'calle 4', '4341414', 'l.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `viviendas`
--

CREATE TABLE IF NOT EXISTS `viviendas` (
  `codigo` int(11) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  `estrato` int(11) NOT NULL,
  `barrio` varchar(45) NOT NULL,
  `deuda` double DEFAULT NULL,
  `descuento` double DEFAULT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `viviendas`
--

INSERT INTO `viviendas` (`codigo`, `direccion`, `estrato`, `barrio`, `deuda`, `descuento`) VALUES
(12, 'calle 4', 4, 'nueva esperanza', NULL, NULL),
(14, 'calle 4', 4, 'nueva esperanza', NULL, NULL),
(15, 'calle 5', 4, 'olimpica', NULL, NULL),
(16, 'calle 6', 4, 'sabana', NULL, NULL),
(17, 'calle 7', 4, 'victoria', NULL, NULL),
(18, 'calle 9', 4, 'nnn', NULL, NULL),
(45, 'calle 40', 6, 'cerrito', NULL, NULL),
(146, 'jnfjvknfv', 4, 'kjnvfjk', NULL, NULL);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
