<h1 align="center">CHALLENGE CONVERSOR</h1>
<h2>DESCRIPCIÓN</h2>
<p>El Conversor de Monedas es una aplicación Java diseñada para realizar conversiones
  de diferentes monedas utilizando tasas de cambio actuales. Además, permite mantener 
  un historial de conversiones realizadas y guardar este historial en archivos JSON y de texto.
</p> 

<h2>CARACTERÍSTICAS</h2>
<p>Esta aplicación te permite:</p>
<ul>
  <li>Realizar la conversión de monedas entre diferentes pares de divisas.</li>
  <li>Ingresar pares de divisas personalizados.</li>
  <li>Visualizar el "Historial de conversiones".</li>
  <li>Guardar el "Historial de conversiones" en archivos JSON y de texto.</li>
</ul>

<h2>REQUISITOS PARA SU USO</h2>
<p>Debes contar con:</p>
<ul>
  <li>Java 17 o superior.</li>
  <li>Librerías externas:</li>
    <ul>
      <li>Gson para manejo de archivos JSON.</li>
      <li>HttpClient para solicitudes HTTP.</li>
      <li>JsonParser para parseo de respuestas JSON.</li>
    </ul>
    <li>Una clave Api de  ExchangeRate-Api, puedes obtenerla de forma 
      gratuita en www.exchangerate-api.com . </li>
</ul>

<h2>EJECUCIÓN DEL PROGRAMA</h2>
<p>Para usar el Conversor debes: </p>
<ol>
  <li>Copiar el repositorio o descargar los archivos fuente del programa.</li>
  <li>Asegúrate de tener las librerías necesarias en tu entorno de desarrollo.
    Puedes añadirlas a tu proyecto mediante un gestor de dependencias o 
    agregarlas manualmente</li>
  <li>Después, abre el archivo de la clase "Solicitud" en tu IDE de Java.
    <br>En apiKey debes reemplazar “Aquí va tu clave” con la clave API que 
    has generado en ExchangeRate-Api.</li>
  <li>Finalmente, abre el archivo de la clase "Principal" y ejecútalo.</li>  
</ol>

<h2>INTERACTUANDO CON LA APLICACIÓN</h2>
<h3>1-Convertir moneda</h3>
<p>El programa presenta el siguiente menú interactivo:</p>
<img width=300 src="https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/aac6c0f5-4417-45b1-b576-86cd1b91a2ef">

<p>Para seleccionar las opciones debes ingresar el número correspondiente
  y seguir las instrucciones.
  <br><br>Las<strong> opciones del 1 al 6</strong> tienen divisas predeterminadas, si seleccionas
  una de ellas obtendrás un resultado similar a estos: </p>
<img height=80 src="https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/f437ecda-17f8-43a8-848d-f91473ccda86">
<img height=80 src="https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/9a422a07-2cf8-4532-ac80-4dc159f9fa4b">
<p>Con la <strong>opción 7</strong> puedes utilizar divisas que no se encuentran entre las predeterminadas.
  <br>Ingresa las divisas y la cantidad a convertir cuando la aplicación lo solicite. 
  <br>Cuentas con la posibilidad de escribir las divisas en mayúsculas o minúsculas.</p>
<img height=140 src="https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/b6aac2b7-c653-4d28-b1a3-8430541f86ca">
<p><br>Aquí tiene algunas divisas para probar: </p>
<ul>
  <li>AUD	- Australian Dollar - Australia</li>
  <li>CRC - Costa Rican Colon - Costa Rica</li>
  <li>CUP - Cuban Peso - Cuba</li>
  <li>HNL - Honduran Lempira - Honduras</li>
  <li>JPY - Japanese Yen - Japan</li>
  <li>KRW - South Korean Won - South Korea</li>
</ul>
<p>Si deseas hacer pruebas con otras monedas, puedes encontrar más códigos en la página www.exchangerate-api.com , 
  en la sección Supported Currencies . </p>

<p>¿Qué ocurre si ingresas una moneda que no se encuentre en el listado de la API?
<br>En ese caso, obtendrás el siguiente mensaje: </p>






