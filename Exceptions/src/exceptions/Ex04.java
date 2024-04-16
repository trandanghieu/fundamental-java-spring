package exceptions;

import java.io.File;
import java.io.IOException;

public class Ex04 {
    public static void main(String[] args) {
        System.out.println("Main start");
        //(createNewFile) throws CompileException >> handle exception >> differnt with ex03
        File file = new File("exception.info");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     public boolean createNewFile() throws IOException {
        SecurityManager security = System.getSecurityManager();
        if (security != null) security.checkWrite(path);
        if (isInvalid()) {
            throw new IOException("Invalid file path");
        }
        return fs.createFileExclusively(path);
    }
     */
}
