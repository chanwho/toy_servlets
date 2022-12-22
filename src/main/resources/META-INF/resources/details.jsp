<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.HashMap" %>


<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <link
      href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
      rel="stylesheet"
      integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
      crossorigin="anonymous"
    />
    <link rel="stylesheet" href="./css/commons.css" />
  </head>

  <body>
    <% 
    HashMap<String, Object> questionHash = (HashMap<String, Object>) request.getAttribute("question");
    HashMap<String, Object> example1 = (HashMap<String, Object>) request.getAttribute("example1");
    HashMap<String, Object> example2 = (HashMap<String, Object>) request.getAttribute("example2");
    HashMap<String, Object> example3 = (HashMap<String, Object>) request.getAttribute("example3");
    HashMap<String, Object> example4 = (HashMap<String, Object>) request.getAttribute("example4");
    HashMap<String, Object> example5 = (HashMap<String, Object>) request.getAttribute("example5");
    %>

    <%
      String orderOriginNext = (String) questionHash.get("ORDERS");
      int ordersIntParamNext = 0;
      if (orderOriginNext.equals("5")){
        ordersIntParamNext = 5;
      } else{
        ordersIntParamNext = Integer.parseInt(orderOriginNext) + 1;
      }
      String ordersParamNext = Integer.toString(ordersIntParamNext);
      
      String orderOriginPrev = (String) questionHash.get("ORDERS");
      int ordersIntParamPrev;
      if (orderOriginPrev.equals("1")){
        ordersIntParamPrev = 1;
      } else{
        ordersIntParamPrev = Integer.parseInt(orderOriginPrev) - 1;
      }
      String ordersParamPrev = Integer.toString(ordersIntParamPrev);
    %>
    
    <div>
      <a href="/Poll/DetailServlet?ORDERS=<%=ordersParamPrev%>">Prev</a>
      <a href="/Poll/DetailServlet?ORDERS=<%=ordersParamNext%>">Next</a>
    </div>
    <div>
      
    </div>
    


    <%-- JSP는 바로 request 사용가능. 이래서 Servlet이라고 부르는듯 --%>

    <div>
      <%= questionHash.get("ORDERS") %>.<%= questionHash.get("QUESTIONS") %>
    </div>
    <div>
      (<%= example1.get("ORDERS") %>) <%= example1.get("EXAMPLE") %> 
      (<%= example2.get("ORDERS") %>) <%= example2.get("EXAMPLE") %> 
      (<%= example3.get("ORDERS") %>) <%= example3.get("EXAMPLE") %> 
      (<%= example4.get("ORDERS") %>) <%= example4.get("EXAMPLE") %> 
      (<%= example5.get("ORDERS") %>) <%= example5.get("EXAMPLE") %> 
      
    </div>
    

    <script
      src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
      integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
      crossorigin="anonymous"
    ></script>
  </body>
</html>
