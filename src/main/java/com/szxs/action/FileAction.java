package com.szxs.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;

public class FileAction extends ActionSupport {
    private String userName;
    private File fileImg;//上传的文件
    private String fileImgFileName;//获取文件名

    /**
     * 上传文件
     * @return
     */
    public String upFile(){
        System.out.println(userName);
        String path = ServletActionContext.getRequest().getSession().getServletContext().getRealPath("upload");
        System.out.println(path);
        if(FileUtil.writeFile(path,fileImgFileName,fileImg)){
            System.out.println("上传成功");
        }
        return SUCCESS;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public File getFileImg() {
        return fileImg;
    }

    public void setFileImg(File fileImg) {
        this.fileImg = fileImg;
    }

    public String getFileImgFileName() {
        return fileImgFileName;
    }

    public void setFileImgFileName(String fileImgFileName) {
        this.fileImgFileName = fileImgFileName;
    }
}
