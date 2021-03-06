package com.recombee.api_client;
/*
 This file is auto-generated, do not edit
*/


import com.recombee.api_client.api_requests.*;
import com.recombee.api_client.bindings.*;
import com.recombee.api_client.exceptions.ApiException;
import com.recombee.api_client.exceptions.ResponseException;

import java.util.HashMap;
import java.util.Date;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.fail;

public class AddItemPropertyTest extends RecombeeTestCase {

    @Test
    public void testAddItemProperty() throws ApiException {
        AddItemProperty req;
        Request req2;
        String  resp;
        // it 'does not fail with valid name and type'
        req = new AddItemProperty("number","int");
        resp = this.client.send(req);
        req = new AddItemProperty("str","string");
        resp = this.client.send(req);
        // it 'fails with invalid type'
        req = new AddItemProperty("prop","integer");
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(400,ex.getStatusCode());
        }
        // it 'really stores property to the system'
        req = new AddItemProperty("number2","int");
        resp = this.client.send(req);
        try {
            this.client.send(req);
            fail("No exception thrown");
        } catch (ResponseException ex) {
            assertEquals(409,ex.getStatusCode());
        }
    }
}
