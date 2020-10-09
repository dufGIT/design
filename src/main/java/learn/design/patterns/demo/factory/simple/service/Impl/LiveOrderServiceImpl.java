package learn.design.patterns.demo.factory.simple.service.Impl;

import learn.design.patterns.demo.factory.simple.service.IOrderService;

/**
 * 直播订单服务
 * @Author df
 * @Date 2020/10/9 13:28
 */
public class LiveOrderServiceImpl implements IOrderService {
    @Override
    public Object kingdeeSave() {
        return "调用金蝶直播订单保存操作！";
    }

    @Override
    public Object kingdeeDelete() {
        return "调用金蝶直播订单删除操作！";
    }

    @Override
    public Object kingdeeQuery() {
        return "调用金蝶直播订单查询操作！";
    }
}
