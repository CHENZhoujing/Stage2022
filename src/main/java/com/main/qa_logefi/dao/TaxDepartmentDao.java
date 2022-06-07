package com.main.qa_logefi.dao;

import com.main.qa_logefi.entity.TaxDepartment;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层 税局接口
 */
@Repository("TaxDepartmentDao")
public interface TaxDepartmentDao {

    TaxDepartment findTaxDepartmentById(Integer tax_department_id);

    List<TaxDepartment> findAll();

    void saveTaxDepartment(TaxDepartment taxDepartment);

    void updateTaxDepartment(TaxDepartment taxDepartment);

    void deleteTaxDepartment(Integer tax_department_id);
}
