package com.main.qa_logefi.service;

import com.main.qa_logefi.entity.TaxDepartment;

import java.util.List;

public interface TaxDepartmentService {

    TaxDepartment findTaxDepartmentById(Integer tax_department_id);

    List<TaxDepartment> findAll();

    void saveTaxDepartment(TaxDepartment taxDepartment);

    void updateTaxDepartment(TaxDepartment taxDepartment);

    void deleteTaxDepartment(Integer tax_department_id);
}