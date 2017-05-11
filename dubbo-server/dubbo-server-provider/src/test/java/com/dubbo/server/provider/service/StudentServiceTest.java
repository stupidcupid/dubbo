package com.dubbo.server.provider.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dubbo.server.api.domain.Students;
import com.dubbo.server.api.service.StudentService;
import com.dubbo.server.provider.BaseJunitTest;

public class StudentServiceTest extends BaseJunitTest
{
    @Autowired
    private StudentService studentService;
    
    @Test
    public void getList()
    {
        List<Students> list = studentService.getList();
        this.print(list);
    }
    
}
