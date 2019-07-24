package com.ppp.ulits;

import com.ppp.entity.Users;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class NewNameUtils {
    public static String perfectInformation( MultipartFile file, HttpServletRequest request){
        String newFileName = null;
        if (null != file) {
            String[] split = file.getOriginalFilename().split("\\.");
            newFileName = UUID.randomUUID()+"."+split[1];
            String imgRootPath= request.getSession().getServletContext().getRealPath("/")+"img\\";
            File imgRootFile = new File(imgRootPath);
            if (!imgRootFile.exists()) {
                imgRootFile.mkdirs();
            }
//            String toPath = "D:\\File\\zilonglove\\target\\zilong-love\\images\\img\\" + fileName + file.getOriginalFilename();
            String toPath =imgRootPath+newFileName;
            File img = new File(toPath);

            try {
                file.transferTo(img);
            } catch (IOException e) {
                e.printStackTrace();
            }
//            System.out.println(users);
            return newFileName;
        }
        return "-1";

    }
}
