SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
SET FOREIGN_KEY_CHECKS = 1;
