package com.main.qa_logefi.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Integer user_id;
    private String user_name;
    private String agency_name;
    private String user_email;
    private String user_password;
    private Date user_register_time;
    private Integer user_status;
}
