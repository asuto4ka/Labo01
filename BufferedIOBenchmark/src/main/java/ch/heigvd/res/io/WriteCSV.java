
package ch.heigvd.res.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class WriteCSV {
   
   public static void WriteFile (String path, Statistic stat  ) throws IOException {
   try {
      File file  = new File (path);
      FileWriter fileWrite = new FileWriter (file,true);
      file.createNewFile();
     
       fileWrite.write(stat.getName() + "\n");
        
       fileWrite.write("Time;");
       for(String temp : stat.getListTime()){
          fileWrite.write(temp + ";");  
       }
       fileWrite.write("\n Block size;");
        
       for(String temp : stat.getListBlock()){
            fileWrite.write(temp + ";");  
       }
       fileWrite.write("\n");
      
       fileWrite.close();
   }
   catch (IOException e) {
      
   }
   
   
   
}
   
}
