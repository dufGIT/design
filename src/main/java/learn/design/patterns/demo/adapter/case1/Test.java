package learn.design.patterns.demo.adapter.case1;

import com.alibaba.fastjson.JSON;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

/*
 * 属性适配例子
 * @Author df
 * @Date 2020/10/30 16:58
 */
public class Test {
    public static void main(String[] args) {
        CreateAccount create_account = new CreateAccount();
        create_account.setNumber("100001");
        create_account.setAddress("北京");
        create_account.setAccountDate(new Date());
        create_account.setDesc("在校开户");
        HashMap<String, String> link01 = new HashMap<String, String>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");
        try {
            UniteInfo rebateInfo = FieldAdapter.filter(JSON.toJSONString(create_account), link01);
            System.out.println("create_account(适配前)" + JSON.toJSONString(create_account));
            System.out.println("UniteInfo(适配后)" + JSON.toJSONString(rebateInfo));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
