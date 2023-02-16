// import java.io.File;
// import java.io.FileWriter;
// import java.io.FileReader;
// import java.io.BufferedReader;
// import java.io.IOException;

// class Solution {
//     public static void main(String[] args) {
//         // Read input from the console and write it to a file
//         try {
//             BufferedReader reader = new BufferedReader(new java.io.InputStreamReader(System.in));
//             FileWriter writer = new FileWriter("output.txt");
//             String line = null;
//             while ((line = reader.readLine()) != null) {
//                 writer.write(line);
//                 writer.write("\n");
//             }
//             writer.close();
//             System.out.println("Successfully wrote to file.");
//         } catch (IOException e) {
//             System.out.println("An error occurred while writing to file.");
//             e.printStackTrace();
//         }

//         // Read the file contents and count the number of words and sentences
//         try {
//             File file = new File("output.txt");
//             FileReader reader = new FileReader(file);
//             BufferedReader bufferedReader = new BufferedReader(reader);
//             String line = null;
//             int wordCount = 0;
//             int sentenceCount = 0;
//             while ((line = bufferedReader.readLine()) != null) {
//                 // Count the number of words in the line
//                 String[] words = line.split("\s+");
//                 wordCount += words.length;

//                 // Count the number of sentences in the line
//                 String[] sentences = line.split("[.!?]+");
//                 sentenceCount += sentences.length;
//             }
//             reader.close();

//             System.out.println(wordCount+" "+ sentenceCount);
//         } catch (IOException e) {
//             System.out.println("An error occurred while reading from file.");
//             e.printStackTrace();
//         }
//     }
// }




// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;

// class BufferedReaderExample {
//     public static void main(String[] args) {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int intValue = 0;
//         double doubleValue = 0.0;
//         boolean booleanValue = false;
//         char charValue = '\0';
//         String stringValue = "";

//         try {
//             System.out.println("Please enter an integer:");
//             intValue = Integer.parseInt(br.readLine());

//             System.out.println("Please enter a double:");
//             doubleValue = Double.parseDouble(br.readLine());

//             System.out.println("Please enter a boolean (true or false):");
//             booleanValue = Boolean.parseBoolean(br.readLine());

//             System.out.println("Please enter a single character:");
//             charValue = br.readLine().charAt(0);

//             System.out.println("Please enter a string:");
//             stringValue = br.readLine();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }

//         System.out.println("Integer value: " + intValue);
//         System.out.println("Double value: " + doubleValue);
//         System.out.println("Boolean value: " + booleanValue);
//         System.out.println("Character value: " + charValue);
//         System.out.println("String value: " + stringValue);
//     }
// }