package learn.design.patterns.demo.factory.simple;

import learn.design.patterns.demo.factory.simple.service.IOrderService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderFactoryTest {
    OrderFactory orderFactory = new OrderFactory();

    @Test
    public void test_Order() {
        /*
         * 1.实例化订单工厂
         * 2.根据订单工厂获取具体的不同服务操作
         * 优点：对之后进行扩展不用改动之前的业务逻辑代码，添加不同的产品就在创建相应的类
         */
        // 直播订单保存
        IOrderService liveOrderService = orderFactory.getOrderService(1);
        Object successMsg = liveOrderService.kingdeeSave();
        Object successMsgQuery = liveOrderService.kingdeeQuery();
        System.out.println(successMsg);
        System.out.println(successMsgQuery);
        /*
         * 自营订单保存
         */
        IOrderService selfOrderService = orderFactory.getOrderService(2);
        Object successMsg1 = selfOrderService.kingdeeSave();
        System.out.println(successMsg1);
        /*
         * 供应商订单保存
         */
        IOrderService suppOrderService = orderFactory.getOrderService(3);
        Object successMsg2 = suppOrderService.kingdeeSave();
        System.out.println(successMsg2);
    }
}