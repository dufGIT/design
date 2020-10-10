package learn.design.patterns.demo.builder.case1.service.impl;

import learn.design.patterns.demo.builder.case1.service.IMap;

/**
 * 晴天实现服务类
 * 1.加载天气晴天的逻辑
 * 2.加载房子晴天的逻辑
 * 3.加载树晴天的逻辑
 * 4.加载路面晴天的逻辑
 * @Author df
 * @Date 2020/10/10 11:13
 */
public class MapSunServiceImpl implements IMap {

    @Override
    public void createWeather() {
        System.out.println("晴天");
    }

    @Override
    public void createHouse() {
        System.out.println("房子被阳光照耀的很好看");
    }

    @Override
    public void createTree() {
        System.out.println("树叶闪闪发光");
    }

    @Override
    public void createWay() {
        System.out.println("路面发烫");
    }
}
