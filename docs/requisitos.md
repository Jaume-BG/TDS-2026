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


## HU Creación de categorías

**Como** usuario,  
**quiero** crear nuevas categorías de gastos,  
**para** organizar mis gastos personales según mis necesidades.

### Criterios de aceptación

- **Dado** que el usuario accede a la opción de crear una categoría,
  - **cuando** introduce un nombre válido y pulsa "Guardar",
    - **entonces** el sistema registra la nueva categoría y la muestra en el listado de categorías disponibles.
- **Dado** que el usuario intenta crear una categoría sin introducir un nombre,
  - **cuando** pulsa "Guardar",
    - **entonces** el sistema muestra un mensaje de error y no crea la categoría.
- **Dado** que ya existe una categoría con el mismo nombre,
  - **cuando** el usuario intenta crear otra categoría con ese nombre,
    - **entonces** el sistema muestra un mensaje de error y no registra la categoría duplicada.
- **Dado** que una categoría se ha creado correctamente,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** la categoría continúa apareciendo entre las categorías disponibles.

## HU Uso de categorías en gastos

**Como** usuario,  
**quiero** asignar categorías a mis gastos,  
**para** clasificarlos y facilitar su organización y consulta.

### Criterios de aceptación

- **Dado** que el usuario accede a la opción de registrar un gasto,
  - **cuando** selecciona el campo de categoría,
    - **entonces** el sistema muestra las categorías predefinidas y las creadas por el usuario.
- **Dado** que existen categorías disponibles,
  - **cuando** el usuario selecciona una categoría y guarda un gasto con todos los datos válidos,
    - **entonces** el sistema registra el gasto asociado a la categoría seleccionada.
- **Dado** que existe un gasto registrado,
  - **cuando** el usuario edita el gasto y selecciona una categoría diferente,
    - **entonces** el sistema actualiza la categoría asociada al gasto.
- **Dado** que existen gastos asociados a diferentes categorías,
  - **cuando** el usuario consulta el listado de gastos,
    - **entonces** el sistema muestra la categoría correspondiente a cada gasto.


## HU Filtrado de gastos

**Como** usuario,  
**quiero** filtrar mis gastos por meses, intervalos de fechas y categorías, pudiendo combinar estos filtros,  
**para** consultar únicamente los gastos que cumplan los criterios seleccionados y facilitar su análisis.

### Criterios de aceptación

- **Dado** que existen gastos registrados en diferentes meses,
  - **cuando** el usuario selecciona uno o varios meses como filtro,
    - **entonces** el sistema muestra únicamente los gastos correspondientes a los meses seleccionados.
- **Dado** que existen gastos registrados en diferentes fechas,
  - **cuando** el usuario establece un intervalo de fechas válido,
    - **entonces** el sistema muestra únicamente los gastos comprendidos entre la fecha inicial y la fecha final, ambas incluidas.
- **Dado** que existen gastos asociados a diferentes categorías,
  - **cuando** el usuario selecciona una o varias categorías como filtro,
    - **entonces** el sistema muestra únicamente los gastos pertenecientes a las categorías seleccionadas.
- **Dado** que el usuario selecciona varios filtros simultáneamente,
  - **cuando** aplica los filtros,
    - **entonces** el sistema muestra únicamente los gastos que cumplen todos los criterios establecidos.
- **Dado** que el usuario establece un intervalo de fechas cuya fecha inicial es posterior a la fecha final,
  - **cuando** intenta aplicar el filtro,
    - **entonces** el sistema muestra un mensaje de error indicando que el intervalo no es válido.
- **Dado** que no existen gastos que cumplan los filtros seleccionados,
  - **cuando** el usuario aplica los filtros,
    - **entonces** el sistema muestra un listado vacío e informa de que no se han encontrado gastos.
- **Dado** que el usuario tiene filtros aplicados,
  - **cuando** elimina todos los filtros,
    - **entonces** el sistema vuelve a mostrar todos los gastos registrados.


## HU Configuración de alertas

**Como** usuario,  
**quiero** configurar alertas estableciendo límites de gasto semanales o mensuales, opcionalmente asociados a una categoría,  
**para** controlar mis gastos y conocer cuándo supero los límites establecidos.

### Criterios de aceptación

- **Dado** que el usuario accede a la opción de configurar una alerta,
  - **cuando** introduce un límite de gasto válido, selecciona una periodicidad semanal o mensual y guarda la alerta,
    - **entonces** el sistema registra la alerta con los parámetros establecidos.
- **Dado** que el usuario configura una alerta,
  - **cuando** selecciona una categoría específica,
    - **entonces** el sistema aplica el límite únicamente a los gastos asociados a dicha categoría.
- **Dado** que el usuario configura una alerta sin seleccionar ninguna categoría,
  - **cuando** guarda la alerta,
    - **entonces** el sistema aplica el límite al conjunto de gastos registrados.
- **Dado** que el usuario introduce un límite de gasto no válido o no selecciona una periodicidad,
  - **cuando** intenta guardar la alerta,
    - **entonces** el sistema muestra un mensaje de error y no registra la alerta.
- **Dado** que una alerta se ha configurado correctamente,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** la alerta continúa registrada con su configuración.

## HU Generación de notificaciones por alertas

**Como** usuario,  
**quiero** recibir notificaciones cuando mis gastos superen los límites establecidos en las alertas,  
**para** conocer cuándo excedo mi presupuesto y controlar mejor mis gastos.

### Criterios de aceptación

- **Dado** que existe una alerta configurada con un límite de gasto semanal o mensual,
  - **cuando** los gastos acumulados durante el periodo correspondiente superan el límite establecido,
    - **entonces** el sistema genera una notificación informando de que se ha superado dicho límite.
- **Dado** que existe una alerta asociada a una categoría específica,
  - **cuando** los gastos acumulados de esa categoría durante el periodo superan el límite establecido,
    - **entonces** el sistema genera una notificación correspondiente a dicha categoría.
- **Dado** que existe una alerta configurada,
  - **cuando** los gastos acumulados durante el periodo no superan el límite establecido,
    - **entonces** el sistema no genera ninguna notificación por esa alerta.
- **Dado** que se ha generado una notificación,
  - **cuando** el usuario consulta su contenido,
    - **entonces** el sistema muestra la información de la alerta que ha sido superada.

## HU Consulta del historial de notificaciones

**Como** usuario,  
**quiero** consultar las notificaciones generadas por las alertas de gasto,  
**para** revisar los límites que he superado y mantener un seguimiento de mis gastos.

### Criterios de aceptación

- **Dado** que existen notificaciones generadas por alertas,
  - **cuando** el usuario accede al historial de notificaciones,
    - **entonces** el sistema muestra un listado con las notificaciones registradas.
- **Dado** que existen notificaciones registradas,
  - **cuando** el usuario selecciona una notificación,
    - **entonces** el sistema muestra su información, incluyendo el límite superado, la periodicidad y la categoría asociada, si existe.
- **Dado** que no existen notificaciones registradas,
  - **cuando** el usuario accede al historial de notificaciones,
    - **entonces** el sistema muestra un mensaje indicando que no existen notificaciones.
- **Dado** que se han generado notificaciones,
  - **cuando** el usuario cierra y vuelve a abrir la aplicación,
    - **entonces** las notificaciones anteriores continúan disponibles en el historial.


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
