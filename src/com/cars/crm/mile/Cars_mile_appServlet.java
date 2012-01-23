package com.cars.crm.mile;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class Cars_mile_appServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
