/* Jenkinsfile (Declarative Pipeline)
Requires the Docker Pipeline plugin */
pipeline {
    agent any
    stages {
        stage('build') {
            agent { docker {image 'maven:3.9.3-eclipse-temurin-17' } }
            steps {
                sh 'echo Hello World'
            }
        }
    }
}
