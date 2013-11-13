-- phpMyAdmin SQL Dump
-- version 3.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 13-11-2013 a las 03:06:02
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
-- Estructura de tabla para la tabla `historial_pago`
--

CREATE TABLE IF NOT EXISTS `historial_pago` (
  `Vivienda` varchar(50) DEFAULT NULL,
  `Consumo_Mes` int(11) DEFAULT NULL,
  `Deuda` int(11) DEFAULT NULL,
  `TotalMes` int(11) DEFAULT NULL,
  `Pago` int(11) DEFAULT NULL,
  `NuevoSaldo` int(11) DEFAULT NULL,
  `Mes` varchar(45) DEFAULT NULL,
  `Año` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `historial_pago`
--

INSERT INTO `historial_pago` (`Vivienda`, `Consumo_Mes`, `Deuda`, `TotalMes`, `Pago`, `NuevoSaldo`, `Mes`, `Año`) VALUES
('1000', 5000, 0, 5000, 3000, 2000, '10', '113');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
