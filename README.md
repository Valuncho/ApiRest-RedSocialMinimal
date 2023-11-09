# ApiRest-RedSocialMinimal
Este proyecto esta desarrollado en java springboot

## **Especificación de la Arquitectura**
​
### **Capa Controller**
Será el punto de entrada a la API. En los controladores deberíamos definir la menor cantidad de lógica posible y utilizarlos como un pasamanos con la capa de servicios.
​
### **Capa Repository**
La capa Repository gestiona la interacción de la aplicación con la base de datos, ofreciendo métodos para operaciones de almacenamiento y recuperación de datos.
​
### **Capa Models**
En este nivel de la arquitectura definiremos todas las entidades.
​
### **Capa Dtos**
*En esta capa, los DTOs se dividen en dos tipos principales: Request y Response.
*DTOs de Request: Estos objetos se utilizan para recibir datos desde las capas superiores, como las solicitudes de los clientes.
*DTOs de Response: Por otro lado, los DTOs de Response se encargan de encapsular los datos que se envían como respuesta a las solicitudes.

### **Capa Services**
En la capa de servicios, se centraliza la lógica. Estos servicios actúan como intermediarios entre los controladores y los repositorios.

### **Capa Mapper**
En la capa Mapper, se lleva a cabo la conversión y mapeo entre distintos tipos de objetos, como entidades del modelo y DTOs.

## **Especificación de GIT**
​
* Se trabajo sobre la rama develop para la fase de prueba de la API y al agregar funcionalidades, estas se pusheaban a la rama principal cuando el codigo no presentaba errores.
