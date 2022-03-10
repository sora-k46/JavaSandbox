/*
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class FileVector {
    public static void main(String[] args) {
        Vector<Long> list = new Vector<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of input: ");
        int n = sc.nextInt();
        String[] arr = new String[n];

        System.out.println("Enter input : ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        try {
            RandomAccessFile raf = new RandomAccessFile("hw.txt", "rw");

            for(int i = 0; i < n; i++) {
                byte[] input = new byte[20];
                input = arr[i].concat("....................").getBytes();
                // list.add(raf.getFilePointer());
                raf.write(input, 0, 20);
                raf.read(input, 0, 20);
                // TODO: sort the vector
                sort(raf, n, list);
                System.out.println(new String(input));
            }

            raf.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        list.forEach(System.out::println);

        sc.close();

    }

// This one is not working
    private static void sort(RandomAccessFile raf, int n, Vector<Long> list) throws Exception {
        String[] arr = new String[n];
        Map<Long, String> map = new TreeMap<>();
        byte[] input = new byte[20];
        for(int i = 0; i < n; i++) {
            raf.read(input, 0, 20);
            map.put(raf.getFilePointer(), new String(input));
        }
        for(int i = 0; i < n; i++) {
            list.add(map.get(raf.getFilePointer()));
        }

    }
}
*/

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Vector;

public class การบ้าน {
    public static void main(String[] args) throws IOException {
        RandomAccessFile แรนด้อมไฟล์แอกเซส = new RandomAccessFile("test.txt", "r");
        Vector<String> ลิสต์ = new Vector<String>();
        while (แรนด้อมไฟล์แอกเซส.getFilePointer() < แรนด้อมไฟล์แอกเซส.length()) {
            if (ลิสต์.size() == 0) {
                ลิสต์.add(แรนด้อมไฟล์แอกเซส.readLine());
                continue;
            }
            String text = แรนด้อมไฟล์แอกเซส.readLine();
            boolean โอเค = false;
            for (int ไอ = 0; ไอ < ลิสต์.size(); ไอ++) {
                if (ลิสต์.get(ไอ).compareTo(text) > 0) {
                    โอเค = true;
                    ลิสต์.insertElementAt(text, ไอ);
                    break;
                }
            }
            if (!โอเค) {
                ลิสต์.insertElementAt(text, ลิสต์.size());
            }
        }
        System.out.println(ลิสต์);
    }
}