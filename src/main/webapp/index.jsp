<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>CalculadoraWeb</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    </head>
    <body style="margin: 5%">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
        <form name="form1" action="miServlet" method="post">
            <h1>Bienvenido a la Calculadora Web</h1>
            <div class="mb-3">
                <label for="numero1" id="numero1" class="form-label">Ingrese un numero</label>
                <input type="text" name="numero1" class="form-control" id="numero1" placeholder="Numero 1">
            </div>
            <div class="mb-3">
                <label for="numero2" id="numero2" class="form-label">Ingrese un segundo numero</label>
                <input type="text" name="numero2" class="form-control" id="numero2" placeholder="Numero 2">
            </div>
            <div>
                <button type="submit" name="operacion" class="btn btn-primary" value="suma">Suma</button>||
                <button type="submit" name="operacion" class="btn btn-primary" value="resta">Resta</button>||
                <button type="submit" name="operacion" class="btn btn-primary" value="multiplicacion">Multiplicacion</button>||
                <button type="submit" name="operacion" class="btn btn-primary" value="division">Division</button>
            </div>
            <br/>
            <br/>
            <p>Resultado: ${calculadora1}</p>
        </form>
    </body>
</html>
