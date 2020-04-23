
/*
 *  DONT'T EDIT
 */

package com.crio.qcharm.ds;

public class SearchReplace implements  Edits {
  int startingLineNo;
  int length;
  Cursor cursor;
  String pattern;
  String newPattern;

  public SearchReplace(int startingLineNo, int length, Cursor cursor, String pattern,
      String newPattern) {
    this.startingLineNo = startingLineNo;
    this.length = length;
    this.cursor = cursor;
    this.pattern = pattern;
    this.newPattern = newPattern;
  }

  @Override
  public int getStartingLineNo() {
    return this.startingLineNo;
  }

  @Override
  public int getLength() {
    return this.length;
  }

  @Override
  public Cursor getCursor() {
    return this.cursor;
  }

  public String getPattern() {
    return this.pattern;
  }

  public String getNewPattern() {
    return this.newPattern;
  }

  public void setStartingLineNo(int startingLineNo) {
    this.startingLineNo = startingLineNo;
  }

  public void setLength(int length) {
    this.length = length;
  }

  public void setCursor(Cursor cursor) {
    this.cursor = cursor;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
  }

  protected boolean canEqual(final Object other) {
    return other instanceof SearchReplace;
  }
}
