import java.io.*;
import java.util.Scanner;

public class App {
    private File dir;
    private String dirName = "Default_Directory_Name";
    private String dirPath = "C:/Users/sorra/" + dirName;

    App() {
        System.out.println("Creating Directory at " + dirPath);
        dir = new File(dirPath);
        if(!dir.exists()) {
            dir.mkdir();
        }
        else {
            existDir();
        }
        main();
    }

    App(String dirPath) {
        System.out.println("Creating Directory at " + dirPath);
        this.dirPath = dirPath;
        dir = new File(dirPath);
        if(!dir.exists()) {
            dir.mkdir();
        }
        else {
            existDir();
        }
        main();
    }

    private void main() {
        Scanner sc = new Scanner(System.in);
        boolean doLoop = true;
        char choice = ' ';
        do {
            System.out.println("Options : ");
            System.out.println("[L]ist all files and directories");
            System.out.println("[A]dd file or directory");
            System.out.println("[D]elete file or directory");
            System.out.println("[R]ename file or directory");
            System.out.println("[X] to exit");

            choice = sc.next().toUpperCase().charAt(0);

            switch(choice) {
                case 'L':
                    if(dir.list() == null) {
                        System.out.println("This directory is empty.");
                    }else {
                        for(String s : dir.list()) {
                            System.out.println(s);
                        }
                    }
                    break;
                case 'A':
                    Add();
                    break;
                case 'D':
                    Delete();
                    break;
                case 'R':
                    Rename();
                    break;
                case 'X':
                    System.out.println("Exiting program");
                    doLoop = false;
                    break; 
                default:
                    System.out.println("Please select the choice above");
            }
            
        }while(doLoop);

        // sc.close();
        
    }

    private void Add() {
        Scanner sc = new Scanner(System.in);
        char choice = ' ';
        boolean doLoop = true;

        do {
            System.out.println("Add [F]ile or [D]irectory");
            System.out.println("[X] for cancel");

            try {
                choice = sc.next().toUpperCase().charAt(0);
            }catch(Exception ex) {
                System.out.println(ex);
            }

            sc.nextLine();

            switch(choice) {
                case 'F':
                    System.out.print("Name of the file ? : ");
                    String fileName = sc.nextLine();
                    File file = new File(dirPath + "/" + fileName);
                    try {
                        file.createNewFile();
                    }catch(Exception ex) {
                        System.out.println(ex);
                    }
                    doLoop = false;
                    break;
                case 'D':
                    System.out.print("Name of the directory? : ");
                    String dir_Name = sc.nextLine();
                    File new_Dir = new File(dirPath + "/" + dir_Name);
                    new_Dir.mkdir();
                    doLoop = false;
                    break;
                case 'X':
                    System.out.println("Canceling");
                    doLoop = false;
                    return;
                default:
                    doLoop = true;
            }

        }while(doLoop);

        // sc.close();

    }

    private void Delete() {
        Scanner sc = new Scanner(System.in);
        boolean doLoop = true;

        char choice = ' ';

        do {
            System.out.println("Delete [F]ile or [D]irectory");
            System.out.println("[X] for cancel");

            try {
                choice = sc.next().toUpperCase().charAt(0);
            }catch(Exception ex) {
                System.out.println(ex);
            }

            sc.nextLine();

            switch(choice) {
                case 'F':
                    System.out.print("Which file do you want to delete ? : ");
                    String file_Name = sc.nextLine();
                    File file = new File(dirPath + "/" + file_Name);
                    if(!file.exists()) {
                        System.out.println("This file is not exist");
                    }else {
                        doLoop = false;
                        file.delete();
                    }
                    break;
                case 'D':
                    System.out.print("Which file do you want to delete ? : ");
                    String dir_Name = sc.nextLine();
                    File dirDelete = new File(dirPath + "/" + dir_Name);
                    if(!dirDelete.exists()) {
                        System.out.println("This directory is not exist");
                    }else {
                        doLoop = false;
                        dirDelete.delete();
                    }
                    break;
                case 'X':
                    System.out.println("Canceling");
                    doLoop = false;
                    break;
                default:
                    doLoop = true;

            }

        }while(doLoop);

        // sc.close();

    }

    private void Rename() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Which file/directory do you want to rename ? : ");
        System.out.println("[X] for cancel");

        String answer = sc.nextLine();

        if(answer.length() == 1 && answer.toUpperCase().charAt(0) == 'X') {
            System.out.println("Canceling");
            return;
        }else {

            File file = new File(dirPath + "/" + answer);

            if(!file.exists()) {
                System.out.println("File or directory is not exist.");
                return;
            }else {
                String newName = sc.nextLine();
                File dest = new File(dirPath + "/" + newName);
                if(file.renameTo(dest))
                    System.out.println("Rename Success");
                else
                    System.out.println("Rename Not Success");
            }
        }

        // sc.close();

    }

    private void existDir() {
        System.out.println("Directory already exist at your path. Please Provide new path or change directory name.");
        Scanner sc = new Scanner(System.in);
        boolean doLoop = true;
        char choice = ' ';
        do {
            System.out.println("Options : ");
            System.out.println("[D]elete directory and create a new one");
            System.out.println("[R]ename directory");
            System.out.println("[X] do nothing");

            choice = sc.next().toUpperCase().charAt(0);

            switch(choice) {
                case 'D':
                    dir.delete();
                    dir.mkdir();
                    doLoop = false;
                    break;
                case 'R':
                    sc.nextLine();
                    String newName;
                    System.out.print("Enter new name : ");
                    newName = sc.nextLine();
                    File newDir = new File("C:/Users/sorra/" + newName);
                    dir.renameTo(newDir);
                    dirPath = newDir.getPath();
                    doLoop = false;
                    break;
                case 'X':
                    doLoop = false;
                    break;
                default:
                    System.out.println("Please Select one of the options above.");
            }

        }while(doLoop);

        // sc.close();

    }

}