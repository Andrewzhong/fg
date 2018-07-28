package com.main.service;

import com.main.entity.KlhaData;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/27
 * @Time:10:36
 */
public interface KlhaDataService {
    /**
     * 查询传感器的数据
     * 最终的返回结果为jason用于给Echarts传递参数
     * @return
     */
    public List<KlhaData> GetallSensorData();
    public KlhaData SelectBySensorId();

    /**
     * 插入
     * 最终我们不一定会用到传感器数据的插入方法
     * @param klhaData
     * @return
     */
    public int InsertSensorData(KlhaData klhaData);

    /**
     * 更新
     * @param klhaData
     * @return
     */
    public int UpdateSensorData(KlhaData klhaData);

    /**
     * 删除
     * @param klhaData
     * @return
     */
    public int DeleteSensorData(KlhaData klhaData);


}
