package blog.wisecoder.demo.mybatisplus.enumtypehandler.controller;

import blog.wisecoder.demo.mybatisplus.enumtypehandler.model.dto.JourneyDTO;
import blog.wisecoder.demo.mybatisplus.enumtypehandler.service.JourneyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 旅程 REST Api
 *
 * @author bianyun
 */
@RequestMapping("/api/v1/journeys")
@RestController
public class JourneyController {
    private final JourneyService journeyService;

    public JourneyController(JourneyService journeyService) {
        this.journeyService = journeyService;
    }

    @PostMapping
    public void addJourney(@RequestBody JourneyDTO journeyDTO) {
        journeyService.saveJourney(journeyDTO);
    }

    @GetMapping
    public List<JourneyDTO> listAllJourneys() {
        return journeyService.listAll();
    }
}
