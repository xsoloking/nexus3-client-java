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

import io.swagger.client.model.ScriptResultXO;
import io.swagger.client.model.ScriptXO;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScriptApi
 */
@Ignore
public class ScriptApiTest {

    private final ScriptApi api = new ScriptApi();

    
    /**
     * Add a new script
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addTest() throws Exception {
        ScriptXO body = null;
        api.add(body);

        // TODO: test validations
    }
    
    /**
     * List all stored scripts
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void browseTest() throws Exception {
        List<ScriptXO> response = api.browse();

        // TODO: test validations
    }
    
    /**
     * Delete stored script by name
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void delete1Test() throws Exception {
        String name = null;
        api.delete1(name);

        // TODO: test validations
    }
    
    /**
     * Update stored script by name
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void editTest() throws Exception {
        String name = null;
        ScriptXO body = null;
        api.edit(name, body);

        // TODO: test validations
    }
    
    /**
     * Read stored script by name
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void read1Test() throws Exception {
        String name = null;
        ScriptXO response = api.read1(name);

        // TODO: test validations
    }
    
    /**
     * Run stored script by name
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void run1Test() throws Exception {
        String name = null;
        String body = null;
        ScriptResultXO response = api.run1(name, body);

        // TODO: test validations
    }
    
}
