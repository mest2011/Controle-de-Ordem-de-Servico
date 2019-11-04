-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para controleos
CREATE DATABASE IF NOT EXISTS `controleos` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `controleos`;

-- Copiando estrutura para tabela controleos.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `cpf` varchar(20) DEFAULT NULL,
  `dataNascimento` varchar(20) DEFAULT NULL,
  `endereco` varchar(30) DEFAULT NULL,
  `cidade` varchar(20) DEFAULT NULL,
  `numero` varchar(20) DEFAULT NULL,
  `cep` varchar(20) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `celular` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela controleos.cliente: ~3 rows (aproximadamente)
DELETE FROM `cliente`;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`id`, `nome`, `cpf`, `dataNascimento`, `endereco`, `cidade`, `numero`, `cep`, `telefone`, `celular`) VALUES
	(1, 'Miguel Eto Sobral Teixeira', '395.000.000-94', '1996/05/23', 'rua maria tereza', 'sao paulo', '045', '03609-000', '(11)9921-2011', '(11)99921-2011'),
	(4, 'Mayara Silveira de Santana', '121.313.212-12', '1996/11/08', 'rua teste', 'são Paulo', '456', '00000-000', '(11)1111-1111', '(11)11111-1111'),
	(5, 'Luiz Antonio de Santana', '111.111.111-11', '1965/12/29', 'Rua jose', 'São paulo', '141', '08140-006', '(11)1111-1111', '(22)22222-2222');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela controleos.login_key
CREATE TABLE IF NOT EXISTS `login_key` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(50) DEFAULT NULL,
  `login` varchar(20) DEFAULT NULL,
  `senha` varchar(12) DEFAULT NULL,
  `hierarquia` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela controleos.login_key: ~3 rows (aproximadamente)
DELETE FROM `login_key`;
/*!40000 ALTER TABLE `login_key` DISABLE KEYS */;
INSERT INTO `login_key` (`id`, `nome`, `login`, `senha`, `hierarquia`) VALUES
	(1, 'Teste', '', '', 0),
	(2, 'miguel', 'mest', '123', 0),
	(11, 'mayara', 'maya', '', NULL);
/*!40000 ALTER TABLE `login_key` ENABLE KEYS */;

-- Copiando estrutura para tabela controleos.ordem_servico
CREATE TABLE IF NOT EXISTS `ordem_servico` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `modelo_aparelho` varchar(50) DEFAULT NULL,
  `numero_serie` varchar(30) DEFAULT NULL,
  `observacoes` text DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_cliente` (`id_cliente`),
  CONSTRAINT `ordem_servico_ibfk_1` FOREIGN KEY (`id_cliente`) REFERENCES `cliente` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela controleos.ordem_servico: ~3 rows (aproximadamente)
DELETE FROM `ordem_servico`;
/*!40000 ALTER TABLE `ordem_servico` DISABLE KEYS */;
INSERT INTO `ordem_servico` (`id`, `modelo_aparelho`, `numero_serie`, `observacoes`, `id_cliente`) VALUES
	(1, 'sm-g940m', '23213213sd', 'Aparelho não esta ligando!', 1),
	(2, 'moto g4 play', 'g456456', 'Aparelho esta sem os botoes de ligar e volume,\r\ntela paralela.\r\n\r\nSem conserto', 4),
	(3, 'motorola g6 play', '5641654654465', 'Aparelho não liga.\r\nEle fica na tela de loading e reiniciando.', 5);
/*!40000 ALTER TABLE `ordem_servico` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
