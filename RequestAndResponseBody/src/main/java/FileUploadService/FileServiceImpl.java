package FileUploadService;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

@Service
public class FileServiceImpl implements FileService {
    @Override
    public String uploadImage(MultipartFile file, String path) throws IOException {
        // File name
        String filename=file.getOriginalFilename();
        // Full Path
        String filePath=path+ File.separator+filename;

        // Create folder if not created
        File f=new File(path);
        if(!f.exists()){
            f.mkdir();
        }
        // File Copy
        Files.copy(file.getInputStream(), Paths.get(filePath));
        return filename;
    }

}
