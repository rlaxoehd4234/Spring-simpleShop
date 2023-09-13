package com.shop.simpleshop.service;

import com.shop.simpleshop.dto.QnA.QnARequestSaveDto;
import com.shop.simpleshop.dto.QnA.QnAResponseInfoDto;
import com.shop.simpleshop.dto.QnA.QnAResponseListDto;
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
    public int saveQnA(QnARequestSaveDto qnARequestSaveDto, HttpSession session) {
        qnARequestSaveDto.setUser_no(userMapper.findById((String) session.getAttribute("id")));
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
}
