node {
    stage('Trabajo en paralelo') {
        
        parallel(
            A: {
                echo "Ejecutando tarea A"
                sh "sleep 5"
            },
            B: {
                echo "Ejecutando tarea B"
                sh "sleep 5"
            },
            C: {
                echo "Ejecutando tarea C"
                sh "sleep 5"
            }
        )
    }
}