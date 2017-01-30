package com.abh.java.bigx;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BigDecimanSort {

    public static void main(String[] args) {
        BigDecimalCompare bd1 = new BigDecimalCompare("90");
        BigDecimalCompare bd2 = new BigDecimalCompare("56.6");
        BigDecimalCompare bd3 = new BigDecimalCompare("-100");
        BigDecimalCompare bd4 = new BigDecimalCompare("000.000");
        BigDecimalCompare bd5 = new BigDecimalCompare("50");
        BigDecimalCompare bd6 = new BigDecimalCompare("02.34");
        BigDecimalCompare bd7 = new BigDecimalCompare("0.12");
        BigDecimalCompare bd8 = new BigDecimalCompare(".12");
        BigDecimalCompare bd9 = new BigDecimalCompare("0");
        List<BigDecimalCompare> list = new ArrayList<>();
        list.add(bd1);
        list.add(bd2);
        list.add(bd3);
        list.add(bd4);
        list.add(bd5);
        list.add(bd6);
        list.add(bd7);
        list.add(bd8);
        list.add(bd9);
        System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }

    static class BigDecimalCompare implements Comparable<BigDecimalCompare> {
        private String stringValue;
        private BigDecimal decmalVal;

        public BigDecimalCompare(String val) {
            this.stringValue = val;
            decmalVal = new BigDecimal(val);
        }

        @Override
        public int compareTo(BigDecimalCompare o) {
            // TODO Auto-generated method stub
            return decmalVal.compareTo(o.getDecmalVal());
        }

        public String getStringValue() {
            return stringValue;
        }

        public BigDecimal getDecmalVal() {
            return decmalVal;
        }

        @Override
        public String toString() {
            return this.stringValue;
        }
    }
}
