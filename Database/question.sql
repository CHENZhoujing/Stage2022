SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for question
-- ----------------------------
DROP TABLE IF EXISTS `question`;
CREATE TABLE `question`
(
    `question_id`             int(0) UNSIGNED                                         NOT NULL AUTO_INCREMENT COMMENT '问题编号',
    `question_user_id`        int(0) UNSIGNED                                         NOT NULL COMMENT '问题的提问者用户编号（关联用户表）',
    `question_tax_department` int(0) UNSIGNED                                         NOT NULL COMMENT '税局名称',
    `question_name_cn`        text CHARACTER SET utf8 COLLATE utf8_general_ci         NULL COMMENT '公司中文名',
    `question_name_en`        text CHARACTER SET utf8 COLLATE utf8_general_ci         NULL COMMENT '公司英文名',
    `question_siren`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL     DEFAULT NULL COMMENT 'siren号',
    `question_siret`          varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL     DEFAULT NULL COMMENT 'siret号',
    `question_request`        datetime(6)                                             NULL     DEFAULT NULL COMMENT 'date_demande',
    `question_processing`     datetime(6)                                             NULL     DEFAULT NULL COMMENT 'date_traitement',
    `status`                  text CHARACTER SET utf8 COLLATE utf8_general_ci         NULL COMMENT '其他',
    `question_update_time`    datetime(6)                                             NULL     DEFAULT NULL COMMENT '问题更新时间',
    `question_create_time`    datetime(6)                                             NULL     DEFAULT NULL COMMENT '问题创建时间',
    `question_status`         int(0)                                                  NOT NULL DEFAULT 1 COMMENT '问题状态',
    PRIMARY KEY (`question_id`) USING BTREE,
    INDEX `q_qu_id` (`question_user_id`) USING BTREE,
    CONSTRAINT `q_qu_id` FOREIGN KEY (`question_user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE,
    INDEX `q_t_department` (`question_tax_department`) USING BTREE,
    CONSTRAINT `q_t_department` FOREIGN KEY (`question_tax_department`) REFERENCES `tax_department` (`tax_department_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
