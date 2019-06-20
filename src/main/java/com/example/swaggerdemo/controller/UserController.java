package com.example.swaggerdemo.controller;

import com.example.swaggerdemo.core.Result;
import com.example.swaggerdemo.core.ResultGenerator;
import com.example.swaggerdemo.model.User;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Api(value = "/user", tags = "Swagger测试接口模块")
@RestController
@RequestMapping("/user")
public class UserController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @ApiOperation(value = "添加用户信息", notes = "添加用户信息,这里是详细说明")
    @ApiImplicitParam(name = "user", value = "用户信息", required = true, dataType = "User")
    @PostMapping
    public Result add(@RequestBody User user) {
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据Id删除用户信息", notes = "根据Id删除用户信息,这里是详细说明")
    @ApiImplicitParam(name = "id", value = "用户唯一id", required = true, dataType = "int")
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "根据Id修改用户信息", notes = "根据Id修改用户信息,这里是详细说明")
    @ApiImplicitParam(name = "user", value = "更新用户的信息", required = true, dataType = "User")
    @PutMapping
    public Result update(@RequestBody User user) {
        return ResultGenerator.genSuccessResult();
    }


    @ApiOperation(value = "根据Id查询用户信息", notes = "根据Id查询用户信息,这里是详细说明")
    @ApiImplicitParam(name = "id", value = "用户唯一id", required = true, dataType = "int")
//    @ApiResponse(code = 200, message = "SUCCESS", response = ResultGenericity.class)
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS", response = ResultGenericity.class),
            @ApiResponse(code = 400, message = "未授权"),
            @ApiResponse(code = 401, message = "授权过期")
    })
    @GetMapping("/{id}/detail")
    public Result detail(@PathVariable Integer id) {
        return ResultGenerator.genSuccessResult(new User());
    }

    @ApiOperation(value = "分页查询全部用户列表", notes = "查询全部用户列表,这里是详细说明")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "page", value = "页码", required = true, dataType = "int"),
            @ApiImplicitParam(name = "size", value = "个数", required = false, defaultValue = "10", dataType = "int")
    })
    @ApiResponses({
            @ApiResponse(code = 200, message = "SUCCESS", response = ResultListGenericity.class),
            @ApiResponse(code = 400, message = "未授权"),
            @ApiResponse(code = 401, message = "授权过期")
    })
    @GetMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        return ResultGenerator.genSuccessResult(new ArrayList<User>());
    }

    private static class ResultGenericity extends Result<User> {
    }

    private static class ResultListGenericity extends Result<List<User>> {
    }
}