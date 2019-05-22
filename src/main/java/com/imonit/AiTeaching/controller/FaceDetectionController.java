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

import java.util.*;

@Controller
@ResponseBody
public class FaceDetectionController {
    Logger log = LoggerFactory.getLogger(FaceDetectionController.class);

    @Autowired
    private FaceDetectionService faceDetectionService;

    @RequestMapping(value = "/FaceDetection",method = RequestMethod.POST)
    public Object FaceDetection(@RequestBody String body){
        log.info("requset:" + body);
        Map request = JSONObject.parseObject(body, Map.class);
        String image = request.containsKey("image")? request.get("image").toString() : "";
        String userId = request.containsKey("userId")? request.get("userId").toString() : "";

        Base64util.GenerateImage(image);

        // faceDetectionService.predict("test");

        List<String> status = new ArrayList<>(3);
        status.add("normal");
        status.add("sleep");
        status.add("leave");
        Random random = new Random();
        String result = status.get(random.nextInt(3));
        Map<String, String> resultMap = new HashMap<>(2);
        resultMap.put("status",result);

        ReturnObj<Map> returnObj = new ReturnObj<>();
        returnObj.setCode("0");
        returnObj.setData(resultMap);
        log.info("response:" + JSONObject.toJSONString(returnObj));
        return returnObj;
    }

}
