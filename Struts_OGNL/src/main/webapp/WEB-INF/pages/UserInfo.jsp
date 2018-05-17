<%@ page contentType="text/html; charset=UTF-8"%>
 <%@ taglib prefix="s" uri="/struts-tags"%>
 
<html>
<head>
<title>User Info</title>
</head>
  <style type="text/css">
.error-msg {
  color: red;
}
 
table.list {
  border: 1px solid #cbcbcb;
  border-collapse: collapse;
}
 
table.list td, th {
  border-left: 1px solid #cbcbcb;
  padding-left: 10px;
  padding-right: 10px;
}
 
table.list thead {
  background-color: #cbcbcb;
}
</style>
<body>
    <h2>Hello, ${loginedUsername}...!</h2>
    
    <table class="list">
      <thead>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Sex</th>
          <th>Email</th>
          <th>Phone</th>
          <th>Address</th>
          <th>Delete</th>
        </tr>
      </thead>
      <!-- show list student -->
      <tbody>
        <s:iterator value="listStudents" id="student" status="st">
          <tr>
            <td><s:property value="#student.id" /></td>
            <td><s:property value="#student.name" /></td>
            <td><s:property value="#student.sex" /></td>
            <td><s:property value="#student.email" /></td>
            <td><s:property value="#student.phone" /></td>
            <td><s:property value="#student.address" /></td>
            <td><s:checkbox name="listStudents[%{#st.index}].delFlag"
               value="%{listStudents[#st.index].delFlag}" /></td>
            <!-- save listStudents -->
            <s:hidden name="listStudents[%{#st.index}].id"
                      value="%{#student.id}" />
            <s:hidden name="listStudents[%{#st.index}].name"
                      value="%{#student.name}" />
            <s:hidden name="listStudents[%{#st.index}].sex"
                      value="%{#student.sex}" />
            <s:hidden name="listStudents[%{#st.index}].email"
                      value="%{#student.email}" />
            <s:hidden name="listStudents[%{#st.index}].phone"
                      value="%{#student.phone}" />
            <s:hidden name="listStudents[%{#st.index}].address"
                      value="%{#student.address}" />
          </tr>
        </s:iterator>
      </tbody>
    </table>
</body>
</html>