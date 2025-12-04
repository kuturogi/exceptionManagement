package com.bertugkuturoglu.service.impl;

import com.bertugkuturoglu.dto.DtoDepartment;
import com.bertugkuturoglu.dto.DtoEmployee;
import com.bertugkuturoglu.exception.BaseException;
import com.bertugkuturoglu.exception.ErrorMessage;
import com.bertugkuturoglu.exception.MessageType;
import com.bertugkuturoglu.model.Department;
import com.bertugkuturoglu.model.Employee;
import com.bertugkuturoglu.repository.EmployeeRepository;
import com.bertugkuturoglu.service.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public DtoEmployee findEmployeeById(long id) {

        DtoEmployee dtoEmployee = new DtoEmployee();
        DtoDepartment dtoDepartment = new DtoDepartment();

        Optional<Employee> optional = employeeRepository.findById(id);
        if (optional.isEmpty()){
            throw new BaseException(new ErrorMessage(MessageType.NO_RECORD_EXIST, null));
        }
        Employee employee = optional.get();
        Department department = employee.getDepartment();
        BeanUtils.copyProperties(employee, dtoEmployee);
        BeanUtils.copyProperties(department, dtoDepartment);

        dtoEmployee.setDepartment(dtoDepartment);

        return dtoEmployee;
    }
}
