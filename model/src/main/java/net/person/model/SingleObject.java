package net.person.model;

/**
 * Created by admin on 2019/3/15.
 */
public class SingleObject extends AbstractJsonObject {
    private Object object;
    public Object getObject() {
        return object;
    }
    public void setObject(Object object) {
        this.object = object;
    }
}
