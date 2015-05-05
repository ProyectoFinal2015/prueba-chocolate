# Prueba de concepto del Framework Chocolate

## Requerimientos
- Java 8
- [Scala IDE](http://scala-ide.org/download/current.html) 2.10.5 me funciona a mi
- [m2eclipse](http://eclipse.org/m2e/)
- [m2eclipse-scala](https://github.com/sonatype/m2eclipse-scala)

O pueden seguir [este tutorial](https://docs.google.com/document/d/1LHkPwi6tkWbkkMK3TkkPwA-5_ZsCYx3Yoa9hUemEByk/pub) para tener todo el Eclipse de una! 
No hace falta que se bajen todos los proyectos para correrlo, pero seguro que está bueno ya tenerlos por las dudas.



## Cómo correr el proyecto
Una vez bajado el proyecto, mavenizado y actualizado con el POM:
- Ir a Run Configurations...
- New Scala Application
 - En la sección Main
    - Project: PruebaChocolate
    - Main class: org.uqbar.chocolate.launchers.DesktopGameLauncher
    - Tener seleccionado todos los includes para que busque el main en las dependencias de Maven.
 - En la sección Arguments
    - Program arguments: org.proyecto.pruebachocolate.MainApp (es donde está nuestro _Game_)
    - VM Arguments: -Dsun.java2d.opengl=true
- Apply (para que se guarde en launches)
- Run
