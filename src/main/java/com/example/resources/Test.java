package com.example.resources;

import com.example.beans.Message;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/test")
public class Test 
{
    @Inject
    private Message msg;
    
    @GET
    @Path("/setmessage")
    public String setMessage()
    {
        msg.setMessage("Hello World");
        return "SETMESSAGE OK";
    }
    
    @GET
    @Path("/getmessage")
    public String getMessage()
    {
        return "MESSAGE: " + msg.getMessage();
    }
}