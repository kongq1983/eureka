package com.kq.eurekaserver;

import java.util.stream.IntStream;

/**
 * IntStreamTest
 *
 * @author kq
 * @date 2019/3/15
 */
public class IntStreamTest {

    public static void main(String[] args) {
        IntStream.rangeClosed(10,20).forEach(System.out::println);


    }

}
