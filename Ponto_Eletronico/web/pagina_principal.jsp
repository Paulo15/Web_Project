<%-- 
    Document   : pagina_principal
    Created on : 06/12/2019, 20:51:33
    Author     : Raquel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="listSol" type="java.util.List" scope="request"/>

<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Sistema de Ponto Eletrônico</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/telaprinc.css" rel="stylesheet">
    </head>
    
    <body>
        <nav class="site-header sticky-top py-1 responsive">
            <div class="container d-flex flex-column flex-md-row responsive">
                <img class="responsive" src="https://majestadelogos.com/wp-content/uploads/2019/01/majestade-logos-logo-favicon.png" >
                <a class="py-2 d-none d-md-inline-block responsive">Ponto Eletrônico </a>
                
            </div>
        </nav>
        
        <div>
            <h3> Bem Vindo ao seu sistema de ponto eletrônico! </h3>
            <h6> Verifique abaixo o resumo de suas últimas solicitações: </h6>            
        </div>
        
        
        <div>
            <form action="form.html?MAX_FILE_SIZE=4194304">
            <button class="btn btn-primary btn-login" type="submit">Nova Solicitação</button>
            </form>
        </div>
        
        <table class="table responsive table-bordered">
                <tbody>
                   
                <tr>
                    <td class="col-4">Nome Solicitante</td>
                    <td class="col-4">Tipo Solicitação</td>
                    <td class="col-4">Status Solicitação</td>
                </tr>
                
                <c:forEach var="solicitacao" items="${listSol}">
                <tr>
                    <td> ${solicitacao.id}  </td>
                    
                    <c:choose>
                        <c:when test = "${solicitacao.tipoSolicitacao == 1}">
                            <c:set var="tipoSol" value="Férias"/>	
                        </c:when>
                        <c:when test = "${solicitacao.tipoSolicitacao == 2}">
                            <c:set var="tipoSol" value="Ajuste de Ponto"/>	
                        </c:when>
                        <c:when test = "${solicitacao.tipoSolicitacao == 3}">
                            <c:set var="tipoSol" value="Justificar Falta"/>	
                        </c:when>
         
         
                        <c:otherwise></c:otherwise>
                    </c:choose>
                    <td> ${tipoSol}  </td>
                    
                    <c:choose>
                        <c:when test = "${solicitacao.etapa == 1}">
                            <c:set var="etapaSol" value="Aguardando Aprovação"/>	
                        </c:when>
                        <c:when test = "${solicitacao.etapa == 2}">
                            <c:set var="etapaSol" value="Finalizado"/>	
                        </c:when>
                    
                        <c:otherwise></c:otherwise>
                    </c:choose>
                    
                    
                    
                    
                    <td> ${etapaSol} </td>
                    <td>     <a href="SolicitacaoServlet?id=${solicitacao.id}?Aprovado=1">Aprovar</a>
                            <a href="SolicitacaoServlet?id=${solicitacao.id}?Aprovado=0">Reprovar</a></td>
                </tr>
                </c:forEach>
                
                
                </tbody>
        </table>
        
    </body>
</html>
