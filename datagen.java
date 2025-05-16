import java.util.*;
import java.util.zip.*;
import java.io.*;

public class Main {
    static String root = "/myfiles";
    
  static String[] woodtypes = {"acacia","birch","cherry","dark_oak","jungle","mangrove","oak","pale_oak","spruce"};

  static String[] intypes = {"#%s_logs","%s_boat","%s_button","%s_door","%s_fence","%s_fence_gate","%s_planks","%s_pressure_plate","%s_sign","%s_slab","%s_stairs","%s_trapdoor"};
  static int[]   incounts = {512, 256, 8, 128, 64, 32, 64, 32, 16, 32, 48, 64};
  
  static String[] outtypes = {"boat","button","door","fence","fence_gate","planks","pressure_plate","sign","slab","stairs","trapdoor","stick"};
  static int[]   outcounts = {256, 8, 128, 64, 32, 64, 32, 16, 32, 48, 64, 16};

  static String[] bamboointypes = {"#%s_blocks","%s_raft","%s_button","%s_door","%s_fence","%s_fence_gate","%s_planks","%s_pressure_plate","%s_sign","%s_slab","%s_stairs","%s_trapdoor","%s_mosaic","%s_mosaic_slab","%s_mosaic_stairs"};
  static int[]   bambooincounts = {256, 256, 8, 128, 64, 32, 64, 32, 16, 32, 48, 64, 64, 32, 48};
  
  static String[] bambooouttypes = {"raft","button","door","fence","fence_gate","planks","pressure_plate","sign","slab","stairs","trapdoor","stick","mosaic","mosaic_slab","mosaic_stairs"};
  static int[]   bamboooutcounts = {256, 8, 128, 64, 32, 64, 32, 16, 32, 48, 64, 16, 64, 32, 48};

  static String[] netherintypes = {"#%s_stems","%s_button","%s_door","%s_fence","%s_fence_gate","%s_planks","%s_pressure_plate","%s_sign","%s_slab","%s_stairs","%s_trapdoor"};
  static int[]   netherincounts = {512, 8, 128, 64, 32, 64, 32, 16, 32, 48, 64};
  
  static String[] netherouttypes = {"button","door","fence","fence_gate","planks","pressure_plate","sign","slab","stairs","trapdoor","stick"};
  static int[]   netheroutcounts = {8, 128, 64, 32, 64, 32, 16, 32, 48, 64, 16};
  
