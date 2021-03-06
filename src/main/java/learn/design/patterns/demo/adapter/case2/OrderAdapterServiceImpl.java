package learn.design.patterns.demo.adapter.case2;

/**
 * 自营订单服务适配，最终返回值是一致的
 * Adapter：通过包装一个需要的支配器对象, 把原来的接口转换成目标接口
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
