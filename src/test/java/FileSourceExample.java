import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.util.FileCopyUtils;
public class FileSourceExample {
	public static void main(String [] args){
		try {
			String filePath = "D:/java.txt";
			Resource res1 = new FileSystemResource(filePath);
			Resource res2 = new ClassPathResource("java.txt");
			InputStream ins1 = res1.getInputStream();
			InputStream ins2 = res2.getInputStream();
			FileInputStream filename  = new FileInputStream(res1.getFile());
			InputStream ins3  = filename;
			FileReader filereader = new FileReader(res1.getFile());
			EncodedResource encRes = new EncodedResource(res2,"UTF-8");
			System.out.println("----------------------------------------------------");
			String content = FileCopyUtils.copyToString(encRes.getReader());
			System.out.println(content);
			System.out.println("----------------------------------------------------");
			InputStreamReader  reader = new InputStreamReader(res2.getInputStream());
//			BufferedReader reader = new BufferedReader(new InputStreamReader(ins3));
	        StringBuilder builder = new StringBuilder();
	        char []cha = new char[1024];  
//	        int len =filereader.read(cha);
	        int len = reader.read(cha);
	        System.out.println(new String(cha,0,len));  
	        FileWriter writer  = new FileWriter(res1.getFile(),true);
	        writer.write("\r\n"+content);
	        byte [] buf = new byte[1024];
	        int leng = 0;
	        System.out.println("sssssssssssssssssssssss");
	        leng = filename.read(buf);
	        System.out.println(new String(buf,0,len)+"\n");
	        reader.close();  
	        writer.close();
//	        String line = null;
//            while ((line = reader.readLine()) != null) {
//                builder.append(line);
//                builder.append("\n"); //appende a new line
//            }
//	        System.out.println(builder.toString());
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("dd"+e.getMessage());
		}
	}
}
