# Ejercicio — Patrón Adapter

## Sistema de notificaciones

Una empresa tiene un sistema de pedidos que debe enviar notificaciones a sus clientes cuando ocurren eventos importantes, por ejemplo, cuando un pedido es enviado o entregado.

Actualmente, el sistema trabaja con una interfaz propia para enviar notificaciones:

```text
enviar(destinatario, mensaje)
```

La empresa quiere ampliar el sistema para enviar notificaciones a través de diferentes servicios:

* **WhatsApp**
* **SMS**
* **Correo electrónico mediante Gmail**

El problema es que estos servicios son externos y cada uno tiene una forma diferente de enviar mensajes:

```text
WhatsApp → enviarMensaje(numero, texto)

SMS → mandarSMS(telefono, mensaje)

Gmail → enviarCorreo(destinatario, asunto, contenido)
```

Estas clases externas **no pueden ser modificadas**.

El sistema de pedidos, sin embargo, debería poder utilizar cualquiera de estos servicios de manera uniforme, sin conocer los detalles de cómo funciona cada uno.

---

## Problema

¿Cómo diseñar el sistema para que pueda utilizar WhatsApp, SMS y Gmail manteniendo una única forma de enviar notificaciones y sin modificar las clases externas?

---

## Requisitos

El sistema debe permitir:

1. Enviar una notificación a través de WhatsApp.
2. Enviar una notificación a través de SMS.
3. Enviar una notificación mediante correo electrónico usando Gmail.
4. Mantener una única interfaz para el sistema de pedidos.
5. No modificar las clases de los servicios externos.
6. Permitir agregar posteriormente nuevos servicios de notificación sin modificar el código principal del sistema.

---

## Objetivo

Diseñar e implementar una solución utilizando el **patrón de diseño Adapter**.

La solución debe identificar claramente:

* **Target**
* **Adapter**
* **Adaptee**
* **Client**

Además, se debe representar el diseño mediante un **diagrama de clases UML** y posteriormente realizar la implementación en **Java**.
