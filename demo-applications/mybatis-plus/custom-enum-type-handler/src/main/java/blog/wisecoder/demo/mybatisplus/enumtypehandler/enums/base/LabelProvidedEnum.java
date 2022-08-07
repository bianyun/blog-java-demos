package blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.base;

/**
 * 提供标签名称的枚举类型接口
 *
 * @author bianyun
 */
public interface LabelProvidedEnum {

    /**
     * 获取 枚举常量对应的标签名称（标签名称一般为枚举常量对应的中文名）
     * @return 标签名称
     */
    String getLabel();
}
