<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../common/taglibs.jsp"%>

<html>
<head>
<title>Spring MVC Exception</title>
<script type="text/javascript">
function ajaxTestException()
{
	$.ajax( {
		type : 'GET',
		url : '${basePath}/exc/josonException',
		async: false,//禁止ajax的异步操作，使之顺序执行。
		dataType : 'json',
		success : function(data,textStatus){
			alert(JSON.stringify(data));
		},
		error : function(data,textstatus){
			alert(data.responseText);
		}
	});
}
function SystemException()
{
	 window.location.href=" <c:url value="/exc/SystemException"/>";
}
function BusinessException()
{
	 window.location.href=" <c:url value="/exc/BusinessException"/>";
}
</script>
</head>
<body>
	<table>
	 <tr>
	  	 <td style="height:72px;">
	          <div>
            	<input type=button value="Ajax Exception Test" onclick="ajaxTestException();"></input>
           	 </div>
	      </td>
	      	 <td style="height:72px;">
	          <div>
            	<input type=button value="System Exception Test" onclick="SystemException();"></input>
           	 </div>
	      </td>
	      	 <td style="height:72px;">
	          <div>
            	<input type=button value="business Exception Test" onclick="BusinessException();"></input>
           	 </div>
	  </tr>
	</table>
</body>
</html>
