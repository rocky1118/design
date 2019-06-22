package com.cmy.design.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 策略模式 中间逻辑不同，结果一样
 */
public class MyListTest {

    public static void main(String[] args) {
        new MyList().sort(new NumberComparator());


        //策略模式
        List<Long> numbers = new ArrayList<Long>();

        Collections.sort(numbers, new Comparator<Long>() {

            @Override
            //返回值是固定的
            //0 、-1 、1
            //0 、 >0 、<0
            public int compare(Long o1, Long o2) {

                //中间逻辑是不一样的

                return 0;
            }


        });
    }
}
