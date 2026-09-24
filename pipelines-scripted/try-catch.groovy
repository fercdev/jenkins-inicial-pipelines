node {
    stage('try-catch') {
        try {
            sh "echo 'Ejecutando sección try'"
            sh "echo 'Otra operación en la sección try'"

            sh "exit 1" // forzar el error para ver mi bloque catch
        } catch (Exception e) {
            echo "Ocurrió un error: ${e.message}"
            currentBuild.result = 'FAILURE'
        } finally {
            echo "Bloque finally ejecutado"
        }
    }
}