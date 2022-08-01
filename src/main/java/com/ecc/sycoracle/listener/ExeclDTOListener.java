package com.ecc.sycoracle.listener;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.ecc.sycoracle.mapper.ExecDtoMapper;
import com.ecc.sycoracle.pojo.ExecDto;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sunyc
 * @create 2022-07-06 17:11
 */
@Slf4j
@NoArgsConstructor
public class ExeclDTOListener extends AnalysisEventListener<ExecDto> {
    private ExecDtoMapper execDtoMapper;
    //构造器
    public ExeclDTOListener(ExecDtoMapper execDtoMapper) {
        this.execDtoMapper = execDtoMapper;
    }
    @Override
    public void invoke(ExecDto data, AnalysisContext analysisContext) {
        System.out.println("ExecDictDtoListener.invoke,,Execl 导入的第3步--------------开始导入");
        log.info("解析到一条记录:"+data);
        execDtoMapper.insert(data);
    }
    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        System.out.println("ExecDictDtoListener.doAfterAllAnalysed,,Execl 导入的第4步--------------完成导入");
        log.info("所有数据解析完成！");
    }
}
