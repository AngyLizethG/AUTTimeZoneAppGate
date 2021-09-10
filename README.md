# AUTTimeZoneAppGate

Se realiza la automatización de pruebas para el servicio Get http://api.geonames.org/timezoneJSON?formatted=true&lat=LATITUD&lng=LONGI se desea validar y verificar el correcto funcionamiento del servicio, las validaciones tenidas en cuenta son:

•	Validación de parámetros de entrada latitud y longitud

•	Validar usuarios validos he invalidos

•	Validar información de coordenadas según parámetros de entrada latitud y longitud.


# Objetivo:

Mejorar los tiempos de certificación del servicio, permitiendo ejecutar los escenarios de prueba, para la verificación del correcto comportamiento del servicio. 


# Información técnica:
 
La automatización esta implementada con patrón de diseño screenplay, para mejor entendimiento del negocio, los escenarios estan escritos en Gherkin en idioma ingles ya que el ingles el el idima universal, la automatización esta implementada en BDD, con lenguaje de programación java, se utilizo Cucumber y serenity BDD para la generacion de los reportes de evidencias. El gestor de dependencias que se utilizo fue Maven y para consumir el servicio se utilizo rest assured. 


# Pre-requisitos:

Para la ejecución de este proyecto debemos tener presente se debe de tener instalado el JDK de java y las variables de entorno, las cuales son:
1.	JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files\Java\jdk1.8.0_281
java version "1.8.0_281"
2.	Configurar en las variable de entorno en el path, en el cual se debe agregar el apache-maven se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en la variable MAVEN  home:  D:\Maven oficial\apache-maven-3.6.3-bin\apache-maven-3.6.3\bin
3. el proyecto se puede abrir en Intellij o Eclipse.
4. Descargar las dependencias establecidas en el archivo POM.


# Evidencia de ejecución de la automatización:

Adicional se adjunta en el repositorio una evidencia de ejecución, el reporte de serenity generado con los resultados.
Esta evidencia se encuentra en:  


AUTTimeZoneAppGate\Evidencias resultados de pruebas\target\site\serenity\Resultados.html


Abrir el archivo Resultados.html con un navegador web.


# Evidencia Jenkis:

Se adjunta tambien una carpeta compartida en drive la cual contiene un archivo "Evidencias Jenkis.ppt" con videos de evidencias que muestran las notificaciones que se generan en Jenkis por push hecho en el proyecto.
Para ver los videos descarga el archivo "Evidencias Jenkis.ppt" de la url https://drive.google.com/drive/folders/1sqVWiY1qCkYbQBVUo6PBjQt-_x3XBpxm?usp=sharing una vez descargado el archivo, abrir el documento y reproducir cada video de cada ppt.



# Ejecutando las pruebas 

Para la ejecución del proyecto debe tener presente que la variable de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas que se encuentra en el archivo POM.


Las pruebas se pueden ejecutar por medio de la clase:


•	serviceTimeZoneRuner ubicada en ./AUTTimeZoneAppGate/src/test/java/geonames/org/certification/runners/serviceTimeZoneRuner.java


# Ver resultados

Para observa los resultados de nuevas ejecuciones, debe ejecutar la automatización y posterior a esto, observar las evidencias de las pruebas ubicadas en la  ruta \AUTTimeZoneAppGate\target\site\serenity\index.html, luego buscar el archivo index.html que se encuentra en en la carpeta, generalmente salen 2 archivos index, se debe abrir los 2 y observar cual de esos 2 archivos es el archivo que tiene la gráfica de torta estadística. El archivo que contiene la gráfica es el informe de los resultados de la última ejecución.


# Nota aclaratoria:

Normalmente no se deberían subir los archivos de la carpeta target al repositorio, pero para efectos de que se puedan observar la evidencia de la ejecución que realice la subo.


# Contribuyente:

Angy Lizeth Giraldo Legarda
Ingenieraangy@gmail.com

Gracias. :)
