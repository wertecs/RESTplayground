package eu.lovinger.ws.core;

import com.google.common.collect.Lists;
import eu.lovinger.ws.Client;
import eu.lovinger.ws.db.Mock;
import eu.lovinger.ws.db.Repository;
import eu.lovinger.ws.dto.ListResponse;
import eu.lovinger.ws.dto.Product;
import eu.lovinger.ws.dto.Result;

import javax.ws.rs.NotFoundException;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/9/15.
 */
public class Api implements Client {
    //autowired
    private Repository repository;

    public Api() {

        this.repository = Mock.getRepository();
    }

    @Override
    public String sayHello() {
        return "Chello";
    }

    @Override
    public Result sum(Integer a, Integer b) {
        return new Result(a + b);
    }

    @Override
    public Product getProductById(Integer id) {

        return repository.getProductByID(id);

    }

    @Override
    public List<Product> getProducts(Integer start, Integer count) {
        return repository.getProducts(start,count);
    }

    @Override
    public ListResponse list200() {
        return new ListResponse(Lists.newArrayList(101L,102L));
    }

    @Override
    public ListResponse list204() {
        return null;
    }

    @Override
    public ListResponse list404() {
        throw new NotFoundException("404 pico");
    }

    @Override
    public ListResponse list500() {
        throw new WebApplicationException(Response.Status.INTERNAL_SERVER_ERROR);
    }

}
