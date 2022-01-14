package chy.net.app.dao;

import java.util.List;


import chy.net.app.dto.TestDTO;
import chy.net.app.vo.TestVO;

public interface TestDAO {
	
	/**
	 * 여러건 조회
	 * @param vo
	 * @return
	 */
	public List<TestVO> selectTestList(TestVO vo);
	
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
