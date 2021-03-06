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
            <center><h3 style="color: #00a157">
                <strong>Dashboard: Statistics of products</strong>
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
                                        <center><h1 style="color: orangered; size: A5"><strong>Total Sell:${sell}</strong></h1></center>
                                    </div>
                                    <div class="col-sm-12">
                                        <center><h4 style="color:deepskyblue">Our Top 5 Profitable Products</h4></center>
                                        <table id="dashTable" class="table table-striped">
                                            <thead>
                                            <tr>
                                                <th>Serial No</th>
                                                <th>Product Name</th>
                                                <th>Profit Percentage</th>
                                                <th>Product Type</th>
                                                <th>Price</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <c:forEach items="${maxprofitList}" var="maxp" varStatus="status">
                                                <tr>
                                                    <td>${status.index+1}</td>
                                                    <td>${maxp.name}</td>
                                                    <td>${maxp.pp}%</td>
                                                    <td>${maxp.ptype}</td>
                                                    <td>${maxp.price}</td>
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
    // $("#dashTable").dataTable();
    $(document).ready( function () {
        var table = $('#dashTable').DataTable({
            "columnDefs": [
                {"className": "dt-center", "targets": "_all"}
            ]
        });
    } );
</script>
</body>
</html>