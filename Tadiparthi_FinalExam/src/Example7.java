/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sai Vivek Reddy Tadiparthi
 */
public class Example7 {
    public static void main(String[] args) {

        System.out.println("Final exam");
        System.out.println("vivek:\n");
        
        Scanner src = new Scanner(System.in);

        System.out.print("Enter Source File Name: ");

        String vfile = src.next();
        try {
            exception(vfile);
        } catch (FileNotFoundException f) {
            System.out.println("Cannot find File");
        }
    }

    public static void exception(String file) throws FileNotFoundException {
        String nameoffile = "myfile.txt";

        if (!nameoffile.equals(file)) {
            throw new FileNotFoundException();
        } else {
            System.out.println("File Found");
        }
    }

}
