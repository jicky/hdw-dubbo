package com.hdw.api.base.job.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.hdw.api.base.job.dto.JobLogDto;
import com.hdw.api.base.job.entity.ScheduleJobLogEntity;
import com.hdw.common.core.vo.PageVo;


/**
 * @Description 定时任务日志
 * @Author JacksonTu
 * @Date 2019/1/18 15:59
 **/
public interface IScheduleJobLogService extends IService<ScheduleJobLogEntity> {

    PageVo queryPage(JobLogDto jobLogDto);

}
