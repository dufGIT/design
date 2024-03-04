package learn.design.patterns.demo.flyweight.impl;

import learn.design.patterns.demo.flyweight.DataSource;
import learn.design.patterns.demo.flyweight.DatasourceFactory;
import learn.design.patterns.demo.flyweight.impl.PooledDatasource;

/**
 * @Author df
 * @Description: 池化数据源工厂
 * @Date 2024/3/2 17:07
 */
public class PooledDatasourceFactory implements DatasourceFactory {

    @Override
    public DataSource getDataSource() {
        return new PooledDatasource();
    }
}
