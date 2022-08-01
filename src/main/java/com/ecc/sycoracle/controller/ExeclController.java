package com.ecc.sycoracle.controller;

import com.ecc.sycoracle.service.ExecDtoService;
import com.ecc.sycoracle.utils.Result;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author sunyc
 * @create 2022-07-06 17:17
 */
@RestController
@RequestMapping("/import")
@Slf4j
@CrossOrigin
@Api(tags="文件上传")
public class ExeclController {
    @Autowired
    ExecDtoService execDtoService;

    @ApiOperation("新增积分等级信息")
    @PostMapping("/file")
    public Result importFile(@RequestParam("file")MultipartFile file){
        System.out.println("AdminDictController.batchImport,,Execl 导入的第一步--------------传入文件");
        try {
            InputStream inputStream=file.getInputStream();
            execDtoService.importData(inputStream);
            return Result.ok().message("数据导入成功");
        } catch (IOException e) {
            throw new RuntimeException("导入失败");
        }
    }
}
