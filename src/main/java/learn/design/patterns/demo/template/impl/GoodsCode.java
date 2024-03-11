package learn.design.patterns.demo.template.impl;

import learn.design.patterns.demo.template.BaseCodeAbstract;
import org.springframework.stereotype.Service;

/**
 * @Author df
 * @Description: 商品码
 * @Date 2024/3/8 10:23
 */
@Service
public class GoodsCode extends BaseCodeAbstract {

    @Override
    protected String generateCode(String preCode) {
        // 模拟商品规则生成
        System.out.println("生成新的编号：20230504002");
        return "20230504002";
    }
}
