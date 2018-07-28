package com.main.entity;

import java.util.Date;
import java.util.Objects;


/**
 * Created with IDEA
 *
 * @author:zhongxiaowa
 * @Date:2018/7/25
 * @Time:09:57
 */
public class KlhaData {
    /**
     * 命名规则：
     * sn:数据的UID编号
     * datatime:数据生成的时间
     * sensorname:传感器主机的名称
     * channelnum:传感器信道号
     * channelname:传感器名称
     * value：具体数值
     *
     *
     */
    private int sn;
    private Date datatime;
    private int sensorname;
    private int channelnum;
    private int channelname;
    private float value;



    public int getSn() {
        return sn;
    }

    public void setSn(int sn) {
        this.sn = sn;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public int getSensorname() {
        return sensorname;
    }

    public void setSensorname(int sensorname) {
        this.sensorname = sensorname;
    }

    public int getChannelnum() {
        return channelnum;
    }

    public void setChannelnum(int channelnum) {
        this.channelnum = channelnum;
    }

    public int getChannelname() {
        return channelname;
    }

    public void setChannelname(int channelname) {
        this.channelname = channelname;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        KlhaData klhaData = (KlhaData) o;
        return sn == klhaData.sn &&
                sensorname == klhaData.sensorname &&
                channelnum == klhaData.channelnum &&
                channelname == klhaData.channelname &&
                Float.compare(klhaData.value, value) == 0 &&
                Objects.equals(datatime, klhaData.datatime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sn, datatime, sensorname, channelnum, channelname, value);
    }

    @Override
    public String toString() {
        return "KlhaData{" +
                "sn=" + sn +
                ", datatime=" + datatime +
                ", sensorname=" + sensorname +
                ", channelnum=" + channelnum +
                ", channelname=" + channelname +
                ", value=" + value +
                '}';
    }
}
