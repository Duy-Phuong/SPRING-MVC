package action;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import com.opensymphony.xwork2.ActionSupport;

public class ActionProduct extends ActionSupport {

    private File photo; // Url file được chọn
    private String photoFileName; // Tên file vừa chọn
    private String photoContentType; // Loại file vừa chọn 

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    @Override
    public String execute() throws Exception {
        String targetPath = "D:\\study"; // Url đích đến
        File fileToCreate = new File(targetPath, photoFileName);
        try {
            FileUtils.copyFile(this.photo, fileToCreate);
        } catch (IOException e) {
            addActionError(e.getMessage());
        }
        return "success";
    }

}