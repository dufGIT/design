package learn.design.patterns.demo.builder.case1.service;

/**
 * 抽象地图接口
 * 1.加载天气
 * 2.加载房子
 * 3.加载树
 * 4.加载路面
 *
 * @Author df
 * @Date 2020/10/10 11:11
 */
public interface IMap {
    void createWeather();

    void createHouse();

    void createTree();

    void createWay();

}
