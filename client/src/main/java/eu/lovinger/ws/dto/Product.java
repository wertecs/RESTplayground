package eu.lovinger.ws.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.UUID;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
@XmlRootElement
public class Product {

    private String id;

    private Specifications specs;

    private Gallery gallery;

    private GalleryItem mainImage;

    private Description desc;

    public Product() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }

    public GalleryItem getMainImage() {
        return mainImage;
    }

    public void setMainImage(GalleryItem mainImage) {
        this.mainImage = mainImage;
    }

    public Description getDesc() {
        return desc;
    }

    public void setDesc(Description desc) {
        this.desc = desc;
    }
}
