package org.effective.section02.item02.builder;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder // 대신 필수값을 지정할 수가 없음
@AllArgsConstructor(access = AccessLevel.PRIVATE) // 외부에서 모든 생성자를 사용하지 못하게 함
public class NutritionFacts2 {

  private int servingSize;
  private int servings;
  private int calories;
  private int fat;
  private int sodium;
  private int carbohydrate;

  public static void main(String[] args) {
    // NutritionFacts2 cocaCola = new Builder(240, 8)
    //     .calories(100)
    //     .sodium(35)
    //     .carbohydrate(27)
    //     .build();

    NutritionFacts2 cocaCola = new NutritionFacts2Builder().servingSize(270)
                                                           .servings(20)
                                                           .calories(100)
                                                           .sodium(35)
                                                           .carbohydrate(27)
                                                           .build();

    NutritionFacts2 build = NutritionFacts2.builder()
                                           .servingSize(270)
                                           .servings(20)
                                           .calories(100)
                                           .sodium(35)
                                           .carbohydrate(27)
                                           .build();

    System.out.println("cocaCola = " + cocaCola);
  }
}