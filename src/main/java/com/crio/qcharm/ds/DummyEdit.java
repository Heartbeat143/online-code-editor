
/*
 *  DONT'T EDIT
 */
package com.crio.qcharm.ds;

public class DummyEdit implements Edits {
  int startingLineNo = 0;
  int length = 0;
  Cursor cursor = new Cursor(0,0);

  public DummyEdit() {
  }

  public int getStartingLineNo() {
    return this.startingLineNo;
  }

  public int getLength() {
    return this.length;
  }

  public Cursor getCursor() {
    return this.cursor;
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
}
