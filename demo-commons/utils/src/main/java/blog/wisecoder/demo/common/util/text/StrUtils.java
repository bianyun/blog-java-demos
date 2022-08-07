package blog.wisecoder.demo.common.util.text;


import blog.wisecoder.demo.common.misc.MiscUtil;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.StrUtil;
import org.springframework.lang.Nullable;

import java.util.Collection;

/**
 * 字符串工具类
 *
 * @author bianyun
 */
@SuppressWarnings("unused")
public final class StrUtils extends StrUtil {
    private StrUtils() {
        MiscUtil.deliberatelyProhibitInstantiation();
    }

    public static final String SINGLE_QUOTE = "'";
    public static final String QUESTION_MARK = "?";
    public static final String DOUBLE_QUOTE = "\"";
    public static final String DOLLAR_SIGN = "$";
    public static final String ASTERISK = "*";
    public static final String EQUAL_SIGN = "=";
    public static final String EXCLAMATION_MARK = "!";
    public static final String SEMICOLON = ";";
    public static final String TRUE = "true";
    public static final String FALSE = "false";
    public static final String NULL = "null";
    public static final String INDENT_WITH_FOUR_SPACE = "    ";

    public static final String PARENTHESES = "()";
    public static final String OPENING_PARENTHESIS = "(";
    public static final String CLOSING_PARENTHESIS = ")";

    public static final String BRACES = "{}";
    public static final String OPENING_BRACE = "{";
    public static final String CLOSING_BRACE = "}";

    public static final String BRACKETS = "[]";
    public static final String OPENING_BRACKET = "[";
    public static final String CLOSING_BRACKET = "]";

    public static final String PARENTHESES_CHN = "（）";
    public static final String OPENING_PARENTHESIS_CHN = "（";
    public static final String CLOSING_PARENTHESIS_CHN = "）";

    public static final String OPENING_BRACKET_CHN = "【";
    public static final String CLOSING_BRACKET_CHN = "】";

    public static final String ELLIPSES = "...";
    public static final String ELLIPSES_CHN = "……";

    public static final String LITERALLY_NULL = "null";
    public static final String LITERALLY_LF = "\\n";

    public static final String PERIOD_CHN = "。";

    public static final String NUM_ZERO = "0";
    public static final String NUM_ONE = "1";
    public static final String NUM_NINE = "9";


    /**
     * 将字符序列 {@link CharSequence} 转换为大写的字符串（字符序列为 null 时直接返回 null）
     *
     * @param charSequence 字符序列
     * @return 转换后的大写字符串
     */
    @Nullable
    public static String toUpperCase(@Nullable CharSequence charSequence) {
        if (isBlank(charSequence)) {
            return charSequence == null ? null : charSequence.toString();
        }

        return charSequence.toString().toUpperCase();
    }

    /**
     * 将字符序列 {@link CharSequence} 转换为小写的字符串（字符序列为 null 时直接返回 null）
     *
     * @param charSequence 字符序列
     * @return 转换后的小写字符串
     */
    @Nullable
    public static String toLowerCase(@Nullable CharSequence charSequence) {
        if (isBlank(charSequence)) {
            return charSequence == null ? null : charSequence.toString();
        }

        return charSequence.toString().toLowerCase();
    }

    /**
     * 判断字符串是否不是空白，同时也不是 NULL字符串
     *
     * <p>
     * 空白的定义如下： <br>
     * 1、null <br>
     * 2、不可见字符（如空格、换行符）<br>
     * 3、空字符串""
     * </p>
     * <p>
     * NULL字符串的定义如下： <br>
     * [NULL字符串].toLowerCase() == "null"
     * </p>
     *
     * @param str 被检测的字符串
     * @return 是否不是空白，同时也不是 NULL字符串
     */
    public static boolean isNotBlankOrLiterallyNull(@Nullable CharSequence str) {
        return isNotBlank(str) && isNotLiterallyNull(str);
    }

    /**
     * 判断字符串是否是 NULL字符串
     * <p>
     * NULL字符串的定义如下： <br>
     * [NULL字符串].toLowerCase() == "null"
     * </p>
     *
     * @param str 被检测的字符串
     * @return 是否是 NULL字符串
     */
    public static boolean isLiterallyNull(@Nullable CharSequence str) {
        return equalsIgnoreCase(LITERALLY_NULL, str);
    }

    /**
     * 判断字符串是否不是 NULL字符串
     * <p>
     * NULL字符串的定义如下： <br>
     * [NULL字符串].toLowerCase() == "null"
     * </p>
     *
     * @param str 被检测的字符串
     * @return 是否不是 NULL字符串
     */
    public static boolean isNotLiterallyNull(@Nullable CharSequence str) {
        return !isLiterallyNull(str);
    }

    /**
     * 判断字符串容器（{@link Collection}&lt;{@link String}&gt;）中的字符串是否全部为 空白
     *
     * <p>
     * 空白的定义如下： <br>
     * 1、null <br>
     * 2、不可见字符（如空格、换行符）<br>
     * 3、空字符串""
     * </p>
     *
     * @param strs 字符串容器
     * @return 字符串容器（Collection[String]）中的字符串是否全部为空白
     */
    public static boolean isAllBlank(Collection<String> strs) {
        return StrUtil.isAllBlank(strs.toArray(new CharSequence[]{}));
    }

    /**
     * 判断字符串容器（{@link Collection}&lt;{@link String}&gt;）中的字符串是否不是全部为空白（即至少有一个字符串不是空白）
     *
     * <p>
     * 空白的定义如下： <br>
     * 1、null <br>
     * 2、不可见字符（如空格、换行符）<br>
     * 3、空字符串""
     * </p>
     *
     * @param strs 字符串容器
     * @return 字符串容器（Collection[String]）中的字符串是否不是全部为空白
     */
    public static boolean isNotAllBlank(Collection<String> strs) {
        return !isAllBlank(strs);
    }

