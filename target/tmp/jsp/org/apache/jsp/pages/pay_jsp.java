/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.2.11.v20150529
 * Generated at: 2016-11-16 22:27:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("jar:file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar!/META-INF/c.tld", Long.valueOf(1384357662000L));
    _jspx_dependants.put("file:/C:/Users/nik/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.1/taglibs-standard-impl-1.2.1.jar", Long.valueOf(1476002715500L));
    _jspx_dependants.put("/pages/css/pay.css", Long.valueOf(1479328356118L));
    _jspx_dependants.put("/pages/css/admin.css", Long.valueOf(1479328356098L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Payment page</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            ");
      out.write("@import url(//netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css);\r\n");
      out.write("\r\n");
      out.write("@import url(http://fonts.googleapis.com/css?family=Titillium+Web:300);\r\n");
      out.write(".fa-2x {\r\n");
      out.write("    font-size: 2em;\r\n");
      out.write("}\r\n");
      out.write(".fa {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: table-cell;\r\n");
      out.write("    width: 60px;\r\n");
      out.write("    height: 36px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    vertical-align: middle;\r\n");
      out.write("    font-size:20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write(".main-menu:hover,nav.main-menu.expanded {\r\n");
      out.write("    width:250px;\r\n");
      out.write("    overflow:visible;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu {\r\n");
      out.write("    background: transparent; /*url(https://dl.dropboxusercontent.com/u/159328383/background.jpg);*/\r\n");
      out.write("    border-right:1px solid rgba(229, 229, 229, 0);\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    top:0;\r\n");
      out.write("    bottom:0;\r\n");
      out.write("    height:100%;\r\n");
      out.write("    left:0;\r\n");
      out.write("    width:30px;\r\n");
      out.write("    overflow:hidden;\r\n");
      out.write("    -webkit-transition:width .05s linear;\r\n");
      out.write("    transition:width .05s linear;\r\n");
      out.write("    -webkit-transform:translateZ(0) scale(1,1);\r\n");
      out.write("    z-index:1000;\r\n");
      out.write("    margin-left: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu>ul {\r\n");
      out.write("    margin:7px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu li {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:block;\r\n");
      out.write("    width:110px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu li>a {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table;\r\n");
      out.write("    border-collapse:collapse;\r\n");
      out.write("    border-spacing:0;\r\n");
      out.write("    color:#999;\r\n");
      out.write("    font-family: arial;\r\n");
      out.write("    font-size: 14px;\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("    -webkit-transform:translateZ(0) scale(1,1);\r\n");
      out.write("    -webkit-transition:all .1s linear;\r\n");
      out.write("    transition:all .1s linear;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu .nav-icon {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table-cell;\r\n");
      out.write("    width:60px;\r\n");
      out.write("    height:36px;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    font-size:18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu .nav-text {\r\n");
      out.write("    position:relative;\r\n");
      out.write("    display:table-cell;\r\n");
      out.write("    vertical-align:middle;\r\n");
      out.write("    width:190px;\r\n");
      out.write("    font-family: 'Titillium Web', sans-serif;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".main-menu>ul.logout {\r\n");
      out.write("    position:absolute;\r\n");
      out.write("    left:0;\r\n");
      out.write("    bottom:0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-touch .scrollable.hover {\r\n");
      out.write("    overflow-y:hidden;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".no-touch .scrollable.hover:hover {\r\n");
      out.write("    overflow-y:auto;\r\n");
      out.write("    overflow:visible;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("a:hover,a:focus {\r\n");
      out.write("    text-decoration:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("    -webkit-user-select:none;\r\n");
      out.write("    -moz-user-select:none;\r\n");
      out.write("    -ms-user-select:none;\r\n");
      out.write("    -o-user-select:none;\r\n");
      out.write("    user-select:none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav ul,nav li {\r\n");
      out.write("    outline:0;\r\n");
      out.write("    margin:0;\r\n");
      out.write("    padding:0;\r\n");
      out.write("}\r\n");
      out.write(".main-menu li:hover>a,nav.main-menu li.active>a,.dropdown-menu>li>a:hover,.dropdown-menu>li>a:focus,.dropdown-menu>.active>a,.dropdown-menu>.active>a:hover,.dropdown-menu>.active>a:focus,.no-touch .dashboard-page nav.dashboard-menu ul li:hover a,.dashboard-page nav.dashboard-menu ul li.active a {\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    background-color:#5fa2db;\r\n");
      out.write("}\r\n");
      out.write(".area {\r\n");
      out.write("    float: left;\r\n");
      out.write("    background: #e2e2e2;\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("@font-face {\r\n");
      out.write("    font-family: 'Titillium Web';\r\n");
      out.write("    font-style: normal;\r\n");
      out.write("    font-weight: 300;\r\n");
      out.write("    src: local('Titillium WebLight'), local('TitilliumWeb-Light'), url(http://themes.googleusercontent.com/static/fonts/titilliumweb/v2/anMUvcNT0H1YN4FII8wpr24bNCNEoFTpS2BTjF6FB5E.woff) format('woff');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".error{\r\n");
      out.write("    color: rgba(255, 26, 28, 0.95);\r\n");
      out.write("    font-size:11px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".success{\r\n");
      out.write("    color: rgba(94, 255, 110, 0.95);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <style>\r\n");
      out.write("            ");
      out.write("html {\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    height: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("*, *:before, *:after {\r\n");
      out.write("    box-sizing: inherit;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("body {\r\n");
      out.write("    background-color: #211f23;\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("    *zoom: 1;\r\n");
      out.write("    filter: progid:DXImageTransform.Microsoft.gradient(gradientType=1, startColorstr='#FF53455B', endColorstr='#FF201E22');\r\n");
      out.write("    background-image: url('data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0idXRmLTgiPz4gPHN2ZyB2ZXJzaW9uPSIxLjEiIHhtbG5zPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyI+PGRlZnM+PHJhZGlhbEdyYWRpZW50IGlkPSJncmFkIiBncmFkaWVudFVuaXRzPSJ1c2VyU3BhY2VPblVzZSIgY3g9IjUwJSIgY3k9IjAlIiByPSI3MCUiPjxzdG9wIG9mZnNldD0iMCUiIHN0b3AtY29sb3I9IiM1MzQ1NWIiLz48c3RvcCBvZmZzZXQ9IjcwJSIgc3RvcC1jb2xvcj0iIzIwMWUyMiIvPjwvcmFkaWFsR3JhZGllbnQ+PC9kZWZzPjxyZWN0IHg9IjAiIHk9IjAiIHdpZHRoPSIxMDAlIiBoZWlnaHQ9IjEwMCUiIGZpbGw9InVybCgjZ3JhZCkiIC8+PC9zdmc+IA==');\r\n");
      out.write("    background-size: 100%;\r\n");
      out.write("    background-image: -moz-radial-gradient(circle at top, #53455b 0%, #201e22 70%);\r\n");
      out.write("    background-image: -webkit-radial-gradient(circle at top, #53455b 0%, #201e22 70%);\r\n");
      out.write("    background-image: radial-gradient(circle at top, #53455b 0%, #201e22 70%);\r\n");
      out.write("    font-family: \"Poppins\", sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".paid\r\n");
      out.write("{\r\n");
      out.write("    display:none;\r\n");
      out.write("    width:300px;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("    background-color:#fff;\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    padding-top:25px;\r\n");
      out.write("    border-radius:0px 0px 10px 10px;\r\n");
      out.write("    padding-bottom:25px;\r\n");
      out.write("    color:#00773D;\r\n");
      out.write("    line-height:30px;\r\n");
      out.write("}\r\n");
      out.write(".paid p\r\n");
      out.write("{\r\n");
      out.write("    background-image:url(\"http://dc455.4shared.com/download/VILITso0/tsid20130720-183900-9216b81f/check.png\");\r\n");
      out.write("    background-repeat:no-repeat;\r\n");
      out.write("    background-position:left center;\r\n");
      out.write("    padding-left:0px;\r\n");
      out.write("    width:190px;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("}\r\n");
      out.write(".container\r\n");
      out.write("{\r\n");
      out.write("    width:350px;\r\n");
      out.write("    margin:50px auto;\r\n");
      out.write("}\r\n");
      out.write(".tab\r\n");
      out.write("{\r\n");
      out.write("    width:350px;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("    height:10px;\r\n");
      out.write("    background-color:#2B2929;\r\n");
      out.write("    border-radius:50px\r\n");
      out.write("}\r\n");
      out.write(".receipt\r\n");
      out.write("{\r\n");
      out.write("    background-color:#FAFAF9;\r\n");
      out.write("    padding-top:20px;\r\n");
      out.write("    width:300px;\r\n");
      out.write("    height:300px;\r\n");
      out.write("    margin:-5px auto;\r\n");
      out.write("    border-radius:5px 5px 50px 50px;\r\n");
      out.write("    -moz-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    -webkit-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("}\r\n");
      out.write(".paper\r\n");
      out.write("{\r\n");
      out.write("    border-top:1px dashed #ccc;\r\n");
      out.write("    width:96%;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("}\r\n");
      out.write(".title\r\n");
      out.write("{\r\n");
      out.write("    color:#00773D;\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("    margin-left:10px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("    float:left;\r\n");
      out.write("    font-size:16px;\r\n");
      out.write("    line-height:30px;\r\n");
      out.write("}\r\n");
      out.write(".date\r\n");
      out.write("{\r\n");
      out.write("    color:#00773D;\r\n");
      out.write("    margin-top:20px;\r\n");
      out.write("    margin-right:10px;\r\n");
      out.write("    font-weight:lighter;\r\n");
      out.write("    float:right;\r\n");
      out.write("    font-size:12px;\r\n");
      out.write("    line-height:30px;\r\n");
      out.write("}\r\n");
      out.write("table\r\n");
      out.write("{\r\n");
      out.write("    clear:both;\r\n");
      out.write("    width:95%;\r\n");
      out.write("    margin:0 auto;\r\n");
      out.write("    color:#5B5B5B;\r\n");
      out.write("    font-size:12px;\r\n");
      out.write("    padding-top:10px;\r\n");
      out.write("    padding-bottom:20px;\r\n");
      out.write("    border-bottom:1px dashed #ccc;\r\n");
      out.write("}\r\n");
      out.write(".right\r\n");
      out.write("{\r\n");
      out.write("    text-align:right;\r\n");
      out.write("}\r\n");
      out.write(".center\r\n");
      out.write("{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("    padding-top:20px;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]\r\n");
      out.write("{\r\n");
      out.write("    background-color:#00874C;\r\n");
      out.write("    outlie:none;\r\n");
      out.write("    border:1px solid #ccc;\r\n");
      out.write("    padding:10px;\r\n");
      out.write("    border-radius:5px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    padding-left:30px;\r\n");
      out.write("    background-image:url(\"http://dc707.4shared.com/img/zr6_o80l/s3/13ffd4de138/cart.png\");\r\n");
      out.write("    background-repeat:no-repeat;\r\n");
      out.write("    background-position:5px center;\r\n");
      out.write("}\r\n");
      out.write("input[type=submit]:hover\r\n");
      out.write("{\r\n");
      out.write("    -moz-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    -webkit-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("    color:#f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=button]\r\n");
      out.write("{\r\n");
      out.write("    background-color:#00874C;\r\n");
      out.write("    outlie:none;\r\n");
      out.write("    border:1px solid #ccc;\r\n");
      out.write("    padding:10px;\r\n");
      out.write("    border-radius:5px;\r\n");
      out.write("    font-weight:bold;\r\n");
      out.write("    color:#fff;\r\n");
      out.write("    padding-left:30px;\r\n");
      out.write("    background-image:url(\"http://dc707.4shared.com/img/zr6_o80l/s3/13ffd4de138/cart.png\");\r\n");
      out.write("    background-repeat:no-repeat;\r\n");
      out.write("    background-position:5px center;\r\n");
      out.write("}\r\n");
      out.write("input[type=button]:hover\r\n");
      out.write("{\r\n");
      out.write("    -moz-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    -webkit-box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    box-shadow: 0 10px 30px rgba(0,0,0,0.3);\r\n");
      out.write("    cursor:pointer;\r\n");
      out.write("    color:#f0f0f0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".barcode\r\n");
      out.write("{\r\n");
      out.write("    height: 10px;\r\n");
      out.write("    width: 0;\r\n");
      out.write("    box-shadow:1px 0 0 1px #343434, 5px 0 0 1px #343434, 10px 0 0 1px #343434, 11px 0 0 1px #343434, 15px 0 0 1px #343434, 18px 0 0 1px #343434, 22px 0 0 1px #343434, 23px 0 0 1px #343434, 26px 0 0 1px #343434, 30px 0 0 1px #343434, 35px 0 0 1px #343434, 37px 0 0 1px #343434, 41px 0 0 1px #343434, 44px 0 0 1px #343434, 47px 0 0 1px #343434, 51px 0 0 1px #343434, 56px 0 0 1px #343434, 59px 0 0 1px #343434, 64px 0 0 1px #343434, 68px 0 0 1px #343434, 72px 0 0 1px #343434, 74px 0 0 1px #343434, 77px 0 0 1px #343434, 81px 0 0 1px #343434;\r\n");
      out.write("    display:inline-block;\r\n");
      out.write("    margin-right:85px;\r\n");
      out.write("}\r\n");
      out.write(".sign\r\n");
      out.write("{\r\n");
      out.write("    text-align:center;\r\n");
      out.write("}\r\n");
      out.write(".thankyou\r\n");
      out.write("{\r\n");
      out.write("    line-height:14px;\r\n");
      out.write("    font-size:10px;\r\n");
      out.write("    margin-top:5px;\r\n");
      out.write("    color:#5B5B5B;\r\n");
      out.write("    width:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select-style {\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    width: 120px;\r\n");
      out.write("    border-radius: 3px;\r\n");
      out.write("    overflow: hidden;\r\n");
      out.write("    background-color: rgba(255, 255, 255, 0.08);\r\n");
      out.write("\r\n");
      out.write("    background: rgba(255, 255, 255, 0.04);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select-style select {\r\n");
      out.write("    padding: 5px 8px;\r\n");
      out.write("    width: 130%;\r\n");
      out.write("    border: none;\r\n");
      out.write("    box-shadow: none;\r\n");
      out.write("    background-color: transparent;\r\n");
      out.write("    background-image: none;\r\n");
      out.write("    -webkit-appearance: none;\r\n");
      out.write("    -moz-appearance: none;\r\n");
      out.write("    appearance: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".select-style select:focus {\r\n");
      out.write("    outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".inp  {  border: 1px solid #cccccc;\r\n");
      out.write("border-radius: 3px;\r\n");
      out.write("-webkit-border-radius: 3px;\r\n");
      out.write("-moz-border-radius: 3px;\r\n");
      out.write("-khtml-border-radius: 3px;\r\n");
      out.write("background: #ffffff !important;\r\n");
      out.write("outline: none;\r\n");
      out.write("color: #cccccc;\r\n");
      out.write("font-size: 11px;\r\n");
      out.write("font-family: Tahoma;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    height:30px;\r\n");
      out.write("}\r\n");
      out.write(".inp:focus{\r\n");
      out.write("    color: rgb(0, 0, 0);\r\n");
      out.write("    border: 1px solid #000000\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("\r\n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\">\r\n");
      out.write("\r\n");
      out.write("            /*function pay()\r\n");
      out.write("            {\r\n");
      out.write("                $(\".receipt\").slideUp(\"slow\");\r\n");
      out.write("                $(\".paid\").slideDown(\"slow\");\r\n");
      out.write("            }*/\r\n");
      out.write("            function checkAll () {\r\n");
      out.write("                payButton = document.getElementById(\"pay\");\r\n");
      out.write("                var comment = document.getElementById(\"comment\");\r\n");
      out.write("                var money = document.getElementById(\"money\");\r\n");
      out.write("                var sources = document.getElementById(\"sources\");\r\n");
      out.write("                var spanCheck = document.getElementById(\"error\");\r\n");
      out.write("                if(comment.value.length==0 | money.value.length==0 | sources.value=='dis' | comment.value.length < 5 | comment.value.length > 95 | (money.value).match(/^[-\\+]?\\d+/) === null | parseInt(money.value)<0 | sources.value=='dis'){\r\n");
      out.write("                    payButton.disabled = true;\r\n");
      out.write("                    spanCheck.innerHTML = \"Input all fields correctly!\";\r\n");
      out.write("                }\r\n");
      out.write("                else{\r\n");
      out.write("                    payButton.disabled = false;\r\n");
      out.write("                    spanCheck.innerHTML = \"\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("             function  checkComment() {\r\n");
      out.write("                var payButton = document.getElementById(\"pay\");\r\n");
      out.write("                var comment = document.getElementById(\"comment\");\r\n");
      out.write("                var spanCheck = document.getElementById(\"error\");\r\n");
      out.write("\r\n");
      out.write("                if (comment.value.length < 5 || comment.value.length > 95) {\r\n");
      out.write("                    payButton.disabled = true;\r\n");
      out.write("                    spanCheck.innerHTML = \"Comment is too small or very large!\";\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    spanCheck.innerHTML = \"\";\r\n");
      out.write("                    checkAll ();\r\n");
      out.write("\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("                function checkMoney(){\r\n");
      out.write("                    payButton = document.getElementById(\"pay\");\r\n");
      out.write("                    var money = document.getElementById(\"money\");\r\n");
      out.write("                    var moneyCheck = document.getElementById(\"moneyError\");\r\n");
      out.write("                if( (money.value).match(/^[-\\+]?\\d+/) === null | parseInt(money.value)<0 ) {\r\n");
      out.write("                    payButton.disabled = true;\r\n");
      out.write("                    moneyCheck.innerHTML = \"Input the the correct amount of money!\";\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    moneyCheck.innerHTML = \"\";\r\n");
      out.write("                    checkAll ();\r\n");
      out.write("                    }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            function checkSources(){\r\n");
      out.write("                payButton = document.getElementById(\"pay\");\r\n");
      out.write("                var sources = document.getElementById(\"sources\");\r\n");
      out.write("                var Check = document.getElementById(\"error\");\r\n");
      out.write("                if( sources.value=='dis' ) {\r\n");
      out.write("                    payButton.disabled = true;\r\n");
      out.write("                    Check.innerHTML = \"Choose! 'What we pay for?'!\";\r\n");
      out.write("                }\r\n");
      out.write("                else {\r\n");
      out.write("                    Check.innerHTML = \"\";\r\n");
      out.write("                    checkAll ();\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"main-menu\">\r\n");
      out.write("    <ul>\r\n");
      out.write("        <li class=\"has-subnav\">\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/home\">\r\n");
      out.write("                <i class=\"fa fa-laptop fa-2x\"></i>\r\n");
      out.write("                <span class=\"nav-text\">\r\n");
      out.write("                            Home\r\n");
      out.write("                        </span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <ul class=\"logout\">\r\n");
      out.write("        <li>\r\n");
      out.write("            ");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("            <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${logoutUrl}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                <i class=\"fa fa-power-off fa-2x\"></i>\r\n");
      out.write("                <span class=\"nav-text\">\r\n");
      out.write("                            Logout\r\n");
      out.write("                        </span>\r\n");
      out.write("            </a>\r\n");
      out.write("        </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <div class=\"tab\"></div>\r\n");
      out.write("    <form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.servletContext.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/payment\" method=\"post\">\r\n");
      out.write("    <div class=\"paid\">\r\n");
      out.write("        <p>Paid successfully</p>\r\n");
      out.write("        <input type=\"submit\" value=\"Home page\" />\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"receipt\">\r\n");
      out.write("        <div class=\"paper\">\r\n");
      out.write("            <div class=\"title\">Receipt</div>\r\n");
      out.write("            <div class=\"date\">Date time: 20/07/2013</div>\r\n");
      out.write("            <table>\r\n");
      out.write("                <tbody>\r\n");
      out.write("                <tr><td>\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("                </td>\r\n");
      out.write("                    <td class=\"right\"><input type=\"input\" placeholder=\"Comment...\" size=\"12\" class=\"inp\" name=\"reason\" id=\"comment\" onchange=\"checkMoney(), checkSources(), checkComment()\"> </td>\r\n");
      out.write("                    <td class=\"right\"><input type=\"input\" placeholder=\"$\" size=\"3\" class=\"inp\" name=\"money\" id=\"money\" onchange=\"checkComment(),checkSources() ,checkMoney()\"> </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td colspan=\"2\" class=\"center\" >\r\n");
      out.write("                    <input type=\"submit\" value=\"Pay Now\" id=\"pay\" onClick=\"pay()\" onmousemove=\"checkAll()\" onmousedown=\"checkAll()\"/>\r\n");
      out.write("                        <p><span id=\"error\" class=\"error\"></span></p>\r\n");
      out.write("                        <span id=\"moneyError\" class=\"error\"></span>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            <div class=\"sign center\">\r\n");
      out.write("                <div class=\"barcode\"></div>\r\n");
      out.write("                bankAccount\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("<script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005furl_005f0.setParent(null);
    // /pages/pay.jsp(108,12) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setValue("/logout");
    // /pages/pay.jsp(108,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005furl_005f0.setVar("logoutUrl");
    int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
    if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /pages/pay.jsp(135,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty increase}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                        <select name=\"sources\"  id=\"sources\" class=\"select-style\" onchange=\"checkMoney(), checkComment(),checkSources()\" value=\"income\"><option value=\"dis\"  disabled selected>Increase wallet</option>\r\n");
        out.write("                            <option value=\"income\">Income</option>\r\n");
        out.write("                        </select>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent(null);
    // /pages/pay.jsp(141,20) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty increase}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                    <select name=\"sources\" id=\"sources\" class=\"select-style\" onchange=\"checkMoney(), checkComment(),checkSources()\"><option value=\"dis\"  disabled selected>What we pay for ?</option>\r\n");
        out.write("                    <option value=\"cloth\">Cloth</option>\r\n");
        out.write("                    <option value=\"dinner\">Dinner</option>\r\n");
        out.write("                    <option value=\"food\">Foodstuffs</option>\r\n");
        out.write("                    </select>\r\n");
        out.write("                    ");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }
}
