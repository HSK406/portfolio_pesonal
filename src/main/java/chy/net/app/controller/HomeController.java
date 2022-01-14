package chy.net.app.controller;

import java.text.DateFormat;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import chy.net.app.dto.NoticeDTO;
import chy.net.app.dto.TestDTO;
import chy.net.app.service.HomeService;
import chy.net.app.vo.TestVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	
	// 공지사항 리스트 첫 화면
	
	@RequestMapping(value = "/noticeList", method = RequestMethod.GET)
	public String noticeList(NoticeDTO noticeDTO, Model model) {
		
		List<NoticeDTO> list = homeService.noticeList(noticeDTO);
		model.addAttribute("list", list);
		
		return "noticeList";
	}
	
	// 게시글 작성 페이지로 이동
	@RequestMapping(value = "/writeForm", method = RequestMethod.GET)
		public String writeFrom(Model model) {
		
		return "writeForm";
	}
	
	
	
	/**
	 * 여러건 조회
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String testList(Model model) {
		
		List<TestVO> testList = new ArrayList<>();
		TestVO vo = new TestVO();
		vo.setSrchText("안녕");
		
		testList = homeService.testList(vo);
		
		model.addAttribute("testList", testList);
		
		return "list";
	}
	
	
	/**
	 * 한건 조회
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test(String no, Model model) {
		
		TestVO test = homeService.selectTest(no);
		
		model.addAttribute("test", test);
		
		return "test";
	}
	
	/**
	 * 등록
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/testInsert", method = RequestMethod.POST)
	public String testInsert(TestDTO dto, Model model) {
		
		homeService.insertTest(dto);
		
		return "list";
	}
	
	// 공지사항 작성
	@RequestMapping(value = "/writeResult", method = RequestMethod.POST)
	public String noticeInsert(NoticeDTO noticeDTO, Model model) {
		
		homeService.insertNotice(noticeDTO);
		
		return "redirect:noticeList.do";
	}
	
	
	/**
	 * 수정
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/testUpdate", method = RequestMethod.POST)
	public String testUpdate(TestDTO dto, Model model) {
		
		homeService.updateTest(dto);
		
		return "list";
	}
	
	/**
	 * 삭제
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/testDelete", method = RequestMethod.POST)
	public String testDelete(String no, Model model) {
		
		homeService.deleteTest(no);
		
		return "list";
	}
	
}
