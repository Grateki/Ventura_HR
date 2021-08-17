<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>

    <title>Registro de candidato</title>

</head><body>
<div class="sidenav">
    <div class="login-main-text">
        <h2>Application<br> Login Page</h2>
        <p>Login or register from here to access.</p>
    </div>
</div>
<div class="main">
    <div class="col-md-6 col-sm-12">
        <div class="login-form">
            <form>
                <div class="form-group">
                    <label>Nome</label>
                    <input type="text" class="form-control" placeholder="Insira aqui seu nome" name="nome">
                </div>

                <div class="form-group">
                    <label>E-mail</label>
                    <input type="text" class="form-control" placeholder="insira aqui seu e-mail" name="email">
                </div>


                <div class="form-group">
                    <label>Data de Nascimento</label>
                    <input type="date" class="form-control" placeholder="Insira sua data de nascimento" name="dataNascimento">
                </div>

                <div class="form-group">
                    <label>CPF</label>
                    <input type="String" class="form-control" placeholder="Insira seu seu cpf" name="cpf">
                </div>


                <div class="form-group">
                    <label>Senha</label>
                    <input type="password" class="form-control" placeholder="insira sua senha" name="senha">
                </div>


                <a><href="/login" button type="submit" class="btn btn-secondary">Efetuar Cadastro</button>
        </div>
    </div>
</div>
</body>
</html>
