package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * 简单任务测试
 * @Author: withyme_尘
 * @Date 2021/8/18 16:42
 */
@Component
public class DemoXxlJob {

    /**
     * 简单测试 xxl-job 执行
     * @return
     * @throws Exception
     */
    @XxlJob("jobDemo-1")
    public ReturnT<String> jobDemo1() throws Exception{
        // 往调度中心界面回写日志方法
        XxlJobHelper.log("[jobDemo-1] ## XXL-JOB, Hello World. 这里是测试调度任务执行... ");

        // 执行成功
        // ps: 调度中心调度界面调用时 JobInfoController.triggerJob 的返回结果为 ReturnT.SUCCESS
        //      所以该返回不会在前端界面显示，这里返回的具体作用还得在看看
        return new ReturnT<>(ReturnT.SUCCESS_CODE,"jobDemo-1 执行成功");
    }

    /**
     * 简单测试 xxl-job 执行
     * @return
     * @throws Exception
     */
    @XxlJob("jobDemo-2")
    public void jobDemo2() throws Exception{
        // 往调度中心界面回写日志方法
        XxlJobHelper.log("[jobDemo-2] ## XXL-JOB, Hello World. 这里是测试调度任务执行... ");
        // 执行成功
    }
}
