# tiny-API

### Aclaraciones

- Existe una base de datos con una tabla llamada "Vehicle", con todos los datos del vehículo. La clave primaria es la columna "id" y las demás columnas se llaman igual que los atributos de la clase "Vehicle.java".

- El acceso a la base de datos no está configurado.

- Se supone que los campos correspondientes a las coordenadas X e Y de los vehículos son modificados por un proceso externo.

### Sondeo ("polling")

- El sondeo se ha investigado, una de las formas es usando la interfaz Callable, como se ve en la clase de utilidad ExecutePeriodically. Debido a la poca experiencia de este humilde programador, se ha preferido no implementar el sondeo para mantener la estructura de tres capas: controlador, servicio y repositorio.

- El sondeo no es una buena solución, porque obliga a estar realizando peticiones constantemente, con la sobrecarga que eso implica. Una posible solución sería que el cliente se suscribiera a ese endpoint, de tal forma que la petción sólo se realizaría si el resultado ha cambiado. Conceptualmente esto es parecido al patrón publicación-suscripción, tan usado en la parte del frontal web. 
