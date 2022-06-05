package com.main.qa_logefi.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class Answer implements Serializable {

    private Integer answer_id;
    private Integer answer_user_id;
    private Integer answer_question_id;
    private String answer_content;
    private Date answer_update_time;
    private Date answer_create_time;
    private Integer answer_status;
}
