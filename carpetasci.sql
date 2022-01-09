-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-01-2022 a las 14:14:46
-- Versión del servidor: 10.4.19-MariaDB
-- Versión de PHP: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `carpetasci`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carpetasc`
--

CREATE TABLE `carpetasc` (
  `codcc` int(11) NOT NULL,
  `nomcc` varchar(100) NOT NULL,
  `numcajon` varchar(100) NOT NULL,
  `puestocc` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carpetasc`
--

INSERT INTO `carpetasc` (`codcc`, `nomcc`, `numcajon`, `puestocc`) VALUES
(1, 'Decretos', '1', '2'),
(2, 'Entrevistas', '2', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carpetasg`
--

CREATE TABLE `carpetasg` (
  `codg` int(11) NOT NULL,
  `nomg` varchar(100) NOT NULL,
  `hojas` varchar(100) NOT NULL,
  `numcaja` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carpetasg`
--

INSERT INTO `carpetasg` (`codg`, `nomg`, `hojas`, `numcaja`) VALUES
(1, 'Oficios varios', '8', '1'),
(2, 'Papeles varios', '100', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `carpetasm`
--

CREATE TABLE `carpetasm` (
  `cod` int(11) NOT NULL,
  `nom` varchar(255) NOT NULL,
  `modulo` varchar(255) NOT NULL,
  `numM` varchar(255) NOT NULL,
  `puesto` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `carpetasm`
--

INSERT INTO `carpetasm` (`cod`, `nom`, `modulo`, `numM`, `puesto`) VALUES
(1, 'Capeta uno', 'uno', '1', '10'),
(2, 'Carpeta dos', 'dos', '3', '11');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `carpetasc`
--
ALTER TABLE `carpetasc`
  ADD PRIMARY KEY (`codcc`);

--
-- Indices de la tabla `carpetasg`
--
ALTER TABLE `carpetasg`
  ADD PRIMARY KEY (`codg`);

--
-- Indices de la tabla `carpetasm`
--
ALTER TABLE `carpetasm`
  ADD PRIMARY KEY (`cod`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `carpetasc`
--
ALTER TABLE `carpetasc`
  MODIFY `codcc` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `carpetasg`
--
ALTER TABLE `carpetasg`
  MODIFY `codg` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `carpetasm`
--
ALTER TABLE `carpetasm`
  MODIFY `cod` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
