package ru.ilyina.ann.resource;

import ru.ilyina.ann.domain.MDemo;
import ru.ilyina.ann.service.DemoService;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Created by anjytka on 28.02.17.
 */
@Path("/demos")
@Produces(MediaType.APPLICATION_JSON)
public class DemoResource {

    @Inject
    private DemoService demoService;

    @GET
    public Response list() {
        return Response.ok(demoService.getAll()).build();
    }

}
