<%@ page contentType="text/html; charset=utf-8"%>

<%@ page import="com.exedosoft.plat.SessionContext"%>

<%






<%	








<style>
.formHeader {
	float: right;
	margin-right: 2px;
	text-align: right;
	height: 60px;
	width: 140px
}

.formHeader .themeLabel {
	text-align: center;
	display: none
}

.formHeader .userName {
	border: 1px;
	border-style: solid;
	border-color: #666666;
	border-style: solid;
	background-color: #FFFFFF;
	margin-top: 5px;;
	text-align: center;
	display: none
}

.formHeader img {
	width: 22px;
	height: 22px;
	background-color: #FFFFFF;
	cursor: pointer;
	border-bottom: 1;
	border-bottom-color: #ffffff;
	border-style: solid
}

.formHeader .themeLabel img {
	width: 18px;
	height: 18px;
	background-color: #FFFFFF;
	cursor: pointer;
	margin-top: 4px;
	border: 1;
	border-color: #ffffff;
	border-style: solid
}
</style>

<script language="javascript">







































































<div class="formHeader"><img
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/user.png" />

<img
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/forward_all.png"
	title="查看消息" /> <img
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/color.png" />

<img
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/help.png"
	title="帮助" /> <img
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/stop.png"
	title="退出" />

<div class="themeLabel"><img value="_lan"
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/lan.gif" />

<img value="_lan"
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/qianlv.gif" />

<img value="_lan"
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/zi.gif" />

<img value="_lan"
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/shenlv.gif" />

<img value="_lan"
	src="<%=request.getContextPath()%>/exedo/webv3/images/main/formHeader/hong.gif" />

<!-- 






<div class="userName">登录人:<%=userName%></div>

</div>

