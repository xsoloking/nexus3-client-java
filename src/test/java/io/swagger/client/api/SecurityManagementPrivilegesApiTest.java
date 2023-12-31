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

import io.swagger.client.model.ApiPrivilege;
import io.swagger.client.model.ApiPrivilegeApplicationRequest;
import io.swagger.client.model.ApiPrivilegeRepositoryAdminRequest;
import io.swagger.client.model.ApiPrivilegeRepositoryContentSelectorRequest;
import io.swagger.client.model.ApiPrivilegeRepositoryViewRequest;
import io.swagger.client.model.ApiPrivilegeScriptRequest;
import io.swagger.client.model.ApiPrivilegeWildcardRequest;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecurityManagementPrivilegesApi
 */
@Ignore
public class SecurityManagementPrivilegesApiTest {

    private final SecurityManagementPrivilegesApi api = new SecurityManagementPrivilegesApi();

    
    /**
     * Create a wildcard type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilegeTest() throws Exception {
        ApiPrivilegeWildcardRequest body = null;
        api.createPrivilege(body);

        // TODO: test validations
    }
    
    /**
     * Create an application type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilege1Test() throws Exception {
        ApiPrivilegeApplicationRequest body = null;
        api.createPrivilege1(body);

        // TODO: test validations
    }
    
    /**
     * Create a repository content selector type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilege2Test() throws Exception {
        ApiPrivilegeRepositoryContentSelectorRequest body = null;
        api.createPrivilege2(body);

        // TODO: test validations
    }
    
    /**
     * Create a repository admin type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilege3Test() throws Exception {
        ApiPrivilegeRepositoryAdminRequest body = null;
        api.createPrivilege3(body);

        // TODO: test validations
    }
    
    /**
     * Create a repository view type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilege4Test() throws Exception {
        ApiPrivilegeRepositoryViewRequest body = null;
        api.createPrivilege4(body);

        // TODO: test validations
    }
    
    /**
     * Create a script type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void createPrivilege5Test() throws Exception {
        ApiPrivilegeScriptRequest body = null;
        api.createPrivilege5(body);

        // TODO: test validations
    }
    
    /**
     * Delete a privilege by name.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void deletePrivilegeTest() throws Exception {
        String privilegeName = null;
        api.deletePrivilege(privilegeName);

        // TODO: test validations
    }
    
    /**
     * Retrieve a privilege by name.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPrivilegeTest() throws Exception {
        String privilegeName = null;
        ApiPrivilege response = api.getPrivilege(privilegeName);

        // TODO: test validations
    }
    
    /**
     * Retrieve a list of privileges.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getPrivilegesTest() throws Exception {
        List<ApiPrivilege> response = api.getPrivileges();

        // TODO: test validations
    }
    
    /**
     * Update a wildcard type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilegeTest() throws Exception {
        String privilegeName = null;
        ApiPrivilegeWildcardRequest body = null;
        api.updatePrivilege(privilegeName, body);

        // TODO: test validations
    }
    
    /**
     * Update an application type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilege1Test() throws Exception {
        String privilegeName = null;
        ApiPrivilegeApplicationRequest body = null;
        api.updatePrivilege1(privilegeName, body);

        // TODO: test validations
    }
    
    /**
     * Update a repository view type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilege2Test() throws Exception {
        String privilegeName = null;
        ApiPrivilegeRepositoryViewRequest body = null;
        api.updatePrivilege2(privilegeName, body);

        // TODO: test validations
    }
    
    /**
     * Update a repository content selector type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilege3Test() throws Exception {
        String privilegeName = null;
        ApiPrivilegeRepositoryContentSelectorRequest body = null;
        api.updatePrivilege3(privilegeName, body);

        // TODO: test validations
    }
    
    /**
     * Update a repository admin type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilege4Test() throws Exception {
        String privilegeName = null;
        ApiPrivilegeRepositoryAdminRequest body = null;
        api.updatePrivilege4(privilegeName, body);

        // TODO: test validations
    }
    
    /**
     * Update a script type privilege.
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void updatePrivilege5Test() throws Exception {
        String privilegeName = null;
        ApiPrivilegeScriptRequest body = null;
        api.updatePrivilege5(privilegeName, body);

        // TODO: test validations
    }
    
}
