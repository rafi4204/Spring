<%--
  Created by IntelliJ IDEA.
  User: BS293
  Date: 7/24/2021
  Time: 11:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="header.jsp" %>

<div class="container">
    <div class="row">
        <c:forEach items="${products}" var="product">
            <div class="col-sm-4">
                <div class="panel panel-primary">
                    <div class="panel-heading"> ${product.name} </div>
                    <div class="panel-body">
                        <p>Price : ${product.price}  </p>
                        <p>Seller :  ${product.seller} </p>
                    </div>
                    <div class="panel-footer"> <button type="button" class="btn btn-primary btn-md"
                                                       onClick="location.href='/products/${product.id} ' ">Browse</button></div>
                </div>
            </div>
        </c:forEach>
    </div>
</div><br>

</body>
</html>
