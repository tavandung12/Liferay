<%@include file="/init.jsp" %>

<%
	ResultRow row = (ResultRow)request.getAttribute(
			WebKeys.SEARCH_CONTAINER_RESULT_ROW);
	TYClass tyClass = (TYClass)row.getObject();
	long groupId = themeDisplay.getLayout().getGroupId();
	String name = TYClass.class.getName();
	String primKey = String.valueOf(tyClass.getPrimaryKey());
	User teacher = (User)request.getAttribute(WebKeys.TY_TEACHER);
%>


<liferay-ui:icon-menu>
	<portlet:actionURL name="addManagementRoleAction" var="addManagementRoleActionURL">
		<portlet:param name="classId" value="<%=primKey %>" />
		<portlet:param name="teacherId" value="<%=String.valueOf(teacher.getUserId())%>" />
	</portlet:actionURL>
	<liferay-ui:icon image="add" message="add" url="<%=addManagementRoleActionURL.toString() %>" />
</liferay-ui:icon-menu>