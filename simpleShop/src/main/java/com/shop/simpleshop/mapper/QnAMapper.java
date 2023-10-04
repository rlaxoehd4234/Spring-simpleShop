package com.shop.simpleshop.mapper;

import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface QnAMapper {
    int saveQnA(QnARequestSaveDto qnARequestSaveDto);
    List<QnAResponseListDto> findAllQnA();
    QnAResponseInfoDto findInfo(int qna_no);
    int deleteQnA(int qna_no);
    int findByUserNo(int qna_no);
    List<QnAResponseListDto> findById(int itemId);
}
