//package com.ins.sys.equipment.web;
//
//import com.ins.sys.equipment.domain.EquipmentInfoEntity;
//import com.ins.sys.equipment.domain.EquipmentRepository;
//import com.ins.sys.equipment.domain.StateRepository;
//import com.ins.sys.equipment.service.EQService;
//import com.ins.sys.equipment.service.StateService;
//import com.ins.sys.tools.Constant;
//import com.ins.sys.tools.Result;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/eq")
//@Api(value = "设备管理",tags = "设备管理")
//public class EQController {
//
//    @Autowired
//    private EQService eqService;
//
//    @Autowired
//    private StateService stateService;
//
//    @Autowired
//    private EquipmentRepository eqRepository;
//
//    @Autowired
//    private StateRepository stateRepository;
//
//    @RequestMapping("/save")
//    @ApiOperation(value = "新增设备信息", httpMethod = "POST")
//    public Result save(EquipmentInfoEntity equipmentInfoEntity){
//        try{
//            return new Result(Constant.SUCCESS_STATUE,"新增成功",this.eqService.save(equipmentInfoEntity));
//        }catch (Exception e){
//            e.printStackTrace();
//            return new Result(Constant.FAIL_STATUE,"操作失败");
//        }
//    }
//
//    @RequestMapping("/delete")
//    @ApiOperation(value = "删除设备信息", httpMethod = "POST")
//    public Result delete(EquipmentInfoEntity equipmentInfoEntity){
//        try{
//            return new Result(Constant.SUCCESS_STATUE,"新增成功",this.eqRepository.save(equipmentInfoEntity));
//        }catch (Exception e){
//            e.printStackTrace();
//            return new Result(Constant.FAIL_STATUE,"操作失败");
//        }
//    }
//
//    @RequestMapping("/save")
//    @ApiOperation(value = "新增设备信息", httpMethod = "POST")
//    public Result save(EquipmentInfoEntity equipmentInfoEntity){
//        try{
//            return new Result(Constant.SUCCESS_STATUE,"新增成功",this.eqRepository.save(equipmentInfoEntity));
//        }catch (Exception e){
//            e.printStackTrace();
//            return new Result(Constant.FAIL_STATUE,"操作失败");
//        }
//    }
//
//    @RequestMapping("/save")
//    @ApiOperation(value = "新增设备信息", httpMethod = "POST")
//    public Result save(EquipmentInfoEntity equipmentInfoEntity){
//        try{
//            return new Result(Constant.SUCCESS_STATUE,"新增成功",this.eqRepository.save(equipmentInfoEntity));
//        }catch (Exception e){
//            e.printStackTrace();
//            return new Result(Constant.FAIL_STATUE,"操作失败");
//        }
//    }
//
//    @RequestMapping("/save")
//    @ApiOperation(value = "新增设备信息", httpMethod = "POST")
//    public Result save(EquipmentInfoEntity equipmentInfoEntity){
//        try{
//            return new Result(Constant.SUCCESS_STATUE,"新增成功",this.eqRepository.save(equipmentInfoEntity));
//        }catch (Exception e){
//            e.printStackTrace();
//            return new Result(Constant.FAIL_STATUE,"操作失败");
//        }
//    }
//}
