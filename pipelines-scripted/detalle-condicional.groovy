node {
    stage('Init Stage') {
        echo 'Hello, World! init stage'
    }

    stage('Conditional stage') {
        def env = "dev"

        if ( env == "dev") {
            echo "trabajando en el environment dev"
        } else {
            echo "trabajando en un environment diferente a dev"
        }
    }

    stage('Stage en paralelo') {
        parallel(
            "Tarea 1": {
                echo "Ejecutando tarea 1 en paralelo"
            },
            "Tarea 2": {
                echo "Ejecutando tarea 2 en paralelo"
            }
        )
    }

    stage ('Final Stage') {
        echo 'Hello, World! final stage'
    }
}