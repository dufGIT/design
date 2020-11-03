package learn.design.patterns.demo.adapter.case2;

/**
 * POP：订单各个平台给的方法名不一样，返回值不一样
 * 这个平台是通过查询订单总数判断是否是首单
 * Adaptee：需要适配的类
 * @Author df
 * @Date 2020/11/2 17:08
 */
public class POPOrderService {
    Long queryUserOrderCount(String userId) {
        return 1L;
    }
}
