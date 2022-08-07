package blog.wisecoder.demo.mybatisplus.enumtypehandler.service;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.dto.JourneyDTO;

import java.util.List;

/**
 * 旅程服务
 *
 * @author bianyun
 */
public interface JourneyService {

    void saveJourney(JourneyDTO journeyDTO);

    List<JourneyDTO> listAll();

}
