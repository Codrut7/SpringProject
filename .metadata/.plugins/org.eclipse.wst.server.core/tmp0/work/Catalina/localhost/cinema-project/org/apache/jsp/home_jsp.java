/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-11-15 06:17:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("<title>CinemaZone</title>\r\n");
      out.write("<meta name=\"description\" content=\"website description\" />\r\n");
      out.write("<meta name=\"keywords\" content=\"website keywords, website keywords\" />\r\n");
      out.write("<meta http-equiv=\"content-type\"\r\n");
      out.write("\tcontent=\"text/html; charset=windows-1252\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"style/style.css\" />\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("h1 {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tfont-size: 2em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h10, h11, h12, h13, h14, h15 {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tfont-size: 1.5em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<div id=\"logo_text\">\r\n");
      out.write("\t\t\t\t\t<!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"home.jsp?");
      out.print(request.getQueryString());
      out.write("\">Cinema<span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"logo_colour\">Zone</span></a>\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<h2>A quick and easy way to find your favorite movies</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"menubar\">\r\n");
      out.write("\t\t\t\t<ul id=\"menu\">\r\n");
      out.write("\t\t\t\t\t<!-- put class=\"selected\" in the li tag for the selected page - to highlight which page you're on -->\r\n");
      out.write("\t\t\t\t\t<li class=\"selected\"><a\r\n");
      out.write("\t\t\t\t\t\thref=\"home.jsp?");
      out.print(request.getQueryString());
      out.write("\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"query/client/");
      out.print(request.getParameter("id"));
      out.write("/myMovies\">My\r\n");
      out.write("\t\t\t\t\t\t\tMovies</a></li>\r\n");
      out.write("\t\t\t\t\t<li><a\r\n");
      out.write("\t\t\t\t\t\thref=\"query/client/");
      out.print(request.getParameter("id"));
      out.write("/allMovies\">All\r\n");
      out.write("\t\t\t\t\t\t\tMovies</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"content_header\"></div>\r\n");
      out.write("\t\t<div id=\"site_content\">\r\n");
      out.write("\t\t\t<div id=\"sidebar_container\">\r\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_item\">\r\n");
      out.write("\t\t\t\t\t\t<!-- insert your sidebar items here -->\r\n");
      out.write("\t\t\t\t\t\t<h3>Latest News</h3>\r\n");
      out.write("\t\t\t\t\t\t<h5>October 28th, 2018</h5>\r\n");
      out.write("\t\t\t\t\t\t<p>So ... Other relevant news coming soon .</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_base\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_item\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Honorable mentions</h3>\r\n");
      out.write("\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"www.stackoverflow.com\">Stack Overflow </a></li>\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_base\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"sidebar\">\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_top\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_item\"></div>\r\n");
      out.write("\t\t\t\t\t<div class=\"sidebar_base\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t\t<!-- insert the page content here -->\r\n");
      out.write("\t\t\t\t<h1>Welcome to the cinemaZone !!</h1>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<h10> Hello ");
      out.print(request.getParameter("name"));
      out.write(" . Here are your\r\n");
      out.write("\t\t\t\taccount details :</h10>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<h12> Your email is ");
      out.print(request.getParameter("email"));
      out.write(" </h12>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t\t<h13> Your cellphone number is ");
      out.print(request.getParameter("cellphone"));
      out.write("</h13>\r\n");
      out.write("\t\t\t\t<p></p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
