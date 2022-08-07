package blog.wisecoder.demo.mybatisplus.enumtypehandler.service.impl;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.dao.JourneyDAO;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.dto.JourneyDTO;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.entity.Journey;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.mapper.JourneyMapper;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.service.JourneyService;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 旅程服务实现
 *
 * @author bianyun
 */
@Service
public class JourneyServiceImpl implements JourneyService {
    private final JourneyDAO journeyDAO;
    private final JourneyMapper journeyMapper;

    @SuppressWarnings({"SpringJavaInjectionPointsAutowiringInspection", "RedundantSuppression"})
    public JourneyServiceImpl(JourneyDAO journeyDAO, JourneyMapper journeyMapper) {
        this.journeyDAO = journeyDAO;
        this.journeyMapper = journeyMapper;
    }

    @Override
    public void saveJourney(JourneyDTO journeyDTO) {
        journeyDTO.setId(null);
        Journey journey = journeyMapper.dtoToEntity(journeyDTO);
        journeyDAO.insert(journey);
    }

    @Override
    public List<JourneyDTO> listAll() {
        List<Journey> entityList = journeyDAO.selectList(Wrappers.emptyWrapper());
        return journeyMapper.entityListToDtoList(entityList);
    }
}
