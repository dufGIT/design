package learn.design.patterns.demo.factory.simple;

import learn.design.patterns.demo.factory.simple.service.IOrderService;
import learn.design.patterns.demo.factory.simple.service.Impl.LiveOrderServiceImpl;
import learn.design.patterns.demo.factory.simple.service.Impl.SelfOrderServiceImpl;
import learn.design.patterns.demo.factory.simple.service.Impl.SuppOrderServiceImpl;

/**
 * 基础订单工厂类
 * 提供获取不同的服务类型
 * @Author df
 * @Date 2020/10/9 13:25
 */
public class OrderFactory {

    public IOrderService getOrderService(Integer OrderType) {
        // 将if判断放在这里，修改不影响正常的业务逻辑
        if (1 == OrderType) {
            return new LiveOrderServiceImpl();
        }
        if (2 == OrderType) {
            return new SelfOrderServiceImpl();
        }
        if (3 == OrderType) {
            return new SuppOrderServiceImpl();
        }
        return null;
    }
}
