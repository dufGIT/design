package learn.design.patterns.demo.flyweight;

import java.sql.SQLException;

/**
 * @Author df
 * @Description:
 * @Date 2024/3/2 16:05
 */
public interface Connection {
    void commit();

    void rollback();

    void close();
}
