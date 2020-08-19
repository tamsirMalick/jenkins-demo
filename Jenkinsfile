pipeline {
    agent any
    tools {
      maven 'maven 3.6.3'
    }
    stages {
        stage('Test Project') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Packaging the project') {
            steps {
                sh 'mvn package -DskipTests'
            }
        }
    }
}
