package learn.design.patterns.demo.adapter.case2;

/**
 * POP订单服务适配，最终返回值是一致的
 * @Author df
 * @Date 2020/11/2 17:12
 */
public class POPOrderAdapterServiceImpl implements IOrderAdapterService {
    private POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.queryUserOrderCount(uId) <= 1;
    }
}
