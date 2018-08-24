package com.ins.sys.classinfo.web;

import com.ins.sys.classinfo.domain.ClassInfoEntity;
import com.ins.sys.classinfo.service.ClassServiceImpl;
import com.ins.sys.tools.BasicController;
import com.ins.sys.tools.Constant;
import com.ins.sys.tools.PageInfo;
import com.ins.sys.tools.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/class")
@Api(value = "分类管理",tags = "分类管理")
public class ClassController extends BasicController<ClassInfoEntity> {

    @Autowired
    private ClassServiceImpl classServiceImpl;

    @RequestMapping("/save")
    @ApiOperation(value = "新增分类",httpMethod = "POST")
    public Result save(ClassInfoEntityForWeb classInfoEntityForWeb ) {
        try {
            ClassInfoEntity classInfoEntity = this.classServiceImpl.save(classInfoEntityForWeb.rev());
            return new Result(Constant.SUCCESS_STATUE,"新增成功",classInfoEntity);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Constant.FAIL_STATUE,e.getMessage());
        }
    }

    @RequestMapping("/delete")
    @ApiOperation(value = "删除分类",httpMethod = "POST")
    public Result delete(ClassInfoEntity classInfoEntity) {
        try {
            this.classServiceImpl.remove(classInfoEntity);
            return new Result(Constant.OK);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Constant.FAIL_STATUE,e.getMessage());
        }
    }

    @RequestMapping("/modify")
    @ApiOperation(value = "修改分类",httpMethod = "POST")
    public Result modify(ClassInfoEntity classInfoEntity) {
        try {
            return new Result(Constant.SUCCESS_STATUE,"修改成功",this.classServiceImpl.modify(classInfoEntity));
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Constant.FAIL_STATUE,e.getMessage());
        }
    }

    @RequestMapping("/pageSearch")
    @ApiOperation(value = "分页查询分类",httpMethod = "POST")
    public Result pageSearch(ClassInfoEntityForWeb classInfoEntityForWeb , PageInfo pageInfo) {
        try {
            Page<ClassInfoEntity> page = this.classServiceImpl.findByPage(classInfoEntityForWeb.rev(),pageInfo);
            return new Result(Constant.SUCCESS_STATUE,"查询成功",page.getContent(),pageInfo.getResult(page));
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Constant.FAIL_STATUE,e.getMessage());
        }
    }

    @RequestMapping("/searchByCode")
    @ApiOperation(value = "编码查询分类",httpMethod = "POST")
    public Result searchByCode(String code) {
        try {
            ClassInfoEntity classInfoEntity = this.classServiceImpl.findByCode(code);
            return new Result(Constant.SUCCESS_STATUE,"查询成功",classInfoEntity);
        }catch (Exception e){
            e.printStackTrace();
            return new Result(Constant.FAIL_STATUE,e.getMessage());
        }
    }
}
