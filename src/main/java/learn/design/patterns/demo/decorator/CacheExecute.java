package learn.design.patterns.demo.decorator;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author df
 * @Description: 带缓存的执行器
 * @Date 2024/1/27 13:10
 */
public class CacheExecute implements Execute {

    private Execute delegate;
    private Map<String,Object> caches=new HashMap<>();

    public CacheExecute(Execute delegate){
        this.delegate=delegate;
    }

    @Override
    public Object query(String id) {
        // 从缓存中取出数据
        if (caches!=null&&caches.containsKey(id)){
            System.out.println("从缓存中取出数据");
            return caches.get(id);
        }
        Object data=delegate.query(id);
        caches.put(id,data);
        System.out.println("存储数据到缓存中");
        return data;
    }

    @Override
    public void insert() {
        delegate.insert();
    }
}
