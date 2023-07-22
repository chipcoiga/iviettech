package vn.iviettech.springbootmvc.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.data.repository.query.Param;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequestMapping("files")
@Controller
public class FileController {

    @GetMapping("/upload")
    public String uploadFile(Model model) {
        model.addAttribute("message", "");
        model.addAttribute("fileName", "");
        return "file/upload";
    }

    @PostMapping("upload")
    public String uploadFile(Model model, @RequestParam("file") MultipartFile file) {
        String message = "";

        try {

            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            String fileExtension = getFileExtension(file.getOriginalFilename());

            File file1 = new File("/Users/lehuuloc/Projects/iviettech/project/SpringBootMVC/src/main/resources/static/" + file.getOriginalFilename());

            try (OutputStream os = new FileOutputStream(file1)) {
                os.write(file.getBytes());
            }

            model.addAttribute("message", message);
            model.addAttribute("fileExtension", fileExtension);
            model.addAttribute("fileDownloadLink", "/files/download/" + file.getOriginalFilename());

        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + ". Error: " + e.getMessage();
            model.addAttribute("message", message);
        }

        return "file/upload";
    }

    @GetMapping(value = "download/{fileName}", produces = MediaType.APPLICATION_OCTET_STREAM_VALUE)
    public @ResponseBody
    Resource getFileViaByteArrayResource(@PathVariable("fileName") String filename) throws IOException, URISyntaxException {
        Path path = Paths.get(getClass().getResource("/static/" + filename).toURI());
        ByteArrayResource resource = new ByteArrayResource(Files.readAllBytes(path));
        return resource;
    }

    private String getFileExtension(String originalFilename) {
        String newFileName = ".png";
        //hack.png
        String[] fileSplits = newFileName.split("\\."); // ["hack", "png"]
        return fileSplits[fileSplits.length - 1]; //"png"
    }
}
