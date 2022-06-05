SET NAMES utf8mb4;

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

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`
(
    `user_id`              int(0) UNSIGNED                                        NOT NULL AUTO_INCREMENT COMMENT '用户编号',
    `user_name`            varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名',
    `agency_name`          varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '代理名',
    `user_email`           varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL     DEFAULT NULL COMMENT '用户邮箱',
    `user_password`        varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户密码',
    `user_register_time`   datetime(6)                                            NULL     DEFAULT NULL COMMENT '用户注册时间',
    `user_status`          int(0)                                                 NOT NULL DEFAULT 1 COMMENT '用户状态',
    PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

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

-- ----------------------------
-- Table structure for answer
-- ----------------------------
DROP TABLE IF EXISTS `answer`;
CREATE TABLE `answer`
(
    `answer_id`          int(0) UNSIGNED                                 NOT NULL AUTO_INCREMENT COMMENT '回答编号',
    `answer_user_id`     int(0) UNSIGNED                                 NOT NULL COMMENT '回答的回答者用户编号（关联用户表）',
    `answer_question_id` int(0) UNSIGNED                                 NOT NULL COMMENT '回答所对应的问题编号（关联问题表）',
    `answer_content`     text CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '回答内容',
    `answer_update_time` datetime(6)                                     NULL DEFAULT NULL COMMENT '回答更新时间',
    `answer_create_time` datetime(6)                                     NULL DEFAULT NULL COMMENT '回答创建时间',
    `answer_status`      int(0)                                          NULL DEFAULT 1 COMMENT '回答状态',
    PRIMARY KEY (`answer_id`) USING BTREE,
    INDEX `a_au_id` (`answer_user_id`) USING BTREE,
    INDEX `a_aq_id` (`answer_question_id`) USING BTREE,
    CONSTRAINT `a_aq_id` FOREIGN KEY (`answer_question_id`) REFERENCES `question` (`question_id`) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT `a_au_id` FOREIGN KEY (`answer_user_id`) REFERENCES `user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  CHARACTER SET = utf8
  COLLATE = utf8_general_ci
  ROW_FORMAT = Dynamic;

