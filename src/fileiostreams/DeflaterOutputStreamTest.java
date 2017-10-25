import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;
public class DeflaterOutputStreamTest {
    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("file.txt");
        FileOutputStream out = new FileOutputStream("file_new.dfl");
        DeflaterOutputStream dos = new DeflaterOutputStream(out);
        int ch=0;
        while ((ch = in.read())!=-1){
           ch = in.read();
           dos.write(ch);
        }
        dos.close();
        in.close();
      }   
 }