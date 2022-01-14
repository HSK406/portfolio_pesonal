package chy.net.app.dao;

import java.util.List;

import chy.net.app.dto.NoticeDTO;

public interface NoticeDAO {
	
// 공지사항 리스트 나타냄
	public List<NoticeDTO> noticeList(NoticeDTO noticeDTO);
	
// 공지사항 등록
	public void insertNotice(NoticeDTO noticeDTO);
}
