package exceptions;

import java.awt.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex05 {
    private static final String path = "database.md";

    public static void main(String[] args) {
        // write data into a file
        File file = new File(path);

        if (file.exists()) {
            try {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write("Line 1 \n");
                fileWriter.write("Line 2 \n ");
                fileWriter.write("Line ... \n ");
                fileWriter.write("Line 8 \n ");
                // du lieu tinh toan sai => exception
                // cup dien
                calculator();
                fileWriter.write("Line ... \n ");
                fileWriter.write("Line 2 0 \n ");


                fileWriter.close();
                System.out.println("Write file successfully");
                open(file);

            } catch (IOException e) {
                e.printStackTrace();

            } catch (ArithmeticException e) {
                e.printStackTrace();
            }

        }
    }

    private static int calculator() {
        return 5 / 0;
    }

    private static void open(File file) {
        try {
            Desktop.getDesktop().open(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
