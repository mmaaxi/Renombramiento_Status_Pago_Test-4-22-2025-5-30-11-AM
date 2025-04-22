Feature: Validación del renombramiento de 'Status de Pago' a 'Descripción Status Pago'

  Scenario: Verificar encabezado renombrado en Excel exportado
    Given el usuario tiene un archivo Excel exportado desde la aplicación
    When el usuario inspecciona el encabezado de la columna en el Excel
    Then el encabezado debe mostrarse como 'Descripción Status Pago' en lugar de 'Status de Pago'