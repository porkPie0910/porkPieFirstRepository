/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2023-07-14 07:48:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class about_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("<!doctype html>\n");
      out.write("<html>\n");
      out.write("  <head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("    <title>Insert title here</title>\n");
      out.write("    <link href=\"css/index.css\" rel=\"stylesheet\" />\n");
      out.write("    <link href=\"css/about.css\" rel=\"stylesheet\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"js/alert.js\"></script>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <header>\n");
      out.write("      <div id=\"logo\"><a href=\"/\"></a></div>\n");
      out.write("      <nav class=\"topnav\" id=\"topnav\">\n");
      out.write("        <a href=\"selectAllBlog\"\n");
      out.write("          ><span>Home</span><span class=\"en\">主页</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"about.jsp\"><span>About</span><span class=\"en\">关于我</span></a>\n");
      out.write("        <a href=\"selectAllDiary\"\n");
      out.write("          ><span>Diary</span><span class=\"en\">日记心得</span></a\n");
      out.write("        >\n");
      out.write("        <a href=\"#\" onclick=\"fun1()\"\n");
      out.write("          ><span>Admin</span><span class=\"en\">管理</span></a\n");
      out.write("        >\n");
      out.write("      </nav>\n");
      out.write("    </header>\n");
      out.write("    <article class=\"aboutcon\">\n");
      out.write("      <h1 class=\"t_nav\"><span>信念和目标促使我努力前进。</span></h1>\n");
      out.write("      <br />\n");
      out.write("      <div class=\"about\">\n");
      out.write("        <h2>About me</h2>\n");
      out.write("        <br />\n");
      out.write("        <div id=\"me_text\">\n");
      out.write("          <p>一个不断学习和研究，web前端和Java的普通人。</p>\n");
      out.write("          <p>\n");
      out.write("            很多时候觉得自己对待任何事都很执着，一旦定了目标，就会不达目标不罢休，永不退缩！\n");
      out.write("            面对爱情也是一样，当真正遇到自己喜欢的一个人，会不顾一切去追。\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            在学习这条路上，最大的收获就是：自己对待人生观和价值观有了自己独特的看法。我是一个对理想有着执着追求的人，坚信是金子总会发光。大学毕业后的工作，让我在文案策划方面有了很大的提高，文笔流畅，熟悉传媒工作、广告学制作与设计等工作方面。为人热情，活泼，大方，\n");
      out.write("            本人好学上进，诚信、敬业、\n");
      out.write("            责任心强，有强烈的团体精神，对工作认真积极，严谨负责。\n");
      out.write("          </p>\n");
      out.write("          <p>\n");
      out.write("            感谢那些曾经帮助过我的人，因为有你们我才会变得如此的优秀。----By:xxx\n");
      out.write("          </p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <aside class=\"right\">\n");
      out.write("        <div class=\"about_c\">\n");
      out.write("          <br />\n");
      out.write("          <p>网名：非一般的感觉</p>\n");
      out.write("          <p>姓名：<a href=\"wwww.duanliang920.com\" target=\"_blank\">xxx</a></p>\n");
      out.write("          <p>星座：xxx座</p>\n");
      out.write("          <p>现居：xx省-xx市</p>\n");
      out.write("          <p>博客：<a href=\"xx\" target=\"_blank\">xx.blog</a></p>\n");
      out.write("          <p>喜欢的书：《我的互联网方法论》..</p>\n");
      out.write("          <p>喜欢的音乐：《一生中最爱》..</p>\n");
      out.write("        </div>\n");
      out.write("      </aside>\n");
      out.write("    </article>\n");
      out.write("    <footer>\n");
      out.write("      <p>\n");
      out.write("        <span\n");
      out.write("          >Design By:<a href=\"www.duanliang920.com\" target=\"_blank\"\n");
      out.write("            >xxx</a\n");
      out.write("          ></span\n");
      out.write("        ><span>网站地图</span><span><a href=\"/\">网站统计</a></span>\n");
      out.write("      </p>\n");
      out.write("    </footer>\n");
      out.write("    <script src=\"js/nav.js\"></script>\n");
      out.write("  </body>\n");
      out.write("  <script type=\"text/javascript\" src=\"js/alert.js\"></script>\n");
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
