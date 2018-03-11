package com.szxs.action;

import java.io.*;

public class FileUtil {

    public static boolean writeFile(String dir, String fileName, File file){
        //文件不存在则创建
        File outFile = new File(dir);
        if(!outFile.exists()){
            outFile.mkdirs();
        }

        InputStream is = null;
        OutputStream os = null;

        try {
            //读取输入的文件
            is = new FileInputStream(file);
            os = new FileOutputStream(new File(dir,fileName));

            int len = -1;
            byte[] data= new byte[1024];

            while(  (len =is.read(data)) != -1){
                os.write(data,0,len);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            try {
                if(os != null) {
                    os.flush();
                    os.close();
                }
                if(is != null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return true;
    }
}
