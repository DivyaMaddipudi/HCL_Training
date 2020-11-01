package com.files;

import java.io.*;
class DemoOnFiles
{
    public static void main(String args[]) throws IOException
    {
        InputStream obj = new FileInputStream("inputoutput.java");
        System.out.print(obj.available());
    }
}
