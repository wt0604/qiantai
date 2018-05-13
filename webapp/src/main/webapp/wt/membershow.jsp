
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>Insert title here</title>
</head>
<body>
<%--引入easyui的js文件begin--%>
<link href="<%=path %>/js/easyui_full.css" rel="stylesheet" type="text/css">
<link href="<%=path %>/js/iconfont/iconfont.css" rel="stylesheet" type="text/css">
<link href="<%=path %>/js/theme.default/master.css" rel="stylesheet" type="text/css">
<link href="<%=path %>/js/js/reset.min.css" rel="stylesheet" type="text/css">
<link href="<%=path %>/js/icon.css" rel="stylesheet" type="text/css">
<script type="text/javascript" src="<%=path %>/js/js/jquery.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/iconfont/iconfont.js"></script>
<script type="text/javascript" src="<%=path %>/js/js/jquery.easyui-1.5.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/js/js/insdep-extend.min.js"></script>
<%--end--%>
<table id="wtcheckee" border="1" bgcolor="#0099ff"></table>
<div id="wtcheckaa">
    <a href="javascript:wtaddCheck()" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">新增</a>
</div>
<div id="wtcheckdd"></div>
<script type="text/javascript">
    $(function () {
        membershow();
    })
    function membershow() {
        //查询会员方法
        $('#wtcheckee').datagrid({
            url:'<%=path%>/wt/queryMember',
            columns:[[
                {field:'',title:'',checkbox:true},
                {field:'memberid',title:'主键Id',width:52 },
                {field:'membernum',title:'会员帐号',width:52 },
                {field:'membername',title:'会员姓名',width:52 },
                {field:'memberdj',title:'会员等级',width:52 },
                {field:'memberjf',title:'会员积分 ',width:52 },
                {field:'memberflag',title:'会员状态',width:52},
                {field:'memberdate',title:'创建日期',width:52 },
                {field:'membersex',title:'会员性别',width:52 },
                {field:'memberphone',title:'手机号 ',width:52 },
                {field:'memberidcard',title:'身份证号 ',width:52 }
            ]],
            //分页
            fit:true,
            //fitColumns:true,
            striped:true,
            pagination:true,
            //singleSelect:true,
            ctrlSelect:true,
            pageList:[5,10,15,20],
            toolbar:'#wtcheckaa',

        });
    }

</script>
<script type="text/javascript">

</script>
</body>
</html>
