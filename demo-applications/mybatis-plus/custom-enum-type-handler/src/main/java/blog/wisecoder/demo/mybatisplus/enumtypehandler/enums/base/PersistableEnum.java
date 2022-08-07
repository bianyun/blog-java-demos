package blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.base;

import java.io.Serializable;

/**
 * 可持久化的枚举类型接口
 *
 * @param <T> 枚举类对应到数据库的字段类型
 *
 * @author bianyun
 */
public interface PersistableEnum<T extends Serializable> {

    /**
     * 获取枚举类常量对应到数据库字段的值
     *
     * @return 枚举类常量对应到数据库字段的值
     */
    T getCode();

}
