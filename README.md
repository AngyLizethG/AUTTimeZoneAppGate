# AUTTimeZoneAppGate

Se realiza la automatización de pruebas para el servicio Get http://api.geonames.org/timezoneJSON?formatted=true&lat=&lng=1&username=, 
se desea validar y verificar el correcto funcionamiento del servicio, las validaciones tenidas en cuenta son:

•	Validación de parámetros de entrada latitud y longitud

•	Validar usuarios validos he invalidos

•	Validar información de coordenadas según parámetros de entrada latitud y longitud


# Objetivo:

 de la automatización el mejorar los tiempos de certificación de los servicios. 


# Información técnica:
 
Construida con patrón de diseño screenplay,  para entendimiento en los reportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven, los consumos de los servicios se realizan con rest assured. 


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

se adjunta tambien una carpeta compartida en drive la cual contiene un archivo "Evidencias Jenkis.ppt" con videos de evidencias que muestran las notificaciones que se generan en Jenkis por push hecho en el proyecto.
Para ver los videos descarga el archivo "Evidencias Jenkis.ppt" de la url https://drive.google.com/drive/folders/1sqVWiY1qCkYbQBVUo6PBjQt-_x3XBpxm?usp=sharing una vez descargado el archivo, abrir el documento y reproducir cada video de cada ppt.



# Ejecutando las pruebas 

Para la ejecución del proyecto debe tener presente que la variable de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas que se encuentra en el archivo POM.


Las pruebas se pueden ejecutar por medio de la clase:


•	serviceTimeZoneRuner ubicada en ./AUTTimeZoneAppGate/src/test/java/geonames/org/certification/runners/serviceTimeZoneRuner.java


# Ver resultados

Para observa los resultados de nuevas ejecuciones, debe ejecutar la automatización y posterior a esto, observar las evidencias de las pruebas ubicadas en la  ruta \AUTTimeZoneAppGate\target\site\serenity\index.html, allí buscamos el archivo index HTML que se encuentra en en la carpeta, generalmente salen 2 archivos index, se debe abrir los 2 y observar cual de esos 2 archivo es el archivo que tiene la gráfica de torta estadística, el archivo que contiene la gráfica es el informe de los resultados de la última ejecución.


# Nota aclaratoria:

Normalmente no se deberían subir los archivos de la carpeta target al repositorio, pero para efectos de que puedan observar la evidencia de la ejecución que realice la subo.


# Contribuyente:

Angy Lizeth Giraldo Legarda
Ingenieraangy@gmail.com

Gracias. :)
