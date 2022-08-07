package blog.wisecoder.demo.mybatisplus.enumtypehandler.enums;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.base.LabelProvidedEnum;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.base.PersistableEnum;
import cn.hutool.core.lang.Console;
import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;



/**
 * 交通工具
 *
 * @author bianyun
 */
@Getter
public enum TransportMeans implements LabelProvidedEnum, PersistableEnum<Integer> {
    CAR(1, "汽车") {
        @Override
        public void march(long distanceInKm) {
            Console.log(MARCH_TEMPLATE, "高速公路", "行驶", distanceInKm);
        }
    },

    TRAIN(2, "火车") {
        @Override
        public void march(long distanceInKm) {
            Console.log(MARCH_TEMPLATE, "铁路", "行驶", distanceInKm);
        }
    },

    SHIP(3, "轮船") {
        @Override
        public void march(long distanceInKm) {
            Console.log(MARCH_TEMPLATE, "海面", "航行", distanceInKm);
        }
    };

    private static final String MARCH_TEMPLATE = "在{}上{}了 {} 公里";

    @EnumValue
    private final Integer code;
    private final String label;

    @SuppressWarnings("unused")
    public abstract void march(long distanceInKm);

    TransportMeans(Integer code, String label) {
        this.label = label;
        this.code = code;
    }
}
