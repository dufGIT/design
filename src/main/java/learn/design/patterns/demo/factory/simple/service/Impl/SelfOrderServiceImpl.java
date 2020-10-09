package learn.design.patterns.demo.factory.simple.service.Impl;

import learn.design.patterns.demo.factory.simple.service.IOrderService;

/**
 * 自营订单服务
 * @Author df
 * @Date 2020/10/9 13:30
 */
public class SelfOrderServiceImpl implements IOrderService {
    @Override
    public Object kingdeeSave() {
        return "调用金蝶自营订单保存操作！";
    }

    @Override
    public Object kingdeeDelete() {
        return "调用金蝶自营删除操作！";
    }

    @Override
    public Object kingdeeQuery() {
        return "调用金蝶自营查询操作！";
    }
}
