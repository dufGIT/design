package learn.design.patterns.demo.flyweight;

import learn.design.patterns.demo.flyweight.impl.PooledDatasourceFactory;
import org.junit.jupiter.api.Test;

/**
 * @Author df
 * @Description: 测试享元模式
 * @Date 2024/3/2 17:12
 */
public class TestApi {
    @Test
    public void test_flyweight() {
        DatasourceFactory datasourceFactory = new PooledDatasourceFactory();
        DataSource datasource = datasourceFactory.getDataSource();

        Connection connection = datasource.getConnection();
        connection.close();

        Connection connection1 = datasource.getConnection();
        //connection.close();
    }
}
