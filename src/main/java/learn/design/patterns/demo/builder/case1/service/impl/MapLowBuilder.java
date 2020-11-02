package learn.design.patterns.demo.builder.case1.service.impl;

import learn.design.patterns.demo.builder.case1.service.IMap;

/**
 * 低画质类
 * 1.建造组合，低画质地图加载方法
 * @Author df
 * @Date 2020/10/10 11:23
 */
public class MapLowBuilder  {
    private IMap iMap;

    public MapLowBuilder(IMap iMap) {
        super();
        this.iMap = iMap;
    }
    public void createMap() {
        System.out.println("创建了一个低画质的地图");
        iMap.createWeather();
        iMap.createHouse();
        // iMap.createTree(); // 低画质就把创建树的过程去掉了
        iMap.createWay();
    }

}
