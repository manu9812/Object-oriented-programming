"""'r' modo solo de lectura (de la palabra en ingles 'read')
'w' modo solo de escritura (de la palabra en ingles 'write')
'a' modo de adición de datos (de la palabra en ingles 'append')


El modo r permite la opción del carácter '+' para acciones simultáneas de lectura y escritura,
y el carácter 'b' para intercambiar información en modo binario. 
Al omitir este argumento se asume que el archivo está en modo de lectura. 
El modo binario de intercambio de información no lo discutiremos en esta sección, 
sólo usaremos el modo de información formateado que podremos leer directamente
desde un editor de texto cualquiera.
Veamos un ejemplo para crear un archivo y escribir en él una información:"""
myf1 = open('archivo1.txt','w')
myf1.write('Este es el primer renglo \n y el segundo.')
myf1.close()




