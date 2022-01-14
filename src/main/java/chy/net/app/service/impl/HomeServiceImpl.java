package chy.net.app.service.impl;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import chy.net.app.dao.NoticeDAO;
import chy.net.app.dao.TestDAO;
import chy.net.app.dto.NoticeDTO;
import chy.net.app.dto.TestDTO;
import chy.net.app.service.HomeService;
import chy.net.app.vo.NoticeVO;
import chy.net.app.vo.TestVO;

@Service("homeService")
public class HomeServiceImpl implements HomeService {

	@Autowired
	TestDAO testDAO;
	
	@Autowired
	NoticeDAO noticeDAO;
	
	@Override
	public List<TestVO> testList(TestVO vo) {
		return testDAO.selectTestList(vo);
	}
	
	
	// 공지사항 처음 보이는 화면
	
	@Override
	public List<NoticeDTO> noticeList(NoticeDTO noticeDTO) {
		return noticeDAO.noticeList(noticeDTO);
		}
	
	
	// 공지사항 등록
		@Override
		public void insertNotice(NoticeDTO noticeDTO) {
			noticeDAO.insertNotice(noticeDTO);
		}

	
	@Override
	public TestVO selectTest(String no) {
		return testDAO.selectTest(no);
	}
	
	@Override
	public void insertTest(TestDTO dto) {
		testDAO.insertTest(dto);
	}
	
	
	@Override
	public void updateTest(TestDTO dto) {
		testDAO.updateTest(dto);
	}
	
	@Override
	public void deleteTest(String no) {
		testDAO.deleteTest(no);
	}




	

	
	
}
