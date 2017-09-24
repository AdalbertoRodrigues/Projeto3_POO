<%-- 
    Document   : home
    Created on : 23/09/2017, 19:02:54
    Author     : Adalberto
--%>
<%if(request.getParameter("page") == null){%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <script src="res/jquery/jquery.min.js"></script>
    <script src="res/popper/popper.min.js"></script>
    <script src="res/bootstrap/js/bootstrap.min.js"></script>
    <%@include file="WEB-INF/jspf/head.jspf"%> 
       
        <%@include file="WEB-INF/jspf/menu.jspf"%>
        
        <div class="conteudo" id="cont">
            
            <%@include file="WEB-INF/jspf/HomeContent.jspf"%>
        </div> 
    </body>   
</html>
<%}else if(request.getParameter("page").equals("home")){%>
    <%@include file="WEB-INF/jspf/HomeContent.jspf" %>
<%}else if(request.getParameter("page").equals("incluir")){%>
    <%@include file="WEB-INF/jspf/Incluir.jspf" %>
<%}else if(request.getParameter("page").equals("pesquisar")){%>
    <%@include file="WEB-INF/jspf/Pesquisar.jspf" %>
<%}%>
        

    

