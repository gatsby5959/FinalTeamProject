package com.myweb.www.repository;

import java.util.List;

import com.myweb.www.domain.ApprovalVO;
import com.myweb.www.domain.ClubVO;
import com.myweb.www.domain.PagingVO;

public interface ClubDAO {

	List<ClubVO> list(PagingVO pagingVO);

	int totalCount(PagingVO pagingVO);

	List<ClubVO> list_club(ApprovalVO approval);

}
