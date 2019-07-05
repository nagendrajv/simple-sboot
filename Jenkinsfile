pipeline {
    agent any
    stages {
        stage('Preparation') {
            echo 'Hello Nag!!'
            git 'https://github.com/nagendrajv/simple-sboot.git'
        }
        stage('Build') {
            sh '/Users/njalapati/develop/Resources/Maven/bin/mvn -Dmaven.test.failure.ignore clean package'
        }
        stage('Deploy') {
            sh '/Users/njalapati/develop/Resources/Maven/bin/mvn spring-boot:run'
        }
    }
}
