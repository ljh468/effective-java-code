package org.effective.section03.item15.class_and_interfaces.item;

import org.effective.section03.item15.class_and_interfaces.member.MemberService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemServiceTest {

  MemberService memberService;

  @Test
  void itemService() {
    // Test를 위해서 public을 필드를 생성하면 안됨 (package private Mock을 활용해야 함)
    // ItemService service = new ItemService(memberService); // DefaultMemberService를 가져올 수 없음

    // assertNotNull(service);
    // assertNotNull(service.getMemberService());
  }

}