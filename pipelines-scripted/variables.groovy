node {
    stage('Definiendo variables') {
        def nombre = "Pedro"
        def edad = 30
        echo "Nombre: ${nombre}, Edad: ${edad}"

        // variables de entorno
        env.CUSTOM_VARIABLE = "Valor personalizado"
        echo "Variable de entorno: ${env.CUSTOM_VARIABLE}"
    }
}