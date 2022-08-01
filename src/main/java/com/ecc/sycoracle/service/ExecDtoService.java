package com.ecc.sycoracle.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ecc.sycoracle.pojo.ExecDto;

import java.io.InputStream;

/**
 * @author sunyc
 * @create 2022-07-06 17:16
 */
public interface ExecDtoService extends IService<ExecDto> {
    void importData(InputStream inputStream);
}
