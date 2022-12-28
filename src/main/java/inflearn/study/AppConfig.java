package inflearn.study;

import inflearn.study.discount.FixDiscountPolicy;
import inflearn.study.member.MemberService;
import inflearn.study.member.MemberServiceImpl;
import inflearn.study.member.MemoryMemberRepository;
import inflearn.study.order.OrderService;
import inflearn.study.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
