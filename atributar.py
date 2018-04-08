class atributar: # se crea una clase llamada atributar

    #ESTE ES MI PRIMER PROGRAMA DE FPOO
    #DONDE VOY A CREAR OBJETOS (INSTANCIAR)
    #Y ADEMAS VOY A CREAR ATRIBUTOS




    #2 abril 2018
   # @author Manuela Garcia Maonsalve



    def __init__(self, marca: object, modelo: object, color: object, tamaño: object, precio: object) -> object:
        self.marca = marca   # se definen los atributos que poseeran cada uno de los objetos relacionados a los tipos de carros
        self.modelo = modelo
        self.color= color
        self.tamaño = tamaño
        self.precio= precio



camion= atributar('foton', 2017, 'rojo','grande',140000000) # se crea el primer obejto llamado camion
                                                            # a este objeto se le inicializan los atributos ya creados para la clase
print("----------------------------CAMIÓN--------------------------------")
print("la marca del camion es: " + camion.marca)  # se imprime la marca del camion
print("el modelo del camion es: " , camion.modelo)  # se imprime el modelo del camion
print ("el color del  camion es: ",  camion.color)   # se imprime el color del camion
print("el tamaño del camion es: ", camion.tamaño)    # se imprime el tamaño del camion
print("el precio del camion es: " , camion.precio)    # se imprime el precio del camion
print("\n")



campero= atributar('toyota', 2016, 'negro','pequeño',150000000)  # se crea el segundo objeto llamado campero
                                                                 # a este objeto se le inicializan los atributos ya creados para la clase
print("----------------------------CAMPERO--------------------------------")
print("la marca del campero es: " + campero.marca)  # se imprime la marca del campero
print("el modelo del campero es: " , campero.modelo)  # se imprime el modelo del campero
print ("el color del  campero es: ",  campero.color)   #  se imprime el color del campero
print("el tamaño del campero es: ", campero.tamaño)    # se imprime el tamaño del campero
print("el precio del campero es: " , campero.precio)   # # se imprime el precio del campero
print("\n")


automovil= atributar('nissan', 2018, 'blanco','pequeño',99000000)   # se crea el tercer objeto llamado automovil
                                                                # a este objeto se le inicializan  los atributos ya creados poara la clase
print("----------------------------AUTOMOVIL--------------------------------")
print("la marca del automovil es: " + automovil.marca)    # se imprime la marca del automovil
print("el modelo del automovil es: " , automovil.modelo)    # se imprime el modelo del automovil
print ("el color del  automovil es: ",  automovil.color)      #  se imprime el color del automovil
print("el tamaño del automovil es: ", automovil.tamaño)       # se imprime el tamaño del automovil
print("el precio del automovil es: " , automovil.precio)      #  # se imprime el precio del automovil
print("\n")


clasico= atributar('renault', 2015, 'gris','pequeño',80000000)   # se crea el cuarto objeto llamado clasico
                                                                # a este objeto se le inicializan los atributos ya creados para la clase
print("----------------------------AUTO CLASICO--------------------------------")
print("la marca del auto clasico es: " + clasico.marca)     # se imprime la marca del auto clasico
print("el modelo del auto clasico es: " , clasico.modelo)      # se imprime el modelo del auto clasico
print ("el color del auto clasico es: ",  clasico.color)       #  se imprime el color del auto clasico
print("el tamaño del auto clasico es: ", clasico.tamaño)        # se imprime el tamaño del auto clasico
print("el precio del auto clasico es: " , clasico.precio)     # se imprime el precio del auto clasico
print("\n")

