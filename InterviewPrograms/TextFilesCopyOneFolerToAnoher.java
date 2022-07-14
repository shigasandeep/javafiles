import java.io.*;

public class TextFilesCopyOneFolerToAnoher {
        public static void main(String arg[]) throws Exception {
            fileMove();
        }
        

        static void fileMove() throws Exception {
            File source = new File("E:\\SandeepDocs\\InterviewPrograms");
            File dest = new File("E:\\SandeepDocs\\testfolder");
            boolean success = false;
            File[] reviews = source.listFiles();
            for(int i = 0; i < reviews.length; i++) {
                File review = reviews[i];

                if (review.getName().contains(".txt")) {
                    System.out.println("ready to move here the .txt files :: " + review.getName());
                    System.out.println(dest.getAbsolutePath());
                    InputStream in = new FileInputStream(source.getAbsoluteFile()+"/"+review.getName());
                    OutputStream out = new FileOutputStream(dest.getAbsolutePath()+"/"+review.getName());

                    // Copy the bits from instream to outstream
                    byte[] buf = new byte[1024];
                    int len;
                    while ((len = in.read(buf)) > 0) {
                        out.write(buf, 0, len);
                    }
                    in.close();
                    out.close();
                } else {
                    System.out.println("else not ready to copy here " + review.getName());
                }

            }
        }


    }