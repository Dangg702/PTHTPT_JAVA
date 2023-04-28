<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleScoreServiceProxyid" scope="session" class="com.ws.example.ScoreServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleScoreServiceProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleScoreServiceProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleScoreServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.ws.example.ScoreService getScoreService10mtemp = sampleScoreServiceProxyid.getScoreService();
if(getScoreService10mtemp == null){
%>
<%=getScoreService10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 27:
        gotMethod = true;
        sampleScoreServiceProxyid.reset();
break;
case 30:
        gotMethod = true;
        int increaseTies30mtemp = sampleScoreServiceProxyid.increaseTies();
        String tempResultreturnp31 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseTies30mtemp));
        %>
        <%= tempResultreturnp31 %>
        <%
break;
case 33:
        gotMethod = true;
        int getTies33mtemp = sampleScoreServiceProxyid.getTies();
        String tempResultreturnp34 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getTies33mtemp));
        %>
        <%= tempResultreturnp34 %>
        <%
break;
case 36:
        gotMethod = true;
        int getLosses36mtemp = sampleScoreServiceProxyid.getLosses();
        String tempResultreturnp37 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getLosses36mtemp));
        %>
        <%= tempResultreturnp37 %>
        <%
break;
case 39:
        gotMethod = true;
        int getWins39mtemp = sampleScoreServiceProxyid.getWins();
        String tempResultreturnp40 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getWins39mtemp));
        %>
        <%= tempResultreturnp40 %>
        <%
break;
case 42:
        gotMethod = true;
        String wins_1id=  request.getParameter("wins51");
        int wins_1idTemp  = Integer.parseInt(wins_1id);
        String losses_2id=  request.getParameter("losses53");
        int losses_2idTemp  = Integer.parseInt(losses_2id);
        String ties_3id=  request.getParameter("ties55");
        int ties_3idTemp  = Integer.parseInt(ties_3id);
        com.ws.example.Score updateScore42mtemp = sampleScoreServiceProxyid.updateScore(wins_1idTemp,losses_2idTemp,ties_3idTemp);
if(updateScore42mtemp == null){
%>
<%=updateScore42mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ties:</TD>
<TD>
<%
if(updateScore42mtemp != null){
%>
<%=updateScore42mtemp.getTies()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">losses:</TD>
<TD>
<%
if(updateScore42mtemp != null){
%>
<%=updateScore42mtemp.getLosses()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wins:</TD>
<TD>
<%
if(updateScore42mtemp != null){
%>
<%=updateScore42mtemp.getWins()
%><%}%>
</TD>
</TABLE>
<%
}
break;
case 57:
        gotMethod = true;
        int increaseLosses57mtemp = sampleScoreServiceProxyid.increaseLosses();
        String tempResultreturnp58 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseLosses57mtemp));
        %>
        <%= tempResultreturnp58 %>
        <%
break;
case 60:
        gotMethod = true;
        int increaseWins60mtemp = sampleScoreServiceProxyid.increaseWins();
        String tempResultreturnp61 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(increaseWins60mtemp));
        %>
        <%= tempResultreturnp61 %>
        <%
break;
case 63:
        gotMethod = true;
        com.ws.example.Score getScore63mtemp = sampleScoreServiceProxyid.getScore();
if(getScore63mtemp == null){
%>
<%=getScore63mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">ties:</TD>
<TD>
<%
if(getScore63mtemp != null){
%>
<%=getScore63mtemp.getTies()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">losses:</TD>
<TD>
<%
if(getScore63mtemp != null){
%>
<%=getScore63mtemp.getLosses()
%><%}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">wins:</TD>
<TD>
<%
if(getScore63mtemp != null){
%>
<%=getScore63mtemp.getWins()
%><%}%>
</TD>
</TABLE>
<%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>