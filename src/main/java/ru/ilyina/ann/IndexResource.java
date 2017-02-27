package ru.ilyina.ann;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Ilyina Ann on 19.02.17.
 */
@Path("/index")
public class IndexResource {

    @GET
    public String get() {
        System.out.println("GET");
        return "Hello, my dear!";
    }
}
