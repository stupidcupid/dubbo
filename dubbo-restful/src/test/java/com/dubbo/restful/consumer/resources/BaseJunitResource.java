package com.dubbo.restful.consumer.resources;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class BaseJunitResource
{
    protected ClientConfig config = new DefaultClientConfig();
    
    protected Client client = Client.create(config);
    
    protected WebResource webResource = client.resource("http://localhost:8003/dubbo-restful/rest/");
}
