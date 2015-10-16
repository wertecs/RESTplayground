package eu.lovinger.ws.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * created by Dominik Lövinger <dominik@lovinger.eu> on 10/10/15.
 */
@XmlRootElement
public class Result {

    Integer result;

    public Result() {
    }

    public Result(int i) {
        this.result = i;
    }


    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
