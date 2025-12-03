package com.bertugkuturoglu.service;

import com.bertugkuturoglu.dto.DtoEmployee;
import com.bertugkuturoglu.model.Employee;

public interface IEmployeeService {

    public DtoEmployee findEmployeeById(long id);
}
