pipeline {
  agent any
  stages {
    stage('Fluffy Build') {
      steps {
        echo 'Placeholder'
        sh './jenkins/build.sh'
        sh './gradlew clean build'
      }
    }

    stage('Fluffy Test') {
      steps {
        sh './jenkins/test.sh'
      }
    }

  }
}