package com.kq.service;

import com.kq.common.HttpResult;
import com.kq.condition.LoginCondition;
import com.kq.dto.LoginDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ILoginService
 * @author kq
 * @date 2019-03-30
 */
@Service
@FeignClient("feignserver")  //指明服务生产者名称
@RequestMapping("/api/login")
public interface ILoginService {


    /**
     * 登录
     * @param dto
     * @return
     */
    public HttpResult<LoginDto> login(LoginCondition dto);


}
