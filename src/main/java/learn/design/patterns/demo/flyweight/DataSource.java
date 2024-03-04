package learn.design.patterns.demo.flyweight;

/**
 * @Author df
 * @Description: 数据源接口
 * @Date 2024/3/2 16:19
 */
public interface DataSource {
    Connection getConnection();
}
