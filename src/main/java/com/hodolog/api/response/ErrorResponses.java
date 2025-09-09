package com.hodolog.api.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

/**
 * {
 *     "code": "400",
 *     "message": "잘못된 요청입니다.",
 *     "validation": {
 *         "title": "값을 입력해주세요."
 *     }
 * }
 */

@Getter
public class ErrorResponses {

    private final String code;
    private final String message;
    private Map<String,String> validation=new HashMap<>();

    @Builder
    public ErrorResponses(String message, String code) {
        this.message = message;
        this.code = code;
    }

    public void addValidation(String fieldName, String errorsMessage){
        this.validation.put(fieldName, errorsMessage);
    }
}
