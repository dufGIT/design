package learn.design.patterns.demo.template.impl;

import learn.design.patterns.demo.template.BaseCodeAbstract;
import org.springframework.stereotype.Service;

/**
 * @Author df
 * @Description: 序列码
 * @Date 2024/3/8 10:24
 */
@Service
public class OrderCode extends BaseCodeAbstract {
    @Override
    protected String generateCode(String preCode) {
        // 模拟序号生成编号
        System.out.println("生成新的编号：1");
        return "1";
    }
}
