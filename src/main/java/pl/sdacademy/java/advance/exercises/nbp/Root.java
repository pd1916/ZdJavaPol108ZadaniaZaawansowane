package pl.sdacademy.java.advance.exercises.nbp;

import java.util.ArrayList;
import java.util.Objects;

public class Root{
    private String table;
    private String no;
    private String effectiveDate;
    private ArrayList<Rate> rates;

    public String getTable() {
        return table;
    }

    public String getNo() {
        return no;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public ArrayList<Rate> getRates() {
        return rates;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Root root = (Root) o;
        return Objects.equals(table, root.table) && Objects.equals(no, root.no) && Objects.equals(effectiveDate, root.effectiveDate) && Objects.equals(rates, root.rates);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table, no, effectiveDate, rates);
    }

    @Override
    public String toString() {
        return "Root{" +
                "table='" + table + '\'' +
                ", no='" + no + '\'' +
                ", effectiveDate='" + effectiveDate + '\'' +
                ", rates=" + rates +
                '}';
    }
}