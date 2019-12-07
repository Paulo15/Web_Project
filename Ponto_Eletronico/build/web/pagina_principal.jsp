<%-- 
    Document   : pagina_principal
    Created on : 06/12/2019, 20:51:33
    Author     : Raquel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                
                <tr>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                                        
                </tr>
                
                <tr>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    
                </tr>
                
                <tr>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    
                </tr>
                
                <tr>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    <td> ${Carrinho.total} </td>
                    
                </tr>
                
                </tbody>
        </table>
        
    </body>
</html>
