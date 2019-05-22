package com.imonit.AiTeaching.controller;

import com.alibaba.fastjson.JSONObject;
import com.imonit.AiTeaching.pojo.ReturnObj;
import com.imonit.AiTeaching.service.FaceDetectionService;
import com.imonit.AiTeaching.util.Base64util;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Controller
@ResponseBody
@RequestMapping(value = "/Teaching")
public class TeachingController {
    private Logger log = LoggerFactory.getLogger(TeachingController.class);

    @Autowired
    private FaceDetectionService faceDetectionService;

    @RequestMapping(value = "/begin")
    public String begin(HttpServletRequest request) {
        // 假设用户tom登录,存储到session中
        request.getSession().setAttribute("WEBSOCKET_USERNAME", "tom");
        return "chat1";
    }
}
