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

public class ListUserDetailViewsTest extends InteractionsTestCase {

    @Test
    public void testListUserDetailViews() throws ApiException {
        ListUserDetailViews req;
        Request req2;
        DetailView [] resp;
        // it 'lists user interactions'
        req = new ListUserDetailViews("user");
        resp = this.client.send(req);
        assertEquals(1, resp.length);
        assertEquals ("item",resp[0].getItemId());
        assertEquals ("user",resp[0].getUserId());
    }
}
