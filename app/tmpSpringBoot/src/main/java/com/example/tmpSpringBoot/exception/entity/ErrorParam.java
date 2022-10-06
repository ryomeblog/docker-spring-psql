package com.example.tmpSpringBoot.exception.entity;

import lombok.*;
import lombok.experimental.*;

/**
 * エラーパラメータ
 */
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class ErrorParam {

    /** パラメータ名 */
    private String name;

    /** 値 */
    private Object value;

    /** エラーメッセージ */
    private String message;
}
