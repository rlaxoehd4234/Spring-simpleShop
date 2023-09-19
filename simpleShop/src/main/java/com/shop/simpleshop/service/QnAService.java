package com.shop.simpleshop.service;


import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface QnAService {
    int saveQnA(QnARequestSaveDto qnARequestSaveDto, HttpSession session);
    List<QnAResponseListDto> findAllQnA();
    QnAResponseInfoDto findInfo(int qna_no);

    int deleteQnA(int qna_no , HttpSession session);
}
