/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-11-15 08:11:52 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class clientMovies_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".button {\r\n");
      out.write("    background-color: #000000; /* black */\r\n");
      out.write("    border: none;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 15px 32px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("}\r\n");
      out.write("h0,h1,h2, h3, h4, h5, h6, h7 {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tfont-size: 1.6em;\r\n");
      out.write("\tline-height:25px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"main\">\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<div id=\"logo\">\r\n");
      out.write("\t\t\t\t<div id=\"logo_text\">\r\n");
      out.write("\t\t\t\t\t<!-- class=\"logo_colour\", allows you to change the colour of the text -->\r\n");
      out.write("\t\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\t\t<a href=\"admin.jsp?");
      out.print(request.getQueryString());
      out.write("\">Cinema<span\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"logo_colour\">Zone</span></a>\r\n");
      out.write("\t\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\t\t<h2>A quick and easy way to find your favorite movies</h2>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
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
      out.write("\t\t\t\t");
 
				 for (int i=0; i<Integer.parseInt(request.getParameter("moviesNumber")); i++) {
              
      out.write(" \r\n");
      out.write("              <h");
      out.print(i);
      out.write("> <img src=");
      out.print(request.getParameter("image"+i));
      out.write(" alt = \"oops.Something went wrong\" width=\"350\" height=\"450\"> </h");
      out.print(i);
      out.write(">\r\n");
      out.write("              <p></p>\r\n");
      out.write("\t\t\t  <h");
      out.print(i);
      out.write(" style=\"font-size:40;\" >");
      out.print(request.getParameter("name"+i));
      out.write(" </h");
      out.print(i );
      out.write(">\r\n");
      out.write("\t\t\t  <p></p>\r\n");
      out.write("\t\t\t  <h");
      out.print(i);
      out.write('>');
      out.print(request.getParameter("description"+i));
      out.write(" </h");
      out.print(i );
      out.write(">\t\r\n");
      out.write("\t\t\t  <p></p>\t\r\n");
      out.write("\t\t\t  <p></p>\r\n");
      out.write("             ");

        }
    
      out.write("\t\t\t  \r\n");
      out.write("   \t\t\t <form action=\"query/admin/");
      out.print(request.getParameter("id"));
      out.write("/clearMovies\">\r\n");
      out.write("\t\t\t  <input type=\"submit\" class= \"button\" value=\"Clear Movies\" >\r\n");
      out.write("\t\t\t  </form>\r\n");
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
