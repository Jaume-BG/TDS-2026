## HU Creación de gasto

**Como** usuario,  
**quiero** registrar mis gastos personales indicando el importe, la fecha y la categoría,  
**para** mantener un control organizado de mis gastos.

### Criterios de aceptación

- **Dado** que el usuario selecciona la opción de registrar un gasto,
  - **cuando** introduce un importe válido, una fecha válida y selecciona una categoría,
    - **entonces** el sistema guarda el gasto y lo muestra en el listado de gastos.
- **Dado** que el usuario intenta registrar un gasto sin completar todos los campos obligatorios,
  - **cuando** pulsa "Guardar",
    - **entonces** el sistema muestra un mensaje de error indicando los datos que faltan y no registra el gasto.
- **Dado** que existen diferentes categorías,
  - **cuando** el usuario selecciona una durante el registro,
    - **entonces** el gasto queda asociado a la categoría seleccionada.
- **Dado** que un gasto se ha registrado correctamente,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** el gasto continúa apareciendo en el listado de gastos.

## HU Edición de gasto

**Como** usuario,  
**quiero** editar los datos de un gasto registrado,  
**para** corregir posibles errores o mantener su información actualizada.

### Criterios de aceptación

- **Dado** que existe un gasto registrado,
  - **cuando** el usuario lo selecciona, modifica sus datos con valores válidos y pulsa "Guardar cambios",
    - **entonces** el sistema guarda los cambios y actualiza la información en el listado de gastos y en las vistas donde aparezca.
- **Dado** que el usuario introduce datos no válidos o deja campos obligatorios incompletos,
  - **cuando** pulsa "Guardar cambios",
    - **entonces** el sistema muestra un mensaje de error y mantiene los datos anteriores del gasto.
- **Dado** que un gasto se ha editado correctamente,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** los cambios realizados permanecen guardados.

## HU Eliminación de gasto

**Como** usuario,  
**quiero** eliminar gastos que ya no necesite conservar,  
**para** mantener mi listado de gastos actualizado y sin registros innecesarios.

### Criterios de aceptación

- **Dado** que el usuario selecciona un gasto que desea eliminar,
  - **cuando** pulsa "Eliminar",
    - **entonces** el sistema solicita una confirmación antes de eliminar el gasto.
- **Dado** que el usuario confirma la eliminación de un gasto,
  - **cuando** el sistema ejecuta la operación,
    - **entonces** el gasto desaparece del listado de gastos y de las vistas o gráficos donde aparezca.
- **Dado** que un gasto se ha eliminado correctamente,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** el gasto eliminado ya no aparece en el sistema.
- **Dado** que el sistema solicita confirmación para eliminar un gasto,
  - **cuando** el usuario cancela la operación,
    - **entonces** el gasto permanece registrado sin modificaciones.


## HU Registrar gasto en cuenta compartida

**Como** usuario,  
**quiero** registrar qué participante ha pagado cada gasto de una cuenta compartida,  
**para** que los saldos de los participantes se actualicen automáticamente.

### Criterios de aceptación

- **Dado** que existe una cuenta compartida con varios participantes,
  - **cuando** el usuario registra un gasto indicando el participante que ha pagado y el importe,
    - **entonces** el sistema contabiliza el importe a favor del participante que ha pagado y distribuye el coste entre los participantes según la estrategia de reparto.
- **Dado** que la cuenta compartida tiene definidos porcentajes de participación,
  - **cuando** el usuario registra un nuevo gasto,
    - **entonces** el sistema distribuye el importe según los porcentajes de participación establecidos.

## HU Consultar saldos del grupo

**Como** usuario,  
**quiero** consultar el saldo de cada participante de una cuenta compartida,  
**para** conocer cuánto dinero debe pagar o recibir cada participante.

### Criterios de aceptación

- **Dado** que existen gastos registrados en una cuenta compartida,
  - **cuando** el usuario accede a la vista de saldos,
    - **entonces** el sistema muestra el saldo correspondiente a cada participante.
- **Dado** que el sistema ha calculado los saldos de todos los participantes,
  - **cuando** el usuario consulta el resumen de la cuenta compartida,
    - **entonces** la suma de los saldos de todos los participantes es igual a 0.

## HU Definir porcentaje de participación

**Como** usuario,  
**quiero** establecer el porcentaje de participación de cada participante de una cuenta compartida,  
**para** distribuir los gastos según los acuerdos establecidos entre los participantes.

### Criterios de aceptación

- **Dado** que el usuario introduce los porcentajes de participación de los participantes,
  - **cuando** intenta guardar los porcentajes,
    - **entonces** el sistema comprueba que todos sean mayores o iguales a 0 y que su suma sea exactamente el 100%.
- **Dado** que los porcentajes de participación se han guardado correctamente,
  - **cuando** se registran nuevos gastos en la cuenta compartida,
    - **entonces** el sistema aplica los porcentajes de participación establecidos sin modificar el reparto de los gastos registrados anteriormente.

## HU Añadir gasto CLI

**Como** usuario,  
**quiero** registrar gastos mediante la línea de comandos (CLI),  
**para** gestionar mis gastos de forma centralizada sin depender de una interfaz gráfica.

### Criterios de aceptación

- **Dado** que el usuario ejecuta el comando para registrar un gasto con todos los argumentos obligatorios válidos,
  - **cuando** el sistema procesa el comando,
    - **entonces** el gasto queda registrado correctamente.
- **Dado** que el usuario ejecuta el comando con argumentos incompletos o valores no válidos,
  - **cuando** el sistema procesa el comando,
    - **entonces** muestra un mensaje de error y no registra el gasto.
- **Dado** que un gasto se ha registrado correctamente mediante la línea de comandos,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** el gasto continúa apareciendo en el listado de gastos.

## HU Editar gasto CLI

**Como** usuario,  
**quiero** editar gastos mediante la línea de comandos (CLI),  
**para** actualizar la información de mis gastos de forma centralizada sin depender de una interfaz gráfica.

### Criterios de aceptación

- **Dado** que existe un gasto registrado,
  - **cuando** el usuario ejecuta el comando de edición con argumentos válidos,
    - **entonces** el sistema guarda los cambios realizados en el gasto.
- **Dado** que el usuario intenta editar un gasto con argumentos no válidos o incompletos,
  - **cuando** ejecuta el comando de edición,
    - **entonces** el sistema muestra un mensaje de error y mantiene los datos anteriores del gasto.
- **Dado** que un gasto se ha editado correctamente mediante la línea de comandos,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** los cambios realizados permanecen guardados.

## HU Eliminación de gasto CLI

**Como** usuario,  
**quiero** eliminar gastos mediante la línea de comandos (CLI),  
**para** mantener mi listado de gastos actualizado de forma centralizada sin depender de una interfaz gráfica.

### Criterios de aceptación
- **Dado** que el usuario desea eliminar un gasto registrado,
  - **cuando** ejecuta correctamente el comando de eliminación,
    - **entonces** el sistema solicita una confirmación mediante la línea de comandos.
- **Dado** que el sistema solicita confirmación para eliminar un gasto,
  - **cuando** el usuario confirma la operación mediante la línea de comandos,
    - **entonces** el sistema elimina el gasto registrado.
- **Dado** que un gasto se ha eliminado correctamente mediante la línea de comandos,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** el gasto eliminado ya no aparece en el sistema.
- **Dado** que el sistema solicita confirmación para eliminar un gasto,
  - **cuando** el usuario cancela la operación mediante la línea de comandos,
    - **entonces** el gasto permanece registrado sin modificaciones.
