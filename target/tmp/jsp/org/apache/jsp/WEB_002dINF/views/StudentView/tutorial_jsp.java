/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2019-07-17 03:51:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.StudentView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tutorial_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

private static org.apache.jasper.runtime.ProtectedFunctionMapper _jspx_fnmap_0;

static {
  _jspx_fnmap_0= org.apache.jasper.runtime.ProtectedFunctionMapper.getMapForFunction("fn:toUpperCase", org.apache.taglibs.standard.functions.Functions.class, "toUpperCase", new Class[] {java.lang.String.class});
}

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/views/StudentView/../../css/listView.css", Long.valueOf(1563335452000L));
    _jspx_dependants.put("jar:file:/home/tharusha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("jar:file:/home/tharusha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/fn.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("file:/home/tharusha/.m2/repository/org/springframework/spring-webmvc/5.1.0.RELEASE/spring-webmvc-5.1.0.RELEASE.jar", Long.valueOf(1562906838000L));
    _jspx_dependants.put("/WEB-INF/views/StudentView/../../css/mainStyle.css", Long.valueOf(1563334587000L));
    _jspx_dependants.put("jar:file:/home/tharusha/.m2/repository/org/springframework/spring-webmvc/5.1.0.RELEASE/spring-webmvc-5.1.0.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1537493032000L));
    _jspx_dependants.put("file:/home/tharusha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1562911120000L));
    _jspx_dependants.put("jar:file:/home/tharusha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"../../../resources/rating.css\" type=\"text/css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"http://netdna.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        <!--\n");
      out.write("        ");
      out.write(".grid-container {\n");
      out.write("    display: grid;\n");
      out.write("    grid-template-columns: 240px 1fr;\n");
      out.write("    grid-template-rows: 50px 1fr 50px;\n");
      out.write("    grid-template-areas:\n");
      out.write("            \"sidenav header\"\n");
      out.write("            \"sidenav main\"\n");
      out.write("            \"sidenav footer\";\n");
      out.write("    height: 100vh;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* Give every child element its grid name */\n");
      out.write(".header {\n");
      out.write("    grid-area: header;\n");
      out.write("    background-color: #648ca6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("    grid-area: sidenav;\n");
      out.write("    background-color: #394263;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".main {\n");
      out.write("    grid-area: main;\n");
      out.write("    background-color: #8fd4d9;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".footer {\n");
      out.write("    grid-area: footer;\n");
      out.write("    background-color: #648ca6;\n");
      out.write("}\n");
      out.write(".header, .footer {\n");
      out.write("    display: flex;\n");
      out.write("    align-items: center;\n");
      out.write("    justify-content: space-between;\n");
      out.write("    padding: 0 16px;\n");
      out.write("    background-color: #648ca6;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".sidenav {\n");
      out.write("    display: flex; /* Will be hidden on mobile */\n");
      out.write("    flex-direction: column;\n");
      out.write("    grid-area: sidenav;\n");
      out.write("    background-color: #394263;\n");
      out.write("}\n");
      out.write(".sidenav__list {\n");
      out.write("    padding: 0;\n");
      out.write("    margin-top: 85px;\n");
      out.write("    list-style-type: none;\n");
      out.write("}\n");
      out.write(".sidenav__list-item {\n");
      out.write("    padding: 20px 20px 20px 40px;\n");
      out.write("    color: #ddd;\n");
      out.write("}\n");
      out.write(".sidenav__list-item:hover {\n");
      out.write("    background-color: rgba(255, 255, 255, 0.2);\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:link, a:visited {\n");
      out.write("    background-color: #394262;\n");
      out.write("    color: white;\n");
      out.write("    padding: 14px 25px;\n");
      out.write("    text-align: center;\n");
      out.write("    text-decoration: none;\n");
      out.write("    display: inline-block;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a:hover, a:active {\n");
      out.write("    background-color: #394262;\n");
      out.write("    border-color: black;\n");
      out.write("}");
      out.write("\n");
      out.write("        ");
      out.write(".glyphicon { margin-right:5px; }\n");
      out.write(".thumbnail\n");
      out.write("{\n");
      out.write("    margin-bottom: 20px;\n");
      out.write("    padding: 0px;\n");
      out.write("    -webkit-border-radius: 0px;\n");
      out.write("    -moz-border-radius: 0px;\n");
      out.write("    border-radius: 0px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item.list-group-item\n");
      out.write("{\n");
      out.write("    float: none;\n");
      out.write("    width: 100%;\n");
      out.write("    background-color: #fff;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("}\n");
      out.write(".item.list-group-item:nth-of-type(odd):hover,.item.list-group-item:hover\n");
      out.write("{\n");
      out.write("    background: #428bca;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item.list-group-item .list-group-image\n");
      out.write("{\n");
      out.write("    margin-right: 10px;\n");
      out.write("}\n");
      out.write(".item.list-group-item .thumbnail\n");
      out.write("{\n");
      out.write("    margin-bottom: 0px;\n");
      out.write("}\n");
      out.write(".item.list-group-item .caption\n");
      out.write("{\n");
      out.write("    padding: 9px 9px 0px 9px;\n");
      out.write("}\n");
      out.write(".item.list-group-item:nth-of-type(odd)\n");
      out.write("{\n");
      out.write("    background: #eeeeee;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item.list-group-item:before, .item.list-group-item:after\n");
      out.write("{\n");
      out.write("    display: table;\n");
      out.write("    content: \" \";\n");
      out.write("}\n");
      out.write("\n");
      out.write(".item.list-group-item img\n");
      out.write("{\n");
      out.write("    float: left;\n");
      out.write("}\n");
      out.write(".item.list-group-item:after\n");
      out.write("{\n");
      out.write("    clear: both;\n");
      out.write("}\n");
      out.write(".list-group-item-text\n");
      out.write("{\n");
      out.write("    margin: 0 0 11px;\n");
      out.write("}\n");
      out.write(".\n");
      out.write("hr {\n");
      out.write("    color: grey;\n");
      out.write("    background-color: grey;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".colormatch{\n");
      out.write("    color: white;\n");
      out.write("    letter-spacing: 3px;\n");
      out.write("    font-style: oblique;\n");
      out.write("}");
      out.write("\n");
      out.write("        -->\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"bg-dark\">\n");
      out.write("\n");
      out.write("<h1 align=\"center\" class=\"colormatch\">The Online Library</h1>\n");
      out.write("<h5 align=\"center\" class=\"colormatch\">");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</h5>\n");
      out.write("\n");
      out.write("<!--Simple dashboard grid layout-->\n");
      out.write("<div class=\"grid-container\">\n");
      out.write("    <header class=\"header\"></header>\n");
      out.write("    <aside class=\"sidenav\">\n");
      out.write("        <ul class=\"sidenav__list\">\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/add\">Add Tutorial</a></li>\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/list\">View Tutorials</a></li>\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"http://reactjs.org\">About Us</a></li>\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"http://reactjs.org\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </aside>\n");
      out.write("    <main class=\"main bg-dark\">\n");
      out.write("        <!--\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div style=\"margin:auto;width: 50%;margin-top:20%\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\"><p>Tutorial Name:</p> </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\"><p>Tutor Name:</p> </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getTutname()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\"><p>About:</p> </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getDescription()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\"><p>Link:</p> </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <p>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p>");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                    <a id=\"update\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${editUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"btn btn-warning\">Update</a>\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"bg-dark\">\n");
      out.write("                <hr>\n");
      out.write("                ");
      if (_jspx_meth_c_005fset_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                ");
      if (_jspx_meth_c_005fset_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                <p class=\"colormatch\"><b>ALL TUTORIALS / VIEW / ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nametoupper}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</b></p>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-4\">\n");
      out.write("                        <img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getImageUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                             alt=\"No image\" width=\"350px\" height=\"400\">\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-8\">\n");
      out.write("                        <h1 style=\"color: white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${nametoupper}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\n");
      out.write("                        <p style=\"color:skyblue;font-size: 20px; font-family: Baskerville, 'Palatino Linotype', Palatino, 'Century Schoolbook L', 'Times New Roman', 'serif'\">\n");
      out.write("                            Online</p>\n");
      out.write("                        <p style=\"color: grey\">ITEM:C-FG4121</p>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <p style=\"color: white\">DESCRIPTION</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <p style=\"color: white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getDescription()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <p style=\"color: white\">TUTORIAL LINK</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><p style=\"color: white\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tute.getUrl()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <hr>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-4\">\n");
      out.write("                                <p style=\"color: white\">RATE TUTORIAL</p>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-8\">\n");
      out.write("                                <div class=\"stars\" id=\"stars\">\n");
      out.write("                                    <form action=\"\">\n");
      out.write("                                        <input class=\"star star-5\" id=\"star-5\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                        <label class=\"star star-5\" for=\"star-5\" onClick=\"rating()\"></label>\n");
      out.write("                                        <input class=\"star star-4\" id=\"star-4\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                        <label class=\"star star-4\" for=\"star-4\"></label>\n");
      out.write("                                        <input class=\"star star-3\" id=\"star-3\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                        <label class=\"star star-3\" for=\"star-3\"></label>\n");
      out.write("                                        <input class=\"star star-2\" id=\"star-2\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                        <label class=\"star star-2\" for=\"star-2\"></label>\n");
      out.write("                                        <input class=\"star star-1\" id=\"star-1\" type=\"radio\" name=\"star\"/>\n");
      out.write("                                        <label class=\"star star-1\" for=\"star-1\"></label>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- Optional JavaScript -->\n");
      out.write("                <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("                        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                        crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"\n");
      out.write("                        integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\"\n");
      out.write("                        crossorigin=\"anonymous\"></script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"\n");
      out.write("                        integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\"\n");
      out.write("                        crossorigin=\"anonymous\"></script>\n");
      out.write("    </main>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"footer__copyright\">&copy; 2019</div>\n");
      out.write("        <div class=\"footer__signature\">THARUSHA WIJAYABAHU/Muaaz Ahamed</div>\n");
      out.write("    </footer>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    /*\n");
      out.write("        function confirmAdd(id){\n");
      out.write("            alert(\"Tutorial successfully Added!\");\n");
      out.write("        }*/\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    boolean _jspx_th_fmt_005fformatDate_005f0_reused = false;
    try {
      _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
      _jspx_th_fmt_005fformatDate_005f0.setParent(null);
      // /WEB-INF/views/StudentView/tutorial.jsp(32,38) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${today}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/StudentView/tutorial.jsp(32,38) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setPattern("yyy-MM-dd");
      int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
      if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      _jspx_th_fmt_005fformatDate_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_fmt_005fformatDate_005f0, _jsp_getInstanceManager(), _jspx_th_fmt_005fformatDate_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /WEB-INF/views/StudentView/tutorial.jsp(77,19) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("editUrl");
      // /WEB-INF/views/StudentView/tutorial.jsp(77,19) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("/edit?id=${tute.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f0_reused = false;
    try {
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /WEB-INF/views/StudentView/tutorial.jsp(131,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("namelower");
      // /WEB-INF/views/StudentView/tutorial.jsp(131,16) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/StudentView/tutorial.jsp(131,16) '${tute.getName()}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${tute.getName()}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      _jspx_th_c_005fset_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fset_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f1 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    boolean _jspx_th_c_005fset_005f1_reused = false;
    try {
      _jspx_th_c_005fset_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f1.setParent(null);
      // /WEB-INF/views/StudentView/tutorial.jsp(132,16) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setVar("nametoupper");
      // /WEB-INF/views/StudentView/tutorial.jsp(132,16) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f1.setValue(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/StudentView/tutorial.jsp(132,16) '${fn:toUpperCase(namelower)}'",_jsp_getExpressionFactory().createValueExpression(new org.apache.jasper.el.ELContextWrapper(_jspx_page_context.getELContext(),_jspx_fnmap_0),"${fn:toUpperCase(namelower)}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int _jspx_eval_c_005fset_005f1 = _jspx_th_c_005fset_005f1.doStartTag();
      if (_jspx_th_c_005fset_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f1);
      _jspx_th_c_005fset_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fset_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fset_005f1_reused);
    }
    return false;
  }
}
