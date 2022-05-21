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

import com.github.akhil11101997.nifi.client.model.LineageEntity;
import com.github.akhil11101997.nifi.client.model.ProvenanceEntity;
import com.github.akhil11101997.nifi.client.model.ProvenanceOptionsEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvenanceApi
 */
@Ignore
public class ProvenanceApiTest {

    private final ProvenanceApi api = new ProvenanceApi();

    
    /**
     * Deletes a lineage query
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteLineageTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        LineageEntity response = api.deleteLineage(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Deletes a provenance query
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteProvenanceTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        ProvenanceEntity response = api.deleteProvenance(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a lineage query
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getLineageTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        LineageEntity response = api.getLineage(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a provenance query
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProvenanceTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        Boolean summarize = null;
        Boolean incrementalResults = null;
        ProvenanceEntity response = api.getProvenance(id, clusterNodeId, summarize, incrementalResults);

        // TODO: test validations
    }
    
    /**
     * Gets the searchable attributes for provenance events
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getSearchOptionsTest() throws Exception {
        ProvenanceOptionsEntity response = api.getSearchOptions();

        // TODO: test validations
    }
    
    /**
     * Submits a lineage query
     *
     * Lineage queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the lineage request should be deleted by the client who originally submitted it.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitLineageRequestTest() throws Exception {
        LineageEntity body = null;
        LineageEntity response = api.submitLineageRequest(body);

        // TODO: test validations
    }
    
    /**
     * Submits a provenance query
     *
     * Provenance queries may be long running so this endpoint submits a request. The response will include the current state of the query. If the request is not completed the URI in the response can be used at a later time to get the updated state of the query. Once the query has completed the provenance request should be deleted by the client who originally submitted it.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitProvenanceRequestTest() throws Exception {
        ProvenanceEntity body = null;
        ProvenanceEntity response = api.submitProvenanceRequest(body);

        // TODO: test validations
    }
    
}
