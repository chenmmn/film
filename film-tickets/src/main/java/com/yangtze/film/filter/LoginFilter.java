package com.yangtze.film.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

/**
 * 简易登录过滤器
 * @author leepon
 *
 */
public class LoginFilter extends OncePerRequestFilter {

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		//无需验证session的情况
		String[] notFilters = {"/user/register","/user/login","/index"};
		String uri = request.getRequestURI();
		boolean isLogin = false;
		for(String nf : notFilters){
			if(uri.indexOf(nf)==-1)
				isLogin = true;
			break;
		}
		//如果无需验证session则继续
		if(isLogin)
			chain.doFilter(request, response);
		else {
			//获取session中的登录实体
			Object userInfo = request.getSession().getAttribute("userInfo");
			if(userInfo == null){
				//为空则跳转至主界面
				response.sendRedirect("../index");
			} else {
				//否则继续
				chain.doFilter(request, response);
			}
		}
	}

}
