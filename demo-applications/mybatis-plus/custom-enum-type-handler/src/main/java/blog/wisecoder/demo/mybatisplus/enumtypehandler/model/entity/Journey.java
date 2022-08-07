package blog.wisecoder.demo.mybatisplus.enumtypehandler.model.entity;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.TransportMeans;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

/**
 * 旅程
 *
 * @author bianyun
 */
@TableName("mp_journey")
@EqualsAndHashCode(callSuper = true)
@Data
public class Journey extends Model<Journey> {

    /**
     * 主键ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 出发城市
     */
    @TableField
    private String srcCity;

    /**
     * 目的城市
     */
    @TableField
    private String destCity;

    /**
     * 出发日期
     */
    @TableField
    private LocalDate departureDate;

    /**
     * 交通工具
     */
    @TableField
    private TransportMeans transportMeans;
}
