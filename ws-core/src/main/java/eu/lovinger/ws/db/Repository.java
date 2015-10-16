package eu.lovinger.ws.db;

import eu.lovinger.ws.dto.Product;

import java.util.List;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public class Repository implements  IProductRepository{
    @Override
    public Product getProductByID(Integer id){
        throw new UnsupportedOperationException("NIY");
    }

    @Override
    public List<Product> searchProductByName(String name) {
        return null;
    }

    @Override
    public List<Product> getProducts(Integer start,  Integer count) {
        return null;
    }
}
