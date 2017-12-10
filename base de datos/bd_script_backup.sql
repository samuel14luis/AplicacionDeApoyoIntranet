-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.28-MariaDB


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema bd_alumnos_universidad
--

CREATE DATABASE IF NOT EXISTS bd_alumnos_universidad;
USE bd_alumnos_universidad;

--
-- Definition of table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
CREATE TABLE `alumno` (
  `idALUMNO` int(11) NOT NULL AUTO_INCREMENT,
  `codigo_universitario` char(10) NOT NULL,
  `f_ingreso` date NOT NULL,
  `id_persona` int(11) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`idALUMNO`),
  UNIQUE KEY `codigo_universitario` (`codigo_universitario`),
  KEY `fk_ALUMNO_PERSONA1_idx` (`id_persona`),
  CONSTRAINT `fk_ALUMNO_PERSONA1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`idPERSONA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `alumno`
--

/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;


--
-- Definition of table `asistencia`
--

DROP TABLE IF EXISTS `asistencia`;
CREATE TABLE `asistencia` (
  `idASISTENCIA` int(11) NOT NULL AUTO_INCREMENT,
  `id_matricula_curso` int(11) NOT NULL,
  `id_clase_programada` int(11) NOT NULL,
  PRIMARY KEY (`idASISTENCIA`),
  KEY `fk_ASISTENCIA_MATRICULA_CURSO1_idx` (`id_matricula_curso`),
  KEY `fk_ASISTENCIA_CLASE_PROGRAMADA1_idx` (`id_clase_programada`),
  CONSTRAINT `fk_ASISTENCIA_CLASE_PROGRAMADA1` FOREIGN KEY (`id_clase_programada`) REFERENCES `clase_programada` (`idCLASE_PROGRAMADA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_ASISTENCIA_MATRICULA_CURSO1` FOREIGN KEY (`id_matricula_curso`) REFERENCES `matricula_curso` (`idMATRICULA_CURSO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `asistencia`
--

/*!40000 ALTER TABLE `asistencia` DISABLE KEYS */;
/*!40000 ALTER TABLE `asistencia` ENABLE KEYS */;


--
-- Definition of table `aula`
--

DROP TABLE IF EXISTS `aula`;
CREATE TABLE `aula` (
  `idAULA` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` char(1) NOT NULL,
  `piso` tinyint(1) NOT NULL,
  `id_carrera` int(11) NOT NULL,
  PRIMARY KEY (`idAULA`),
  KEY `fk_AULA_CARRERA1_idx` (`id_carrera`),
  CONSTRAINT `fk_AULA_CARRERA1` FOREIGN KEY (`id_carrera`) REFERENCES `carrera` (`idCARRERA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `aula`
--

/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;


--
-- Definition of table `carrera`
--

DROP TABLE IF EXISTS `carrera`;
CREATE TABLE `carrera` (
  `idCARRERA` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_carrera` varchar(120) NOT NULL,
  `f_creacion` date NOT NULL,
  `logo` mediumblob,
  `id_facultad` int(11) NOT NULL,
  `id_ciclo_max` int(11) NOT NULL,
  PRIMARY KEY (`idCARRERA`),
  KEY `fk_CARRERA_FACULTAD1_idx` (`id_facultad`),
  KEY `fk_CARRERA_NOMBRE_CICLO1_idx` (`id_ciclo_max`),
  CONSTRAINT `fk_CARRERA_FACULTAD1` FOREIGN KEY (`id_facultad`) REFERENCES `facultad` (`idFACULTAD`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CARRERA_NOMBRE_CICLO1` FOREIGN KEY (`id_ciclo_max`) REFERENCES `nombre_ciclo` (`idNOMBRE_CICLO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `carrera`
--

/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;


--
-- Definition of table `ciclo_academico`
--

DROP TABLE IF EXISTS `ciclo_academico`;
CREATE TABLE `ciclo_academico` (
  `idCICLO_ACADEMICO` int(11) NOT NULL AUTO_INCREMENT,
  `f_inicio` date NOT NULL,
  `f_fin` date DEFAULT NULL,
  PRIMARY KEY (`idCICLO_ACADEMICO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `ciclo_academico`
--

/*!40000 ALTER TABLE `ciclo_academico` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciclo_academico` ENABLE KEYS */;


--
-- Definition of table `clase_programada`
--

DROP TABLE IF EXISTS `clase_programada`;
CREATE TABLE `clase_programada` (
  `idCLASE_PROGRAMADA` int(11) NOT NULL AUTO_INCREMENT,
  `tema_de_clase` varchar(200) NOT NULL,
  `id_curso_abierto` int(11) NOT NULL,
  PRIMARY KEY (`idCLASE_PROGRAMADA`),
  KEY `fk_CLASE_PROGRAMADA_CURSO_ABIERTO1_idx` (`id_curso_abierto`),
  CONSTRAINT `fk_CLASE_PROGRAMADA_CURSO_ABIERTO1` FOREIGN KEY (`id_curso_abierto`) REFERENCES `curso_abierto` (`idCURSO_ABIERTO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `clase_programada`
--

/*!40000 ALTER TABLE `clase_programada` DISABLE KEYS */;
/*!40000 ALTER TABLE `clase_programada` ENABLE KEYS */;


--
-- Definition of table `curso`
--

DROP TABLE IF EXISTS `curso`;
CREATE TABLE `curso` (
  `idCURSO` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_curso` varchar(120) NOT NULL,
  PRIMARY KEY (`idCURSO`),
  UNIQUE KEY `nombre_curso_UNIQUE` (`nombre_curso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `curso`
--

/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;


--
-- Definition of table `curso_abierto`
--

DROP TABLE IF EXISTS `curso_abierto`;
CREATE TABLE `curso_abierto` (
  `idCURSO_ABIERTO` int(11) NOT NULL AUTO_INCREMENT,
  `id_ciclo_academico` int(11) NOT NULL,
  `id_docente` int(11) NOT NULL,
  `id_curso_de_plan_estudios` int(11) NOT NULL,
  PRIMARY KEY (`idCURSO_ABIERTO`),
  KEY `fk_CURSO_ABIERTO_DOCENTE1_idx` (`id_docente`),
  KEY `fk_CURSO_ABIERTO_CICLO_ACADEMICO1_idx` (`id_ciclo_academico`),
  KEY `fk_CURSO_ABIERTO_CURSO_CARRERA1_idx` (`id_curso_de_plan_estudios`),
  CONSTRAINT `fk_CURSO_ABIERTO_CICLO_ACADEMICO1` FOREIGN KEY (`id_ciclo_academico`) REFERENCES `ciclo_academico` (`idCICLO_ACADEMICO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CURSO_ABIERTO_CURSO_CARRERA1` FOREIGN KEY (`id_curso_de_plan_estudios`) REFERENCES `curso_de_plan_estudios` (`idCURSO_DE_PLAN_ESTUDIOS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CURSO_ABIERTO_DOCENTE1` FOREIGN KEY (`id_docente`) REFERENCES `docente` (`idDOCENTE`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `curso_abierto`
--

/*!40000 ALTER TABLE `curso_abierto` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso_abierto` ENABLE KEYS */;


--
-- Definition of table `curso_de_plan_estudios`
--

DROP TABLE IF EXISTS `curso_de_plan_estudios`;
CREATE TABLE `curso_de_plan_estudios` (
  `idCURSO_DE_PLAN_ESTUDIOS` int(11) NOT NULL AUTO_INCREMENT,
  `id_curso` int(11) NOT NULL,
  `id_carrera` int(11) NOT NULL,
  `id_plan_estudios` int(11) NOT NULL,
  `id_nombre_ciclo` int(11) NOT NULL,
  PRIMARY KEY (`idCURSO_DE_PLAN_ESTUDIOS`),
  KEY `fk_CURSO_CARRERA_CARRERA1_idx` (`id_carrera`),
  KEY `fk_CURSO_CARRERA_CURSO1_idx` (`id_curso`),
  KEY `fk_CURSO_CARRERA_NOMBRE_CICLO1_idx` (`id_nombre_ciclo`),
  KEY `fk_CURSO_CARRERA_PLAN_ESTUDIOS1_idx` (`id_plan_estudios`),
  CONSTRAINT `fk_CURSO_CARRERA_CARRERA1` FOREIGN KEY (`id_carrera`) REFERENCES `carrera` (`idCARRERA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CURSO_CARRERA_CURSO1` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`idCURSO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CURSO_CARRERA_NOMBRE_CICLO1` FOREIGN KEY (`id_nombre_ciclo`) REFERENCES `nombre_ciclo` (`idNOMBRE_CICLO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_CURSO_CARRERA_PLAN_ESTUDIOS1` FOREIGN KEY (`id_plan_estudios`) REFERENCES `plan_estudios` (`idPLAN_ESTUDIOS`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `curso_de_plan_estudios`
--

/*!40000 ALTER TABLE `curso_de_plan_estudios` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso_de_plan_estudios` ENABLE KEYS */;


--
-- Definition of table `docente`
--

DROP TABLE IF EXISTS `docente`;
CREATE TABLE `docente` (
  `idDOCENTE` int(11) NOT NULL AUTO_INCREMENT,
  `f_ingreso` date NOT NULL,
  `codigo_docente` char(10) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`idDOCENTE`),
  KEY `fk_DOCENTE_PERSONA1_idx` (`id_persona`),
  CONSTRAINT `fk_DOCENTE_PERSONA1` FOREIGN KEY (`id_persona`) REFERENCES `persona` (`idPERSONA`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `docente`
--

/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;


--
-- Definition of table `facultad`
--

DROP TABLE IF EXISTS `facultad`;
CREATE TABLE `facultad` (
  `idFACULTAD` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_facu` varchar(120) NOT NULL,
  `f_creacion` date NOT NULL,
  PRIMARY KEY (`idFACULTAD`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `facultad`
--

/*!40000 ALTER TABLE `facultad` DISABLE KEYS */;
INSERT INTO `facultad` (`idFACULTAD`,`nombre_facu`,`f_creacion`) VALUES 
 (1,'Facultad de Bromatología y Nutrición','2002-12-03'),
 (2,'Facultad de Ciencias','2002-12-03'),
 (3,'Facultad de Ciencias Económicas, Contables y Financieras','2002-12-03'),
 (4,'Facultad de Ciencias Empresariales','2002-12-03'),
 (5,'Facultad de Ciencias Sociales','2002-12-03'),
 (6,'Facultad de Derecho y Ciencias Políticas','2002-12-03'),
 (7,'Facultad de Educación','2002-12-03'),
 (8,'Facultad de Ingeniería Agraria, Industrias Alimentarias y Ambiental','2002-12-03'),
 (9,'Facultad de Ingeniería Industrial, Sistemas e Informática','2002-12-03'),
 (10,'Facultad de Ingeniería Pesquera','2002-12-03'),
 (11,'Facultad de Ingeniería Química y Metalurgia','2002-12-03'),
 (12,'Facultad de Medicina Humana','2001-12-03');
/*!40000 ALTER TABLE `facultad` ENABLE KEYS */;


--
-- Definition of table `horario`
--

DROP TABLE IF EXISTS `horario`;
CREATE TABLE `horario` (
  `idHORARIO` int(11) NOT NULL AUTO_INCREMENT,
  `dia` char(1) NOT NULL,
  `horas` int(11) NOT NULL,
  `hora_inicio` time NOT NULL,
  `id_aula` int(11) NOT NULL,
  `id_curso_abierto` int(11) NOT NULL,
  PRIMARY KEY (`idHORARIO`),
  KEY `fk_HORARIO_AULA1_idx` (`id_aula`),
  KEY `fk_HORARIO_CURSO_ABIERTO1_idx` (`id_curso_abierto`),
  CONSTRAINT `fk_HORARIO_AULA1` FOREIGN KEY (`id_aula`) REFERENCES `aula` (`idAULA`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_HORARIO_CURSO_ABIERTO1` FOREIGN KEY (`id_curso_abierto`) REFERENCES `curso_abierto` (`idCURSO_ABIERTO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `horario`
--

/*!40000 ALTER TABLE `horario` DISABLE KEYS */;
/*!40000 ALTER TABLE `horario` ENABLE KEYS */;


--
-- Definition of table `matricula_curso`
--

DROP TABLE IF EXISTS `matricula_curso`;
CREATE TABLE `matricula_curso` (
  `idMATRICULA_CURSO` int(11) NOT NULL AUTO_INCREMENT,
  `id_alumno` int(11) NOT NULL,
  `id_curso_abierto` int(11) NOT NULL,
  `ec1` double DEFAULT NULL,
  `ep1` double DEFAULT NULL,
  `ed1` double DEFAULT NULL,
  `ec2` double DEFAULT NULL,
  `ep2` double DEFAULT NULL,
  `ed2` double DEFAULT NULL,
  `ec3` double DEFAULT NULL,
  `ep3` double DEFAULT NULL,
  `ed3` double DEFAULT NULL,
  `ec4` double DEFAULT NULL,
  `ep4` double DEFAULT NULL,
  `ed4` double DEFAULT NULL,
  PRIMARY KEY (`idMATRICULA_CURSO`),
  KEY `fk_MATRICULA_CURSO_ALUMNO1_idx` (`id_alumno`),
  KEY `fk_MATRICULA_CURSO_CURSO_ABIERTO1_idx` (`id_curso_abierto`),
  CONSTRAINT `fk_MATRICULA_CURSO_ALUMNO1` FOREIGN KEY (`id_alumno`) REFERENCES `alumno` (`idALUMNO`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_MATRICULA_CURSO_CURSO_ABIERTO1` FOREIGN KEY (`id_curso_abierto`) REFERENCES `curso_abierto` (`idCURSO_ABIERTO`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `matricula_curso`
--

/*!40000 ALTER TABLE `matricula_curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `matricula_curso` ENABLE KEYS */;


--
-- Definition of table `nombre_ciclo`
--

DROP TABLE IF EXISTS `nombre_ciclo`;
CREATE TABLE `nombre_ciclo` (
  `idNOMBRE_CICLO` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_ciclo` varchar(4) NOT NULL,
  PRIMARY KEY (`idNOMBRE_CICLO`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `nombre_ciclo`
--

/*!40000 ALTER TABLE `nombre_ciclo` DISABLE KEYS */;
/*!40000 ALTER TABLE `nombre_ciclo` ENABLE KEYS */;


--
-- Definition of table `persona`
--

DROP TABLE IF EXISTS `persona`;
CREATE TABLE `persona` (
  `idPERSONA` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(100) NOT NULL,
  `ap_paterno` varchar(50) NOT NULL,
  `ap_materno` varchar(50) NOT NULL,
  `dni` char(8) NOT NULL,
  `f_nacimiento` date NOT NULL,
  `email` varchar(150) DEFAULT NULL,
  `telf` varchar(15) DEFAULT NULL,
  `cel` varchar(9) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `foto` mediumblob,
  `sexo` char(1) NOT NULL,
  PRIMARY KEY (`idPERSONA`),
  UNIQUE KEY `dni_UNIQUE` (`dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;


--
-- Definition of table `plan_estudios`
--

DROP TABLE IF EXISTS `plan_estudios`;
CREATE TABLE `plan_estudios` (
  `idPLAN_ESTUDIOS` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_plan` varchar(45) NOT NULL,
  PRIMARY KEY (`idPLAN_ESTUDIOS`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `plan_estudios`
--

/*!40000 ALTER TABLE `plan_estudios` DISABLE KEYS */;
/*!40000 ALTER TABLE `plan_estudios` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
