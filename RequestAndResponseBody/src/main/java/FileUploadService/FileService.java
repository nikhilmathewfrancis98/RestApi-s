package FileUploadService;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface FileService {
    public String uploadImage(MultipartFile file,String path) throws IOException;
}
