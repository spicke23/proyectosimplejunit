pipeline {
    agent any

    tools {
        maven 'jenkinsmaven'
    }

    stages {
        stage('Build') {
            steps {
                echo 'Realizando la clonacion del repo'
                git 'https://github.com/spicke23/proyectosimplejunit.git'
                echo 'Vamos a generar el repo'
                sh 'mvn -Dmaven.test.failure.ignore=true clean package'
            }
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
        stage('Test') {
            steps {
                echo 'Ejecutando los test'
                sh 'mvn test'
            }
            post {
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
