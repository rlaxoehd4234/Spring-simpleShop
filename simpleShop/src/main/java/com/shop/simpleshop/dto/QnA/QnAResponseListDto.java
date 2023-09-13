package com.shop.simpleshop.dto.QnA;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class QnAResponseListDto {
    private int qna_no;
    private String title;
    private String id;
    private String answer;
}
