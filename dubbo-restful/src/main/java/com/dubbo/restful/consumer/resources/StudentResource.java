/**
 * Project Name:dubbo-restful
 * File Name:StudentResource.java
 * Package Name:com.dubbo.restful.consumer.resources
 * Date:2016-11-12下午04:00:33
 * Copyright (c) 2016, nanzhou All Rights Reserved.
 *
 */

package com.dubbo.restful.consumer.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;
import com.dubbo.server.api.service.StudentService;

@Component
@Path("/student")
public class StudentResource {
	@Autowired
	private StudentService studentService;

	@GET
	@Path("/list")
	@Produces("text/json;charset=utf-8")
	public String getList() {
		return JSONObject.toJSONString(studentService.getList());
	} 
}
