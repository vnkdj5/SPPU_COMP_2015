package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("loggedIn")!=null)
    {
        response.sendRedirect("process.jsp");
    };
    
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\t<title>Login Page</title>\n");
      out.write("        \n");
      out.write("            <script type = \"text/javascript\" >\n");
      out.write("function disableBackButton()\n");
      out.write("{\n");
      out.write("window.history.forward();\n");
      out.write("}\n");
      out.write("setTimeout(\"disableBackButton()\", 0);\n");
      out.write("</script>\n");
      out.write("            </script>\n");
      out.write("</head>\n");
      out.write("<body onload=\"disableBackButton()\">\n");
      out.write("<div width=\"50%\">\n");
      out.write("<form action=\"process.jsp\" method=\"POST\">\n");
      out.write("\t<p>\n");
      out.write("\t<label>Username:</label>\n");
      out.write("\t<input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Username\" required>\n");
      out.write("\t</p>\n");
      out.write("\t<p>\n");
      out.write("\t<label>Password:</label>\n");
      out.write("\t<input type=\"password\" name=\"password\" id=\"password\" placeholder=\"Password\" required> \n");
      out.write("\t</p>\n");
      out.write("\t<p>\n");
      out.write("\t<input type=\"submit\" name=\"submit\" id=\"submit\" value=\"Login\">\n");
      out.write("\t</p>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
