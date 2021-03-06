package com.main.qa_logefi.dao;

import com.main.qa_logefi.entity.TaxDepartment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层 税局接口
 */
@Mapper
@Repository("TaxDepartmentDao")
public interface TaxDepartmentDao {

    /**
     * 根据税局编号查询税局
     * @param tax_department_id
     * @return
     */
    TaxDepartment findTaxDepartmentById(Integer tax_department_id);

    /**
     * 查询所有税局
     * @return
     */
    List<TaxDepartment> findAll();

    /**
     * 新增税局
     * @param taxDepartment
     */
    void saveTaxDepartment(TaxDepartment taxDepartment);

    /**
     * 更新税局
     * @param taxDepartment
     */
    void updateTaxDepartment(TaxDepartment taxDepartment);

    /**
     * 根据ID删除税局
     * @param tax_department_id
     */
    void deleteTaxDepartment(Integer tax_department_id);
}
