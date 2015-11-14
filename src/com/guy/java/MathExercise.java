package com.guy.java;

import java.io.IOException;

import javax.servlet.http.*;


import com.guy.java.*;
@SuppressWarnings({ "serial", "unused" })
public class MathExercise extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/html");
		// define and activate your new class that
		// manages math calculations:
		MathManager mathManager = new MathManager();
		String resultStr = mathManager.getResults();
		//add this string inside the response print line:
		resp.getWriter().println(resultStr);
	}
}
