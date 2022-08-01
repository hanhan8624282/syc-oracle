package com.ecc.sycoracle.service.impl;

import com.alibaba.excel.EasyExcel;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ecc.sycoracle.listener.ExeclDTOListener;
import com.ecc.sycoracle.mapper.ExecDtoMapper;
import com.ecc.sycoracle.pojo.ExecDto;
import com.ecc.sycoracle.service.ExecDtoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.InputStream;

/**
 * @author sunyc
 * @create 2022-07-06 17:16
 */
@Service
@Slf4j
public class ExecDtoServiceImpl extends ServiceImpl<ExecDtoMapper, ExecDto> implements ExecDtoService {
    @Override
    public void importData(InputStream inputStream) {
        // 这里 需要指定读用哪个class去读，然后读取第一个sheet 文件流会自动关闭
        System.out.println("DictServiceImpl.importData,,Execl 导入的第2步--------------开始解析");
        EasyExcel.read(inputStream,ExecDto.class,new ExeclDTOListener(baseMapper)).sheet().doRead();
        log.info("importData finished");
    }
}
