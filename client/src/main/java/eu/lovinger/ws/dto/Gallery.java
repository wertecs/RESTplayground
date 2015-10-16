package eu.lovinger.ws.dto;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public class Gallery {

    List<GalleryItem> items;

    public Gallery() {
        this.items = new LinkedList<>();
    }

    public void addItem(GalleryItem item) {
        this.items.add(item);
    }

    public List<GalleryItem> getItems() {
        return items;
    }

    public void setItems(List<GalleryItem> items) {
        this.items = items;
    }
}
