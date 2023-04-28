/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.72
 * Generated at: 2023-04-16 13:57:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.sampleScoreServiceProxy;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Input_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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

      out.write("\r\n");
      out.write("<HTML>\r\n");
      out.write("<HEAD>\r\n");
      out.write("<TITLE>Inputs</TITLE>\r\n");
      out.write("</HEAD>\r\n");
      out.write("<BODY>\r\n");
      out.write("<H1>Inputs</H1>\r\n");
      out.write("\r\n");

String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

boolean valid = true;

if(methodID != -1) methodID = Integer.parseInt(method);
switch (methodID){ 
case 2:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 5:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">endpoint:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"endpoint8\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 10:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 27:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 30:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 33:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 36:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 39:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 42:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">wins:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"wins51\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">losses:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"losses53\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">ties:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"ties55\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 57:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 60:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 63:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111111:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<TABLE>\r\n");
      out.write("<TR>\r\n");
      out.write("<TD COLSPAN=\"1\" ALIGN=\"LEFT\">URLString:</TD>\r\n");
      out.write("<TD ALIGN=\"left\"><INPUT TYPE=\"TEXT\" NAME=\"url1111111111\" SIZE=20></TD>\r\n");
      out.write("</TR>\r\n");
      out.write("</TABLE>\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
case 1111111112:
valid = false;

      out.write("\r\n");
      out.write("<FORM METHOD=\"POST\" ACTION=\"Result.jsp\" TARGET=\"result\">\r\n");
      out.write("<INPUT TYPE=\"HIDDEN\" NAME=\"method\" VALUE=\"");
      out.print(org.eclipse.jst.ws.util.JspUtils.markup(method));
      out.write("\">\r\n");
      out.write("<BR>\r\n");
      out.write("<INPUT TYPE=\"SUBMIT\" VALUE=\"Invoke\">\r\n");
      out.write("<INPUT TYPE=\"RESET\" VALUE=\"Clear\">\r\n");
      out.write("</FORM>\r\n");

break;
}
if (valid) {

      out.write("\r\n");
      out.write("Select a method to test.\r\n");

}

      out.write("\r\n");
      out.write("\r\n");
      out.write("</BODY>\r\n");
      out.write("</HTML>\r\n");
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
