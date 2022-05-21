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

import com.github.akhil11101997.nifi.client.model.ProvenanceEventEntity;
import com.github.akhil11101997.nifi.client.model.StreamingOutput;
import com.github.akhil11101997.nifi.client.model.SubmitReplayRequestEntity;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProvenanceEventsApi
 */
@Ignore
public class ProvenanceEventsApiTest {

    private final ProvenanceEventsApi api = new ProvenanceEventsApi();

    
    /**
     * Gets the input content for a provenance event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getInputContentTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        StreamingOutput response = api.getInputContent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets the output content for a provenance event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getOutputContentTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        StreamingOutput response = api.getOutputContent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Gets a provenance event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getProvenanceEventTest() throws Exception {
        String id = null;
        String clusterNodeId = null;
        ProvenanceEventEntity response = api.getProvenanceEvent(id, clusterNodeId);

        // TODO: test validations
    }
    
    /**
     * Replays content from a provenance event
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void submitReplayTest() throws Exception {
        SubmitReplayRequestEntity body = null;
        ProvenanceEventEntity response = api.submitReplay(body);

        // TODO: test validations
    }
    
}
