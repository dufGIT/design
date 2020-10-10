package learn.design.patterns.demo.builder.case1.service.impl;

import learn.design.patterns.demo.builder.case1.service.IMap;

/**
 * 高画质类
 * 1.建组组合，高画质地图加载方法
 * @Author df
 * @Date 2020/10/10 11:20
 */
public class MapAdvBuilder {
    private IMap iMap;

    public MapAdvBuilder(IMap iMap) {
        super();
        this.iMap = iMap;
    }

    public void createMap() {
        System.out.println("创建了一个高画质的地图");
        iMap.createWeather();
        iMap.createHouse();
        iMap.createTree();
        iMap.createWay();
    }
}
