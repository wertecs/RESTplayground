package eu.lovinger.ws;

import eu.lovinger.ws.dto.ListResponse;
import eu.lovinger.ws.dto.Product;
import eu.lovinger.ws.dto.Result;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by wertecs on 10/8/15.
 */
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface Client {

    @GET
    @Path("/hello")
    String sayHello();

    @GET
    @Path("/sum/{a:[0-9]+}/{b:[0-9]+}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    Result sum(@PathParam("a") Integer a, @PathParam("b") Integer b);

    @GET
    @Path("/prod/{id:[0-9]+}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    Product getProductById(@PathParam("id") Integer id);

    @GET
    @Path("/prod/list/{start:[0-9]+}/{count:[0-9]+}")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    List<Product> getProducts(@PathParam("start") Integer start, @PathParam("count") Integer count);

    @GET
    @Path("list200")
    ListResponse list200();

    @GET
    @Path("list204")
    ListResponse list204();

    @GET
    @Path("list404")
    ListResponse list404();

    @GET
    @Path("list500")
    ListResponse list500();


}
