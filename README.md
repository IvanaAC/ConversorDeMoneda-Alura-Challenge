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
<h2>1-Convertir moneda</h2>
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

<h3>Aquí tiene algunas divisas para probar: </h3>
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

<h3>¿Qué ocurre si ingresas una moneda que no se encuentre en el listado de la API?</h3>
<p>En ese caso, obtendrás el siguiente mensaje: </p>
<img height=140 src="https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/de80a34a-ea9f-4c8e-93c0-6ed9d2bbeb58">

<h2>2-Mostrar el Historial de Conversiones</h2>
<p>En caso de que quieras ver nuevamente las conversiones que has realizado, entonces 
selecciona la <strong>opción 8</strong>, de ésta manera podrás observar
los cambios de moneda que has realizado.</p>
<img src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/978ec2fd-0636-4336-9835-88f0215bd4a7">

<p>Si no realizaste ninguna conversión, recibirás otro mensaje.</p>
<img src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/7dc03936-6891-4808-af54-7a69bc78abb0">

<h2>3-Guardar el Historial de Conversiones</h2>
<p>Con ésta opción puedes guardar el historial en dos archivos, uno en formato .json y otro 
en formato .txt.
<br>Ambos se guardan dentro de la carpeta donde copiaste el repositorio con los archivos fuente.</p>
<img height=70 src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/06e26efd-e02a-4fc5-b0f0-f290cd7f7a01">
<br><img  height=350 src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/7e62e711-3fec-4a0d-a8e2-8c25092fc328">

<h2>4-Opción inválida</h2>
<p>¿Qué sucede si elijes una opción que no es valida? Saldrá un mensaje que 
  te permitirá volver a ingresar otra opción.</p>
<img src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/30863eba-93c3-4cb5-be52-f94a839a4855">

<h2>5-Salir de la aplicacíon</h2>
<p>Cuando decidas salir de la aplicacion, solo debes seleccionar la <strong>opción 10</strong>.</p> 
<img height=90 src= "https://github.com/IvanaAC/ConversorDeMoneda-Alura-Challenge/assets/144395133/0cf98250-daa4-46a1-955c-cfc753f1dff4">
