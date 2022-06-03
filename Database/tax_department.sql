SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tax department
-- ----------------------------
DROP TABLE IF EXISTS `tax_department`;
CREATE TABLE `tax_department`
(
    `tax_department_id`   int(0) UNSIGNED                                        NOT NULL AUTO_INCREMENT COMMENT '税局编号',
    `tax_department_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '税局名称',
    PRIMARY KEY (`tax_department_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;
SET FOREIGN_KEY_CHECKS = 1;