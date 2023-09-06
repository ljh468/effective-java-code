package org.effective.section02.item03.staticfactory;

// 제네릭 싱글톤 팩터리
public class MetaElvis<T> {

  private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

  private MetaElvis() {
  }

  @SuppressWarnings("unchecked")
  // 앞의 <T>는 클래스에 선언한 <T>가 아닌 static의 다른 스코프에 있는 제네릭
  public static <E> MetaElvis<E> getInstance() {
    return (MetaElvis<E>) INSTANCE;
  }

  public void say(T t) {
    System.out.println(t);
  }

  public void leaveTheBuilding() {
    System.out.println("Whoa baby, I'm outta here!");
  }

  public static void main(String[] args) {
    // 제네릭 싱글톤 팩터리를 사용하면 원하는 타입으로 바꿔서 사용할 수 있다.
    MetaElvis<String> elvis1 = MetaElvis.getInstance();
    MetaElvis<Integer> elvis2 = MetaElvis.getInstance();
    // 같은 객체이지만 타입이 다르기때문에, == 동일성 비교는 불가
    System.out.println(elvis1.equals(elvis2));
  }
}
