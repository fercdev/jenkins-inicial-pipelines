node {
    def environments = ['dev', 'qa', 'prod', 'staging']

    for (environment in environments) {
        stage ("Deploy to ${environment}") {
            echo "Deploying to ${environment}"
        }
    }
}