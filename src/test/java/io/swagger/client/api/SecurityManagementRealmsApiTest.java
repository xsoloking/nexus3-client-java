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

import io.swagger.client.model.RealmApiXO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityManagementRealmsApi
 */
@Ignore
public class SecurityManagementRealmsApiTest {

    private final SecurityManagementRealmsApi api = new SecurityManagementRealmsApi();

    
    /**
     * List the active realm IDs in order
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getActiveRealmsTest() throws Exception {
        List<String> response = api.getActiveRealms();

        // TODO: test validations
    }
    
    /**
     * List the available realms
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRealmsTest() throws Exception {
        List<RealmApiXO> response = api.getRealms();

        // TODO: test validations
    }
    
    /**
     * Set the active security realms in the order they should be used
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void setActiveRealmsTest() throws Exception {
        List<String> body = null;
        api.setActiveRealms(body);

        // TODO: test validations
    }
    
}
