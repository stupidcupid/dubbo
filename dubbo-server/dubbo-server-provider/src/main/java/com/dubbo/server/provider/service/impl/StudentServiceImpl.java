package com.dubbo.server.provider.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dubbo.server.api.domain.Students;
import com.dubbo.server.api.service.StudentService;
import com.dubbo.server.provider.dao.StudentDao;

public class StudentServiceImpl implements StudentService
{
    
    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Students> getList()
    {
        
        return studentDao.getList();
    }
    
}
