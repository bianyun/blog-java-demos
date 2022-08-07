package blog.wisecoder.demo.mybatisplus.enumtypehandler.dao;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.entity.Journey;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 旅程 DAO
 *
 * @author bianyun
 */
@Mapper
public interface JourneyDAO extends BaseMapper<Journey> {

}
