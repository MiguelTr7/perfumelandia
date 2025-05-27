# 🧾 Proyecto: Transformación Digital - Perfulandia SPA

Este repositorio contiene el desarrollo técnico del sistema basado en microservicios para la empresa Perfulandia SPA, como parte de la Evaluación Parcial 2 de la asignatura Desarrollo Full Stack I.

---

## 📦 Descripción General del Proyecto

El sistema consiste en una plataforma moderna basada en microservicios para la gestión de pedidos y productos, diseñada para mejorar la eficiencia, escalabilidad y mantenimiento del software. Reemplaza al sistema antiguo monolítico, que era rígido, difícil de actualizar y propenso a fallos al realizar cambios.

Este nuevo enfoque resuelve problemas clave como la lentitud en el procesamiento de datos, la dificultad para escalar partes específicas del sistema, y la alta dependencia entre módulos que generaba errores en cascada.

Entre los beneficios más importantes se incluyen:

Escalabilidad: cada módulo puede crecer de forma independiente.

Mantenibilidad: es más fácil detectar, corregir y desplegar cambios sin afectar todo el sistema.

Resiliencia: si un microservicio falla, los demás pueden seguir funcionando.

Agilidad en el desarrollo: permite trabajar con equipos especializados por servicio, acelerando la entrega de nuevas funcionalidades.

---


### Microservicios Desarrollados

# 🧱 Arquitectura de Microservicios – Perfulandia SPA

El sistema está basado en una arquitectura de microservicios que permite desarrollar, desplegar y escalar componentes de forma independiente. Cada microservicio tiene una única responsabilidad y se comunica con los demás mediante HTTP (REST APIs).

## 🔧 Microservicios Desarrollados

---

### 🧍‍♂️ usuarioservice
**Descripción**: Servicio encargado de la gestión de usuarios.

**Funciones**:
- Crear, actualizar y eliminar usuarios.
- Obtener información de usuario por ID.
- Validar existencia de usuario al generar pedidos.
- Asociar carritos y pedidos a un usuario.

---

### 🛍 productoservice
**Descripción**: Servicio que administra el catálogo de productos disponibles.

**Funciones**:
- Crear, actualizar y eliminar productos.
- Consultar productos disponibles.
- Controlar stock y precios.
- Brindar información a carritoservice y pedidoservice.

---

### 📦 pedidoservice
**Descripción**: Servicio que gestiona los pedidos realizados por los usuarios.

**Funciones**:
- Crear un nuevo pedido a partir del carrito.
- Cambiar el estado del pedido (GENERADO, ENVIADO, ENTREGADO).
- Listar pedidos por usuario.
- Validar productos y usuarios antes de confirmar el pedido.

---

### 🛒 carritoservice
**Descripción**: Servicio que permite a los usuarios gestionar productos antes de realizar una compra.

**Funciones**:
- Agregar o eliminar productos al carrito.
- Visualizar el contenido del carrito por usuario.
- Vaciar carrito.
- Integrarse con productoservice y usuarioservice.

---

## 🔗 Comunicación entre Servicios

La comunicación entre microservicios se realiza mediante **REST APIs** usando `RestTemplate`.

Actualmente, **solo `pedidoservice` actúa como consumidor**, realizando llamadas REST a:

- `usuarioservice`: para validar la existencia del usuario que realiza el pedido.
- `productoservice`: para validar la disponibilidad y obtener detalles del producto.

> En el futuro, se puede integrar un **API Gateway** para centralizar las rutas y autenticaciones, y reemplazar `RestTemplate` por **FeignClient** para simplificar el consumo de servicios.

---


## 🧰 Tecnologías y herramientas utilizadas

| Herramienta / Tecnología      | Descripción                                                         |
|------------------------------|---------------------------------------------------------------------|
| **Spring Boot**              | Framework para el desarrollo de aplicaciones Java modernas.         |
| **Maven**                    | Sistema de construcción y gestión de dependencias.                  |
| **MySQL**                    | Base de datos relacional para almacenar la información.             |
| **Postman**                  | Herramienta para probar y consumir APIs REST.                       |
| **GitHub**                   | Plataforma para el control de versiones y colaboración.             |
| **Laragon**                  | Entorno de desarrollo local que facilita la gestión de servicios.   |
| **IntelliJ IDEA + Intellicode** | IDE para desarrollo en Java con soporte inteligente de código.    |

---

## 🗄️ Configuración de Bases de Datos

_Indicar qué motor de base de datos usaron, cómo configuraron la conexión (`application.properties`), y qué tablas y campos definieron para cada microservicio._





---

## 📮 Endpoints y Pruebas

_Especificar los principales endpoints disponibles por microservicio (CRUD y llamadas entre servicios)._

Entre producto y usuario
http://localhost:8085/api/v1/productos/usuario/{id}

Entre pedidos y usuario
 http://localhost:8085/api/v1/pedidos/usuario/2


_Incluir capturas o descripciones de pruebas realizadas con Postman (mínimo 3 por micro-servicio)._

## Capturas

Puedes ver las capturas del proyecto en el siguiente enlace: [Capturas](https://docs.google.com/document/d/1VMEqcWXhj39GU4Ukw7at6-QDYonfy-0VDxmBDUEVpxU/edit?usp=sharing)

---

## 🧑‍💻 Integrantes del Equipo

| Nombre                | Rol en el proyecto          | Servicio principal trabajado  |
|-----------------------|----------------------------|------------------------------|
| Miguel Tropa 1 | Scrum Master-tester  |        pedidoservice   | 
| Maicol Hernandez 2 |  Backend y tester             | carritoservice              |
| Diego Mancilla 3 |      Backend y tester            | pedidoservice                |

---

## 📁 Estructura del Repositorio

Este proyecto está organizado bajo una arquitectura de microservicios. Cada carpeta representa un servicio independiente con su propia configuración, código y dependencias.

- `.idea/`  
  Archivos de configuración del entorno IntelliJ IDEA (no afecta el código del proyecto).

- `carritoservice/`  
  Microservicio encargado de gestionar los carritos de compra de los usuarios. Permite operaciones como agregar, eliminar y listar productos en el carrito.

- `pedidoservice/`  
  Microservicio que administra los pedidos realizados por los usuarios. Verifica la existencia del usuario y productos antes de registrar el pedido. Se comunica con `usuarioservice` y `productoservice`.

- `perfumelandia-spa/`  
  Proyecto principal del frontend (posiblemente una SPA), encargado de consumir los microservicios y ofrecer la interfaz de usuario.

- `productoservice/`  
  Microservicio que maneja la gestión de productos: creación, edición, listado y control de stock.

- `usuarioservice/`  
  Microservicio encargado del manejo de usuarios: registro, actualización y obtención de datos personales.

- `README`  
  Archivo de documentación que describe el propósito del proyecto, arquitectura, cómo ejecutarlo, endpoints disponibles, y otra información útil para los desarrolladores.

Cada servicio es un proyecto Spring Boot separado y puede contener su propio `pom.xml` (en caso de usar Maven) o `build.gradle` (si se usa Gradle).

