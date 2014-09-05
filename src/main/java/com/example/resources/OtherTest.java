package com.example.resources;

import com.example.beans.Message;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/othertest")
public class OtherTest 
{
    @Inject
    private Message msg;
    
    @GET
    @Path("/getmessage")
    public String getMessage()
    {
        if (msg.getMessage() == null ||
                "".equals(msg.getMessage()))
        {
            return "Sorry, there's no message available.";
        }
        else
        {
            return "MESSAGE: " + msg.getMessage();
        }
    }
}
