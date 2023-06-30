package com.wanshu.common.model;

import lombok.Data;

/**
 * 字典bean
 * 只有code和text，可用于展示下拉框
 *
 * @author 波哥
 */
@Data
public class DictBean<T> implements IDict<T> {
    private final T code;
    private final String text;
}