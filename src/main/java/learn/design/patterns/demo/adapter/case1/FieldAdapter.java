package learn.design.patterns.demo.adapter.case1;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * 属性消息体适配类
 *
 * @Author df
 * @Date 2020/10/30 16:02
 */
public class FieldAdapter {
    public static UniteInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static UniteInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        UniteInfo rebateInfo = new UniteInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            UniteInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class)
                    .invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }
}
