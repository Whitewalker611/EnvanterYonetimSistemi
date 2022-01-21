package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.envanter.javabean.Cart;
import com.envanter.javabean.Products;
import java.sql.ResultSet;
import com.envanter.veritabani.UserDB;

public final class urunEkle_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/urunekle.css\" type=\"text/css\">\n");
      out.write("    <title>Yönetici</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   ");
 
       UserDB us = new UserDB();
       request.setCharacterEncoding("utf-8");
       HttpSession oturum = request.getSession();
       String prevPage = oturum.getAttribute("oncekiSayfa").toString();
       
    
      out.write("\n");
      out.write("   \n");
      out.write("       \n");
      out.write("<div class=\"hizala\">\n");
      out.write("           <div class=\"solMenu\"  >\n");
      out.write("               ");
/*
            out.print("<h1>Hoş geldiniz " + ad + "</h1>");*/
            
      out.write("\n");
      out.write("             <form  method=\"post\" action=\"\">\n");
      out.write("                    <label for=\"urunKodu\">Ürün Kodu:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"urunKodu\" value=\"\" />\n");
      out.write("                    <label for=\"kategori\">Kategori:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"kategori\" value=\"\" />\n");
      out.write("                    <label for=\"urunAdi\">Ürün Adı:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"urunAdi\" value=\"\" />\n");
      out.write("                    <label for=\"adet\">Adet:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"adet\" value=\"\" />\n");
      out.write("                    <label for=\"alisFiyat\">Alış Fiyatı:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"alisFiyat\" value=\"\" />\n");
      out.write("                    <label for=\"satisFiyat\">Satış Fiyatı:</label>\n");
      out.write("                    <input class=\"urunTxt\" type=\"text\" name=\"satisFiyat\" value=\"\" />\n");
      out.write("                    <div class=\"btnHiza\">\n");
      out.write("                    <input id=\"btnGeri\"  class=\"btn\" type=\"submit\" value=\"Geri\" name=\"geri\"/>\n");
      out.write("                    <input id=\"btnEkle\" class=\"btn\" type=\"submit\" value=\"Ekle\" name=\"ekle\"/>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("</form>  \n");
      out.write("             \n");
      out.write("             ");

                 
            String kod = request.getParameter("urunKodu");
            String ek = request.getParameter("ekle");
            String geri = request.getParameter("geri");
            
                  if(geri != null){
                response.sendRedirect(prevPage);
            }
           int result = 0;
            
           String urunKodu = request.getParameter("urunKodu");
           String kategori = request.getParameter("kategori");
           String urunAdi = request.getParameter("urunAdi");
           String adet = request.getParameter("adet");
           String alisFiyat = request.getParameter("alisFiyat");
           String satisFiyat = request.getParameter("satisFiyat");
           
           if(ek != null){
       
               if(urunKodu.equals("") || kategori.equals("") || urunAdi.equals("") ||
                        adet.equals("") || alisFiyat.equals("") || satisFiyat.equals("")){
                  
      out.write("\n");
      out.write("                  <p style=\"color: red; margin-top: 25px; margin-left: 50px\">Bütün alanlar doldurulmalıdır!</p>\n");
      out.write("             ");
  }
               else{
                   
                    us.urunEkle(urunKodu, kategori, urunAdi, adet, alisFiyat, satisFiyat);
                
               }
           }
             
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<div class=\"urunListe\">\n");
      out.write("    <table>\n");
      out.write("        <tr>\n");
      out.write("            <th>Ürün Kodu</th>\n");
      out.write("            <th>Kategori</th>\n");
      out.write("            <th>Ürün Adı</th>\n");
      out.write("            <th>Adet</th>\n");
      out.write("            <th>Alış Fiyatı</th>\n");
      out.write("            <th>Satış Fiyati</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            
            Products p = new Products();
            
            
             ResultSet rs = us.urunListele("urunler");
            
            while(rs.next()){
                if (Integer.valueOf(rs.getString("adet")) > 0) {
                        out.print("<tr>");
                out.print("<td>" + rs.getString("urunKodu") + "</td>");
                out.print("<td>" + rs.getString("kategori") + "</td>");
                out.print("<td>" + rs.getString("urunAdi") + "</td>");
                out.print("<td>" + rs.getString("adet") + "</td>");
                out.print("<td>" + rs.getString("alisFiyat") + " TL</td>");
                out.print("<td>" + rs.getString("satisFiyat") + " TL</td>");
                out.print("</tr>");
                  }
            }
       
     
      out.write("  \n");
      out.write("    </table>\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</div>  \n");
      out.write("</body>\n");
      out.write("</html>\n");
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
