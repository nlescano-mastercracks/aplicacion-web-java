# aplicacion-web-java

## Universidad Arturo Jaureche

### Alumno: Nicolas Lescano

### Docente:Alejandro Vazquez

## Maven

**Maven es una herramienta para la gestion y construccionde proyectos java**
Una de sus funciones es de compilar las aplicacion con comando:
"mvn compile"
Esto Compilara el codigo y lo almacena en la carpeta target
Para generar el jar se utiliza el comando
"mvn package"
Este comando lo que hace es compilar si es necesario y si no hay fallos ,creara el jar
"mvn install"
Sirve para compilar y instalar localmente en nuestro repositorio maven el jar de nuesta app
"mvn clean install"
Trabaja igual que el anteriir pero este boraa y recompila de nuevo jar
Otra ventaja de trabajar con maven es el tema de los repositoris jar
Cuando se instala maven en nuestra maquina lo que hacemos es crearnos nuestro repositorio local
Y por ultimo maneja la administracion de dependencia de procecto mediantes jar

## Git

### Para poder subir un pryecto a git hay que segir los siguientes paso

1. Crear cuenta en el repositorio remoto
2. Ejecutar el comando "git init" en la raiz de nuestro proyecto
3. Crear el archivo " .gitignore "
4. Agregar todos los archivos que vamos a subir con " git add "
5. Confirmar los archivo y agregarle un mensaje " git commit -m "
6. Ahora se tiene que conectar con el repositorio remoto con el local " git remote add origin URL "
7. Subir los cambios confirmados a repositorio remoto " git push -u origin rama "
