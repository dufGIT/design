package learn.design.patterns.demo.builder.case1.service.impl;

import learn.design.patterns.demo.builder.case1.service.IMap;

/**
 * 阴天实现服务类
 * 1.加载天气阴天的逻辑
 * 2.加载房子阴天的逻辑
 * 3.加载树阴天的逻辑
 * 4.加载路面阴天的逻辑
 * @Author df
 * @Date 2020/10/10 11:17
 */
public class MapCloudyServiceImpl implements IMap {
    @Override
    public void createWeather() {
        System.out.println("阴天");
    }

    @Override
    public void createHouse() {
        System.out.println("房子的玻璃暗的");
    }

    @Override
    public void createTree() {
        System.out.println("树的颜色是深绿色");
    }

    @Override
    public void createWay() {
        System.out.println("路面有些潮湿");
    }
}
