package learn.design.patterns.demo.flyweight.impl;

import learn.design.patterns.demo.flyweight.Connection;

/**
 * @Author df
 * @Description:
 * @Date 2024/3/2 16:31
 */
public class DefaultConnection implements Connection {


    private PooledDatasource pooledDatasource;

    public DefaultConnection(PooledDatasource pooledDatasource) {
        this.pooledDatasource = pooledDatasource;
    }

    @Override
    public void commit() {
        // 模拟提交
    }

    @Override
    public void rollback() {
        // 模拟回滚
    }

    @Override
    public void close() {
        pooledDatasource.pushConnection(this);
    }
}
