node {
    stage('Jenkins Info') {
        echo "Jenkins Build Number: ${env.BUILD_NUMBER}"
        echo "Jenkins Job Name: ${env.JOB_NAME}"
        echo "Jenkins Node Name: ${env.NODE_NAME}"
        echo "Jenkins Workspace: ${env.WORKSPACE}"
        echo "Jenkins URL: ${env.JENKINS_URL}"
        echo "Jenkins Home: ${env.JENKINS_HOME}"
        echo "Jenkins User: ${env.JENKINS_USER}"
    }
}