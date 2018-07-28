package com.main.daoimpl;

import com.main.dao.KlhaDataDao;
import com.main.entity.KlhaData;

import java.util.List;

/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/27
 * @Time:10:09
 */
public class KlhaDataDaoimpl implements KlhaDataDao{
    @Override
    public List<KlhaData> GetallSensorData() {
        return null;
    }

    @Override
    public KlhaData SelectBySensorId() {
        return null;
    }

    @Override
    public int InsertSensorData(KlhaData klhaData) {
        return 0;
    }

    @Override
    public int UpdateSensorData(KlhaData klhaData) {
        return 0;
    }

    @Override
    public int DeleteSensorData(KlhaData klhaData) {
        return 0;
    }
}
