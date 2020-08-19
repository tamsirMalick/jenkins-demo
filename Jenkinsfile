pipeline {
    agent any
    tools {
      maven 'maven363'
    }
    stages {
        stage('Test Project') {
            steps {
                sh 'mvn test'
            }
        }
    }
}
