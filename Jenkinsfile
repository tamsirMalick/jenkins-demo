pipeline {
    agent any
    tools {
      maven 'maven363'
    }
    stages {
        stage('Test Project') {
            steps {
                bat 'mvn test'
            }

            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Packaging the project') {
            steps {
                bat 'mvn package -DskipTests'
            }

          post {
                 always {
                    archiveArtifacts artifacts: 'target/*.jar'
                  }
          }
        }
    }
}
