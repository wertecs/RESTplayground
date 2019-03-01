package eu.lovinger.ws.dto;

import java.io.Serializable;
import java.util.List;

/**
 *
 */
public class ListResponse implements Serializable {

    private List<Long> data;

    public ListResponse() {
    }

    public ListResponse(List<Long> data) {
        this.data = data;
    }

    public List<Long> getData() {
        return data;
    }

    public void setData(List<Long> data) {
        this.data = data;
    }
}
