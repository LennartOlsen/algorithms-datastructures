package com.company.generics.functional;

import java.util.Comparator;

/**
 * Created by lennartolsen on 12/09/2016.
 */
public class CaseInsenitiveCompare implements Comparator<String> {
    public int compare(String lhs, String rhs){
        return lhs.compareToIgnoreCase(rhs);
    }
}
