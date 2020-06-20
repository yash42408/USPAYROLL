<%@page import="model.Product"%>
<%@page import="dao.ProductDAO"%>
<%@include  file="FrontPage.jsp" %>
<%! 
Product P=new Product();
%>
<html>
    <head>
        <title>TODO supply a title</title>
    </head>
    <body>
          <% 
          for(int i=1;i<=15;i++)
              out.println("<br>");
        %>
        <center>
            <font color="blue" size="6">Enter Id for Search</font>
            <form method="post" action="SearchData.jsp">   
   <table border="1">
       
       <tr>
           <th>Product Id</th>
           <td><input type="text" name="txtId"></td>
       </tr>
       <tr>
           <td><input type="submit"  value="Submit">
                <input type="reset"  value="Reset"></td>
       </tr>
    </table>
             </form>   
            <% 
            String pid=null;
            pid=request.getParameter("txtId");
          if(pid!=null)  
          {    
               int id;
               id=Integer.parseInt(pid);
               ProductDAO pd=new ProductDAO();
               P=pd.searchById(id);
               if(P==null)
                  out.println("<font color=red size=7>Record Not Found 404......</font>");
               else
               {   
            %>
                <table border="1">
                    <tr><th>Product Id</th><th>Product Name</th><th>Product Price</th><th>Product Type</th></tr>
                    <tr>
                      <td><%=P.getId()%></td>  
                     <td><%=P.getName()%></td>  
                     <td><%=P.getPrice()%></td>  
                       <td><%=P.getType()%></td>  
                    </tr>        
                </table>
            <% 
               }
          }      
            %>
     </center>
    </body>
</html>
