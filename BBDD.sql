CREATE DATABASE  IF NOT EXISTS `hotelopm` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `hotelopm`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hotelopm
-- ------------------------------------------------------
-- Server version	5.5.5-10.1.38-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `consumos`
--

DROP TABLE IF EXISTS `consumos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consumos` (
  `idConsumos` int(11) NOT NULL AUTO_INCREMENT,
  `Cantidad_Producto` int(11) DEFAULT NULL,
  `Stock_idStock` int(11) NOT NULL,
  `Reserva_idReservaHabitacion` int(11) NOT NULL,
  PRIMARY KEY (`idConsumos`,`Stock_idStock`),
  KEY `fk_Consumos_Stock1_idx` (`Stock_idStock`),
  KEY `fk_Consumos_Reserva1_idx` (`Reserva_idReservaHabitacion`),
  CONSTRAINT `fk_Consumos_Reserva1` FOREIGN KEY (`Reserva_idReservaHabitacion`) REFERENCES `reserva` (`idReservaHabitacion`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Consumos_Stock1` FOREIGN KEY (`Stock_idStock`) REFERENCES `stock` (`idStock`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consumos`
--

LOCK TABLES `consumos` WRITE;
/*!40000 ALTER TABLE `consumos` DISABLE KEYS */;
INSERT INTO `consumos` VALUES (1,3,2,9),(2,5,4,9),(3,4,2,9);
/*!40000 ALTER TABLE `consumos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cuenta`
--

DROP TABLE IF EXISTS `cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cuenta` (
  `idCuenta` int(11) NOT NULL AUTO_INCREMENT,
  `ModalidaddePago` varchar(45) DEFAULT NULL,
  `SubTotalProductos` int(11) DEFAULT NULL,
  `SubtotalHabitacion` int(11) DEFAULT NULL,
  `CantitaddePasajero` int(11) DEFAULT NULL,
  `SubtotalDescuentoCliente` int(11) DEFAULT NULL,
  `Total` int(11) DEFAULT NULL,
  `PasajeroTitular_IdPasajeroTitular` int(11) NOT NULL,
  PRIMARY KEY (`idCuenta`,`PasajeroTitular_IdPasajeroTitular`),
  KEY `fk_Cuenta_PasajeroTitular1_idx` (`PasajeroTitular_IdPasajeroTitular`),
  CONSTRAINT `fk_Cuenta_PasajeroTitular1` FOREIGN KEY (`PasajeroTitular_IdPasajeroTitular`) REFERENCES `pasajerotitular` (`IdPasajeroTitular`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cuenta`
--

LOCK TABLES `cuenta` WRITE;
/*!40000 ALTER TABLE `cuenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `encuesta`
--

DROP TABLE IF EXISTS `encuesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `encuesta` (
  `idEncuesta` int(11) NOT NULL AUTO_INCREMENT,
  `p1` int(11) DEFAULT NULL,
  `p2` int(11) DEFAULT NULL,
  `p3` int(11) DEFAULT NULL,
  `p4` int(11) DEFAULT NULL,
  `p5` int(11) DEFAULT NULL,
  `p6` int(11) DEFAULT NULL,
  `p7` int(11) DEFAULT NULL,
  `p8` int(11) DEFAULT NULL,
  `p9` int(11) DEFAULT NULL,
  `p10` int(11) DEFAULT NULL,
  `p11` varchar(45) DEFAULT NULL,
  `PasajeroTitular_IdPasajeroTitular` int(11) NOT NULL,
  PRIMARY KEY (`idEncuesta`),
  KEY `fk_Encuesta_PasajeroTitular1_idx` (`PasajeroTitular_IdPasajeroTitular`),
  CONSTRAINT `fk_Encuesta_PasajeroTitular1` FOREIGN KEY (`PasajeroTitular_IdPasajeroTitular`) REFERENCES `pasajerotitular` (`IdPasajeroTitular`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `encuesta`
--

LOCK TABLES `encuesta` WRITE;
/*!40000 ALTER TABLE `encuesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `encuesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `habitaciones`
--

DROP TABLE IF EXISTS `habitaciones`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `habitaciones` (
  `NombreHab` varchar(45) NOT NULL,
  `Preciomomento` int(11) DEFAULT NULL,
  `Preciojornada` int(11) DEFAULT NULL,
  `Disponibilidad` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`NombreHab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `habitaciones`
--

LOCK TABLES `habitaciones` WRITE;
/*!40000 ALTER TABLE `habitaciones` DISABLE KEYS */;
INSERT INTO `habitaciones` VALUES ('Amorlila',15000,45000,'Ocupada'),('Gradocinco',25000,75000,'Disponible'),('Oasisdeplacer',10000,30000,'Ocupada'),('Pololeozarpao',30000,90000,'Disponible'),('Todopasando',20000,60000,'Disponible');
/*!40000 ALTER TABLE `habitaciones` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasajeroacompañante`
--

DROP TABLE IF EXISTS `pasajeroacompañante`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pasajeroacompañante` (
  `IdPasajeroAcompañante` int(11) NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` int(11) NOT NULL,
  PRIMARY KEY (`IdPasajeroAcompañante`),
  KEY `fk_PasajeroAcompañante_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_PasajeroAcompañante_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasajeroacompañante`
--

LOCK TABLES `pasajeroacompañante` WRITE;
/*!40000 ALTER TABLE `pasajeroacompañante` DISABLE KEYS */;
INSERT INTO `pasajeroacompañante` VALUES (1,2),(2,15),(3,16);
/*!40000 ALTER TABLE `pasajeroacompañante` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pasajerotitular`
--

DROP TABLE IF EXISTS `pasajerotitular`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pasajerotitular` (
  `IdPasajeroTitular` int(11) NOT NULL AUTO_INCREMENT,
  `Persona_idPersona` int(11) NOT NULL,
  PRIMARY KEY (`IdPasajeroTitular`,`Persona_idPersona`),
  KEY `fk_PasajeroTitular_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_PasajeroTitular_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pasajerotitular`
--

LOCK TABLES `pasajerotitular` WRITE;
/*!40000 ALTER TABLE `pasajerotitular` DISABLE KEYS */;
INSERT INTO `pasajerotitular` VALUES (1,2),(2,6),(3,10),(4,12),(5,14),(6,17),(7,19);
/*!40000 ALTER TABLE `pasajerotitular` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `persona` (
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `Rut` int(11) DEFAULT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `APaterno` varchar(45) DEFAULT NULL,
  `AMaterno` varchar(45) DEFAULT NULL,
  `Nacionalidad` varchar(45) DEFAULT NULL,
  `Sexo` varchar(45) DEFAULT NULL,
  `Fecha_Nacimiento` date DEFAULT NULL,
  PRIMARY KEY (`idPersona`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,111,'Pedro','Ramirez','Figueroa','Chilena','Masculino','1989-06-11'),(2,22,'Julio','Martinez','Suazo','Peruano','Masculino','2019-04-02'),(3,222,'Camila','Pavez','Lindas','Chilena','Femenino','2019-04-02'),(4,123,'dsfsfsd','sdfdsfds','dsfdsfsd','fdsfdsf','Masculino','2019-04-03'),(5,123,'dsfsfsd','sdfdsfds','dsfdsfsd','fdsfdsf','Masculino','2019-04-03'),(6,55,'Homero','sdadsas','asdasdasd','sdsdasdad','Masculino','2019-04-02'),(7,55,'Homero','sdadsas','asdasdasd','sdsdasdad','Masculino','2019-04-02'),(8,77,'sdsdsd','asdsadsad','asdsadasd','sdsdasda','Masculino','2019-04-02'),(9,33,'sdfdsfds','fsdfdsfds','fsdfsdffsd','dfsfdsfsd','Masculino','2019-04-03'),(10,22,'Julio','Martinez','Suazo','Peruano','Masculino','2019-04-02'),(11,22,'Julio','Martinez','Suazo','Peruano','Masculino','2019-04-02'),(12,11,'Pedro','Ramirez','Figueroa','Chilena','Masculino','1989-06-11'),(13,11,'Pedro','Ramirez','Figueroa','Chilena','Masculino','1989-06-11'),(14,66,'Claudio','alta','sdsd','chileno','Masculino','2019-04-02'),(15,666,'Claudia','Lopez','marten','Chilena','Femenino','2019-04-03'),(16,6666,'Cecilia','Lopez','marten','Chilena','Femenino','2019-04-03'),(17,88,'Emilio','Zola','Garante','Argentino','Masculino','2019-04-01'),(18,888,'Emiliano','Zolasi','Garantesi','Argentino','Masculino','2019-04-01'),(19,33,'sdfdsfds','fsdfdsfds','fsdfsdffsd','dfsfdsfsd','Masculino','2019-04-03'),(20,44,'sdfdsfds','fsdfdsfds','fsdfsdffsd','dfsfdsfsd','Masculino','2019-04-03');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reserva`
--

DROP TABLE IF EXISTS `reserva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reserva` (
  `idReservaHabitacion` int(11) NOT NULL AUTO_INCREMENT,
  `Modalidad` varchar(45) DEFAULT NULL,
  `Fecha_Ingreso` date DEFAULT NULL,
  `Fecha_Egreso` date DEFAULT NULL,
  `PasajeroTitular_IdPasajeroTitular` int(11) NOT NULL,
  `Habitaciones_NombreHab` varchar(45) NOT NULL,
  PRIMARY KEY (`idReservaHabitacion`,`PasajeroTitular_IdPasajeroTitular`,`Habitaciones_NombreHab`),
  KEY `fk_Reserva_PasajeroTitular1_idx` (`PasajeroTitular_IdPasajeroTitular`),
  KEY `fk_Reserva_Habitaciones1_idx` (`Habitaciones_NombreHab`),
  CONSTRAINT `fk_Reserva_Habitaciones1` FOREIGN KEY (`Habitaciones_NombreHab`) REFERENCES `habitaciones` (`NombreHab`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reserva`
--

LOCK TABLES `reserva` WRITE;
/*!40000 ALTER TABLE `reserva` DISABLE KEYS */;
INSERT INTO `reserva` VALUES (1,'Momento','2019-04-09','2019-04-09',2,'Amorlila'),(2,'Momento','2019-04-09','2019-04-09',7,'Amorlila'),(3,'Momento','2019-04-09','2019-04-09',7,'Amorlila'),(4,'Momento','2019-04-09','2019-04-09',7,'Amorlila'),(5,'Seleccione','2019-04-09','2019-04-09',7,'Gradocinco'),(8,'Momento','2019-04-09','2019-04-09',7,'Amorlila'),(9,'Momento','2019-04-09','2019-04-09',4,'Gradocinco');
/*!40000 ALTER TABLE `reserva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock`
--

DROP TABLE IF EXISTS `stock`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock` (
  `idStock` int(11) NOT NULL AUTO_INCREMENT,
  `NombreProducto` varchar(45) DEFAULT NULL,
  `StockProducto` int(11) DEFAULT NULL,
  `PrecioUnitario` int(11) DEFAULT NULL,
  PRIMARY KEY (`idStock`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock`
--

LOCK TABLES `stock` WRITE;
/*!40000 ALTER TABLE `stock` DISABLE KEYS */;
INSERT INTO `stock` VALUES (1,'Preservativos',100,1000),(2,'Lubricante',60,1500),(3,'Shampoo',80,2000),(4,'Maquinasdeafeitar',50,1000),(5,'Juguetesexual',30,7000),(6,'BebidaInd',100,1500),(7,'CervezaInd',100,2000),(8,'RonInd',50,2500),(9,'PiscoInd',50,2500),(10,'WhiskeyInd',30,4000),(11,'ChampagneInd',30,4000),(12,'SnackVarios',100,4000),(13,'TabladeQuesos',50,12000),(14,'Sandwiches',100,3500),(15,'Sushi',50,12000),(16,'Pasteles',100,1500);
/*!40000 ALTER TABLE `stock` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuarios` (
  `idUsuarios` int(11) NOT NULL,
  `Login` varchar(45) DEFAULT NULL,
  `Password` int(11) DEFAULT NULL,
  `Persona_idPersona` int(11) NOT NULL,
  PRIMARY KEY (`idUsuarios`,`Persona_idPersona`),
  KEY `fk_Usuarios_Persona1_idx` (`Persona_idPersona`),
  CONSTRAINT `fk_Usuarios_Persona1` FOREIGN KEY (`Persona_idPersona`) REFERENCES `persona` (`idPersona`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (0,'Pedro',123,1);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'hotelopm'
--

--
-- Dumping routines for database 'hotelopm'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-09 14:36:44
