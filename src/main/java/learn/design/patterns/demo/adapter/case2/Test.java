package learn.design.patterns.demo.adapter.case2;

/*
 *
 * @Author df
 * @Date 2020/11/2 17:17
 */
public class Test {
    public static void main(String[] args) {
        // 通过适配器给接口同一个方法名称并且统一了同一个返回值
        IOrderAdapterService orderAdapterService = new OrderAdapterServiceImpl();
        System.out.println("适配器：判断首单，接口适配(自营)" + orderAdapterService.isFirst("100001"));
        IOrderAdapterService popOrderService = new POPOrderAdapterServiceImpl();
        System.out.println("适配器：判断首单，接口适配(POP)" + popOrderService.isFirst("100001"));
    }
}
