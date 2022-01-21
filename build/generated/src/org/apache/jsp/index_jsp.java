package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.envanter.javabean.Products;
import com.envanter.veritabani.UserDB;

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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("    <title>Envanter Yönetim Sistemi</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   \n");
      out.write("    <form action=\"\" method=\"post\">\n");
      out.write("        <h1>Envanter Yönetim Sistemi'ne Hoşgeldiniz<br>Lütfen Giriş Yapınız</h1>\n");
      out.write("  <div class=\"inset\">\n");
      out.write("      <div class = \"bligiler\">\n");
      out.write("          <div class = \"container\">\n");
      out.write("                <div class = \"kullanici\">\n");
      out.write("                <p>\n");
      out.write("    <label for=\"ad\">Kullanıcı Adı</label>\n");
      out.write("    <input type=\"text\" name=\"ad\" id=\"ad\">\n");
      out.write("    </p><br><br>\n");
      out.write("  <p>\n");
      out.write("    <label for=\"sifre\">Şifre</label>\n");
      out.write("    <input type=\"password\" name=\"sifre\" id=\"sifre\">\n");
      out.write("  </p>\n");
      out.write("              </div>\n");
      out.write("        \n");
      out.write("  <p class = \"hatirla\">\n");
      out.write("    <input type=\"checkbox\" name=\"remember\" id=\"remember\">\n");
      out.write("    <label for=\"remember\">Beni Hatırla</label>\n");
      out.write("  </p>\n");
      out.write("              <br>\n");
      out.write("        \n");
      out.write("          \n");
      out.write("      </div>\n");
      out.write("  <br>\n");
      out.write("  </div>\n");
      out.write("  <p class=\"p-container\">\n");
      out.write("      <span></span>\n");
      out.write("    <input type=\"submit\" name=\"go\" id=\"go\" value=\"Giriş Yap\">\n");
      out.write("  </p>\n");
      out.write("  \n");
      out.write("  <div class = \"bilgi\">\n");
      out.write("       ");

        String isim = request.getParameter("ad");
        String sifre = request.getParameter("sifre");
        String giris = request.getParameter("go");
        HttpSession oturum = request.getSession(true);
        
        UserDB user = new UserDB();
        boolean remember = request.getParameter("remember") != null;
        Cookie ckUsername = null;
        Cookie ckPassword = null;
        Cookie durum = null;
        String passWord = "";
        String userName = "";
        
        if(!remember){
            
        }
        else{
            
        }
        
        HttpSession prevPage = request.getSession(true);
      
        
        if(isim != null && sifre != null && giris != null){
                  ckUsername = new Cookie("username", isim);
                  ckPassword = new Cookie("password", sifre);
                  durum = new Cookie("durum", "false");
                  
             }
              
        
         Cookie[] allCookies = request.getCookies();
         if (allCookies != null) {
                 for(Cookie cook: allCookies){
                     if(cook.getName().equalsIgnoreCase("username")){
                         userName = cook.getValue();
                     }
                     else if(cook.getName().equalsIgnoreCase("password")){
                         passWord = cook.getValue();
                     }
                     
                 }
             }
         
         if(allCookies != null){
             for(int i = 0; i < allCookies.length; i++){
                 System.out.println(allCookies[i].getValue());
             if(allCookies[i].getValue().contains(user.hesapKontrol(userName, passWord))){
                      response.sendRedirect(request.getContextPath() + "/adminAccount.jsp");
                      break;
                  }
             else{
                 System.out.println("bulunamadi");
             }
         }
         }
           
             if (isim != null && sifre != null) {
                if (user.hesapKontrol(isim, sifre).equals("admin")) {
                    if(UserDB.isFirstLogin){
                        response.sendRedirect("yeniSifre.jsp");
                        UserDB.isFirstLogin = false;
                    }
                    else{
                        if(remember){
                         ckUsername.setMaxAge(300);
                         response.addCookie(ckUsername);
                         ckPassword.setMaxAge(300);
                         response.addCookie(ckPassword);
                         durum.setMaxAge(0);
                         response.addCookie(durum);
        }else{          
                            durum.setMaxAge(300);
                         response.addCookie(durum);
                            oturum.setAttribute("Uname", isim);
                        }
                        
                         
                         
                        prevPage.setAttribute("oncekiSayfa", "adminAccount.jsp");
                        response.sendRedirect("adminAccount.jsp");
                    }
                   }
                else if (user.hesapKontrol(isim, sifre).equals("staff")) {
                         ckUsername.setMaxAge(-1);
                         response.addCookie(ckUsername);
                         ckPassword.setMaxAge(-1);
                         response.addCookie(ckPassword);
                    prevPage.setAttribute("oncekiSayfa", "staffAccount.jsp");
                    response.sendRedirect("staffAccount.jsp");
                   }       
else{
                out.println("\t Bilgiler yanlış");

            }
                
            }
      
      out.write("\n");
      out.write("      \n");
      out.write("  </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
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
