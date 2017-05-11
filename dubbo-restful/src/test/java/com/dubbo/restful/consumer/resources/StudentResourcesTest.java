/**
* Project Name:dubbo-restful
* File Name:StudentResourcesTest.java
* Package Name:com.dubbo.restful.consumer.resources
* Date:2016-11-12下午04:17:25
* Copyright (c) 2016, nanzhou All Rights Reserved.
*
*/

package com.dubbo.restful.consumer.resources;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;

import org.junit.Test;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.dubbo.restful.consumer.resources.BaseJunitResource;

public class StudentResourcesTest extends BaseJunitResource
{
    @Test
    public void testQuerySchemeList()
    {
        
        MultivaluedMap<String, String> param = new MultivaluedMapImpl();
        
        ClientResponse response =
            webResource.path("/student/list")
                .queryParams(param)
                .type(MediaType.APPLICATION_FORM_URLENCODED)
                .get(ClientResponse.class);
        System.out.println(response.getStatus() + "+" + response.getEntity(String.class));
    }
}
