package com.xxx.viewmodel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

import org.apache.commons.fileupload.FileUpload;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.util.media.Media;
import org.zkoss.zk.ui.event.Event;
import org.zkoss.zk.ui.event.UploadEvent;
import org.zkoss.zul.Messagebox;

public class FileUploadEx1 {

	@Command
	public void getFile(@BindingParam("upevent") UploadEvent e){
		Media media = e.getMedia();
		String contentType = media.getContentType();
		if("text/plain".equals(contentType)){
			String is = null;
//			try {
//				is = new String(media.getStringData().getBytes("MS950"), "UTF-8");
//			} catch (UnsupportedEncodingException e1) {
//				e1.printStackTrace();
//			}
//			System.out.println(is);
			char[] cbuf = new char[1024];
			
			StringBuffer sb = new StringBuffer();
			int i=0;
			try {
				BufferedReader isr = new BufferedReader(new InputStreamReader(media.getStreamData(), "MS950")) ;
				String str,col1,col2,col3,col4,col5,col6;
				while((str = isr.readLine()) != null){
//					sb.append(str);
					col1 = str.substring(0, 6);
					col2 = str.substring(6, 10);
					col3 = str.substring(10, 82);
					col4 = str.substring(82, 96);
					col5 = str.substring(96, 106);
					col6 = str.substring(106, 118);
					System.out.println(col1+","+col3+","+col5+","+col6);
//					System.out.println(str.length());
					i++;
				}
				isr.close();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			System.out.println(sb+"\n"+i);
		}
		System.out.println(media.getName());
		System.out.println(media.getContentType());
		
	}
}
