/*
Navicat MySQL Data Transfer

Source Server         : Mysql
Source Server Version : 80021
Source Host           : localhost:3306
Source Database       : project

Target Server Type    : MYSQL
Target Server Version : 80021
File Encoding         : 65001

Date: 2020-08-27 17:18:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for acomment
-- ----------------------------
DROP TABLE IF EXISTS `acomment`;
CREATE TABLE `acomment` (
  `AComment_ID` int NOT NULL AUTO_INCREMENT,
  `AComment_ArticleID` int NOT NULL,
  `AComment_Content` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AComment_UserName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `AComment_Data` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`AComment_ID`),
  KEY `ACA` (`AComment_ArticleID`),
  KEY `ACV` (`AComment_UserName`),
  CONSTRAINT `ACA` FOREIGN KEY (`AComment_ArticleID`) REFERENCES `article` (`Article_ID`),
  CONSTRAINT `ACV` FOREIGN KEY (`AComment_UserName`) REFERENCES `visitor` (`VisitorName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of acomment
-- ----------------------------

-- ----------------------------
-- Table structure for article
-- ----------------------------
DROP TABLE IF EXISTS `article`;
CREATE TABLE `article` (
  `Article_ID` int NOT NULL AUTO_INCREMENT,
  `Article_FileName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Article_Path` varchar(255) DEFAULT NULL,
  `Article_Data` varchar(255) DEFAULT NULL,
  `Article_Title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Article_ID`),
  KEY `ATT` (`Article_FileName`),
  CONSTRAINT `ATT` FOREIGN KEY (`Article_FileName`) REFERENCES `record` (`Record_FileName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of article
-- ----------------------------
INSERT INTO `article` VALUES ('1', 'cs.txt', '/assets/Article/', '2020/8/28', 'cs');

-- ----------------------------
-- Table structure for pcomment
-- ----------------------------
DROP TABLE IF EXISTS `pcomment`;
CREATE TABLE `pcomment` (
  `PComment_ID` int NOT NULL AUTO_INCREMENT,
  `PComment_UserName` varchar(255) DEFAULT NULL,
  `PComment_PictureID` int DEFAULT NULL,
  `PComment_Data` varchar(255) DEFAULT NULL,
  `PComment_Context` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`PComment_ID`),
  KEY `PCP` (`PComment_PictureID`),
  KEY `PCV` (`PComment_UserName`),
  CONSTRAINT `PCP` FOREIGN KEY (`PComment_PictureID`) REFERENCES `picture` (`Picture_ID`),
  CONSTRAINT `PCV` FOREIGN KEY (`PComment_UserName`) REFERENCES `visitor` (`VisitorName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pcomment
-- ----------------------------

-- ----------------------------
-- Table structure for picture
-- ----------------------------
DROP TABLE IF EXISTS `picture`;
CREATE TABLE `picture` (
  `Picture_ID` int NOT NULL AUTO_INCREMENT,
  `Picture_FileName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Picture_Path` varchar(255) DEFAULT NULL,
  `Picture_Data` varchar(255) DEFAULT NULL,
  `Picture_Title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Picture_ID`),
  KEY `PTT` (`Picture_FileName`),
  CONSTRAINT `PTT` FOREIGN KEY (`Picture_FileName`) REFERENCES `record` (`Record_FileName`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of picture
-- ----------------------------
INSERT INTO `picture` VALUES ('1', '66819724_p0.png', '/assets/Picture/', '66819724_p0.png', '猫');

-- ----------------------------
-- Table structure for power
-- ----------------------------
DROP TABLE IF EXISTS `power`;
CREATE TABLE `power` (
  `power_id` int NOT NULL,
  `power_type` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`power_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of power
-- ----------------------------
INSERT INTO `power` VALUES ('1', 'user');
INSERT INTO `power` VALUES ('99', 'developer');

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record` (
  `Record_ID` int NOT NULL AUTO_INCREMENT,
  `Record_Type` varchar(255) DEFAULT NULL,
  `Record_FileName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Record_data` varchar(255) DEFAULT NULL,
  `Record_Path` varchar(255) DEFAULT NULL,
  `Record_Title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Record_ID`),
  KEY `Record_Title` (`Record_FileName`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1', 'picture', '66819724_p0.png', '2020/8/28', '/assets/Picture/', 'dfg');
INSERT INTO `record` VALUES ('2', 'fgf', 'asfgh', 'fgnh', 'fgn', 'fg');
INSERT INTO `record` VALUES ('3', 'Article', 'cs.txt', '2020/8/28', '/assets/Article/', 'cs');

-- ----------------------------
-- Table structure for vcomment
-- ----------------------------
DROP TABLE IF EXISTS `vcomment`;
CREATE TABLE `vcomment` (
  `VComment_ID` int NOT NULL AUTO_INCREMENT,
  `VComment_VideoID` int DEFAULT NULL,
  `VComment_Content` varchar(255) DEFAULT NULL,
  `VComment_UserName` varchar(255) DEFAULT NULL,
  `VComment_Data` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`VComment_ID`),
  KEY `VCV` (`VComment_VideoID`),
  KEY `VCVN` (`VComment_UserName`),
  CONSTRAINT `VCV` FOREIGN KEY (`VComment_VideoID`) REFERENCES `video` (`Video_ID`),
  CONSTRAINT `VCVN` FOREIGN KEY (`VComment_UserName`) REFERENCES `visitor` (`VisitorName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vcomment
-- ----------------------------

-- ----------------------------
-- Table structure for video
-- ----------------------------
DROP TABLE IF EXISTS `video`;
CREATE TABLE `video` (
  `Video_ID` int NOT NULL AUTO_INCREMENT,
  `Video_FileName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Video_Path` varchar(255) DEFAULT NULL,
  `Video_Data` varchar(255) DEFAULT NULL,
  `Video_Title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`Video_ID`),
  KEY `VTT` (`Video_FileName`),
  CONSTRAINT `VTT` FOREIGN KEY (`Video_FileName`) REFERENCES `record` (`Record_FileName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of video
-- ----------------------------

-- ----------------------------
-- Table structure for visitor
-- ----------------------------
DROP TABLE IF EXISTS `visitor`;
CREATE TABLE `visitor` (
  `VisitorID` int NOT NULL AUTO_INCREMENT,
  `VisitorName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Visitorpwd` varchar(255) DEFAULT NULL,
  `VisitorRoleID` int DEFAULT NULL,
  PRIMARY KEY (`VisitorID`),
  KEY `UR_ID` (`VisitorRoleID`),
  KEY `VisitorName` (`VisitorName`),
  CONSTRAINT `UR_ID` FOREIGN KEY (`VisitorRoleID`) REFERENCES `power` (`power_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of visitor
-- ----------------------------
INSERT INTO `visitor` VALUES ('1', '绿辉zzZ', 'lhyjtz529527', '99');
INSERT INTO `visitor` VALUES ('2', '痴心妄想', 'llllll', '1');
