/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50634
 Source Host           : localhost:3306
 Source Schema         : order_2

 Target Server Type    : MySQL
 Target Server Version : 50634
 File Encoding         : 65001

 Date: 10/06/2020 13:25:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order_1
-- ----------------------------
DROP TABLE IF EXISTS `order_1`;
CREATE TABLE `order_1`  (
  `order_id` bigint(20) NOT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_1
-- ----------------------------
INSERT INTO `order_1` VALUES (477117971471269888, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117971693568000, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117972637286400, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117972951859200, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117973622947840, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117974033989632, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117974382116864, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117974705078272, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117974977708032, 1.00, NULL, 1);
INSERT INTO `order_1` VALUES (477117975187423232, 1.00, NULL, 1);

-- ----------------------------
-- Table structure for order_2
-- ----------------------------
DROP TABLE IF EXISTS `order_2`;
CREATE TABLE `order_2`  (
  `order_id` bigint(20) NOT NULL,
  `price` decimal(10, 2) NULL DEFAULT NULL,
  `status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `user_id` bigint(20) NULL DEFAULT NULL,
  PRIMARY KEY (`order_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of order_2
-- ----------------------------
INSERT INTO `order_2` VALUES (477117969864851457, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117971588710401, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117972435959809, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117972742144001, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117973161574401, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117973782331393, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117974138847233, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117974491168769, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117974839296001, 1.00, NULL, 1);
INSERT INTO `order_2` VALUES (477117975082565633, 1.00, NULL, 1);

SET FOREIGN_KEY_CHECKS = 1;
