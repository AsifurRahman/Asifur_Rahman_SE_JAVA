<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html lang="en">
<head>
    <%@ include file="/WEB-INF/views/head.jsp" %>
</head>

<body class="hold-transition skin-purple sidebar-mini">
<div class="wrapper">

    <!-- This is Top menu bar  -->
    <%@ include file="/WEB-INF/views/topMenuBar.jsp" %>
    <!-- Left side column. contains the logo and sidebar -->
    <%@ include file="/WEB-INF/views/leftMenuBar.jsp" %>

    <!-- Content Wrapper. Contains page content -->
    <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
            <center><h3 style="color: deepskyblue">
                <strong>Our Products </strong>
            </h3></center>
        </section>

        <!-- Main content -->
        <section class="content">
            <div class="row">
                <div class="col-xs-12">
                    <div class="box">
                        <div class="box-header">
                        </div>
                        <div class="box-body">
                            <div class="dataTables_wrapper form-inline dt-bootstrap">
                                <div class="row">
                                    <div class="col-sm-12">
                                        <table id="productTable" class="table table-striped">
                                            <thead>
                                            <tr>
                                                <th>Serial No</th>
                                                <th>Product Name</th>
                                                <th>Product Type</th>
                                                <th>Price</th>
                                                <th>Update Product</th>
                                                <th>Delete Product</th>
                                                <th>Buy</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${productList}" var="pdr" varStatus="status">
                                                <tr>
                                                    <td>${status.index+1}</td>
                                                    <td>${pdr.name}</td>
                                                    <td>${pdr.ptype}</td>
                                                    <td>${pdr.price}</td>
                                                    <td>
                                                        <a class="btn btn-warning btn-sm" href="./upsertProduct?productId=${pdr.id}">Update</a>
                                                    </td>
                                                    <td>
                                                    <a class="btn btn-danger btn-sm" href="./deleteProduct?productId=${pdr.id}">Delete</a>
                                                    </td>
                                                    <td>
                                                        <a class="btn btn-success btn-sm" href="/buyProduct">Buy</a>
                                                    </td>
                                                </tr>
                                            </c:forEach>
                                            </tbody>
                                        </table>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </section>
        <!-- /.content -->
    </div>
    <!-- /.content-wrapper -->


    <!-- thisis footer -->
    <%@ include file="/WEB-INF/views/footer.jsp" %>

    <!-- Control Sidebar -->
    <%--<%@ include file="/WEB-INF/views/settings.jsp" %>--%>
    <!-- /.control-sidebar -->
    <!-- Add the sidebar's background. This div must be placed
         immediately after the control sidebar -->
    <div class="control-sidebar-bg"></div>

</div>
<!-- ./wrapper -->
<script>
    // $("#productTable").dataTable();
    $(document).ready( function () {
        var table = $('#productTable').DataTable({
            "columnDefs": [
                {"className": "dt-center", "targets": "_all"}
            ]
        });
    } );
</script>
</body>
</html>