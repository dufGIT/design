package learn.design.patterns.demo.flyweight.impl;

import learn.design.patterns.demo.flyweight.Connection;
import learn.design.patterns.demo.flyweight.DataSource;
import learn.design.patterns.demo.flyweight.impl.DefaultConnection;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author df
 * @Description: 有池化资源
 * @Date 2024/3/2 16:22
 */
public class PooledDatasource implements DataSource {

    protected final List<Connection> activeConnectionPool = new ArrayList<>();
    protected final List<Connection> idleConnectionPool = new ArrayList<>();


    @Override
    public Connection getConnection() {
        if (!idleConnectionPool.isEmpty()) {
            return idleConnectionPool.remove(0);
        }

        // 模拟获取连接
        Connection connection = new DefaultConnection(this);
        activeConnectionPool.add(connection);
        return connection;
    }

    protected void pushConnection(Connection connection) {
        // 移除活跃池
        activeConnectionPool.remove(connection);
        // 放入空闲池
        idleConnectionPool.add(connection);
    }
}
