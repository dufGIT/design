package learn.design.patterns.demo.template;

import learn.design.patterns.demo.template.enums.CodeTypeEnum;
import learn.design.patterns.demo.template.impl.GoodsCode;
import learn.design.patterns.demo.template.impl.OrderCode;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * @Author df
 * @Description: 模板模式测试
 * @Date 2024/3/8 10:29
 */
@SpringBootTest
public class TestApi {
    @Resource
    private  CodeStrategy codeStrategy;

    @Test
    void useTemplate() {
        // 商品编码获取流程
        String goodsCodeType= CodeTypeEnum.GOODS_NO.getCode();
        GoodsCode goods=(GoodsCode)codeStrategy.getInstance(goodsCodeType);
        String newCode=goods.getCode(goodsCodeType);
        System.out.println("最终商品编号："+newCode);

        System.out.println("------------------------------------------------");

        // 序号获取流程
        String orderType=CodeTypeEnum.ORDER_NO.getCode();
        OrderCode order=(OrderCode)codeStrategy.getInstance(orderType);
        String newCode1=order.getCode(orderType);
        System.out.println("order序号编号："+newCode1);
    }
}
