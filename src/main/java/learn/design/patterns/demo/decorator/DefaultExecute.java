package learn.design.patterns.demo.decorator;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author df
 * @Description:执行器实现类
 * @Date 2024/1/27 13:08
 */
public class DefaultExecute implements Execute{
    @Override
    public Object query(String id) {
        System.out.println("执行查询语句");
        // 模拟假数据
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id",01);
        jsonObject.put("name","test");
        return jsonObject;
    }

    @Override
    public void insert() {
        System.out.println("执行插入语句");
    }
}
