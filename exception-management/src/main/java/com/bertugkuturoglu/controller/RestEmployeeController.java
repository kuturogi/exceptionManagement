package com.bertugkuturoglu.controller;


import com.bertugkuturoglu.dto.DtoEmployee;

public interface RestEmployeeController {

    public DtoEmployee findEmployeeById(Long id);
}
