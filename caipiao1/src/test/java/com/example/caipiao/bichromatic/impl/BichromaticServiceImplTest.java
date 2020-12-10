package com.example.caipiao.bichromatic.impl;


import cn.hutool.core.collection.ListUtil;
import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import org.junit.jupiter.api.Test;

import java.util.*;

public class BichromaticServiceImplTest {

    @Test
    public void getNumber() {
        BichromaticServiceImpl bichromaticService = new BichromaticServiceImpl();
        bichromaticService.getNumber(5);
    }

    @Test
    public void testNumber() {
        List<Integer> value = new LinkedList<>();
        value.add(16);
        value.add(18);
        value.add(19);
        value.add(20);
        value.add(29);
        value.add(33);
        value.sort(Comparator.comparingInt(Integer::intValue));
        value.add(12);
        System.out.println(JSON.toJSONString(value));
        BichromaticServiceImpl bichromaticService = new BichromaticServiceImpl();
        bichromaticService.testNumber(JSON.toJSONString(value));
    }

    @Test
    public void test03() {
        int[] reds = NumberUtil.generateRandomNumber(1, 33, 6);
        Arrays.sort(reds);

        List<Integer> resultList = new LinkedList<>();
        Arrays.stream(reds).forEach(e -> resultList.add(e));

        int[] blue = NumberUtil.generateRandomNumber(1, 16, 1);
        resultList.add(blue[0]);
        System.out.println(JSON.toJSONString(resultList));
    }

}