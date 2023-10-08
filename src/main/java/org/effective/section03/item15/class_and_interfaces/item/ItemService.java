package org.effective.section03.item15.class_and_interfaces.item;

import org.effective.section03.item15.class_and_interfaces.member.MemberService;

public class ItemService {

    // 상수는 외부에 공개 가능
    public static final String NAME = "name";

    /**
     * 내부 정보
     */
    private MemberService memberService; // public 클래스의 인스턴스 필드는 public 이 아니어야 함.
    boolean onSale;

    /**
     * 공개 정보
     */
    protected int saleRate;

    // 외부에서 사용하기 위한 (public) 생성자
    public ItemService(MemberService memberService) {
        if (memberService == null) {
            throw new IllegalArgumentException("MemberService should not be null.");
        }

        this.memberService = memberService;
    }

    // 배열은 임의대로 바꿀 수 있음 (배열은 외부에 제공 X)
    // public static final String[] NAMES = new String[10];

    MemberService getMemberService() {
        return memberService;
    }
}
