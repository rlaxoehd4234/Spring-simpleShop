package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;
import com.shop.simpleshop.exception.domain.UserException;
import com.shop.simpleshop.exception.domain.UserExceptionType;
import com.shop.simpleshop.mapper.QnAMapper;
import com.shop.simpleshop.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class QnAServiceImpl implements QnAService{

    private final QnAMapper qnAMapper;
    private final UserMapper userMapper;
    @Override
    public int saveQnA(QnARequestSaveDto qnARequestSaveDto) {
        qnARequestSaveDto.setUser_no(userMapper.findById(qnARequestSaveDto.getUserId()));
        qnARequestSaveDto.setItem_no(1);
        return qnAMapper.saveQnA(qnARequestSaveDto);
    }

    @Override
    public List<QnAResponseListDto> findAllQnA() {
        return qnAMapper.findAllQnA();
    }

    @Override
    public QnAResponseInfoDto findInfo(int qna_no) {
        return qnAMapper.findInfo(qna_no);
    }

    @Override
    public int deleteQnA(int qna_no, HttpSession session) {
        validUser(qna_no, session);
        return qnAMapper.deleteQnA(qna_no);
    }

    @Override
    public List<QnAResponseListDto> findById(int itemId) {
        return qnAMapper.findById(itemId);
    }

    public void validUser(int qna_no , HttpSession session){
        if(qnAMapper.findByUserNo(qna_no) != userMapper.findById((String) session.getAttribute("id"))){
            throw new UserException(UserExceptionType.UN_AUTHORIZE_ERROR);
        }
    }
}
