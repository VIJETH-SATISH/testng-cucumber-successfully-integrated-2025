pipeline {
    agent any

    tools {
        maven 'Maven 3.9.9'
        jdk 'JDK21'
    }

    stages {
         stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Run TestNG') {
            steps {
                bat 'mvn clean test -Dsurefire.suiteXmlFiles=testng.xml'
            }
        }
    }

    post {
        always {
            publishTestNGResults testNGPattern: '**/test-output/testng-results.xml'
        }
    }
}