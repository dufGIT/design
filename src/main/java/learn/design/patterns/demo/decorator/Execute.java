package learn.design.patterns.demo.decorator;

import java.util.List;

/**
 * @Author df
 * @Description: 伪代码，执行器，执行SQL的接口
 * 定义查询和新增方法。
 * @Date 2024/1/27 13:03
 */
public interface Execute {
    Object query(String id);
    void insert();
}
