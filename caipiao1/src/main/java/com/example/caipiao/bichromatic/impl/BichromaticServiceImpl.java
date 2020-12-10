package com.example.caipiao.bichromatic.impl;

import cn.hutool.core.util.NumberUtil;
import com.alibaba.fastjson.JSON;
import com.example.caipiao.bichromatic.BichromaticService;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Description TODO
 * @Author yueguang
 * @Date 2020/12/10
 * @Version 1.0
 */
@Service
public class BichromaticServiceImpl implements BichromaticService {

    @Override
    public void getNumber(int size) {
        for (int i = 0; i < size; i++) {
            String number = randomNumber();
            System.out.println(number);
        }
    }

    private String randomNumber() {
        int[] reds = NumberUtil.generateRandomNumber(1, 33, 6);
        Arrays.sort(reds);

        List<Integer> resultList = new LinkedList<>();
        Arrays.stream(reds).forEach(e -> resultList.add(e));

        int[] blue = NumberUtil.generateRandomNumber(1, 16, 1);
        resultList.add(blue[0]);
        return JSON.toJSONString(resultList);
    }

    @Override
    public void testNumber(String number) {
        int i = 0;
        while (true){
            i++;
            String s = randomNumber();
            System.out.println(s);
            if(number.equals(s)){
                System.out.println("次数："+i);
                break;
            }
        }
    }


}
