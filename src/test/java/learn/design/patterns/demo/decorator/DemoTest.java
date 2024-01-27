package learn.design.patterns.demo.decorator;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

/**
 * @Author df
 * @Description: 装饰器模式单元测试
 * @Date 2024/1/27 13:28
 */
public class DemoTest {
    @Test
    public void test_decorator() {
        Execute execute=new CacheExecute(new DefaultExecute());
        JSONObject jsonObject= (JSONObject)execute.query("test");
        System.out.println("结果数据为："+JSONObject.toJSONString(jsonObject));

        JSONObject jsonObject1= (JSONObject)execute.query("test");
        System.out.println("第二次结果数据为："+JSONObject.toJSONString(jsonObject1));
    }
}
