class padre:
    def __init__(self, oficio):
        self.oficio=oficio

    def hacerOficio(self):
        print("soy la super clase padre y hago fritanga con buen sabor")

class madre:
    def __init__(self, oficio):
        self.oficio = oficio

    def hacerOficio(self):
        print("soy la super clase madre y hago tamales con amor ")

class primerhijo(padre):
    def hacerOficio(self):
        print("soy la sub clase primer hijo y hago chicharrones con estilo  ")

class segundohijo(padre):
    def hacerOficio(self):
        print("soy la sub clase segundo hijo y hago arepas rellenas con carne y pollo ")

class primerhija(madre):
    def hacerOficio(self):
        print("soy la sub clase primer hija y hago lechona con estilo  ")


class segundahija(madre):
    def hacerOficio(self):
        print("soy la sub clase segunda  hija y hago ayacas multi sabores   ")


pad=padre("cocinero")
print("soy la super class padre")
pad.hacerOficio()

print("\n")

mad=madre ("tamalera")
print("soy la super clase madre ")
mad.hacerOficio()
print("\n")

p1= primerhijo("fritador")
print("soy la sub clase primer hijo")
p1.hacerOficio()
print("heredo el oficio de mi padre que es cocinero")
print("\n")


p2= segundohijo("arepero")
print("soy la sub clase segundo hijo ")
p2.hacerOficio()
print("heredo el oficio de mi padre que es cocinero")
print("\n")


h1=primerhija("lechonera")
print("soy la sub clase primera hija")
h1.hacerOficio()
print("heredo el oficio de mi madre que es tamalera")
print("\n")

h2=segundahija("vendedora de ayacas ")
print("soy la sub clase segunda hija ")
h2.hacerOficio()
print("heredo el oficio de mi madre que es tamalera")
print("\n")
