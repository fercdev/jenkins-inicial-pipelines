def saludar(nombre) {
    echo "Hola ${nombre}!... desde mi funcion"
}

def buildApp() {
    echo "Building the application..."
    echo "Application build completed."
    return true
}

node {
    stage('Utilizando funcion') {
        saludar("Pedro")
    }
    stage('Build Application') {
        def buildResult = buildApp()
        echo "Build result: ${buildResult}"
    }
}