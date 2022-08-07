package blog.wisecoder.demo.mybatisplus.enumtypehandler.model.dto;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.enums.TransportMeans;
import lombok.Data;

import java.time.LocalDate;

/**
 * 旅程 DTO
 *
 * @author bianyun
 */
@Data
public class JourneyDTO {

    /**
     * 主键ID
     */
    private Integer id;

    /**
     * 出发城市
     */
    private String srcCity;

    /**
     * 目的城市
     */
    private String destCity;

    /**
     * 出发日期
     */
    private LocalDate departureDate;

    /**
     * 交通工具
     */
    private TransportMeans transportMeans;
}
