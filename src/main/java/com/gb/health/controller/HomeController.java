package com.gb.health.controller;

import com.gb.health.domain.CiMing;
import com.gb.health.domain.Msg;
import com.gb.health.init.Const;
import com.gb.health.rqf.CimingServiceR;
import com.gb.health.rqf.DataHeader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * Created by yangyibo on 17/1/18.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        Msg msg =  new Msg("后台管理","","");
        model.addAttribute("msg", msg);
        return "home";
    }

    @RequestMapping("/cimingupload")
    public String cimingUpload(Model model,
                               HttpServletRequest request,
                               HttpServletResponse response) throws Exception {
        Msg msg =  new Msg("后台管理","上传失败","");

        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        MultiValueMap<String, MultipartFile> multiValueMap = multipartRequest.getMultiFileMap();

        List<MultipartFile> file = multiValueMap.get("ciming");
        if(file.size()<1){
            return "home";
        }

        System.out.println(file.get(0).getOriginalFilename());
        UUID uuid = UUID.randomUUID();

        for (int i = 0; i < file.size(); i++) {
            if (file.isEmpty())
                continue;

            File fileWrite = new File(Const.FILE_PATH+uuid+".html");

            try {

                fileWrite.createNewFile();
                FileOutputStream fos = new FileOutputStream(fileWrite);
                System.out.println(((MultipartFile)file.get(i)).getOriginalFilename());

                fos.write(((MultipartFile)file.get(i)).getBytes());

                fos.flush();
                fos.close();

                CimingServiceR ci = new CimingServiceR();
                DataHeader<CiMing> dh = new DataHeader<>(ci);
                dh.setEntiy(new CiMing());

                Boolean isSuccess=dh.getDataIn().loadPathFile( Const.FILE_PATH, uuid+".html");

                if(isSuccess==true){
                    msg.setContent("上传成功！");

                }else{
                    msg.setContent("格式错误,上传失败！");
                }

            } catch (IOException e)
            {
                msg.setContent("其他原因,上传失败！");
            }
        }

        model.addAttribute("msg", msg);
        return "home";
    }
}
