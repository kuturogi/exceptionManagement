package com.bertugkuturoglu.dto;

import com.bertugkuturoglu.model.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DtoEmployee {


    private Long id;

    private String name;

    private DtoDepartment department;

}
