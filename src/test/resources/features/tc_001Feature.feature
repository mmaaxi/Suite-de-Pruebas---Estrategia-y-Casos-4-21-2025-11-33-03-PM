Feature: Verificar funcionalidad de inicio de sesión

  Scenario: Ingresar credenciales válidas
    Given el usuario está en la página de inicio de sesión
    When el usuario ingresa el nombre de usuario "usuario_valido" y la contraseña "contraseña_valida"
    And el usuario presiona el botón de inicio de sesión
    Then se muestra la página principal