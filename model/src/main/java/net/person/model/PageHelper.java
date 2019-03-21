package net.person.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by admin on 2019/3/15.
 */
public class PageHelper<T> extends AbstractJsonObject {
    //实体类集合
    private List<T> rows = new ArrayList<T>();
    //数据总条数
    private int total;

    public PageHelper() {
        super();
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}

