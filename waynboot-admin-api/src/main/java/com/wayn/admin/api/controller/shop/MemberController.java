package com.wayn.admin.api.controller.shop;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wayn.admin.api.domain.shop.Goods;
import com.wayn.admin.api.domain.shop.Member;
import com.wayn.admin.api.service.shop.IMemberService;
import com.wayn.common.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import com.wayn.common.base.BaseController;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wayn
 * @since 2020-07-21
 */
@RestController
@RequestMapping("shop/member")
public class MemberController extends BaseController {

    @Autowired
    private IMemberService iMemberService;

    @GetMapping("list")
    public R list(Member member) {
        Page<Member> page = getPage();
        return R.success().add("page", iMemberService.listPage(page, member));
    }

    @GetMapping("{memberId}")
    public R getMember(@PathVariable Long memberId) {
        return R.success().add("data", iMemberService.getById(memberId));
    }
}
