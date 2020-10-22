package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.BkUser;
import com.company.project.service.BkUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/10/22.
*/
@Api(tags = {"标签1"}, value = "控制器1")
@RestController
@RequestMapping("/bk/user")
public class BkUserController {
    @Resource
    private BkUserService bkUserService;

    @ApiOperation(value = "添加用户", notes = "详细说明...")
    @PostMapping("/add")
    public Result add(@RequestBody BkUser bkUser) {
        bkUserService.save(bkUser);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "删除用户", notes = "详细说明...")
    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        bkUserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "修改用户", notes = "详细说明...")
    @PostMapping("/update")
    public Result update(BkUser bkUser) {
        bkUserService.update(bkUser);
        return ResultGenerator.genSuccessResult();
    }

    @ApiOperation(value = "查看用户", notes = "详细说明...")
    @GetMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        BkUser bkUser = bkUserService.findById(id);
        return ResultGenerator.genSuccessResult(bkUser);
    }

    @ApiOperation(value = "分页查询用户列表", notes = "详细说明...")
    @GetMapping("/list")
    public Result list(@ApiParam(required = true, value = "页数") @RequestParam(defaultValue = "0") Integer page, @ApiParam(value = "每页条数") @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<BkUser> list = bkUserService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
