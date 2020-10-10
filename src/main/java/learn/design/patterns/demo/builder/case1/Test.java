package learn.design.patterns.demo.builder.case1;

import learn.design.patterns.demo.builder.case1.service.IMap;
import learn.design.patterns.demo.builder.case1.service.impl.MapAdvBuilder;
import learn.design.patterns.demo.builder.case1.service.impl.MapCloudyServiceImpl;
import learn.design.patterns.demo.builder.case1.service.impl.MapLowBuilder;
import learn.design.patterns.demo.builder.case1.service.impl.MapSunServiceImpl;

/**
 * 测试案例使用
 * @Author df
 * @Date 2020/10/10 11:02
 */
public class Test {
    public static void main(String[] args) {
        // 阴天服务
        IMap cloudyService = new MapCloudyServiceImpl();
        MapAdvBuilder highMap = new MapAdvBuilder(cloudyService);
        highMap.createMap();
        // 晴天服务
        IMap sunService = new MapSunServiceImpl();
        // MapAdvBuild highMap1=new MapAdvBuild(sunService);
        // highMap1.createMap();
        System.out.println();
        // 低画质
        MapLowBuilder lowBuild = new MapLowBuilder(sunService);
        lowBuild.createMap();
    }
}
