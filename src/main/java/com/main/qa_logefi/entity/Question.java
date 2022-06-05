package com.main.qa_logefi.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Question implements Serializable {

    private Integer question_id;
    private Integer question_user_id;
    private Integer question_tax_department;
    private String question_name_cn;
    private String question_name_en;
    private String question_siren;
    private String question_siret;
    private Date question_request;
    private Date question_processing;
    private String status;
    private Date question_update_time;
    private Date question_create_time;
    private Integer question_status;
}
