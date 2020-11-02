package learn.design.patterns.demo.adapter.case2;

/*
 * 自营：订单各个平台给的方法名不一样，返回值不一样
 * @Author df
 * @Date 2020/11/2 17:08
 */
public class OrderService {
    boolean isFirstOrder(String userId) {
        return true;
    }
}
