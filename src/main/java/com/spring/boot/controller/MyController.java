package com.spring.boot.controller;

import com.spring.boot.dao.model.UserDataPo;
import com.spring.boot.service.MyService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


/**
 * Controller层
 *
 * @author 代码的路
 * @date 2022/6/8
 */


@RestController
@RequestMapping("/homepage")
public class MyController {

    @Resource
    MyService myService;

    @GetMapping("/deleteByPrimaryKey")
    public void deleteByPrimaryKey(@RequestParam("id") int id) {
        myService.deleteByPrimaryKey(id);
    }

    @GetMapping("/insert")
    public void insert(@RequestParam("id") int id, @RequestParam("name") String name) {
        myService.insert(id, name);
    }

    @GetMapping("/insertSelective")
    public void insertSelective(@RequestParam("id") int id, @RequestParam("name") String name) {
        myService.insertSelective(id, name);
    }

    @GetMapping("/selectByPrimaryKey")
    public UserDataPo selectByPrimaryKey(@RequestParam("id") int id) {
        return myService.selectByPrimaryKey(id);
    }

    @GetMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestParam("id") int id, @RequestParam("name") String name) {
        return myService.updateByPrimaryKeySelective(id, name);
    }

    @GetMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestParam("id") int id, @RequestParam("name") String name) {
        return myService.updateByPrimaryKey(id, name);
    }

}
