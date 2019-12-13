package springbootvue01.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {


    /**
     * 注意 form 中的 name 的 value  需要和 MultipartFile 的变量名一致
     *
     * @param file
     * @param request
     * @return
     */
    @PostMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) {
        String originalFilename = file.getOriginalFilename();

        File f = new File("d:/11");
        try {
            file.transferTo(f);
        } catch (IOException e) {



        }
        return originalFilename;
    }
}
