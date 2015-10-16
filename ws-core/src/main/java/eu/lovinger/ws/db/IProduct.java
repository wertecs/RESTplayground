package eu.lovinger.ws.db;

import eu.lovinger.ws.dto.Product;

import java.util.List;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public interface IProduct {

    Product getProductByID(Integer id);

    List<Product> searchProductByName(String name);

    List<Product> getProducts(Integer start, Integer count);
}
