package org.effective.section03.item15.module;


import org.effective.name.NameService;

public class HelloService {

    public static void main(String[] args) {
        // 모듈이 아닌 곳에서 사용하면 사용할 수 있다.
        // 그래서 안쓰임
        NameService service = new NameService();
        System.out.println(service.getName());
    }
}
