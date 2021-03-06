package learn.design.patterns.demo.builder.case1;

/**
 * 案例说明
 *
 * @Author df
 * @Date 2020/10/10 10:49
 */
public class Description {
    /*
     * 建造者设计模式：
     * 案例：觉得这个网上的案例还不错，就按照这个案例学习下思想
     * 假如一款大型游戏进入主页需要加载界面，天空，房子，树，地上，等等操作，这个加载过程可能是固定的，可能对于高配置电脑来说没关系。
     * 但对于低配置的电脑可能就会卡死等操作，可能就需要减少加载一些画面操作，这时候需要创建不同的地图，但地图的创建过程却是固定的，建造者模式完全可以应对这样的情况。
     * 意图：将一个复杂的构建与其标识相分离，使得同样的构建过程可以创建不同的表示
     * 什么时候使用：一些基本不会变，而其组合经常变化的时候
     * 如何解决：将变与不变分离开
     * 优点：建造者独立，易扩展。2、便于控制细节风向
     * 缺点：产品必须有共同点，范围有限制。2、内部变化复杂，会有很多的建造类。
     */
}
