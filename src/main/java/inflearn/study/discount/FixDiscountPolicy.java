package inflearn.study.discount;

import inflearn.study.member.Grade;
import inflearn.study.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int disCountFixAmount = 1000; //1000원 할인

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return disCountFixAmount;
        }else {
            return 0;
        }
    }
}
