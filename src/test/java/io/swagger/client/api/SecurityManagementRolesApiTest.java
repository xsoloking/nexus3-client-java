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

import io.swagger.client.model.RoleXORequest;
import io.swagger.client.model.RoleXOResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityManagementRolesApi
 */
@Ignore
public class SecurityManagementRolesApiTest {

    private final SecurityManagementRolesApi api = new SecurityManagementRolesApi();

    
    /**
     * Create role
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createTest() throws Exception {
        RoleXORequest body = null;
        RoleXOResponse response = api.create(body);

        // TODO: test validations
    }
    
    /**
     * Delete role
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deleteTest() throws Exception {
        String id = null;
        api.delete(id);

        // TODO: test validations
    }
    
    /**
     * Get role
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRoleTest() throws Exception {
        String id = null;
        String source = null;
        RoleXOResponse response = api.getRole(id, source);

        // TODO: test validations
    }
    
    /**
     * List roles
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRolesTest() throws Exception {
        String source = null;
        List<RoleXOResponse> response = api.getRoles(source);

        // TODO: test validations
    }
    
    /**
     * Update role
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void update1Test() throws Exception {
        String id = null;
        RoleXORequest body = null;
        api.update1(id, body);

        // TODO: test validations
    }
    
}
