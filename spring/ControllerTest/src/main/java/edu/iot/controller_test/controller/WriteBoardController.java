package edu.iot.controller_test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import edu.iot.controller_test.model.Board;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class WriteBoardController {
	@RequestMapping(value="/board/write",method=RequestMethod.GET)
	public String form() {
		return "board/board_write";
	}
	
	@RequestMapping(value="/board/write",method=RequestMethod.POST)
	public String submit(Board board) {
		log.debug(board.toString());
		return "board/board_write_result";
	}
}
