package com.abhi.interceptor;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekAccessInterceptor extends HandlerInterceptorAdapter {

		@Override 
		public boolean preHandle(HttpServletRequest req, HttpServletResponse res,Object obj) throws Exception {
			
			Calendar cal = Calendar.getInstance();
			
			int dayOfWeek = cal.get(cal.DAY_OF_WEEK);
			
			/**
			 * web site will not be accessed  on Sunday.
			 */
			if(dayOfWeek == 1){
				res.getWriter().write("The website is closed on sunday, try on some another day!!");
				return false;
			}			
			return true;
		}
		
		@Override 
		public void postHandle(HttpServletRequest req, HttpServletResponse res,Object obj,ModelAndView model) throws Exception {
		}
		
		@Override 
		public void afterCompletion(HttpServletRequest req, HttpServletResponse res,Object obj,Exception exe) throws Exception {
		}
		
}
