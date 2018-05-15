
""""en este programa se pretende utilizar constructores
AUTOR Manuela Garcia Monsalve
fecha: 10 mayo 2018"""




class empleado: # clase empleado
    def __init__(self, ced, nombre, apellido, salario, deducciones): # se crea el constructor que recibe los parametros.
        """"entre los parametros estan:
        cedula
        nombre
        apellido
        salario
        deducciones
        total salario """
        self.cedula=ced
        self.nombre=nombre
        self.apellido=apellido
        self.salario=salario
        self.deducciones=deducciones



    def totalSalario(self):
        return self.salario-self.deducciones

# funcion para mostrar los datos
    def MostrarDatos(self):
        """se imprime la informacion de los trabajadores en forma de tabla """
        print('{:^10}{:^15}{:^15}{:^10}{:^10}{:^15}'.format(self.cedula,self.nombre,self.apellido,self.salario,self.deducciones,self.totalSalario()))


print("tabla con informacion sobre los empleados ")

"""en esta impresion se muestra la infomacion general de los datos que contiene  cada empleado """
print ('{:^10}{:^15}{:^15}{:^10}{:^10}{:^15}'.format('cedula','nombre','apellido','salario', 'deducciones    ', 'total salario '))

"""se llena la  informacion que contendra cada empelado"""
"""ademas se crearon los objetos """

empleado1= empleado(1234,"jorge", "lopez",13000000,300000)
empleado2= empleado(1234,"andres", "garcia",180000000,900000)
empleado3= empleado(1234,"camila", "perez",134300000,90000)
empleado4= empleado(1234,"sergio", "monsalve",133220000,34500000)
empleado5= empleado(1234,"felipe", "gonzalez",9000000,600000)
empleado6= empleado(1234,"alejandra", "fonnegra",789000000,100000)
empleado7= empleado(1234,"julian", "moralez",122400000,3400000)
empleado8= empleado(1234,"stiven", "otalora",134000000,7800000)
empleado9= empleado(1234,"jose", "caceres",13530000,780000)
empleado10= empleado(1234,"sofia", "peñuela",1338900000,390000)


"""finalmente se invocan la funcion mostrar datos """
empleado1.MostrarDatos()
empleado3.MostrarDatos()
empleado4.MostrarDatos()
empleado5.MostrarDatos()
empleado6.MostrarDatos()
empleado7.MostrarDatos()
empleado8.MostrarDatos()
empleado9.MostrarDatos()
empleado10.MostrarDatos()

