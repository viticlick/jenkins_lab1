pipeline {
  agent any
  stages {
    stage('Fluffy Build') {
      steps {
        echo 'Placeholder'
        sh '''echo "Im a ${BUZZ_NAME}"
./jenkins/build.sh'''
        sh './gradlew clean build'
        archiveArtifacts(artifacts: 'build/**/*.class', fingerprint: true)
      }
    }

    stage('Fluffy Test') {
      parallel {
        stage('Test A') {
          steps {
            sh './jenkins/test.sh'
            junit 'build/test-results/test/**/*.xml'
          }
        }

        stage('Test B') {
          steps {
            sh '''sleep 10
echo done!'''
          }
        }

      }
    }

  }
  environment {
    BUZZ_NAME = 'Worker Bee'
  }
}