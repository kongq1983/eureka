package com.kq.feignserver.ctrl;

import com.kq.common.HttpResult;
import com.kq.condition.LoginCondition;
import com.kq.dto.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * LoginController
 * @author kq
 * @date 2019-03-30
 */

@Controller
@RequestMapping("/api")
public class LoginController {


    @RequestMapping("/login")
    public HttpResult<LoginDto> login(LoginCondition dto) {
        LoginDto login = new LoginDto();
        login.setUsername(dto.getUsername());

        HttpResult<LoginDto> result = new HttpResult<>();
        result.setSuccess(true);
        result.setResult(login);

        return result;

    }


}
