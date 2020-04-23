
/*
 *  DONT'T EDIT
 */

package com.crio.qcharm.ds;

import java.util.List;

public class UpdateLines implements Edits {
  int startingLineNo;
  int numberOfLines;
  List<String> lines;
  Cursor cursor;
  int length;

  public UpdateLines(int startingLineNo, int numberOfLines, List<String> lines, Cursor cursor) {
    this.startingLineNo = startingLineNo;
    this.numberOfLines = numberOfLines;
    this.lines = lines;
    this.cursor = cursor;
    this.length = lines.size();
  }

  @Override
  public int getStartingLineNo() {
    return this.startingLineNo;
  }

  public int getNumberOfLines() {
    return this.numberOfLines;
  }
  @Override
  public int getLength() {
    return this.length;
  }

  public List<String> getLines() {
    return this.lines;
  }

  @Override
  public Cursor getCursor() {
    return this.cursor;
  }

  public void setStartingLineNo(int startingLineNo) {
    this.startingLineNo = startingLineNo;
  }

  public void setNumberOfLines(int numberOfLines) {
    this.numberOfLines = numberOfLines;
  }

  public void setLines(List<String> lines) {
    this.lines = lines;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

}
