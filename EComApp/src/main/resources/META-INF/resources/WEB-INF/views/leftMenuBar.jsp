<%@ page import="com.ict.ecomApp.Utils" %>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<aside class="main-sidebar">
    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">
        <!-- Sidebar user panel -->
        <!-- sidebar menu: : style can be found in sidebar.less -->
        <ul class="sidebar-menu tree" data-widget="tree">
            <li class="treeview menu-open">
                <a href="#">
                    <i class="fa fa-laptop "></i>
                    <span>Administration</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu" style="display: block;">
                    <security:authorize access="hasAnyRole('ROLE_ADMIN','ROLE_USER')">
                        <li><a href="/"><i class="fa fa-fw fa-home text-aqua"></i>DashBoard</a></li>
                    </security:authorize>
                    <%--<security:authorize access="hasAnyRole('ROLE_ADMIN')">--%>
                        <%--<li><a href="/upsertUser"><i class="fa fa-fw fa-user-plus text-red"></i>Add User</a></li>--%>
                            <%--<li><a href="/userList"><i class="fa fa-fw fa-th-list text-orange"></i>User Information</a></li>--%>
                    <%--</security:authorize>--%>
                </ul>
            </li>
        </ul>
        <ul class="sidebar-menu tree" data-widget="tree">
            <li class="treeview menu-open">
                <a href="#">
                    <i class="fa fa-laptop "></i>
                    <span>Product</span>
                    <span class="pull-right-container">
              <i class="fa fa-angle-left pull-right"></i>
            </span>
                </a>
                <ul class="treeview-menu" style="display: block;">
                    <security:authorize access="hasAnyRole('ROLE_ADMIN')">
                        <li><a href="/upsertProduct"><i class="fa fa-fw fa-user-plus text-red"></i>Add new Product</a></li>
                        <li><a href="/productList"><i class="fa fa-fw fa-th-list text-orange"></i>View Product List</a></li>
                    </security:authorize>
                </ul>
            </li>
        </ul>



    </section>
    <!-- /.sidebar -->
</aside>