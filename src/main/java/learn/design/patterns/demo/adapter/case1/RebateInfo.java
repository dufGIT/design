package learn.design.patterns.demo.adapter.case1;

import java.util.Date;

/*
 * 统一的MQ消息体
 * @Author df
 * @Date 2020/10/30 16:03
 */
public class RebateInfo {
    private String userId;
    private String bizId;
    private String bizTime;
    private String desc;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getBizTime() {
        return bizTime;
    }

    public void setBizTime(String bizTime) {
        this.bizTime = bizTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
