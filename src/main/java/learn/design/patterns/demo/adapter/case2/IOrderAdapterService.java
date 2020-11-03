package learn.design.patterns.demo.adapter.case2;

/*
 * 订单服务
 * Target：目标接口类, 客户所期待的接口, 目标可以是具体的或者抽象的类, 也可以是接口
 * @Author df
 * @Date 2020/11/2 17:10
 */
public interface IOrderAdapterService {
    boolean isFirst(String uId);
}
