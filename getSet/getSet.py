""""en este programa se pretende utilizar constructores
AUTOR Manuela Garcia Monsalve
fecha: 10 mayo 2018"""



"""" se crea la clase empleados ademas de ello se definen ciertos atributos que tendran cada uno de los empleados 
tambien se crea el constructor de dichos parametros"""
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



# se crean los metodos set y get
    def getCedula(self):
        return self.cedula

    def setcedula(self, ced):
        self.cedula = ced

    def getNombre(self):
        return self.nombre

    def setNombre(self, nom):
        self.nombre = nom

    def getApellido(self):
        return self.apellido

    def setApellido(self, ape):
        self.apellido = ape

    def getSalario(self):
        return self.salario

    def setSalario(self, sal):
        self.salario = sal

    def getDeducciones(self):
        return self.deducciones

    def setDeducciones(self, deduc):
        self.deducciones = deduc


    """funcion para calcular el salario total de un empleado"""
    def totalSalario(self):
        return self.salario-self.deducciones

     #metodo para mostrar los datos
    def MostrarDatos(self):
        """se imprime la informacion de los trabajadores en forma de tabla """
        print('{:^10}{:^15}{:^15}{:^10}{:^10}{:^15}'.format(self.cedula,self.nombre,self.apellido,self.salario,self.deducciones,self.totalSalario()))


print("tabla con informacion sobre los empleados ")

"""en esta impresion se muestra la infomacion general de los datos que contiene  cada empleado """
print ('{:^10}{:^15}{:^15}{:^10}{:^10}{:^15}'.format('cedula','nombre','apellido','salario', 'deducciones    ', 'total salario '))

"""se llena la  informacion que contendra cada empelado"""
"""ademas se crearon los objetos """

empleado1= empleado(1234,"jorge", "lopez",13000000,300000)
empleado2= empleado(8834,"andres", "garcia",180000000,900000)
empleado3= empleado(7686,"camila", "perez",134300000,90000)
empleado4= empleado(4567,"sergio", "monsalve",133220000,34500000)
empleado5= empleado(9865,"felipe", "gonzalez",9000000,600000)



"""finalmente se invocan la funcion mostrar datos """
empleado1.MostrarDatos()
empleado3.MostrarDatos()
empleado2.MostrarDatos()
empleado4.MostrarDatos()
empleado5.MostrarDatos()
print("\n")



#se actualizan los datos de los empleados


print("LOS DATOS ACTUALIZADOS DEL EMPLEADO 1 SON :")
empleado1.setcedula(9332)
empleado1.setNombre("andres")
empleado1.setApellido("garcia")
empleado1.setSalario(1000000)
empleado1.setDeducciones(10000)
print("la nueva cedula del empleado 1 es : " , empleado1.getCedula())
print("el nuevo nombre del empleado 1 es : " , empleado1.getNombre())
print("el nuevo apellido del empleado 1 es : " , empleado1.getApellido())
print("el nuevo salario del empleado 1 es : " , empleado1.getSalario())
print("las nuevas deducciones del empleado 1 son : " , empleado1.getDeducciones())
print("\n")


print("LOS DATOS ACTUALIZADOS DEL EMPLEADO 2 SON :")
empleado2.setcedula(89427)
empleado2.setNombre("   daniela")
empleado2.setApellido(" Gomez")
empleado2.setSalario(15000000)
empleado2.setDeducciones(150000)
print("la nueva cedula del empleado 2 es : " , empleado2.getCedula())
print("el nuevo nombre del empleado 2 es : " , empleado2.getNombre())
print("el nuevo apellido del empleado 2 es : " , empleado2.getApellido())
print("el nuevo salario del empleado 2 es : " , empleado2.getSalario())
print("las nuevas deducciones del empleado 2 son : " , empleado2.getDeducciones())
print("\n")


print("LOS DATOS ACTUALIZADOS DEL EMPLEADO 3 SON :")
empleado3.setcedula(23462)
empleado3.setNombre("felipe")
empleado3.setApellido("londoño")
empleado3.setSalario(4500000)
empleado3.setDeducciones(45000)
print("la nueva cedula del empleado 2 es : " , empleado3.getCedula())
print("el nuevo nombre del empleado 2 es : " , empleado3.getNombre())
print("el nuevo apellido del empleado 2 es : " , empleado3.getApellido())
print("el nuevo salario del empleado 2 es : " , empleado3.getSalario())
print("las nuevas deducciones del empleado 2 son : " , empleado3.getDeducciones())
print("\n")

print("LOS DATOS ACTUALIZADOS DEL EMPLEADO 4 SON :")
empleado4.setcedula(11839)
empleado4.setNombre("Julian")
empleado4.setApellido("diaz")
empleado4.setSalario(1500000)
empleado4.setDeducciones(105000)
print("la nueva cedula del empleado 4 es : " , empleado4.getCedula())
print("el nuevo nombre del empleado 4 es : " , empleado4.getNombre())
print("el nuevo apellido del empleado 4 es : " , empleado4.getApellido())
print("el nuevo salario del empleado 4 es : " , empleado4.getSalario())
print("las nuevas deducciones del empleado 4 son : " , empleado4.getDeducciones())
print("\n")

print("LOS DATOS ACTUALIZADOS DEL EMPLEADO 5 SON :")
empleado5.setcedula(39475)
empleado5.setNombre("Nancy")
empleado5.setApellido("Monsalve")
empleado5.setSalario(8000000)
empleado5.setDeducciones(80000)
print("la nueva cedula del empleado 5 es : " , empleado5.getCedula())
print("el nuevo nombre del empleado 5 es : " , empleado5.getNombre())
print("el nuevo apellido del empleado 5 es : " , empleado5.getApellido())
print("el nuevo salario del empleado 5 es : " , empleado5.getSalario())
print("las nuevas deducciones del empleado 5 son : " , empleado5.getDeducciones())
print("\n")


