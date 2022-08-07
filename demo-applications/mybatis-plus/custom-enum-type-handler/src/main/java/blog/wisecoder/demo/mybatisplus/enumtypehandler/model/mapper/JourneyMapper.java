package blog.wisecoder.demo.mybatisplus.enumtypehandler.model.mapper;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.dto.JourneyDTO;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.entity.Journey;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapstruct mapper
 *
 * @author bianyun
 */
@SuppressWarnings("unused")
@Mapper
public interface JourneyMapper {

    @Mapping(source = "id", target = "id")
    @Mapping(source = "srcCity", target = "srcCity")
    @Mapping(source = "destCity", target = "destCity")
    @Mapping(source = "departureDate", target = "departureDate")
    @Mapping(source = "transportMeans", target = "transportMeans")
    JourneyDTO entityToDto(Journey entity);

    @InheritInverseConfiguration
    Journey dtoToEntity(JourneyDTO dto);

    List<JourneyDTO> entityListToDtoList(List<Journey> entityList);
}
