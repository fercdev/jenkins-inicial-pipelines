node {
    stage('Check node version') {
        docker.image('node:24-alpine').inside {
            sh 'node -v'
            sh 'npm -v'
        }
    }

    stage('Check python version (agent python)') {
        docker.image('python:3.12-alpine').inside {
            sh 'python --version'
        }
    }

    stage('Check java version (agent java)') {
        docker.image('openjdk:17-ea-alpine').inside {
            sh 'java -version'
        }
    }
}