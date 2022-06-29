package student.demo.pro.parcticePro.helper;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@Component
public class FileUploadHelper {
public final String UPLOAD_DIR="D:\\studentDemo\\parcticePro\\src\\main\\resources\\static\\image";
public boolean uploadFile(MultipartFile multipartFile){
    boolean f=false;
    try{
//        InputStream inputStream = multipartFile.getInputStream();
//        byte data[]=new byte[inputStream.available()];
//        inputStream.read(data);
//        FileOutputStream fos=new FileOutputStream(UPLOAD_DIR+ File.separator+multipartFile.getOriginalFilename());
//        fos.write(data);
//        fos.flush();
//        fos.close();
        Files.copy(multipartFile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartFile.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
        f=true;

    }catch (Exception e){
        e.printStackTrace();
    }
    return f;
}
}
