package com.dubbo.server.provider.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dubbo.server.api.domain.Students;
import com.iflytek.iframework.orm.hibernate.HibernateGenericDao;

@Repository
public class StudentDao extends HibernateGenericDao
{
    
    public List<Students> getList(){
        
        String hql = "from Students";
        List<Students> demoList = super.find(hql);
        return demoList;
    }
}

