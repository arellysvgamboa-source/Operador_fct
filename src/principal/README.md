# Sistema de Planes de Internet - Patrón Factory Method

## Descripción del Proyecto

Este proyecto implementa un sistema de contratación de planes de internet utilizando el patrón de diseño **Factory Method** en Java.

La aplicación permite que un cliente seleccione una operadora de telecomunicaciones, elija un tipo de plan de datos, ingrese la cantidad de megas consumidos y obtenga automáticamente el monto a pagar según las tarifas establecidas por cada proveedor.

El sistema contempla tres proveedores de servicios:

- Línea Rápida
- Claro
- Movistar

Y tres tipos de planes:

- Personal
- Negocio
- Académico

Además, el usuario puede registrar múltiples consultas durante la ejecución del programa.

---

# Objetivos

- Aplicar el patrón de diseño Factory Method.
- Implementar el concepto de herencia y polimorfismo.
- Separar responsabilidades mediante paquetes.
- Facilitar la incorporación de nuevos proveedores o planes sin modificar la lógica principal del sistema.

---

# Patrón de Diseño Utilizado

## Factory Method

El patrón Factory Method permite crear objetos sin especificar exactamente la clase concreta que se va a instanciar.

En este proyecto:

- La clase abstracta `Proveedor` actúa como Creator.
- Las clases `LineaRapida`, `Claro` y `Movistar` actúan como ConcreteCreator.
- La clase abstracta `PlanDatos` representa el Product.
- Las clases `PlanPersonal`, `PlanNegocio` y `PlanAcademico` representan los ConcreteProduct.

De esta forma el programa crea dinámicamente el plan solicitado dependiendo de la operadora seleccionada por el usuario.

---

# Estructura del Proyecto

```text
src
│
├── fabrica
│   └── FabricaCreadora.java
│
├── planes
│   ├── PlanDatos.java
│   ├── PlanPersonal.java
│   ├── PlanNegocio.java
│   └── PlanAcademico.java
│
├── proveedores
│   ├── Proveedor.java
│   ├── LineaRapida.java
│   ├── Claro.java
│   └── Movistar.java
│
└── principal
    └── Main.java
```

---

# Descripción de los Paquetes

## Paquete planes

Contiene la jerarquía de clases relacionada con los tipos de planes de internet.

### PlanDatos

Clase abstracta que representa un plan genérico.

Responsabilidades:

- Almacenar el nombre del plan.
- Almacenar la tasa por mega.
- Calcular el monto a pagar.
- Permitir asignar la tasa correspondiente.

Atributos:

```java
protected String nombre;
protected float tasa;
```

Métodos principales:

```java
setTasa(float tasa)
calculaPago(int megas)
```

---

### PlanPersonal

Representa el plan Personal.

Hereda de:

```java
PlanDatos
```

---

### PlanNegocio

Representa el plan Negocio.

Hereda de:

```java
PlanDatos
```

---

### PlanAcademico

Representa el plan Académico.

Hereda de:

```java
PlanDatos
```

---

## Paquete proveedores

Contiene las operadoras de internet.

### Proveedor

Clase abstracta que define el comportamiento común de todas las operadoras.

Método principal:

```java
crearPlan(String tipo)
```

Este método será implementado por cada proveedor.

---

### LineaRapida

Implementa las tarifas:

| Plan | Tasa |
|--------|--------|
| Personal | 0.50 |
| Negocio | 1.50 |
| Académico | 1.00 |

---

### Claro

Implementa las tarifas:

| Plan | Tasa |
|--------|--------|
| Personal | 0.60 |
| Negocio | 1.60 |
| Académico | 1.20 |

---

### Movistar

Implementa las tarifas:

| Plan | Tasa |
|--------|--------|
| Personal | 0.80 |
| Negocio | 1.60 |
| Académico | 1.25 |

---

## Paquete fabrica

### FabricaCreadora

Clase encargada de crear dinámicamente la operadora solicitada.

Método:

```java
crearPlanDatos(String proveedor)
```

Dependiendo del nombre recibido retorna:

```java
LineaRapida
Claro
Movistar
```

---

## Paquete principal

### Main

Clase principal que interactúa con el usuario.

Responsabilidades:

1. Mostrar menú de operadoras.
2. Permitir seleccionar una operadora.
3. Mostrar menú de planes.
4. Permitir seleccionar un plan.
5. Solicitar la cantidad de megas consumidos.
6. Calcular el pago.
7. Mostrar el resultado.
8. Preguntar si desea registrar otro plan.

---

# Flujo de Ejecución

```text
Inicio
   │
   ▼
Seleccionar Operadora
   │
   ▼
Seleccionar Plan
   │
   ▼
Ingresar Megas
   │
   ▼
Crear Operadora
   │
   ▼
Crear Plan
   │
   ▼
Calcular Pago
   │
   ▼
Mostrar Resultado
   │
   ▼
¿Desea registrar otro plan?
   │
 ┌─┴─┐
 │Sí │
 └─┬─┘
   │
   └──────────► Repetir Proceso

No
 │
 ▼
Fin
```

---

# Fórmula de Cálculo

El monto a pagar se obtiene mediante la siguiente fórmula:

```text
Pago = Tasa × Megas Consumidos
```

Ejemplo:

```text
Plan Personal - Claro
Tasa = 0.60

Megas = 1000

Pago = 0.60 × 1000

Pago = S/. 600.00
```

---

# Ejemplo de Ejecución

```text
===== PLANES DE INTERNET =====

Seleccione una operadora:
1. Linea Rapida
2. Claro
3. Movistar

Ingrese la opcion seleccionada: 2

Seleccione el tipo de plan:
1. Personal
2. Negocio
3. Academico

Ingrese la opcion seleccionada: 1

Ingrese la cantidad de megas consumidos: 1000

===== DETALLE DEL PLAN =====

Operadora : Claro
Plan: Personal Tasa :0.6
Megas consumidos : 1000
Pago total : S/. 600.0

¿Desea registrar otro plan? (S/N): N

Gracias por utilizar el sistema.
```

---


# Autora

Arellys Villena
000292454