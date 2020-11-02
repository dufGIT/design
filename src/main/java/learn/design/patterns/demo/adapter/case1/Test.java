package learn.design.patterns.demo.adapter.case1;

import com.alibaba.fastjson.JSON;
import learn.design.patterns.demo.adapter.case1.MqAdapter;
import learn.design.patterns.demo.adapter.case1.RebateInfo;
import learn.design.patterns.demo.adapter.case1.create_account;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.HashMap;

/*
 *
 * @Author df
 * @Date 2020/10/30 16:58
 */
public class Test {
    public static void main(String[] args) {
        create_account create_account = new create_account();
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
            RebateInfo rebateInfo = MqAdapter.filter(JSON.toJSONString(create_account), link01);
            System.out.println("mq.create_account(适配前)" + JSON.toJSONString(create_account));
            System.out.println("mq.create_account(适配后)" + JSON.toJSONString(rebateInfo));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
