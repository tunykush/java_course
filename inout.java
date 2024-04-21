
import java.util.ArrayList;

import java.util.Scanner;

import java.io.FileInputStream;

import java.io.IOException;



/*Open the file helloWorld.txt for writing*/	            FileOutputStream fileStream = new FileOutputStream("helloWorld.txt");

/*Create a PrintWriter to write to the file*/	            PrintWriter outFS = new PrintWriter(fileStream);

/*Write the string "Hello World!" to the file*/	            outFS.println("Hello World!");

/*Close the file after writing all desired data*/	        outFS.close();
