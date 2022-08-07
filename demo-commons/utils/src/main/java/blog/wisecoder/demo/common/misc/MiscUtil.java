package blog.wisecoder.demo.common.misc;

/**
 * 杂项工具类
 *
 * @author bianyun
 */
@SuppressWarnings("unused")
public final class MiscUtil {
    private MiscUtil() {
        deliberatelyProhibitInstantiation();
    }

    /**
     * 在私有的构造方法中调用此方法，可以通过抛出 <code>AssertionError</code>
     * 的方式来禁止实例化（即使反射方式也无法实例化对象）
     */
    public static void deliberatelyProhibitInstantiation() {
        throw new AssertionError("deliberately prohibit instantiation");
    }


    public static <T> T unreachableButCompilerNeedsThis() {
        throw new AssertionError("this code should never be reached");
    }
}
