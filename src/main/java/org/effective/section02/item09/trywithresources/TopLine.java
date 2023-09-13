package org.effective.section02.item09.trywithresources;

import org.effective.section02.item09.suppress.BadBufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TopLine {
  // 코드 9-3 try-with-resources - 자원을 회수하는 최선책! (48쪽)
  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BadBufferedReader(new InputStreamReader(org.effective.section02.item09.suppress.TopLine.class.getClassLoader().getResourceAsStream(path)))) {
      return br.readLine();
    }
  }

  public static void main(String[] args) throws IOException {
    System.out.println(firstLineOfFile("test.txt"));
  }
}