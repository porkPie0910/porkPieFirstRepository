/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2023-07-14 07:50:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class writeblog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/home/shiyanlou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar", Long.valueOf(1689320812000L));
    _jspx_dependants.put("jar:file:/home/shiyanlou/.m2/repository/javax/servlet/jstl/1.2/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153385082000L));
  }

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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("    <title>Write Blog</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"EditorMd/examples/css/style.css\"/>\n");
      out.write("    <link rel=\"stylesheet\" href=\"EditorMd/css/editormd.css\"/>\n");
      out.write("    <link href=\"css/index.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/about.css\" rel=\"stylesheet\"/>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<header>\n");
      out.write("    <div id=\"logo\"><a href=\"/\"></a></div>\n");
      out.write("    <nav class=\"topnav\" id=\"topnav\">\n");
      out.write("        <a href=\"selectAllBlog\"><span>Home</span><span class=\"en\">主页</span></a>\n");
      out.write("        <a href=\"adminblog\"><span>Admin Blog</span><span class=\"en\">管理博客</span></a>\n");
      out.write("        <a href=\"admindiary\"><span>Admin Diary</span><span class=\"en\">管理日记</span></a>\n");
      out.write("        <a href=\"writeblog.jsp\"><span>Write Blog</span><span class=\"en\">写博客</span></a>\n");
      out.write("        <a href=\"writediary.jsp\"><span>Write Diary</span><span class=\"en\">写日记</span></a>\n");
      out.write("    </nav>\n");
      out.write("</header>\n");
      out.write("<div class=\"box\">\n");
      out.write("    <form action=\"writeBlog\" method=\"post\">\n");
      out.write("        <div class=\"admin\">\n");
      out.write("            <h1 class=\"t_nav\"><span>分享使人感到愉悦。</span></h1><br/>\n");
      out.write("            <div id=\"layout\">\n");
      out.write("                <header>\n");
      out.write("                    <h1>写博客</h1>\n");
      out.write("                </header>\n");
      out.write("                <div class=\"blogtitle\">\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    标题 ：<input type=\"text\" name=\"blogtitle\" style=\"width: 400px;height:25px;\"/>\n");
      out.write("                </div>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <input type=\"submit\" value=\"uplode\" style=\"background-color:#0055AA;color: white;font-size: 15px;\n");
      out.write("                height:30px;width:80px;display:inline-block;float: left;margin-left: 55px;\"/>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <br/>\n");
      out.write("                <div id=\"test-editormd\">\n");
      out.write("                <textarea style=\"display:none;\" name=\"article\"></textarea>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <script src=\"EditorMd/examples/js/jquery.min.js\"></script>\n");
      out.write("            <script src=\"EditorMd/editormd.min.js\"></script>\n");
      out.write("            <script type=\"text/javascript\">\n");
      out.write("                var testEditor;\n");
      out.write("\n");
      out.write("                $(function () {\n");
      out.write("                    testEditor = editormd(\"test-editormd\", {\n");
      out.write("                        width: \"90%\",\n");
      out.write("                        height: 800,\n");
      out.write("                        syncScrolling: \"single\",\n");
      out.write("                        path: \"EditorMd/lib/\"\n");
      out.write("                    });\n");
      out.write("\n");
      out.write("                    /*\n");
      out.write("                    // or\n");
      out.write("                    testEditor = editormd({\n");
      out.write("                        id      : \"test-editormd\",\n");
      out.write("                        width   : \"90%\",\n");
      out.write("                        height  : 640,\n");
      out.write("                        path    : \"../lib/\"\n");
      out.write("                    });\n");
      out.write("                    */\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
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
