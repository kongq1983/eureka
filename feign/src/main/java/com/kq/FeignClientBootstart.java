package com.kq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * FeignClientBootstart
 *
 * @author kq
 * @date 2019-03-30
 */

@EnableFeignClients
@SpringBootApplication
public class FeignClientBootstart {


    public static void main(String[] args) {
        SpringApplication.run(FeignClientBootstart.class, args);
    }


}
