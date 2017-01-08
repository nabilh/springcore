package demo;

import java.io.IOException;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/**
 * Created by nabil on 1/7/17.
 */
public class ClassLister {

    public void run () {

        String classpath = System.getProperty("java.class.path");

        String[] entries = classpath.split(":");

        int totalCount = 0;

        for (String entry: entries) {

//            System.out.println("***** Entry: " + entry + " *****");

            totalCount += printClasses(entry);

            System.out.println("***** Total count for classpath = " + totalCount + "\n");
        }
    }


    private int printClasses (String entry) {
        int count = 0;
        if (entry.endsWith(".jar")) {
//            System.out.println("jjjjj jar file: " + entry);
            count = unzip (entry);
        } else {
            System.out.println("***** not a jar file: " + entry);
        }
        return count;
    }

    private int unzip(String fileName) {

        ZipFile zipFile;


        try {
            zipFile = new ZipFile(fileName);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            int count = 0;
            while (entries.hasMoreElements()) {
                count++;
                ZipEntry zipEntry = entries.nextElement();
                if (count < 6)
                    getFile (zipEntry);
            }
            System.out.println("----- count for " + fileName + " = " + count + " entries");
            return count;
        } catch (IOException e) {
            System.err.println("IO error: " + e);
        }

        return 0;
    }

    private void getFile(ZipEntry e) {

        String zipName = e.getName();
        if (e.isDirectory()) {
            System.out.println("Directory: " + zipName);
        } else {
            System.out.println("File: " + zipName);
        }

    }

}
