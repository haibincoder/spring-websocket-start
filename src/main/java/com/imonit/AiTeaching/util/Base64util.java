package com.imonit.AiTeaching.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.misc.BASE64Decoder;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.UUID;

/**
 * Created by bin on 2019/5/8.
 */
public class Base64util {
    private static final Logger logger = LoggerFactory.getLogger(Base64util.class);

    /**
     * base64字符串转化成图片
     */
    public static boolean GenerateImage(String imgStr)
    {
        // 对字节数组字符串进行Base64解码并生成图片
        // 图像数据为空
        if (imgStr == null || "".equals(imgStr))
            return false;
        BASE64Decoder decoder = new BASE64Decoder();
        try
        {
            // Base64解码
            byte[] b = decoder.decodeBuffer(imgStr);
            for(int i=0;i<b.length;++i)
            {
                if(b[i]<0)
                {//调整异常数据
                    b[i]+=256;
                }
            }
            //生成jpeg图片
            String imgFilePath = "/data/chenhaibin/images/temp.jpg";   ;//新生成的图片
            OutputStream out = new FileOutputStream(imgFilePath);
            out.write(b);
            out.flush();
            out.close();
            return true;
        }
        catch (Exception ex)
        {
            logger.error(ex.toString());
            return false;
        }
    }
}
