import org.junit.jupiter.api.Test;

public class UploadFile {
    @Test
    public void test1(){
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));

        System.out.println(suffix);
    }

}
