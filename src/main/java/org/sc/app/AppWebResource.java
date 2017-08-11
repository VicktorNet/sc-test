/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sc.app;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.onosproject.rest.AbstractWebResource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.*;
import java.io.IOException;
import java.io.InputStream;
import com.google.gson.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.type.TypeReference;

import static org.onlab.util.Tools.nullIsNotFound;

/**
 * Sample web resource.
 */
@Path("login")
public class AppWebResource extends AbstractWebResource{

    /**
     * Get hello world greeting.
     *
     * @return 200 OK
     */
    @GET
    @Path("me")
     @Produces("application/json")
    public Response getGreeting() {
        ObjectNode node = mapper().createObjectNode().put("Scorched", "Earth");
        return ok(node).build();
          
    }

     
  @POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
  @Produces(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(InputStream stream) {

  ObjectNode root = mapper().createObjectNode();

  try {

  ObjectNode jsonTree = (ObjectNode) mapper().readTree(stream);

//String result = "Track saved : " + meow + " " + track;

} catch (IOException e)
{

e.printStackTrace();
}

  return ok(root).build();	
	}
}