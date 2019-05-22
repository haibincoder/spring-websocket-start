package com.imonit.AiTeaching.service;

/**
 * 学生状态检测接口
 * @Author bin
 * @Date 2019/5/7.
 */
public interface FaceDetectionService {
    Boolean predict(String base64);
}
