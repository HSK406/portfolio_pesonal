package chy.net.app.service;

import java.util.List;

import chy.net.app.dto.NoticeDTO;
import chy.net.app.dto.TestDTO;
import chy.net.app.vo.NoticeVO;
import chy.net.app.vo.TestVO;

public interface HomeService {

	/**
	 * 여러건 조회
	 * @param vo
	 * @return
	 */
	public List<TestVO> testList(TestVO vo);
	
	// 공지사항 첫 화면 리스트
	public List<NoticeDTO> noticeList(NoticeDTO noticeDTO); 
	
	/**
	 * 한건 조회
	 * @param no
	 * @return
	 */
	public TestVO selectTest(String no);
	
	/**
	 * 등록
	 * @param dto
	 */
	public void insertTest(TestDTO dto);
	
	// 공지사항 등록
	public void insertNotice(NoticeDTO noticeDTO);
	
	/**
	 * 수정
	 * @param dto
	 */
	public void updateTest(TestDTO dto);
	
	/**
	 * 삭제
	 * @param no
	 */
	public void deleteTest(String no);
	
}
