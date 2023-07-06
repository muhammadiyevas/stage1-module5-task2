package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return (List<Integer> value) -> {
            List<Integer> list = new ArrayList<>();
            for (Integer item : value) {
                list.add(item / divider);

            }
            return list;
        };
    }
}
