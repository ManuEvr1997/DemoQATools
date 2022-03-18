# language: es

Característica: Realizar compra de articulo
  como un nuevo cliente
  quiero ingresar a la pagina www.abc.com
  para realizar la compra de un articulo


  @EscenarioSinValor
  Escenario: Ingresar A Elements Y Webtables
    Dado  que un cliente accede a la web de compras
    Cuando el agrega el nombre Emanuel con apellido Vega email eveg7719@gmail.com edad 30 salario 1200 departamento DistritoCapital
    Cuando el agrega la primera fecha 03/17/2050 y la segundo fecha October 08, 2025 10:00 AM
    Cuando el da click en el campo del modal Esto Es Un Alert
    Entonces el ve los productos en el carrito de compras


  @EscenarioConValor
  Esquema del escenario: agregar producto al carrito de compras
    Dado  que un cliente accede a la web de compras
    Cuando  el da click en el campo del modal
      |<agregarNombre>|
    Entonces el ve los productos en el carrito de compras list


    Ejemplos:
      |agregarNombre|
      |emanuel|