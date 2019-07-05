pipeline {
    agent any
    stages {
        stage('Preparation') {
            steps {
                echo 'Hello Nag!!'
                git 'https://github.com/nagendrajv/simple-sboot.git'
            }
        }
        stage('Build') {
            steps {
                sh '/Users/njalapati/develop/Resources/Maven/bin/mvn -Dmaven.test.failure.ignore clean package'
            }
        }
        stage('Deploy') {
            steps {
                sh '/Users/njalapati/develop/Resources/Maven/bin/mvn spring-boot:run'
            }
        }
    }
}
