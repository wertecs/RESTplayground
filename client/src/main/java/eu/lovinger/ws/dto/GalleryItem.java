package eu.lovinger.ws.dto;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
public class GalleryItem {

    String thumb;
    String image;

    public GalleryItem() {
    }

    public GalleryItem(String thumb, String image) {
        this.thumb = thumb;
        this.image = image;
    }

    public GalleryItem(String thumb) {
        this.thumb = thumb;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }
}
