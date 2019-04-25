package com.yinda.gbcommon.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yinda.gbcommon.bean.Device;
import com.yinda.gbcommon.service.DeviceService;

@Api(tags="用户管理")
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private DeviceService deviceService;

    @ApiOperation(value = "主页", notes = "进入主页")
    @RequestMapping(value="/index",method = RequestMethod.GET)
    @ResponseBody
    public String index(){
        return "/mian/index.html";
    }

    @ApiOperation(value = "根据id获得设备信息-GET请求", notes = "根据id获得设备信息")
    @RequestMapping(value = "/queryByIdGet",method = RequestMethod.GET)
    @ResponseBody
    public Device get(@RequestParam(value="id") Long id){
        return deviceService.queryById(id);
    }
    
    @ApiOperation(value = "根据id获得设备信息-POST请求", notes = "根据id获得设备信息")
    @RequestMapping(value = "/queryByIdPost",method = RequestMethod.POST)
    @ResponseBody
    public Device post(@RequestBody Long id){
        return deviceService.queryById(id);
    }
    
}
