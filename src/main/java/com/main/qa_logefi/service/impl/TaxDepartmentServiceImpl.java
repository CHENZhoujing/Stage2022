package com.main.qa_logefi.service.impl;

import com.main.qa_logefi.dao.TaxDepartmentDao;
import com.main.qa_logefi.entity.TaxDepartment;
import com.main.qa_logefi.service.TaxDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("taxDepartmentService")
public class TaxDepartmentServiceImpl implements TaxDepartmentService {

    @Autowired()
    private TaxDepartmentDao taxDepartmentDao;

    @Override
    public TaxDepartment findTaxDepartmentById(Integer tax_department_id) {
        return taxDepartmentDao.findTaxDepartmentById(tax_department_id);
    }

    @Override
    public List<TaxDepartment> findAll() {
        return taxDepartmentDao.findAll();
    }

    @Override
    public void saveTaxDepartment(TaxDepartment taxDepartment) {
        taxDepartmentDao.saveTaxDepartment(taxDepartment);
    }

    @Override
    public void updateTaxDepartment(TaxDepartment taxDepartment) {
        taxDepartmentDao.updateTaxDepartment(taxDepartment);
    }

    @Override
    public void deleteTaxDepartment(Integer tax_department_id) {
        taxDepartmentDao.deleteTaxDepartment(tax_department_id);
    }
}
