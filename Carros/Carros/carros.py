"""esta es una aplicacion para usar los carros y generar acciones"""
# creado por Manuela García Monsalve

import time
class Carros:
    marca=""
    modelo=0
    tamano=""
    precio=0


    """como crear un metodo
    sintexis del metodo 
    def Nombre_Metodo(self)
    luego las acciones
    """
    def MostrarDatos(self):
        print("la marca del carro es : " ,self.marca)
        print("el modelo del carro es : " ,self.modelo)
        print("el tamaño del carro es : ", self.tamano)
        print("el precio del carro es : ", self.precio)
    def ApagarCarro(self):
        print("el carro se ha apagado")

    def EncenderCarro(self):
            print("el carro ha encendido")

    def AcelerarCarro(self, velocidad):
        for i in range (0, velocidad,2):
            print("el carro ha acelerado hasta : " ,i , "km/h" )
            time.sleep(0.2)

    def FrenarCarro(self, velocidad, frenando):
        for i in range (velocidad, frenando, -2):
            print("el carro esta frenando: ", frenando, "km/h")
            time.sleep(0.4)


clasico=Carros()
clasico.marca="ferrari"
clasico.modelo=2018
clasico.tamano="pequeno"
clasico.precio=5000000000
clasico.MostrarDatos()
clasico.EncenderCarro()
clasico.AcelerarCarro(60)
clasico.FrenarCarro(60,20)
clasico.ApagarCarro()
