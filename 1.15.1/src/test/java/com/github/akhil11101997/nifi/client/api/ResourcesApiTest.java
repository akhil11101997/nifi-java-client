/*
 * NiFi Rest API
 * The Rest API provides programmatic access to command and control a NiFi instance in real time. Start and                                             stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.15.1
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.github.akhil11101997.nifi.client.api;

import com.github.akhil11101997.nifi.client.model.ResourcesEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourcesApi
 */
@Ignore
public class ResourcesApiTest {

    private final ResourcesApi api = new ResourcesApi();

    
    /**
     * Gets the available resources that support access/authorization policies
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getResourcesTest() throws Exception {
        ResourcesEntity response = api.getResources();

        // TODO: test validations
    }
    
}
