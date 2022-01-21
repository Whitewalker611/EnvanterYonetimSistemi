package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.envanter.javabean.SoldProducts;
import com.envanter.javabean.Cart;
import com.envanter.veritabani.UserDB;
import java.sql.ResultSet;
import com.envanter.javabean.User;

public final class adminAccount_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/panelcss.css\" type=\"text/css\">\n");
      out.write("    <title>Yönetici</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("   ");
 
       UserDB us = new UserDB();
       request.setCharacterEncoding("utf-8");
       HttpSession prevPage = request.getSession();
       prevPage.setAttribute("oncekiSayfa", "adminAccount.jsp");
       String ad = "";
       String userName = "";
       Cookie[] ccc = request.getCookies();
       boolean durum = true;
       
       for(Cookie ca: ccc){
           if(ca.getName().contains("durum")){
               if(ca.getValue().contains("false")){
                   //ad =prevPage.getAttribute("Uname").toString();
                   durum = false;
                   break;
               }
           }
           else if(ca.getName().equalsIgnoreCase("username") && ca.getValue().contains("admin")){
                    userName = ca.getValue();
                    
                }
                             
            }
       
if(!durum){
    ad = prevPage.getAttribute("Uname").toString();
}
else{
    ad = userName;
}
    
       
       
       
       
       
    
      out.write("\n");
      out.write("    <div class=\"bos\" > \n");
      out.write("        ");

           
            
            out.print("<h1>Hoş geldiniz " + ad + "</h1>");
            
            
            
             
            
      out.write("\n");
      out.write("            <div class=\"hizala\">\n");
      out.write("                 <div class=\"solMenu\">\n");
      out.write("             <form name=\"frm\" method=\"post\" action=\"\">\n");
      out.write("        <input class=\"btn\" type=\"submit\" value=\"Ürün Ekle\" name=\"urunEkleBtn\"/><br>\n");
      out.write("        <input  class=\"btn\" type=\"submit\" value=\"Stok Görüntüle\" name=\"stokGetirBtn\"/>\n");
      out.write("        <input  class=\"btn\" type=\"submit\" value=\"Kullanıcı Ekle\" name=\"hesapEkleBtn\"/>\n");
      out.write("        <input  class=\"btn\" type=\"submit\" value=\"Çıkış Yap\" name=\"cikis\"/>\n");
      out.write("</form>        \n");
      out.write("        </div>\n");
      out.write("                <div class=\"urunListe\">\n");
      out.write("                    <p>Son Satılanlar</p>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Ürün Kodu</th>         \n");
      out.write("            <th>Ürün Adı</th>\n");
      out.write("            <th>Adet</th>\n");
      out.write("            <th>Fiyat</th>\n");
      out.write("            ");

                 /*ResultSet satilan = us.urunListele("satilan");
                while(satilan.next()){
                out.print("<tr>");
                out.print("<td>" + satilan.getString("urunKodu") + "</td>");
                out.print("<td>" + satilan.getString("urunAdi") + "</td>");
                out.print("<td>" + satilan.getString("adet") + "</td>");
                out.print("<td>" + satilan.getString("fiyat") + "</td>");
                out.print("</tr>");
                }*/
                 for(SoldProducts sol: UserDB.satilanlarList){
                out.print("<tr>");
                out.print("<td>" + sol.getUrunKodu() + "</td>");
                out.print("<td>" + sol.getUrunAdi() + "</td>");
                out.print("<td>" + sol.getAdet() + "</td>");
                out.print("<td>" + sol.getFiyat() + " TL</td>");
                out.print("</tr>");
                 }
            
      out.write("\n");
      out.write("                \n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("                 <div class=\"urunListe\">\n");
      out.write("                    <p>Onay Bekleyen Ürünler</p>\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Ürün Kodu</th>         \n");
      out.write("            <th>Ürün Adı</th>\n");
      out.write("            <th>Adet</th>\n");
      out.write("            <th>Fiyat</th>\n");
      out.write("            <th>İşlem</th>\n");
      out.write("            ");

                ResultSet sepet = us.urunListele("sepet");
                while(sepet.next()){
                out.print("<tr>");
                out.print("<td>" + sepet.getString("urunKodu") + "</td>");
                out.print("<td>" + sepet.getString("urunAdi") + "</td>");
                out.print("<td>" + sepet.getString("adet") + "</td>");
                out.print("<td>" + sepet.getString("fiyat") + " TL</td>");
                
      out.write("\n");
      out.write("            <td><a href=\"adminAccount.jsp?id=");
      out.print( sepet.getString("urunKodu") );
      out.write("\">Listeden Çıkart</a></td>\n");
      out.write("            ");

                out.print("</tr>");
               }
            
      out.write("\n");
      out.write("                \n");
      out.write("    </table>\n");
      out.write("            <form action=\"\" method=\"post\">\n");
      out.write("                <input class =\"onay\" type=\"submit\" name=\"onay\" value=\"Satışı Onayla\"></input>\n");
      out.write("             <input class =\"onay\" type=\"submit\" name=\"temizle\" value=\"Listeyi Temizle\"></input>\n");
      out.write("            </form>\n");
      out.write("</div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("</div> \n");
      out.write("    ");

        String ekle = request.getParameter("urunEkleBtn");
        String stok = request.getParameter("stokGetirBtn");
        String hesap = request.getParameter("hesapEkleBtn");
        String cikis = request.getParameter("cikis");
        String idd = request.getParameter("id");
        String temizle = request.getParameter("temizle");
        String onay = request.getParameter("onay");
        
        Cookie urunKodu = null;
        Cookie urunAdi = null;
        Cookie adet = null;
        Cookie fiyat = null;
        
        
        if(onay != null){
            UserDB.isForSell = true;
             us.satilaniSil();
             us.satilaniBosalt();
             
            for(SoldProducts s: UserDB.satilanlarList){
                us.satisListesineEkle(s.getUrunKodu(), s.getUrunAdi(), s.getAdet(), s.getFiyat());
                
            }
            response.sendRedirect("fatura.jsp");
        }
        
        if(temizle != null){
            UserDB.isRemovedAll = true;
            us.sepetiTemizle("sepet");
            response.sendRedirect("adminAccount.jsp");
        }
        if(idd != null){
            UserDB.isRemovedFromCart = true;
            us.urunSil("sepet", Integer.valueOf(idd));
            response.sendRedirect("adminAccount.jsp"); 
        }
       
        if(ekle != null){
            response.sendRedirect("urunEkle.jsp");
        }
        if(stok != null){
            response.sendRedirect("stok.jsp");
        }
        if(hesap != null){
            response.sendRedirect("kullaniciEkle.jsp");
        }
        if(cikis != null){
            Cookie[] co = request.getCookies();
            for(Cookie c: co){
                if(c.getName().equalsIgnoreCase("username")){
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
                if(c.getName().equalsIgnoreCase("password")){
                    c.setMaxAge(0);
                    response.addCookie(c);
                }
            }
             response.sendRedirect("index.jsp");
           
        }
        
    
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
