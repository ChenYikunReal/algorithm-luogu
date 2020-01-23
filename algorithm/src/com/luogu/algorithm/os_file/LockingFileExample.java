package com.luogu.algorithm.os_file;

import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.charset.*;

public class LockingFileExample {
    //排它/互斥
    public static final boolean EXCLUSIVE = false;
    //共享
    public static final boolean SHARED = true;
    //文件路径
    private static final String FILE_PATH = "src/com/neu/algorithm/os_file/file.txt";

    public static void main(String[] args) throws IOException {
        //共享锁
        FileLock sharedLock = null;
        //排它锁/互斥锁
        FileLock exclusiveLock = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(FILE_PATH, "rw");
            //get the channel from the file
            FileChannel ch = raf.getChannel();
            ByteBuffer buffer = ch.map(FileChannel.MapMode.READ_ONLY, 0, raf.length());
            //this locks the first half of the file - exclusive
            exclusiveLock = ch.lock(0, raf.length()/2, EXCLUSIVE);
            /* Now modify the data . . . */
            ch.position(raf.length());
            ch.write(buffer);
            //release the lock
            exclusiveLock.release();
            //this locks the second half of the file - shared
            sharedLock = ch.lock(raf.length()/2+1, raf.length(), SHARED);
            /* Now read the data . . . */
            ByteBuffer buffer2 = ch.map(FileChannel.MapMode.READ_WRITE, 0, raf.length());
            ch.read(buffer2);
            //release the lock
            sharedLock.release();
            buffer = ch.map(FileChannel.MapMode.READ_ONLY, 0, raf.length());
            //create the UTF-8 decoder
            Charset charset = Charset.forName("UTF-8");
            CharsetDecoder charsetDecoder = charset.newDecoder();
            //ByteBuffer -> CharBuffer
            CharBuffer charBuffer = charsetDecoder.decode(buffer);
            //output
            System.out.println(charBuffer);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (exclusiveLock != null) {
                exclusiveLock.release();
            }
            if (sharedLock != null) {
                sharedLock.release();
            }
        }
    }
}
