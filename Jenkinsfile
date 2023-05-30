pipeline {
    agent any

    tools {
        maven 'jenkinsmaven'
        jdk 'java-jenkins'
    }

    stages {
        stage('Build') {
            steps {
                git branch: 'main', url: 'https://github.com/spicke23/proyectosimplejunit.git'
                sh "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
