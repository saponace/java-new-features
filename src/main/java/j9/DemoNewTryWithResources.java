package j9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class DemoNewTryWithResources {
    public static void main(String[] args) throws IOException {
        System.out.println(readData("test"));
    }
    static String readData(String message) throws IOException {
        Reader inputString = new StringReader(message);
        BufferedReader br = new BufferedReader(inputString);
        String retVal;
        try (br) {
            retVal = br.readLine();
        }
//        br.readLine();
        return retVal;
    }
}