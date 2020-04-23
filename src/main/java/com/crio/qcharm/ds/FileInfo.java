
/*
 *  DONT'T EDIT
 */
package com.crio.qcharm.ds;

import java.util.ArrayList;
import java.util.List;

public class FileInfo {
  String fileName;
  List<String> lines;

  public FileInfo(String fileName, List<String> lines) {
    this.fileName = fileName;
    this.lines = new ArrayList<>(lines);
  }

  public FileInfo() {
  }

  public String getFileName() {
    return this.fileName;
  }

  public List<String> getLines() {
    return this.lines;
  }

  public void setFileName(String fileName) {
    this.fileName = fileName;
  }

  public void setLines(List<String> lines) {
    this.lines = lines;
  }

  public String toString() {
    return "FileInfo(fileName=" + this.getFileName() + ", lines=" + this.getLines() + ")";
  }
}
