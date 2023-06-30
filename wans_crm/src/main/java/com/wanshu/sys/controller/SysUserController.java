package com.wanshu.sys.controller;

import com.wanshu.sys.service.ISysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 系统用户 前端控制器
 * </p>
 *
 * @author qla
 * @since 2023-06-27
 */
@Controller
@RequestMapping("/sys/sysUser")
public class SysUserController {

}

//@Api(tags = "系统用户",value = "SysUser")
//@RestController
//@RequestMapping("/sys/sysUser")
//public class SysUserController {
//
//    @Autowired
//    private ISysUserService userService;
//
//    @ApiOperation(value = "查询系统用户",notes = "查询用户")
//    @GetMapping("/list")
//    public PageUtils list(SysUserQueryDTO dto){
//        return userService.queryPage(dto);
//    }
//
//}