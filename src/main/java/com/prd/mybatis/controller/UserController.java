package com.prd.mybatis.controller;

import com.prd.mybatis.LimitConfig;
import com.prd.mybatis.entity.User;
import com.prd.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private LimitConfig limitConfig;

    //该种参数的url访问写法为localhost:8080/user/money/100,则可获取到id值为100
    /*@GetMapping("/money/{id}")
    public String say(@PathVariable("id") Integer myId){
        return "说明："+limitConfig.getDescription()+";id="+myId;
    }*/

    //该种参数的url访问写法为http://localhost:8080/user/money?id=100,则可获取到id值为100
    @GetMapping("/money")
    public String say(@RequestParam(value = "id",required = false,defaultValue="0") Integer myId){
        return "说明："+limitConfig.getDescription()+";id="+myId;
    }

    /*@Value("${minMoney}")
    private BigDecimal minMoney;

    @Value(("${description}"))
    private String description;

    @Value("${maxMoney}")
    private BigDecimal maxMoney;

    @GetMapping(value = "/money")
    public String say() {
        return "说明："+description;
    }*/

    @GetMapping("/selectByPrimaryKey/{userId}")
    public User selectByPrimaryKey(@PathVariable("userId") Integer userId) {
        return userService.selectByPrimaryKey(userId);
    }
}
