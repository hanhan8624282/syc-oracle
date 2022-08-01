package com.ecc.sycoracle.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author sunyc
 * @create 2022-07-06 17:03
 */
@Data
@TableName(value = "execlinput")
public class ExecDto {
    @ExcelProperty("id")
    private Long id;
    @ExcelProperty("上级id")
    private Long parentId;
    @ExcelProperty("名称")
    private String name;
    @ExcelProperty("值")
    private Integer value;
    @ExcelProperty("编码")
    private String dictCode;
}
