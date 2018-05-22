class emcapsulamiento: # clase regiatroa
    def __init__(self, usuario, nombre, apellido, _cedula, _clave, _email): # se crea el constructor que recibe los parametros.
        """"entre los parametros estan:
        cedula
        nombre
        apellido
        salario
        deducciones
        total salario """
        self.usuario= usuario
        self.cedula=_cedula
        self.nombre= nombre
        self.apellido=apellido
        self.clave= _clave
        self.email=_email



# se crean los metodos set y get

    def getUsuario(self):
        return self.usuario

    def setUsuario(self, usuario):
        self.usuario = usuario

    def getCedula(self):
        return self.cedula

    def setcedula(self, cedula):
        self.cedula = cedula

    def getNombre(self):
        return self.nombre

    def setNombre(self, nombre):
        self.nombre = nombre

    def getApellido(self):
        return self.apellido

    def setApellido(self, apellido):
        self.apellido = apellido

    def getClave(self):
        return self.clave

    def setClave(self, clave):
        self.clave = clave

    def getEmail(self):
        return self.email

    def setEmail(self, email):
        self.deducciones = email

    def MostrarDatos(self):
        print("-------------------------------")
        print("los datos de usuario son: ")
        print("nombre del usuario:  " , self.usuario)
        print("nombre de la persona: ", self.nombre, self.apellido)
        print("la cedula de la persona :" , self.cedula)
        print("la clave de usuario es:", self.clave)
        print("el email de usuario:", self.email)
        print("\n")


usu1= emcapsulamiento("JOR2323","jorge","lopez","1273868246","jorgeu236","jorge@gmail.com")
usu2= emcapsulamiento("danil91","daniel","paez","347328743242","daniel8123685","danielm@gmail.com")
usu3= emcapsulamiento("manuela9812","manuela","garcia ","91347792642","manuela328o74qyw9e","manu1012@gmail.com")
usu4= emcapsulamiento("no4ra","nora","garcia","9817498234","norii63424723","nora672@gmail.com")
usu5= emcapsulamiento("luisito456","luis","perez","193492379432","jdashd12357123","luisi@gmail.com")

usu1.MostrarDatos()
usu2.MostrarDatos()
usu3.MostrarDatos()
usu4.MostrarDatos()
usu5.MostrarDatos()








