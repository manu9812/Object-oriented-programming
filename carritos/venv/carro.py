class carro:

      #se crea la clase carro

    def __init__(self) -> object:  #aqui creare los diferentes tipos de metodos que ejecutaran los objetos
    #de la clase metodos carros
        print("\n") # salto de linea

    def arrancar(self, marka, modelo, color, tamaño, precio):  # se crea el metodo arrancara carro
        print(" el carro de marca: " , marka , " de modelo: " , modelo , " color: ", color ," tamaño: " , tamaño , " de precio: " , precio , " ha arrancado") # imprime mensaje por consola cuando este mettodo es invocado


    def acelerar(self, marka, modelo, color, tamaño, precio):  # se crea el metodo acelerar carro
        print(" el carro  de marca: " , marka , " de modelo: " , modelo , " color: ", color ," tamaño:  " , tamaño , " de precio: " , precio , " ha acelerado")


    def  frenar (self, marka, modelo, color, tamaño, precio):  # se crea el metodo frenar carro
        print(" el carro de marca:" , marka , " de modelo: " , modelo , " color: ", color ," tamaño:  " , tamaño , " de precio: " , precio , " ha  frenado")  # imprime mensaje por consola cuando este mettodo es invocado

    def  retroceder (self, marka, modelo, color, tamaño, precio):  # se crea el metodo retroceder carro
        print(" el carro de marca: " , marka , " de modelo: " , modelo , " color: ", color ," tamaño: " , tamaño , " de precio: " , precio , " ha retocedido") # imprime mensaje por consola cuando este mettodo es invocado
   
    def apagar (self, marka, modelo, color, tamaño, precio): # se crea el metodo apagar carro
        print(" el carro de marca: " , marka ," de modelo: " , modelo , " color: ", color ," tamaño:  " , tamaño , " de precio: " , precio , " se  ha apagado") # imprime mensaje por consola cuando este mettodo es invocado
