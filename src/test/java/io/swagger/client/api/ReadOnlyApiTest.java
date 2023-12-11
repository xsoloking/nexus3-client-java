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

import io.swagger.client.model.ReadOnlyState;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ReadOnlyApi
 */
@Ignore
public class ReadOnlyApiTest {

    private final ReadOnlyApi api = new ReadOnlyApi();

    
    /**
     * Forcibly release read-only
     *
     * Forcibly release read-only status, including System initiated tasks. Warning: may result in data loss.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void forceReleaseTest() throws Exception {
        api.forceRelease();

        // TODO: test validations
    }
    
    /**
     * Enable read-only
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void freezeTest() throws Exception {
        api.freeze();

        // TODO: test validations
    }
    
    /**
     * Get read-only state
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getTest() throws Exception {
        ReadOnlyState response = api.get();

        // TODO: test validations
    }
    
    /**
     * Release read-only
     *
     * Release administrator initiated read-only status. Will not release read-only caused by system tasks.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void releaseTest() throws Exception {
        api.release();

        // TODO: test validations
    }
    
}