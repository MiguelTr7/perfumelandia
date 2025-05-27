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

## 🧩 Arquitectura de Microservicios

_Describir cómo está estructurado el sistema en microservicios. Pueden incluir un diagrama y explicar brevemente la función de cada servicio._

### Microservicios Desarrollados

- **usuarioservice:**  
  _Describir qué funcionalidades ofrece este microservicio._

- **productoservice:**  
  _Describir qué funcionalidades ofrece este microservicio._

- **Pedidoservice:**  
  _Indicar el nombre y función del microservicio adicional implementado._

- **Carritoservice:**  
  _Indicar el nombre y función del microservicio adicional implementado._

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

_Incluir capturas o descripciones de pruebas realizadas con Postman (mínimo 3 por micro-servicio)._

https://docs.google.com/document/d/1VMEqcWXhj39GU4Ukw7at6-QDYonfy-0VDxmBDUEVpxU/edit?usp=sharing
---

## 🧑‍💻 Integrantes del Equipo

| Nombre                | Rol en el proyecto          | Servicio principal trabajado  |
|-----------------------|----------------------------|------------------------------|
| Miguel Tropa 1 | | Scrum Master-tester  |        |pedidoservice   | 
| Maicol Hernandez 2 |  Backend y tester             | carritoservice              |
| Diego Mancilla 3 |      Backend y tester            | pedidoservice                |

---

## 📂 Estructura del Repositorio

_Explicar brevemente la organización de carpetas del repositorio (por ejemplo, cada carpeta corresponde a un microservicio separado con su propio `pom.xml`)._