  public static void main(String[] args) {
      File newDirectory = new File(root, "wc");
newDirectory.mkdir();
    for (int i = 0; i < woodtypes.length; i++) {
    File dir = new File(root + "/wc", woodtypes[i]);
    dir.mkdir();
    for (int j = 0; j < intypes.length; j++) {
    for (int k = 0; k < outtypes.length; k++) {
        if (intypes[j] == outtypes[k]) continue;
      int count = incounts[j]/outcounts[k];
      if (count == 0) continue;
      try {
          String intype = new String(intypes[j]);
          intype = intype.substring(intype.charAt(0) == '#' ? 4 : 3);
          String fname = root+"/wc/"+woodtypes[i]+"/woodcut_"+intype+"_to_"+outtypes[k]+".json";
    File file = new File(fname);
      FileWriter fileW = new FileWriter(file);
        fileW.write(r(woodtypes[i],intypes[j],outtypes[k],count));
        fileW.flush();
     } catch (IOException e) {System.out.println("hehe");}
    }
    }
    }
    File dir = new File(root + "/wc", "bamboo");
    dir.mkdir();
    for (int j = 0; j < bamboointypes.length; j++) {
    for (int k = 0; k < bambooouttypes.length; k++) {
        if (bamboointypes[j] == bambooouttypes[k]) continue;
      int count = bambooincounts[j]/bamboooutcounts[k];
      if (count == 0) continue;
      try {
          String intype = new String(bamboointypes[j]);
          intype = intype.substring(intype.charAt(0) == '#' ? 4 : 3);
          String fname = root+"/wc/bamboo/woodcut_"+intype+"_to_"+bambooouttypes[k]+".json";
    File file = new File(fname);
      FileWriter fileW = new FileWriter(file);
      System.out.println(file.createNewFile());
        fileW.write(r("bamboo",bamboointypes[j],bambooouttypes[k],count));
        fileW.flush();
     } catch (IOException e) {System.out.println("hehe");}
      System.out.println("e");
    }
    }
    dir = new File(root + "/wc", "crimson");
    dir.mkdir();
    for (int j = 0; j < netherintypes.length; j++) {
    for (int k = 0; k < netherouttypes.length; k++) {
        if (netherintypes[j] == netherouttypes[k]) continue;
      int count = netherincounts[j]/netheroutcounts[k];
      if (count == 0) continue;
      try {
          String intype = new String(netherintypes[j]);
          intype = intype.substring(intype.charAt(0) == '#' ? 4 : 3);
          String fname = root+"/wc/crimson/woodcut_"+intype+"_to_"+netherouttypes[k]+".json";
    File file = new File(fname);
      FileWriter fileW = new FileWriter(file);
      System.out.println(file.createNewFile());
        fileW.write(r("crimson",netherintypes[j],netherouttypes[k],count));
        fileW.flush();
     } catch (IOException e) {System.out.println("hehe");}
      System.out.println("e");
    }
    }
    dir = new File(root + "/wc", "warped");
    dir.mkdir();
    for (int j = 0; j < netherintypes.length; j++) {
    for (int k = 0; k < netherouttypes.length; k++) {
        if (netherintypes[j] == netherouttypes[k]) continue;
      int count = netherincounts[j]/netheroutcounts[k];
      if (count == 0) continue;
      try {
          String intype = new String(netherintypes[j]);
          intype = intype.substring(intype.charAt(0) == '#' ? 4 : 3);
          String fname = root+"/wc/warped/woodcut_"+intype+"_to_"+netherouttypes[k]+".json";
    File file = new File(fname);
      FileWriter fileW = new FileWriter(file);
      System.out.println(file.createNewFile());
        fileW.write(r("warped",netherintypes[j],netherouttypes[k],count));
        fileW.flush();
     } catch (IOException e) {System.out.println("hehe");}
      System.out.println("e");
    }
    }
    for (int i = 0; i < woodtypes.length; i++) {
      try {
    String sourceFile = root+"/wc/"+woodtypes[i];
    //File file = new File("/myfiles/dp.zip");
    FileOutputStream fos = new FileOutputStream(root+"/"+woodtypes[i]+".zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);

    File fileToZip = new File(sourceFile);
    zipFile(fileToZip, fileToZip.getName(), zipOut);
    zipOut.close();
    fos.close();
     } catch (IOException e) {System.out.println("hehe");}
    }
      try {
    String sourceFile = root+"/wc/bamboo";
    //File file = new File("/myfiles/dp.zip");
    FileOutputStream fos = new FileOutputStream(root+"/bamboo.zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);

    File fileToZip = new File(sourceFile);
    zipFile(fileToZip, fileToZip.getName(), zipOut);
    zipOut.close();
    fos.close();
     } catch (IOException e) {System.out.println("hehe");}
      try {
    String sourceFile = root+"/wc/warped";
    //File file = new File("/myfiles/dp.zip");
    FileOutputStream fos = new FileOutputStream(root+"/warped.zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);

    File fileToZip = new File(sourceFile);
    zipFile(fileToZip, fileToZip.getName(), zipOut);
    zipOut.close();
    fos.close();
     } catch (IOException e) {System.out.println("hehe");}
      try {
    String sourceFile = root+"/wc/crimson";
    //File file = new File("/myfiles/dp.zip");
    FileOutputStream fos = new FileOutputStream(root+"/crimson.zip");
    ZipOutputStream zipOut = new ZipOutputStream(fos);

    File fileToZip = new File(sourceFile);
    zipFile(fileToZip, fileToZip.getName(), zipOut);
    zipOut.close();
    fos.close();
     } catch (IOException e) {System.out.println("hehe");}
  }
  
  public static String r(String type, String in, String out, int count) {
      if (out == "stick") return "{\n  \"type\": \"minecraft:stonecutting\",\n  \"ingredient\": \""+String.format(in, type)+"\",\n  \"result\": {\n    \"id\": \"minecraft:stick\",\n    \"count\":"+count+"\n  }\n}";
    return "{\n  \"type\": \"minecraft:stonecutting\",\n  \"ingredient\": \""+String.format(in, type)+"\",\n  \"result\": {\n    \"id\": \"minecraft:"+type+"_"+out+"\",\n    \"count\":"+count+"\n  }\n}";
  }
  
  public static void zipFile(File fileToZip, String fileName, ZipOutputStream zipOut) throws IOException {
    if (fileToZip.isHidden()) {
        return;
    }
    if (fileToZip.isDirectory()) {
        if (fileName.endsWith("/")) {
            zipOut.putNextEntry(new ZipEntry(fileName));
            zipOut.closeEntry();
        } else {
            zipOut.putNextEntry(new ZipEntry(fileName + "/"));
            zipOut.closeEntry();
        }
        File[] children = fileToZip.listFiles();
        for (File childFile : children) {
    FileInputStream fis = new FileInputStream(childFile);
    ZipEntry zipEntry = new ZipEntry(fileName + "/" + childFile.getName());
    zipOut.putNextEntry(zipEntry);
    byte[] bytes = new byte[1024];
    int length;
    while ((length = fis.read(bytes)) >= 0) {
        zipOut.write(bytes, 0, length);
    }
    fis.close();
        }
        return;
    }
  }
}
