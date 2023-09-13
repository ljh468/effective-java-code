package org.effective.section02.item08.autoclosable;

import java.io.BufferedInputStream;
import java.io.IOException;

// AutoCloseable을 사용하면 try with resource를 통해 자원 반납을 자동으로 해줌
public class AutoClosableIsGood implements AutoCloseable {

  private BufferedInputStream inputStream;

  // 가급적 idempotent(멱등) 해야한다.
  @Override
  public void close() throws Exception {
    try {
      inputStream.close();
    } catch (IOException e) {
      throw new RuntimeException("failed to close" + inputStream);
    }
  }
}
