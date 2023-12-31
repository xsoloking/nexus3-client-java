/*
 * Nexus Repository Manager REST API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.63.0-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import io.swagger.client.model.UploadDefinitionXO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FormatsApi
 */
@Ignore
public class FormatsApiTest {

    private final FormatsApi api = new FormatsApi();

    
    /**
     * Get upload field requirements for the desired format
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void get1Test() throws Exception {
        String format = null;
        UploadDefinitionXO response = api.get1(format);

        // TODO: test validations
    }
    
    /**
     * Get upload field requirements for each supported format
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void get2Test() throws Exception {
        List<UploadDefinitionXO> response = api.get2();

        // TODO: test validations
    }
    
}
