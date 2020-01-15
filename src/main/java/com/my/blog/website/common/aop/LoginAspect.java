package com.my.blog.website.common.aop;

import com.my.blog.website.constant.WebConst;
import com.my.blog.website.modal.Vo.UserVo;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Component
@Aspect
public class LoginAspect {

    @Pointcut("@annotation(com.my.blog.website.common.aop.LoginAop)")
    public void loginAspect() {
    }

    @Before("loginAspect() && @annotation(data)")
    public void doBefore(JoinPoint point, LoginAop data) throws Throwable {
        // 获取request以及session
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        // 获得当前用户
        UserVo user = (UserVo) session.getAttribute(WebConst.LOGIN_SESSION_KEY);
        if (user == null) {
//            throw new BusinessException(9, "登陆超时，请重新登陆");
            System.out.println("登录超时");
        }

    }


}
