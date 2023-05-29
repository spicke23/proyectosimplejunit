pipeline {
    agent any

    tools {
        maven 'jenkinsmaven'
    }

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/spicke23/proyectosimplejunit.git'
            }
    }
}
