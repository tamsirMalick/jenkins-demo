pipeline {
    agent any
    tools {
      maven 'maven363'
    }
    stages {
        stage('Test Project') {
            steps {
                bat 'mvn test'
                junit 'target/surefire_reports/*.xml'
            }
        }
        stage('Packaging the project') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }
}
