/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2019-07-19 05:01:43 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.AdminView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/home/tharusha/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/fmt.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("/WEB-INF/views/AdminView/../../css/mainStyle.css", Long.valueOf(1563362991000L));
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\"></script>\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
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
      out.write("    font-weight: bold;\n");
      out.write("    font-family: red-serif;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 12px;\n");
      out.write("    text-shadow: -1px 0 black, 0 1px black, 1px 0 black, 0 -1px #ff213f;\n");
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
      out.write("}\n");
      out.write(".bodyfont{\n");
      out.write("    font-style:italic;\n");
      out.write("    color:white;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-family:Consolas;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".datefont{\n");
      out.write("    font-style: oblique;\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("hr{\n");
      out.write("    background-color:darkgray;\n");
      out.write("}\n");
      out.write(".adminTitile{\n");
      out.write("    font-style:italic;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-family:Consolas;\n");
      out.write("\n");
      out.write("}\n");
      out.write(".adminDate{\n");
      out.write("    font-style: oblique;\n");
      out.write("}\n");
      out.write(".about{\n");
      out.write("    font-weight: bold;\n");
      out.write("    font-size: 15px;\n");
      out.write("}");
      out.write("\n");
      out.write("        -->\n");
      out.write("    </style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<h1 align=\"center\" class=\"adminTitile\">The Online Library</h1>\n");
      out.write("<h5 align=\"center\" class=\"adminDate\">");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</h5>\n");
      out.write("\n");
      out.write("<!--Simple dashboard grid layout-->\n");
      out.write("<div class=\"grid-container\">\n");
      out.write("    <header class=\"header\">\n");
      out.write("\n");
      out.write("        <div >\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" onclick=\"gotostudent()\">Student</button>\n");
      out.write("            <button type=\"button\" class=\"btn btn-secondary\" onclick=\"gotoadmin()\">Admin</button>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </header>\n");
      out.write("    <aside class=\"sidenav\">\n");
      out.write("        <ul class=\"sidenav__list\">\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/add\">Add Tutorial</a></li>\n");
      out.write("            <li class=\"sidenav__list-item\"><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/admin/list\">View Tutorials</a></li>\n");
      out.write("        </ul>\n");
      out.write("    </aside>\n");
      out.write("    <main class=\"main\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <p class=\"text-center\" style=\"color: black; border: 5px solid black; letter-spacing: 5px; padding: 10px;\">\n");
      out.write("                <b>List Of Tutorials Available</b>\n");
      out.write("            </p>\n");
      out.write("            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </main>\n");
      out.write("    <footer class=\"footer\">\n");
      out.write("        <div class=\"footer__copyright\">&copy; 2019</div>\n");
      out.write("        <div class=\"footer__signature\">THARUSHA WIJAYABAHU / MUAAZ AHAMED</div>\n");
      out.write("    </footer>\n");
      out.write("</div>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\n");
      out.write("    function confirmDelete(id) {\n");
      out.write("        if (confirm('Are you sure you want to Delete this Tutorial')) {\n");
      out.write("            console.log(id);\n");
      out.write("\n");
      out.write("            window.location.assign(\"/admin/deleteTut?id=\" + id);\n");
      out.write("            alert(\"Tutorial successfully deleted!\");\n");
      out.write("\n");
      out.write("            // Save it!\n");
      out.write("        } else {\n");
      out.write("            alert(\"Tutorial not deleted!\");\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    function confirmUpdate(id) {\n");
      out.write("\n");
      out.write("        window.location.assign(\"/admin/edit?id=\" + id);\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function viewMethod(id) {\n");
      out.write("        window.location.assign(\"/admin/tut?id=\" + id);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function gotoadmin() {\n");
      out.write("        window.location.assign(\"/admin\");\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    function gotostudent() {\n");
      out.write("        window.location.assign(\"/\");\n");
      out.write("\n");
      out.write("    }\n");
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
      // /WEB-INF/views/AdminView/viewlist.jsp(27,37) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${today}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /WEB-INF/views/AdminView/viewlist.jsp(27,37) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/AdminView/viewlist.jsp(51,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("emp");
      // /WEB-INF/views/AdminView/viewlist.jsp(51,12) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/AdminView/viewlist.jsp(51,12) '${tutelist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${tutelist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                <ul style=\"font-family: Arial; font-size: 14pt;\">\n");
            out.write("\n");
            out.write("\n");
            out.write("                    <div class=\"row\">\n");
            out.write("                        <div class=\"col-8\">\n");
            out.write("                            <li>Tutorial Name: ");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.getName()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</li>\n");
            out.write("                        </div>\n");
            out.write("                        <div class=\"col-4\">\n");
            out.write("\n");
            out.write("                            <!-- rating.js file -->\n");
            out.write("\n");
            out.write("                            <p>\n");
            out.write("                                <button id=\"view\" class=\"btn btn-success\"\n");
            out.write("                                        onclick=\"viewMethod(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">View\n");
            out.write("                                </button>\n");
            out.write("\n");
            out.write("                                <button id=\"Delete\" class=\"btn btn-success\"\n");
            out.write("                                        onclick=\"confirmDelete(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">Delete\n");
            out.write("                                </button>\n");
            out.write("                                <button id=\"update\" class=\"btn btn-success\"\n");
            out.write("                                        onclick=\"confirmUpdate(");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${emp.getId()}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write(")\">Update\n");
            out.write("                                </button>\n");
            out.write("                            </p>\n");
            out.write("                        </div>\n");
            out.write("                    </div>\n");
            out.write("\n");
            out.write("                </ul>\n");
            out.write("                <hr>\n");
            out.write("            ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