    /**
     * 判断字符串容器（{@link Collection}&lt;{@link String}&gt;）中的字符串是否存在任意一个字符串为空白
     *
     * <p>
     * 空白的定义如下： <br>
     * 1、null <br>
     * 2、不可见字符（如空格、换行符）<br>
     * 3、空字符串""
     * </p>
     *
     * @param strs 字符串容器
     * @return 字符串容器（{@link Collection}&lt;{@link String}&gt;）中的字符串是否存在任意一个字符串为空白
     */
    public static boolean isAnyBlank(Collection<String> strs) {
        return isAnyBlank(strs.toArray(new CharSequence[]{}));
    }

    /**
     * 判断字符序列变长参数列表中的字符序列是否存在任意一个字符序列为空白
     *
     * <p>
     * 空白的定义如下： <br>
     * 1、null <br>
     * 2、不可见字符（如空格、换行符）<br>
     * 3、空字符串""
     * </p>
     *
     * @param charSequences 字符序列 {@link CharSequence} 类型的变长参数列表
     * @return 字符序列变长参数列表中的字符序列是否存在任意一个字符序列为空白
     */
    public static boolean isAnyBlank(CharSequence... charSequences) {
        if (ArrayUtil.isEmpty(charSequences)) {
            return true;
        }

        for (CharSequence charSequence : charSequences) {
            if (isBlank(charSequence)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 将字符串中间出现的多个空白替换为一个空格
     *
     * 示例：
     * <pre>
     *     replaceAllBlanksToOneSpace("12  2        3     4") ==>  "12 2 3 4"
     *     replaceAllBlanksToOneSpace("   12  2     3   4  ") ==>  "   12 2 3 4  "
     * </pre>
     *
     * @param str 待处理的字符串
     * @return 处理完的字符串
     */
    public static String replaceAllInnerWhiteSpacesToOneSpace(String str) {
        return str.replaceAll("\\s+", SPACE).trim();
    }

    /**
     * 查找指定字符串是否包含指定字符串列表中的任意一个字符串
     *
     * @param str      指定字符串
     * @param testStrs 需要检查的字符串集合
     * @return 是否包含任意一个字符串
     */
    public static boolean containsAny(CharSequence str, Collection<? extends CharSequence> testStrs) {
        return containsAny(str, testStrs.toArray(new CharSequence[]{}));
    }

    /**
     * 以 conjunction 为分隔符将对象的集合转换为字符串
     *
     * @param collection  对象的集合
     * @param conjunction 分隔符
     * @return 连接后的字符串
     */
    public static String join(Collection<?> collection, CharSequence conjunction) {
        Object[] array = collection.toArray(new Object[]{});
        return join(conjunction, array);
    }

    /**
     * 对字符串中间部分进行脱敏（即头尾各留一部分不脱敏）
     *
     * <p> 注1：对字符串进行脱敏的部分长度，最少为字符串长度的一半</p>
     * <p> 注2：不脱敏部分的长度 = Math.min(strLen/2, maxExposedPartLen) </p>
     *
     * @param str 需要脱敏的字符串
     * @param maxExposedPartLen 不脱敏部分的最大长度
     * @return 已脱敏的字符串
     */
    @SuppressWarnings("AlibabaUndefineMagicConstant")
    public static String partiallyDesensitize(String str, int maxExposedPartLen) {
        if (StrUtils.isBlank(str)) {
            return str;
        }

        int strLen = str.length();
        maxExposedPartLen = Math.max(maxExposedPartLen, 0);
        int exposedPartLen = Math.min(strLen / 2, maxExposedPartLen);

        int desensitizedPartLen = strLen - exposedPartLen;
        String desensitizedPart = StrUtils.repeat(StrUtils.ASTERISK, desensitizedPartLen);

        String headExposedPart;
        String tailExposedPart;
        if (exposedPartLen % 2 == 0) {
            headExposedPart = subPre(str, exposedPartLen / 2);
            tailExposedPart = subSufByLength(str, exposedPartLen / 2);
        } else {
            headExposedPart = subPre(str, (exposedPartLen + 1) / 2);
            tailExposedPart = subSufByLength(str, (exposedPartLen - 1) / 2);
        }

        return headExposedPart + desensitizedPart + tailExposedPart;
    }

    /**
     * 对字符串中间部分进行脱敏（即头尾各留一部分不脱敏）
     *
     * <p> 注1：对字符串进行脱敏的部分长度，最少为字符串长度的一半</p>
     * <p> 注2：头尾部分不脱敏直接显示的字符串长度最长共16个字符</p>
     *
     *
     * @param str 需要脱敏的字符串
     * @return 已脱敏的字符串
     */
    public static String desensitizeMiddlePart(String str) {
        return partiallyDesensitize(str, 16);
    }

    /**
     * 获取包含汉字的字符串长度（汉字的长度按长度 2 计算，其它字符按 1 计算）
     * @param str 待计算长度的字符串
     * @return 包含汉字的字符串长度
     */
    public static int lenOfHansStr(String str) {
        int valueLength = 0;
        String chinese = "[\u0391-\uFFE5]";
        for (int i = 0; i < str.length(); i++) {
            String temp = str.substring(i, i + 1);
            if (temp.matches(chinese)) {
                valueLength += 2;
            } else {
                valueLength += 1;
            }
        }
        return valueLength;
    }
}
