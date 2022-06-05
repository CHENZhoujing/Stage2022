package com.main.qa_logefi.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层 税局接口
 */
@Repository("TaxDepartmentDao")
public interface TaxDepartmentDao {

    TaxDepartmentDao findTaxDepartmentById(Integer tax_department_id);

    List<TaxDepartmentDao> findAll();
}
