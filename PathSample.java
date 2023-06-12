import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;
import static java.nio.file.AccessMode.*;
import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PathSample {
    Path fullPath, inputPath;
    String fileName;
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        PathSample ps = new PathSample();

        do {
            ps.filePath();
            boolean exitCurrentFile = false;

            do {
                System.out.println("What do you want to do with the file/directory?");
                System.out.println("READ/ATTRIBUTES/DELETE/BUFFEREDWRITE/FILEWRITER/END [end program]");

                try {
                    String option = input.nextLine();

                    if (option.equalsIgnoreCase("READ")) {
                        ps.readExe();
                        System.out.println();
                    } else if (option.equalsIgnoreCase("ATTRIBUTES")) {
                        ps.fileAttributes();
                        System.out.println();
                    } else if (option.equalsIgnoreCase("DELETE")) {
                        ps.deleteFileOrDirectory();
                        System.out.println();
                    } else if (option.equalsIgnoreCase("END")) {
                        System.out.println("Thank you for using the program");
                        return;
                    } else if (option.equalsIgnoreCase("BUFFEREDWRITE")) {
                        ps.bufferedWriterSample();
                        System.out.println();
                    } else if (option.equalsIgnoreCase("FILEWRITER")) {
                        ps.sampleFileWriter();
                        System.out.println();
                    } else {
                        System.out.println("Invalid Input");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Choose only the options above by typing it below");
                }
            } while (!exitCurrentFile);
        } while (true);
    }

    // file path
    public void filePath() {
        System.out.print("Enter file name: ");
        fileName = input.nextLine();
        inputPath = Paths.get(fileName);
        fullPath = inputPath.toAbsolutePath();
        int count = fullPath.getNameCount();
        System.out.println("Path is " + fullPath.toString());
        System.out.println("File name is " + fullPath.getFileName());
        System.out.println("There are " + count + " elements in the file path");

        System.out.print("/");
        for (int x = 0; x < count; x++) {
            System.out.print(fullPath.getName(x) + "/");
        }
        System.out.println();
    }

    // read and execute
    public void readExe() {
        try {
            fullPath.getFileSystem().provider().checkAccess(fullPath, READ, EXECUTE);
            System.out.println("The file can be read and executed");
        } catch (IOException e) {
            System.out.println("The file cannot be used");
        }
    }

    // attributes
    public void fileAttributes() {
        try {
            BasicFileAttributes fileAtt = Files.readAttributes(fullPath, BasicFileAttributes.class);
            System.out.println("Size: " + fileAtt.size() + " bytes");
            System.out.println("Creation time: " + fileAtt.creationTime());
            System.out.println("Last modified time: " + fileAtt.lastModifiedTime());
        } catch (IOException e) {
            System.out.println("IO exception");
        }
    }

    // deleting
    public void deleteFileOrDirectory() {
        boolean deleteConfirmed = false;

        do {
            try {
                System.out.println("Are you sure you want to delete the file/directory? Y/N");
                String choice = input.nextLine();

                if (choice.equalsIgnoreCase("Y")) {
                    Files.delete(fullPath);
                    System.out.println("The file or directory is deleted");
                    deleteConfirmed = true;
                } else if (choice.equalsIgnoreCase("N")) {
                    deleteConfirmed = true;
                } else {
                    System.out.println("Invalid Input");
                }
            } catch (NoSuchFileException e) {
                System.out.println("No such file/directory");
                deleteConfirmed = true;
            } catch (DirectoryNotEmptyException e) {
                System.out.println("Directory is not empty");
                deleteConfirmed = true;
            } catch (SecurityException e) {
                System.out.println("No permission to delete");
                deleteConfirmed = true;
            } catch (IOException e) {
                System.out.println("IO exception");
                deleteConfirmed = true;
            }
        } while (!deleteConfirmed);
    }

    // buffered writer sample
    public void bufferedWriterSample() {
        try {
            Path file = fullPath;
            String s = "";
            String delimiter = ", ";
            long id;
            String name;
            double grade;
            final long QUIT = 0;

            OutputStream output = new BufferedOutputStream(Files.newOutputStream(file, StandardOpenOption.CREATE));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(output));

            System.out.print("Enter student ID number: ");
            id = input.nextLong();

            while (id != QUIT) {
                System.out.print("Enter name for student no. " + id + ": ");
                input.nextLine();
                name = input.nextLine();
                System.out.print("Enter the subject grade: ");
                grade = input.nextDouble();
                DecimalFormat df = new DecimalFormat("0.00");
                s = id + delimiter + name + delimiter + df.format(grade);
                writer.write(s, 0, s.length());
                writer.newLine();
                System.out.print("Enter next ID number or " + QUIT + " to quit: ");
                id = input.nextLong();
            }

            writer.close();
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }

    // sample file writer
    public void sampleFileWriter() {
        try {
            Scanner scan = new Scanner(System.in);

            String idnum;
            String lastname;
            String fname = " ";
            String rateprday;
            String position;

            System.out.print("Enter ID Number: ");
            idnum = scan.nextLine();
            System.out.print("Enter Lastname: ");
            lastname = scan.nextLine();
            System.out.print("Enter Firstname: ");
            fname = scan.nextLine();
            System.out.print("Enter rate per day: ");
            rateprday = scan.nextLine();
            System.out.print("Enter Position: ");
            position = scan.nextLine();

            FileWriter file;
            BufferedWriter writer;
            try {
                file = new FileWriter("employee.txt", true);
                writer = new BufferedWriter(file);
                writer.write("\n");
                writer.write(idnum + ",");
                writer.write(lastname + ",");
                writer.write(fname + ",");
                writer.write(rateprday + ",");
                writer.write(position + "");
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print("Enter File Name to Open and display all content: ");
            fname = scan.nextLine();

            String line = null;
            try {
                FileReader fileReader = new FileReader(fname);
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                while ((line = bufferedReader.readLine()) != null) {
                    System.out.println(line);
                }

                bufferedReader.close();
            } catch (IOException ex) {
                System.out.println("Error reading file named '" + fname + "'");
            }
        } catch (Exception e) {
            System.out.println("Message: " + e);
        }
    }
}
