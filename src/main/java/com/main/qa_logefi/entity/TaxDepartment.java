package com.main.qa_logefi.entity;

import lombok.Data;
import java.io.Serializable;

@Data
public class TaxDepartment implements Serializable {
    private Integer tax_department_id;
    private String tax_department_name;
}
