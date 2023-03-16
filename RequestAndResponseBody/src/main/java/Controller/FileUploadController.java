package Controller;

import FileUploadService.FileServiceImpl;
import POJOS.FilePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/file")
public class FileUploadController {
    @Autowired
   private FileServiceImpl fileService;
    @Value("${project.image}")
    private String filePath;

    @PostMapping("/upload")
    public ResponseEntity<FilePojo> UploadImage(@RequestParam("image") MultipartFile file) {
        String fileName =null;
       try {
            fileName= this.fileService.uploadImage(file,filePath);
       }catch (IOException e){
           e.printStackTrace();
           return new ResponseEntity<FilePojo>(new FilePojo(null,"Image not Uploaded"), HttpStatus.INTERNAL_SERVER_ERROR);
       }


       return new ResponseEntity<FilePojo>(new FilePojo(fileName,"Successfully Uploaded"), HttpStatus.OK);
    }
}
