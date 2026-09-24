def saludar(nombre) {
    echo "Hola ${nombre}!... desde mi funcion"
}

node {
    stage('Utilizando funcion') {
        saludar("Pedro")
    }
}