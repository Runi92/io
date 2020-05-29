package serialization;

import java.io.Serializable;
import java.util.Date;

public class Signal implements Serializable {

    private static final long serialVersionUID = 1123235123l;

    transient private int id;
    private String tagret;
    private Date date;
    public State state;

    public Signal(int id, String tagret, Date date) {
        this.id = id;
        this.tagret = tagret;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTagret() {
        return tagret;
    }

    public void setTagret(String tagret) {
        this.tagret = tagret;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
