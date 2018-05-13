<%--
  Created by IntelliJ IDEA.
  User: 王涛
  Date: 2018/5/13
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="data" method="post" enctype="multipart/form-data">
    <input type="hidden" name="memberid" value="${member.memberid}" >
    <table align="center">
        <tr>
            <td>会员帐号</td>
            <td><input type="text" class="easyui-textbox" value="${member.membernum}" name="membernum"  required="true"></td>
        </tr>
        <tr>
            <td>会员姓名</td>
            <td><input type="text" class="easyui-textbox" value="${member.membername}" name="membername" required="true">
            </td>
        </tr>
        <tr>
            <td>会员等级</td>
            <td><input type="text" class="easyui-textbox" value="${member.memberdj}" name="memberdj" required="true">
            </td>
        </tr>
        <tr>
            <td>会员积分</td>
            <td><input type="text" class="easyui-textbox" value="${member.memberjf}" name="memberjf" required="true">
            </td>
        </tr>
        <tr>
            <td>会员状态</td>
            <td>
                <input type="radio" name="memberflag" value="1"  ${member.memberflag==1?'checked':'' }>正常
                <input type="radio" name="memberflag" value="2" ${member.memberflag==2?'checked':'' }>锁定
            </td>
        </tr>

        <tr>
            <td>创建日期</td>
            <td><input type="text" class="easyui-datebox" value="${member.memberdate}" id="memberdate" required="true"  name="memberdate" required="true"></td>
        </tr>
        <tr>
            <td>会员性别</td>
            <td>
                <input type="radio" name="membersex" value="1"  ${member.membersex==1?'checked':'' }>男
                <input type="radio" name="membersex" value="2" ${member.membersex==2?'checked':'' }>女
            </td>
        </tr>
        <tr>
            <td>手机号</td>
            <td><input type="text" class="easyui-textbox" value="${member.memberphone}" name="memberphone" required="true">
            </td>
        </tr>
        <tr>
            <td>身份证号</td>
            <td><input type="text" class="easyui-textbox" value="${member.memberidcard}" name="memberidcard" required="true">
            </td>
        </tr>
    </table>
</form>

<script type="text/javascript">

    $("#memberdate").datebox({
        validType:'date'
    });

</script>
</body>
</html>
