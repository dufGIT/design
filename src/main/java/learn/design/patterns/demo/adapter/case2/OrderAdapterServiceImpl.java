package learn.design.patterns.demo.adapter.case2;

/*
 * 自营订单服务适配，最终返回值是一致的
 * @Author df
 * @Date 2020/11/2 17:11
 */
public class OrderAdapterServiceImpl implements IOrderAdapterService {
    private OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.isFirstOrder(uId);
    }
}
