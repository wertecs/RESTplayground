package eu.lovinger.ws.db;

import eu.lovinger.ws.dto.*;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public class Mock {
    public static Repository getRepository() {

        Repository r = mock(Repository.class);

        when(r.getProductByID(anyInt())).thenAnswer(answer -> Products.INSTANCE.getProductByID((Integer) answer.getArguments()[0]));

        when(r.getProducts(anyInt(), anyInt())).thenAnswer(
                answer -> {
                    Object[] o = answer.getArguments();
                    Integer[] args = Arrays.copyOf(o, o.length, Integer[].class);
                    return Products.INSTANCE.getProducts(args[0], args[1]);
                });

        return r;
    }


    static class Products implements IProduct {

        static Products INSTANCE = new Products();

        @Override
        public Product getProductByID(Integer id) {
            Product p = new Product();

            p.setId("123");
            p.setMainImage(new GalleryItem("123_thumb.jpg", "123.jpg"));

            Description des = new Description();
            des.setHeader("Product 123");
            des.addItem("Desc1", "Lorem Ipsum");
            des.addItem("Desc2", "Dolor Sit");

            p.setDesc(des);

            Specifications specs = new Specifications();
            specs.addItem("Material", "Gold");

            p.setSpecs(specs);

            Gallery g = new Gallery();

            g.addItem(new GalleryItem("img1", "img2"));

            p.setGallery(g);

            return p;
        }

        @Override
        public List<Product> searchProductByName(String name) {
            return null;
        }

        @Override
        public List<Product> getProducts(Integer start, Integer count) {
            List<Product> products = new LinkedList<>();

            for (int i = 0; i < count; i++) {
                products.add(getProductByID(0));
            }

            return products;
        }
    }
}
