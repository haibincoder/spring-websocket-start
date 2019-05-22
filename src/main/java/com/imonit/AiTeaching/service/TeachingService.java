package com.imonit.AiTeaching.service;

/**
 * 教学接口
 * @Author bin
 * @Date 2019/5/7.
 */
public interface TeachingService {
    /**
     * 教学方法接口
     * @param base64
     * @return
     */
    void parse(String base64);

    /**
     * 课程列表接口
     * @param input
     */
    void subject(String input);
}
