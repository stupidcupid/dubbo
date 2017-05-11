package com.dubbo.server.provider;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring_test/*.xml"})
//加载配置文件
public class BaseJunitTest
{
    protected void print(Object result)
    {
        System.out.println(JSONObject.toJSONString(result,
            SerializerFeature.WriteDateUseDateFormat,
            SerializerFeature.WriteMapNullValue));
    }
}
