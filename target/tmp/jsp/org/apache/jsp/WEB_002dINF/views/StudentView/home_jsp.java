/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2019-07-22 04:25:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.StudentView;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/StudentView/../../css/nav.css", Long.valueOf(1563769207000L));
    _jspx_dependants.put("/WEB-INF/views/StudentView/../../js/nav.js", Long.valueOf(1563513548000L));
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <title>Tutorial library</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("          integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        ");
      out.write("body {\n");
      out.write("    padding: 0;\n");
      out.write("    margin: 0;\n");
      out.write("    background: #f2f6e9;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/*--- navigation bar ---*/\n");
      out.write(".navbar {\n");
      out.write("    background:#222;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-link,\n");
      out.write(".navbar-brand {\n");
      out.write("    color: #fff;\n");
      out.write("    cursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-link {\n");
      out.write("    margin-right: 1em !important;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".nav-link:hover {\n");
      out.write("    color: #cccccc;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".navbar-collapse {\n");
      out.write("    justify-content: flex-end;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".header {\n");
      out.write("    background-image: url('../../resources/background.jpg');\n");
      out.write("    background-size: cover;\n");
      out.write("    background-position: center;\n");
      out.write("    position: relative;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".overlay {\n");
      out.write("    position: absolute;\n");
      out.write("    min-height: 100%;\n");
      out.write("    min-width: 100%;\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    background: rgba(0, 0, 0, 0.6);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description {\n");
      out.write("    left: 50%;\n");
      out.write("    position: absolute;\n");
      out.write("    top: 45%;\n");
      out.write("    transform: translate(-50%, -55%);\n");
      out.write("    text-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description h1 {\n");
      out.write("    color: #6ab446;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description p {\n");
      out.write("    color: #fff;\n");
      out.write("    font-size: 1.3rem;\n");
      out.write("    line-height: 1.5;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description button {\n");
      out.write("    border: 1px solid #6ab446;\n");
      out.write("    background: #6ab446;\n");
      out.write("    border-radius: 0;\n");
      out.write("    color: #fff;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".description button:hover {\n");
      out.write("    border: 1px solid #fff;\n");
      out.write("    background: #fff;\n");
      out.write("    color: #000;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card1 {\n");
      out.write("    position: relative;\n");
      out.write("    display: -ms-flexbox;\n");
      out.write("    display: flex;\n");
      out.write("    -ms-flex-direction: column;\n");
      out.write("    flex-direction: column;\n");
      out.write("    min-width: 0;\n");
      out.write("    word-wrap: break-word;\n");
      out.write("    background-image: url(\"http://www.toca-ch.com/data/walls/123/25665498.jpg\");\n");
      out.write("    background-color: #39426294;\n");
      out.write("    color: #dddddd;\n");
      out.write("    background-clip: border-box;\n");
      out.write("    border-radius: .25rem;\n");
      out.write("    width: 250px;\n");
      out.write("    height: 455px;\n");
      out.write("    margin-bottom: 10px;\n");
      out.write("    margin-top: 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("hr {\n");
      out.write("    background-color: darkgray;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bodyfont {\n");
      out.write("    font-style: italic;\n");
      out.write("    color: white;\n");
      out.write("    font-size: 40px;\n");
      out.write("    font-family: Consolas;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".datefont {\n");
      out.write("    font-style: oblique;\n");
      out.write("    color: white;\n");
      out.write("}\n");
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
      out.write(".page-footer {\n");
      out.write("    background-color: #222;\n");
      out.write("    color: #ccc;\n");
      out.write("    padding: 60px 0 30px;\n");
      out.write("}\n");
      out.write(".footer-copyright {\n");
      out.write("    color: #666;\n");
      out.write("    padding: 40px 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bodybackground{\n");
      out.write("    background-image: url('../../resources/background.jpg');\n");
      out.write("    background-size:cover;\n");
      out.write("    background-position: center;\n");
      out.write("    position: relative;\n");
      out.write("}\n");
      out.write(".myoverlay{\n");
      out.write("    position:relative;\n");
      out.write("    min-height: 100%;\n");
      out.write("    min-width: 100%;\n");
      out.write("    left: 0;\n");
      out.write("    top: 0;\n");
      out.write("    background: rgba(0, 0, 0, 0.6);\n");
      out.write("\n");
      out.write("}\n");
      out.write("@media (max-width: 575.98px) {\n");
      out.write("    .description {\n");
      out.write("        left: 0;\n");
      out.write("        padding: 0 15px;\n");
      out.write("        position: absolute;\n");
      out.write("        top: 10%;\n");
      out.write("        transform: none;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .description h1 {\n");
      out.write("        font-size: 2em;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .description p {\n");
      out.write("        font-size: 1.2rem;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .features {\n");
      out.write("        margin: 0;\n");
      out.write("    }\n");
      out.write("}");
      out.write("\n");
      out.write("    </style>\n");
      out.write("    <script type=\"text/javascript\">\n");
      out.write("        ");
      out.write("    $(document).ready(function(){\n");
      out.write("      $('.header').height($(window).height());\n");
      out.write("    })\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-md\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student/home\">HOME</a>\n");
      out.write("    <button class=\"navbar-toggler navbar-dark\" type=\"button\" data-toggle=\"collapse\" data-target=\"#main-navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"main-navigation\">\n");
      out.write("        <ul class=\"navbar-nav\">\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student/\">TUTORIAL</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/student/about-us\">ABOUT</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/\">LOGOUT</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<header class=\"page-header header container-fluid\">\n");
      out.write("    <div class=\"overlay\"></div>\n");
      out.write("    <div class=\"description\">\n");
      out.write("        <h1>Welcome to the Tutorial Library!</h1>\n");
      out.write("        <p><b>\"Education is the most powerful weapon which you can use to change the world\" </b></p><p>-Nelson Mandela-\n");
      out.write("        </p>\n");
      out.write("        <button class=\"btn btn-outline-secondary btn-lg\" onclick=\"godown()\">Contact Us</button>\n");
      out.write("    </div>\n");
      out.write("</header>\n");
      out.write("<footer class=\"page-footer\" id=\"contact\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-lg-8 col-md-8 col-sm-12\">\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Additional Information</h6>\n");
      out.write("                <p>hSenid Mobile Solutions is a company with a proud history of 20 years of innovations, proven\n");
      out.write("                    expertise while still having a heart of a startup. We design and build innovative\n");
      out.write("                    cutting-edge technology platforms which enables the digital transformation of the businesses..</p>\n");
      out.write("                <p>Our advanced solutions and guaranteed service qualities has enabled us to gain healthy base of loyal customers.\n");
      out.write("                    We strive to help our customers by opening up uncontested market spaces and thereby achieve rapid growth.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-lg-4 col-md-4 col-sm-12\">\n");
      out.write("                <h6 class=\"text-uppercase font-weight-bold\">Contact</h6>\n");
      out.write("                <p>hSenid Mobile Solutions\n");
      out.write("                    No 320, 3rd Floor,\n");
      out.write("                    T.B.Jayah Mawatha,\n");
      out.write("                    Colombo 10.\n");
      out.write("                    <br/>info@mywebsite.com\n");
      out.write("                    <br/>+ 94 712959395\n");
      out.write("                    <br/>+ 01 234 567 89</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer-copyright text-center\">Â© 2019 Copyright: tutoriallibrary.com</div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("        integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("        crossorigin=\"anonymous\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(document).ready(function () {\n");
      out.write("        $('.header').height($(window).height());\n");
      out.write("    })\n");
      out.write("\n");
      out.write("\n");
      out.write("    function godown() {\n");
      out.write("        window.location.assign(\"#contact\");\n");
      out.write("\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
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
